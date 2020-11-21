package com.Planning.client.presenters;

import java.util.Date;
import java.util.LinkedHashMap;

import com.gwtplatform.dispatch.shared.DispatchAsync;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.Planning.client.Widgets.ProcurementPlansListGrid;
import com.Planning.client.Widgets.Windows.PlanFormWindow;
import com.Planning.client.Widgets.buttons.CancelButton;
import com.Planning.client.Widgets.buttons.DeleteButton;
import com.Planning.client.Widgets.buttons.EditButton;
import com.Planning.client.Widgets.buttons.LoadButton;
import com.Planning.client.Widgets.buttons.SaveButton;
import com.Planning.client.place.NameTokens;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.planetsystems.model.utils.utils_model.Account;
import com.planetsystems.model.utils.utils_model.Activity;
import com.planetsystems.model.utils.utils_model.Currency;
import com.planetsystems.model.utils.utils_model.FinancialYear;
import com.planetsystems.model.utils.utils_model.FundingAgency;
import com.planetsystems.model.utils.utils_model.Item;
import com.planetsystems.model.utils.utils_model.MeasurementUnit;
import com.planetsystems.model.utils.utils_model.ProcurementType;
import com.planetsystems.ui.utils.utils_ui.client.utils.UtilConstants;
import com.planetsystems.ui.utils.utils_ui.shared.Util;
import com.planetsystems.ui.utils.utils_ui.shared.UtilResult;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.form.fields.events.ChangedEvent;
import com.smartgwt.client.widgets.form.fields.events.ChangedHandler;
import com.smartgwt.client.widgets.form.fields.events.KeyUpEvent;
import com.smartgwt.client.widgets.form.fields.events.KeyUpHandler;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import com.smartgwt.client.widgets.grid.events.CellContextClickEvent;
import com.smartgwt.client.widgets.grid.events.CellContextClickHandler;
import com.smartgwt.client.widgets.grid.events.RecordClickEvent;
import com.smartgwt.client.widgets.grid.events.RecordClickHandler;
import com.smartgwt.client.widgets.menu.Menu;
import com.smartgwt.client.widgets.menu.MenuItem;
import com.smartgwt.client.widgets.menu.MenuItemSeparator;
import com.smartgwt.client.widgets.menu.events.MenuItemClickEvent;
import com.Planning.client.presenters.MainPagePresenter;
import com.Planning.client.util.PlanningConstants;
import com.Planning.model.ProcurementPlan;
import com.Planning.shared.Planning;
import com.Planning.shared.PlanningResult;

