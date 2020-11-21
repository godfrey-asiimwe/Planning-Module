package com.Planning.client.presenters;

import java.util.Date;
import java.util.LinkedHashMap;

import com.gwtplatform.dispatch.shared.DispatchAsync;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.Planning.client.Widgets.PlanPeriodListGrid;
import com.Planning.client.place.NameTokens;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.planetsystems.model.utils.utils_model.FinancialYear;
import com.planetsystems.ui.utils.utils_ui.client.utils.UtilConstants;
import com.planetsystems.ui.utils.utils_ui.client.widgets.DeleteButton;
import com.planetsystems.ui.utils.utils_ui.client.widgets.EditButton;
import com.planetsystems.ui.utils.utils_ui.client.widgets.SaveButton;
import com.planetsystems.ui.utils.utils_ui.shared.Util;
import com.planetsystems.ui.utils.utils_ui.shared.UtilResult;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.ComboBoxItem;
import com.smartgwt.client.widgets.form.fields.DateItem;
import com.smartgwt.client.widgets.form.fields.TextItem;
import com.smartgwt.client.widgets.form.fields.events.ClickEvent;
import com.smartgwt.client.widgets.form.fields.events.ClickHandler;
import com.smartgwt.client.widgets.grid.events.RecordClickEvent;
import com.smartgwt.client.widgets.grid.events.RecordClickHandler;
import com.Planning.client.presenters.MainPagePresenter;
import com.Planning.client.util.PlanningConstants;
import com.Planning.model.PlanningPeriod;
import com.Planning.shared.Planning;
import com.Planning.shared.PlanningResult;