public class ProcurementPlanPresenter
		extends
		Presenter<ProcurementPlanPresenter.MyView, ProcurementPlanPresenter.MyProxy> {
	
	@Inject
	private PlaceManager placeManager;
	final DispatchAsync dispatcher;


	public interface MyView extends View {
		
		public ProcurementPlansListGrid getProcurementPlansListGrid();
		public CancelButton getCancelButton();
		public SaveButton getSaveButton();
		public SaveButton getAddNewPlanButton();
		public EditButton getEditButton();
		public DeleteButton getDeletePlanButton();
		public LoadButton getLoadButton();
		public LoadButton getLoadByYearButton();
		public PlanFormWindow getPlanFormWindow();

	}

	@ProxyCodeSplit
	@NameToken(NameTokens.procurementplan)
	public interface MyProxy extends ProxyPlace<ProcurementPlanPresenter> {
	}

	@Inject
	public ProcurementPlanPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy,DispatchAsync dispatcher,PlaceManager placeManager) {
		super(eventBus, view, proxy);
		
		this.placeManager = placeManager;
		this.dispatcher = dispatcher;
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this, MainPagePresenter.TYPE_SetContextAreaContent,
				this);
	}

	@Override
	protected void onBind() {
		super.onBind();
		onaddPlanButtonClicked();
		onRetrieveProcurementPlan();
		onProcurementPlanRecordRightClicked();
	}
	
	public void onaddPlanButtonClicked(){
		getView().getAddNewPlanButton().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				PlanFormWindow planFormWindow=new PlanFormWindow();
				loadPlanningWindowCurrencyCombo(planFormWindow);
				loadPlanWindowUOMCombo(planFormWindow);
				loadPlanWindowItemCombo(planFormWindow);
				loadProcurementTypeCombo(planFormWindow);
				onUnitCostClicked(planFormWindow);
				onsaveProcurementPlan(planFormWindow);
				loadFinancialYearCombo(planFormWindow);
				loadFundingAgencies(planFormWindow);
				loadAccounts(planFormWindow);
				loadActivities(planFormWindow);
				planFormWindow.show();
			}
		});
	}
	
	private void loadProcurementTypeCombo(final PlanFormWindow planFormWindow) {
		LinkedHashMap<String, String> valueMap = new LinkedHashMap<String, String>();

		for (ProcurementType procurementType : ProcurementType.values()) {
			valueMap.put(procurementType.getProcurementType(), procurementType.getProcurementType());
		}

		planFormWindow.getProcurementPlan().getProcurementTypeCombo().setValueMap(valueMap);
	}
	
	
	private void loadPlanWindowItemCombo(final PlanFormWindow planFormWindow) {
		dispatcher.execute(new Util(UtilConstants.RETRIEVE_ITEM), new AsyncCallback<UtilResult>() {
			public void onFailure(Throwable caught) {
				System.out.println(caught.getMessage());
			}

			public void onSuccess(UtilResult result) {
				if (result != null) {

					LinkedHashMap<String, String> valueMap = new LinkedHashMap<String, String>();

					for (Item item : result.getItems()) {
						valueMap.put(item.getId(), item.getItemName());
					}

					planFormWindow.getProcurementPlan().getItemCombo().setValueMap(valueMap);

				} else {
				}

			}
		});

	}
	
	private void loadPlanWindowUOMCombo(final PlanFormWindow planFormWindow) {
		dispatcher.execute(new Util(UtilConstants.RETRIEVE_UOM), new AsyncCallback<UtilResult>() {
			public void onFailure(Throwable caught) {
				System.out.println(caught.getMessage());
			}

			public void onSuccess(UtilResult result) {
				if (result != null) {

					LinkedHashMap<String, String> valueMap = new LinkedHashMap<String, String>();

					for (MeasurementUnit measurementUnit : result.getMeasurementUnits()) {
						valueMap.put(measurementUnit.getId(), measurementUnit.getName());
					}

					planFormWindow.getProcurementPlan().getUnitMeasureCombo().setValueMap(valueMap);

				} else {
				}

			}
		});

	}
	
	private void loadPlanningWindowCurrencyCombo(final PlanFormWindow planFormWindow) {
		dispatcher.execute(new Util(UtilConstants.RETRIEVE_CURRENCY), new AsyncCallback<UtilResult>() {
			public void onFailure(Throwable caught) {
				System.out.println(caught.getMessage());
			}

			public void onSuccess(UtilResult result) {
				if (result != null) {

					LinkedHashMap<String, String> valueMap = new LinkedHashMap<String, String>();

					for (Currency currency : result.getCurrencies()) {
						valueMap.put(currency.getId(), currency.getCurrencyName());
					}

					planFormWindow.getProcurementPlan().getCurrencyCombo().setValueMap(valueMap);

				} else {
				}

			}
		});
	}
	
	public void onQuantityClicked(final PlanFormWindow planFormWindow){
		planFormWindow.getProcurementPlan().getQuantityText().addChangedHandler(new ChangedHandler() {

				public void onChanged(ChangedEvent event) {

					double quantity = 0;
					double unitCost = 0;

					if (planFormWindow.getProcurementPlan().getQuantityText().getValue() == null) {

					

					} else if (planFormWindow.getProcurementPlan().getUnitCostText().getValue() == null) {

					

					}

					else {

						quantity = Double.parseDouble(planFormWindow.getProcurementPlan().getQuantityText().getValueAsString().replace(",", ""));
						unitCost = Double.parseDouble(planFormWindow.getProcurementPlan().getUnitCostText().getValueAsString().replace(",", ""));
						double totalAmount = quantity * unitCost;

						planFormWindow.getProcurementPlan().getEstimatedCostText().setValue(planFormWindow.getProcurementPlan().getNf().format(totalAmount));

					

					}

				}

			});
	  }

	private void onUnitCostClicked(final PlanFormWindow planFormWindow){
		planFormWindow.getProcurementPlan().getUnitCostText().addKeyUpHandler(new KeyUpHandler() {
			
			public void onKeyUp(KeyUpEvent event) {
				
				float quantity=Float.parseFloat(planFormWindow.getProcurementPlan().getQuantityText().getValueAsString().replace(",", ""));
				float unitCost=Float.parseFloat(planFormWindow.getProcurementPlan().getUnitCostText().getValueAsString().replace(",", ""));
				
				planFormWindow.getProcurementPlan().getEstimatedCostText().setValue(planFormWindow.getProcurementPlan().getNf().format(quantity*unitCost));
				
			}
		});
	}
	
	private void clearFields(final PlanFormWindow planFormWindow){
		
	}
	
	private void loadActivities(final PlanFormWindow planFormWindow) {
		dispatcher.execute(new Util(UtilConstants.RETRIEVE_ACTIVITY), new AsyncCallback<UtilResult>() {
			public void onFailure(Throwable caught) {
				System.out.println(caught.getMessage());
			}

			public void onSuccess(UtilResult result) {
				if (result != null) {
					LinkedHashMap<String, String> valueMap = new LinkedHashMap<String, String>();
					for (Activity activities : result.getActivities()) {
						valueMap.put(activities.getId(), activities.getActivityName());
					}

					planFormWindow.getProcurementPlan().getActivitiesCombo().setValueMap(valueMap);

				} else {
					System.out.println("loadActivities list is Empty");
				}

			}
		});

	}
	
	private void loadFundingAgencies(final PlanFormWindow planFormWindow) {
		dispatcher.execute(new Util(UtilConstants.RETRIEVE_FUNDING_AGENCY), new AsyncCallback<UtilResult>() {
			public void onFailure(Throwable caught) {
				System.out.println(caught.getMessage());
			}

			public void onSuccess(UtilResult result) {
				if (result != null) {

					LinkedHashMap<String, String> valueMap = new LinkedHashMap<String, String>();
					for (FundingAgency fundingAgency : result.getFundingAgencies()) {
						valueMap.put(fundingAgency.getId(), fundingAgency.getName());
					}

					planFormWindow.getProcurementPlan().getFundingAgencyCombo().setValueMap(valueMap);

				} else {
					System.out.println("loadFundingAgencies list is Empty");
				}

			}
		});
	}
	
	private void loadAccounts(final PlanFormWindow planFormWindow) {
		dispatcher.execute(new Util(UtilConstants.SAVE_ACCOUNT), new AsyncCallback<UtilResult>() {
			public void onFailure(Throwable caught) {
				System.out.println(caught.getMessage());
			}

			public void onSuccess(UtilResult result) {
				if (result != null) {
					
					LinkedHashMap<String, String> valueMap = new LinkedHashMap<String, String>();
					for (Account accounts : result.getAccounts()) {
						valueMap.put(accounts.getId(), accounts.getAccountName());
					}

					planFormWindow.getProcurementPlan().getAccountsCombo().setValueMap(valueMap);
				} else {
					System.out.println("loadAccounts list is Empty");
				}

			}
		});
	}
	
	public void onsaveProcurementPlan(final PlanFormWindow planFormWindow){
		planFormWindow.getProcurementPlan().getSaveButton().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				ProcurementPlan procurementPlan=new ProcurementPlan();
				
				Date dateRequired=planFormWindow.getProcurementPlan().getDateRequiredItem().getValueAsDate();
				
				ProcurementType procurementType=ProcurementType.getProcurementType(planFormWindow.getProcurementPlan().getProcurementTypeCombo().getValueAsString());
				
				Item item=new Item();
				item.setId(planFormWindow.getProcurementPlan().getItemCombo().getValueAsString());
				
				MeasurementUnit unit=new MeasurementUnit();
				unit.setId(planFormWindow.getProcurementPlan().getUnitMeasureCombo().getValueAsString());
				
				String quantity=planFormWindow.getProcurementPlan().getQuantityText().getValueAsString().replace(",", "");
				
				double unitCost=Double.parseDouble(planFormWindow.getProcurementPlan().getUnitCostText().getValueAsString().replace(",", ""));
				
				double estimatedCost=Double.parseDouble(planFormWindow.getProcurementPlan().getEstimatedCostText().getValueAsString().replace(",", ""));
				
				FinancialYear financialYear=new FinancialYear();
				financialYear.setId(planFormWindow.getProcurementPlan().getFinYearCombo().getValueAsString());
				
				Currency currency=new Currency();
				currency.setId(planFormWindow.getProcurementPlan().getCurrencyCombo().getValueAsString());
				
				Activity activity=new Activity();
				activity.setId(planFormWindow.getProcurementPlan().getActivitiesCombo().getValueAsString());
				
				Account account=new Account();
				account.setId(planFormWindow.getProcurementPlan().getAccountsCombo().getValueAsString());
				
				FundingAgency fundingAgency=new FundingAgency();
				fundingAgency.setId(planFormWindow.getProcurementPlan().getFundingAgencyCombo().getValueAsString());
				
				String comment=planFormWindow.getProcurementPlan().getCommentText().getValueAsString();
				
				procurementPlan.setCurrency(currency);
				procurementPlan.setDateRequired(dateRequired);
				procurementPlan.setItem(item);
				procurementPlan.setMeasurementUnit(unit);
				procurementPlan.setQuantity(quantity);
				procurementPlan.setUnitCost(unitCost);
				procurementPlan.setComment(comment);
				procurementPlan.setEstimatedCost(estimatedCost);
				procurementPlan.setFinancialYear(financialYear);
				procurementPlan.setProcurementType(procurementType);
				procurementPlan.setAccount(account);
				procurementPlan.setActivity(activity);
				procurementPlan.setFundingAgency(fundingAgency);
				
				dispatcher.execute(new Planning(PlanningConstants.SAVE_PROCUREMENT_PLAN,procurementPlan), new AsyncCallback<PlanningResult>() {
					public void onFailure(Throwable caught) {
						System.out.println(caught.getMessage());
					}

					public void onSuccess(PlanningResult result) {
						if (result != null) {
							SC.say("SERVER RESPONSE", result.getResponse());
						getView().getProcurementPlansListGrid().loadProcurementPlans(result.getProcurementPlanList());
							

						} else {
							
						}
					}
				});	
			}
		});
		
	}
	
	public void onRetrieveProcurementPlan(){
		dispatcher.execute(new Planning(PlanningConstants.RETRIEVE_PROCUREMENT_PLAN), new AsyncCallback<PlanningResult>() {
			public void onFailure(Throwable caught) {
				System.out.println(caught.getMessage());
			}
	
			public void onSuccess(PlanningResult result) {
				if (result != null) {
					getView().getProcurementPlansListGrid().loadProcurementPlans(result.getProcurementPlanList());
					
				} else {
					
				}
			}
		});
	}

	
	private void loadFinancialYearCombo(final PlanFormWindow planFormWindow) {

		dispatcher.execute(new Util(UtilConstants.RETRIEVE_FINANCIAL_YEAR), new AsyncCallback<UtilResult>() {
			public void onFailure(Throwable caught) {
				System.out.println(caught.getMessage());
			}

			public void onSuccess(UtilResult result) {
				if (result != null) {
					LinkedHashMap<String, String> valueMap = new LinkedHashMap<String, String>();
					for (FinancialYear financialYear : result.getFinancialYears()) {
						valueMap.put(financialYear.getId(), financialYear.getName());
					}

					planFormWindow.getProcurementPlan().getFinYearCombo().setValueMap(valueMap);

				} else {
					System.out.println("loadFinancialYearCombo list is Empty");
				}
			}
		});
	}
	
   public void onProcurementPlanRecordRightClicked(){
		
		getView().getProcurementPlansListGrid().addCellContextClickHandler(new CellContextClickHandler() {
			
			public void onCellContextClick(final CellContextClickEvent rightClickEvent) {

				getView().getProcurementPlansListGrid().deselectAllRecords();
				getView().getProcurementPlansListGrid().selectRecord(rightClickEvent.getRecord());

				Menu menu = new Menu();
				MenuItem EditProcurmentPlan=new MenuItem("Edit Plan","Edit Plan");
				MenuItem DelteProcurmentPlan=new MenuItem("Delete Plan","Delete Plan");
				
				EditProcurmentPlan.addClickHandler(new com.smartgwt.client.widgets.menu.events.ClickHandler() {

					public void onClick(MenuItemClickEvent event) {

						onProcurementPlanRecordSelectedToEdit();
						
					}
				});
				
				DelteProcurmentPlan.addClickHandler(new com.smartgwt.client.widgets.menu.events.ClickHandler() {

					public void onClick(MenuItemClickEvent event) {

						onProcurementPlanRecordSelectedToDelete();
						
					}
				});
				
				menu.setItems(EditProcurmentPlan,new MenuItemSeparator(),DelteProcurmentPlan);
				getView().getProcurementPlansListGrid().setContextMenu(menu);
			}
		});
		
	}
	
	public void onProcurementPlanRecordSelectedToEdit(){
		
		PlanFormWindow planFormWindow=new PlanFormWindow();
		
							loadPlanningWindowCurrencyCombo(planFormWindow);
							loadPlanWindowUOMCombo(planFormWindow);
							loadPlanWindowItemCombo(planFormWindow);
							loadProcurementTypeCombo(planFormWindow);
							onUnitCostClicked(planFormWindow);
							loadFinancialYearCombo(planFormWindow);
							loadFundingAgencies(planFormWindow);
							loadAccounts(planFormWindow);
							loadActivities(planFormWindow);
		
							planFormWindow
									.getProcurementPlan()
									.getFinYearCombo()
									.setValue(
											getView()
													.getProcurementPlansListGrid()
													.getSelectedRecord()
													.getAttribute(
															ProcurementPlansListGrid.FINANCIAL_YEAR_ID));
							
							planFormWindow.getProcurementPlan().getDateRequiredItem()
							.setValue(
									getView()
									.getProcurementPlansListGrid()
									.getSelectedRecord()
									.getAttribute(
											ProcurementPlansListGrid.DATE_REQUIRED));
							
							planFormWindow.getProcurementPlan().getProcurementTypeCombo()
							.setValue(
									getView()
									.getProcurementPlansListGrid()
									.getSelectedRecord()
									.getAttribute(
											ProcurementPlansListGrid.PROCUREMENT_TYPE_NAME));
							
							planFormWindow.getProcurementPlan().getItemCombo()
							.setValue(
									getView()
									.getProcurementPlansListGrid()
									.getSelectedRecord()
									.getAttribute(
											ProcurementPlansListGrid.ITEM_ID));
							
							planFormWindow.getProcurementPlan().getUnitMeasureCombo()
							.setValue(
									getView()
									.getProcurementPlansListGrid()
									.getSelectedRecord()
									.getAttribute(
											ProcurementPlansListGrid.UNITS_ID));
							
							planFormWindow.getProcurementPlan().getQuantityText()
							.setValue(
									getView()
									.getProcurementPlansListGrid()
									.getSelectedRecord()
									.getAttribute(
											ProcurementPlansListGrid.QUANTITY));
							
							planFormWindow.getProcurementPlan().getUnitCostText()
							.setValue(
									getView()
									.getProcurementPlansListGrid()
									.getSelectedRecord()
									.getAttribute(
											ProcurementPlansListGrid.UNIT_COST));
							
							planFormWindow.getProcurementPlan().getEstimatedCostText()
							.setValue(
									getView()
									.getProcurementPlansListGrid()
									.getSelectedRecord()
									.getAttribute(
											ProcurementPlansListGrid.ESTIMATED_COST));
							
							planFormWindow.getProcurementPlan().getCurrencyCombo()
							.setValue(
									getView()
									.getProcurementPlansListGrid()
									.getSelectedRecord()
									.getAttribute(
											ProcurementPlansListGrid.CURRENCY_ID));
							
							planFormWindow.getProcurementPlan().getCommentText()
							.setValue(
									getView()
									.getProcurementPlansListGrid()
									.getSelectedRecord()
									.getAttribute(
											ProcurementPlansListGrid.COMMENT));
							
							planFormWindow.getProcurementPlan().getActivitiesCombo()
							.setValue(
									getView()
									.getProcurementPlansListGrid()
									.getSelectedRecord()
									.getAttribute(
											ProcurementPlansListGrid.ACTIVITY_ID));
							
							planFormWindow.getProcurementPlan().getAccountsCombo()
							.setValue(
									getView()
									.getProcurementPlansListGrid()
									.getSelectedRecord()
									.getAttribute(
											ProcurementPlansListGrid.ACCOUNT_ID));
							
							planFormWindow.getProcurementPlan().getFundingAgencyCombo()
							.setValue(
									getView()
									.getProcurementPlansListGrid()
									.getSelectedRecord()
									.getAttribute(
											ProcurementPlansListGrid.FUNDER_ID));
							
							onEditProcurementPlan(planFormWindow);
							
							planFormWindow.show();
				}
	
	public void onEditProcurementPlan(final PlanFormWindow planFormWindow){
		planFormWindow.getProcurementPlan().getEditButton().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				ProcurementPlan procurementPlan=new ProcurementPlan();
				procurementPlan.setId(
						getView()
						.getProcurementPlansListGrid()
						.getSelectedRecord()
						.getAttribute(
								ProcurementPlansListGrid.PLAN_ID));
				
				Date dateRequired=planFormWindow.getProcurementPlan().getDateRequiredItem().getValueAsDate();
				
				ProcurementType procurementType=ProcurementType.getProcurementType(planFormWindow.getProcurementPlan().getProcurementTypeCombo().getValueAsString());
				
				Item item=new Item();
				item.setId(planFormWindow.getProcurementPlan().getItemCombo().getValueAsString());
				
				MeasurementUnit unit=new MeasurementUnit();
				unit.setId(planFormWindow.getProcurementPlan().getUnitMeasureCombo().getValueAsString());
				
				String quantity=planFormWindow.getProcurementPlan().getQuantityText().getValueAsString().replace(",", "");
				
				double unitCost=Double.parseDouble(planFormWindow.getProcurementPlan().getUnitCostText().getValueAsString().replace(",", ""));
				
				double estimatedCost=Double.parseDouble(planFormWindow.getProcurementPlan().getEstimatedCostText().getValueAsString().replace(",", ""));
				
				FinancialYear financialYear=new FinancialYear();
				financialYear.setId(planFormWindow.getProcurementPlan().getFinYearCombo().getValueAsString());
				
				Currency currency=new Currency();
				currency.setId(planFormWindow.getProcurementPlan().getCurrencyCombo().getValueAsString());
				
				Activity activity=new Activity();
				activity.setId(planFormWindow.getProcurementPlan().getActivitiesCombo().getValueAsString());
				
				Account account=new Account();
				account.setId(planFormWindow.getProcurementPlan().getAccountsCombo().getValueAsString());
				
				FundingAgency fundingAgency=new FundingAgency();
				fundingAgency.setId(planFormWindow.getProcurementPlan().getFundingAgencyCombo().getValueAsString());
				
				String comment=planFormWindow.getProcurementPlan().getCommentText().getValueAsString();
				
				procurementPlan.setCurrency(currency);
				procurementPlan.setDateRequired(dateRequired);
				procurementPlan.setItem(item);
				procurementPlan.setMeasurementUnit(unit);
				procurementPlan.setQuantity(quantity);
				procurementPlan.setUnitCost(unitCost);
				procurementPlan.setComment(comment);
				procurementPlan.setEstimatedCost(estimatedCost);
				procurementPlan.setFinancialYear(financialYear);
				procurementPlan.setProcurementType(procurementType);
				procurementPlan.setAccount(account);
				procurementPlan.setActivity(activity);
				procurementPlan.setFundingAgency(fundingAgency);
				
				
				dispatcher.execute(new Planning(PlanningConstants.EDIT_PROCUREMENT_PLAN,procurementPlan), new AsyncCallback<PlanningResult>() {
					public void onFailure(Throwable caught) {
						System.out.println(caught.getMessage());
					}

					public void onSuccess(PlanningResult result) {
						if (result != null) {
							SC.say("SERVER RESPONSE", result.getResponse());
						getView().getProcurementPlansListGrid().loadProcurementPlans(result.getProcurementPlanList());
							

						} else {
							
						}
					}
				});	
			}
		});
		
	}
	
	public void onProcurementPlanRecordSelectedToDelete(){
		
		ProcurementPlan procurementPlan=new ProcurementPlan();
		procurementPlan.setId(
				getView()
				.getProcurementPlansListGrid()
				.getSelectedRecord()
				.getAttribute(
						ProcurementPlansListGrid.PLAN_ID));
		
		dispatcher.execute(new Planning(PlanningConstants.DELETE_PROCUREMENT_PLAN,procurementPlan), new AsyncCallback<PlanningResult>() {
			public void onFailure(Throwable caught) {
				System.out.println(caught.getMessage());
			}

			public void onSuccess(PlanningResult result) {
				if (result != null) {
					SC.say("SERVER RESPONSE", result.getResponse());
				getView().getProcurementPlansListGrid().loadProcurementPlans(result.getProcurementPlanList());
					

				} else {
					
				}
			}
		});	
		
		}
	
	
}