public class PlanningPeriodPresenter
		extends
		Presenter<PlanningPeriodPresenter.MyView, PlanningPeriodPresenter.MyProxy> {
	
	@Inject
	private PlaceManager placeManager;
	final DispatchAsync dispatcher;

	public interface MyView extends View {
		public ComboBoxItem getFinYearCombo();
		public DateItem getStartDateItem();
		public DateItem getEndDateItem();
		public TextItem getPeriodNameText();
		public PlanPeriodListGrid getPlanPeriodListGrid();
		public SaveButton getSaveButton();
		public EditButton getEditButton();
		public DeleteButton getDeleteButton();
		public DynamicForm getDF_FORM();

	}

	@ProxyCodeSplit
	@NameToken(NameTokens.planningperiod)
	public interface MyProxy extends ProxyPlace<PlanningPeriodPresenter> {
	}

	@Inject
	public PlanningPeriodPresenter(final EventBus eventBus, final MyView view,
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
		loadFinancialYearCombo() ;
		onsavePlanningPeriod();
		onRetrievePlanningPeriod();
		onPlanningPeriodRecordSelected();
		onEditPlanningPeriod();
		onDeletePlanningPeriod();
	}
	
	private void clearFields(){
		getView().getDF_FORM().clearValues();
	}
	
	private void loadFinancialYearCombo() {

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

					getView().getFinYearCombo().setValueMap(valueMap);

				} else {
					System.out.println("loadFinancialYearCombo list is Empty");
				}

			}
		});
	}
	
	public void onsavePlanningPeriod(){
		getView().getSaveButton().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				PlanningPeriod planningPeriod=new PlanningPeriod();
				
				FinancialYear finYear=new FinancialYear();
				finYear.setId(getView().getFinYearCombo().getValueAsString());
				
				Date startDate=getView().getStartDateItem().getValueAsDate();
				Date endDate=getView().getEndDateItem().getValueAsDate();
				String periodName=getView().getPeriodNameText().getValueAsString();
				
				planningPeriod.setFinancialYear(finYear);
				planningPeriod.setPeriodName(periodName);
				planningPeriod.setStartDate(startDate);
				planningPeriod.setEndDate(endDate);
				
				dispatcher.execute(new Planning(PlanningConstants.SAVE_PLANNING_PERIOD,planningPeriod), new AsyncCallback<PlanningResult>() {
					public void onFailure(Throwable caught) {
						System.out.println(caught.getMessage());
					}

					public void onSuccess(PlanningResult result) {
						if (result != null) {
							SC.say("SERVER RESPONSE", result.getResponse());
							getView().getPlanPeriodListGrid().addRecordsToGrid(result.getPlanningPeriodList());
							clearFields();

						} else {
							
						}
					}
				});	
			}
		});
		
	}

	public void onRetrievePlanningPeriod(){
		dispatcher.execute(new Planning(PlanningConstants.RETRIEVE_PLANNING_PERIOD), new AsyncCallback<PlanningResult>() {
			public void onFailure(Throwable caught) {
				System.out.println(caught.getMessage());
			}
	
			public void onSuccess(PlanningResult result) {
				if (result != null) {
					getView().getPlanPeriodListGrid().addRecordsToGrid(result.getPlanningPeriodList());
					
				} else {
					
				}
			}
		});
	}
	
	public void onPlanningPeriodRecordSelected(){
		final PlanPeriodListGrid planPeriodListGrid=getView().getPlanPeriodListGrid();
		planPeriodListGrid.addRecordClickHandler(new RecordClickHandler() {
			
			public void onRecordClick(RecordClickEvent event) {
				if(planPeriodListGrid.anySelected()){
					
					getView().getFinYearCombo().setValue(planPeriodListGrid.getSelectedRecord().getAttribute(PlanPeriodListGrid.FINANCIAL_YEAR_ID));
					getView().getPeriodNameText().setValue(planPeriodListGrid.getSelectedRecord().getAttribute(PlanPeriodListGrid.PERIOD_NAME));
					getView().getStartDateItem().setValue(new Date(planPeriodListGrid.getSelectedRecord().getAttribute(PlanPeriodListGrid.PERIOD_START_DATE)));
					getView().getEndDateItem().setValue(new Date(planPeriodListGrid.getSelectedRecord().getAttribute(PlanPeriodListGrid.PERIOD_END_DATE)));
					
				}
				
			}
		});
	}
	
	public void onEditPlanningPeriod(){
        getView().getEditButton().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				if(getView().getPlanPeriodListGrid().anySelected()){
				PlanningPeriod planningPeriod=new PlanningPeriod();
				planningPeriod.setId(getView().getPlanPeriodListGrid().getSelectedRecord().getAttribute(PlanPeriodListGrid.PERIOD_ID));
				
				FinancialYear finYear=new FinancialYear();
				finYear.setId(getView().getFinYearCombo().getValueAsString());
				
				Date startDate=getView().getStartDateItem().getValueAsDate();
				Date endDate=getView().getEndDateItem().getValueAsDate();
				String periodName=getView().getPeriodNameText().getValueAsString();
				
				planningPeriod.setFinancialYear(finYear);
				planningPeriod.setPeriodName(periodName);
				planningPeriod.setStartDate(startDate);
				planningPeriod.setEndDate(endDate);
				
				dispatcher.execute(new Planning(PlanningConstants.EDIT_PLANNING_PERIOD,planningPeriod), new AsyncCallback<PlanningResult>() {
					public void onFailure(Throwable caught) {
						System.out.println(caught.getMessage());
					}

					public void onSuccess(PlanningResult result) {
						if (result != null) {
							SC.say("SERVER RESPONSE", result.getResponse());
							getView().getPlanPeriodListGrid().addRecordsToGrid(result.getPlanningPeriodList());
							clearFields();

						} else {
							
						}
					}
				});	
			}
			   }
		});
     
	}
	
	public void onDeletePlanningPeriod(){
        getView().getDeleteButton().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				if(getView().getPlanPeriodListGrid().anySelected()){
				PlanningPeriod planningPeriod=new PlanningPeriod();
				planningPeriod.setId(getView().getPlanPeriodListGrid().getSelectedRecord().getAttribute(PlanPeriodListGrid.PERIOD_ID));
			
				
				dispatcher.execute(new Planning(PlanningConstants.DELETE_PLANNING_PERIOD,planningPeriod), new AsyncCallback<PlanningResult>() {
					public void onFailure(Throwable caught) {
						System.out.println(caught.getMessage());
					}

					public void onSuccess(PlanningResult result) {
						if (result != null) {
							SC.say("SERVER RESPONSE", result.getResponse());
							getView().getPlanPeriodListGrid().addRecordsToGrid(result.getPlanningPeriodList());
							clearFields();

						} else {
							
						}
					}
				});	
			}
			   }
		});
     
	}
}
