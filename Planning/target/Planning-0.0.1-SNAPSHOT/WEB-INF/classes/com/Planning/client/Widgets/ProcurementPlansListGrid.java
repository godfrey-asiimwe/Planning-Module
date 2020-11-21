/**
 * 
 */
package com.Planning.client.Widgets;

import java.util.Date;
import java.util.List;

import com.Planning.model.ProcurementPlan;
import com.google.gwt.i18n.client.NumberFormat;
import com.smartgwt.client.data.fields.DataSourceTextField;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.types.GroupStartOpen;
import com.smartgwt.client.types.ListGridFieldType;
import com.smartgwt.client.types.SelectionAppearance;
import com.smartgwt.client.types.SortDirection;
import com.smartgwt.client.widgets.Button;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.DataBoundComponent;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.ComboBoxItem;
import com.smartgwt.client.widgets.form.fields.TextAreaItem;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridField;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VLayout;
import com.smartgwt.client.widgets.tab.Tab;
import com.smartgwt.client.widgets.tab.TabSet;
import com.smartgwt.client.widgets.viewer.DetailViewer;
import com.smartgwt.client.widgets.viewer.DetailViewerField;
import com.smartgwt.client.widgets.viewer.DetailViewerRecord;

public class ProcurementPlansListGrid extends ListGrid {

	public static final String ICON = "icon";
	private static final String ICON_DISPLAY_NAME = "#";
	public static final String PLAN_ID = "planID";
	private static final String PLAN_ID_DISPLAY = "Plan ID";
	public static final String FINANCIAL_YEAR_ID = "finYearID";
	private static final String FINANCIAL_YEAR_ID_DISPLAY = "Financial Year ID";
	public static final String FINANCIAL_YEAR_NAME = "finYearName";
	private static final String FINANCIAL_YEAR_NAME_DISPLAY = "Financial Year";
	public static final String QUARTER_NAME = "quarterName";
	private static final String QUARTER_NAME_DISPLAY = "Quarter";
	public static final String CURRENCY_ID = "currencyID";
	private static final String CURRENCY_ID_DISPLAY = "Currency ID";
	public static final String CURRENCY_NAME = "currencyName";
	private static final String CURRENCY_NAME_DISPLAY = "Currency";
	public static final String CURRENCY_SYMBOL = "currencySymbol";
	private static final String CURRENCY_SYMBOL_DISPLAY = "Symbol";

	public static final String ITEM_ID = "itemID";
	private static final String ITEM_ID_DISPLAY = "Item ID";
	public static final String ITEM_CODE = "itemCode";
	private static final String ITEM_CODE_DISPLAY = "Item Code";
	public static final String ITEM_NAME = "itemName";
	private static final String ITEM_NAME_DISPLAY = "Item Name";

	public static final String ITEM_CATEGORY_ID = "itemCategoryID";
	private static final String ITEM_CATEGORY_ID_DISPLAY = "Item Category ID";

	public static final String ITEM_CATEGORY_CODE = "itemCategoryCode";
	private static final String ITEM_CATEGORY_CODE_DISPLAY = "Item Category Code";

	public static final String ITEM_CATEGORY_NAME = "itemCategoryName";
	private static final String ITEM_CATEGORY_NAME_DISPLAY = "Item Category Name";

	public static final String FUNDER_ID = "funderId";
	private static final String FUNDER_ID_DISPLAY = "Funder ID";
	public static final String FUNDER_NAME = "funderName";
	private static final String FUNDER_NAME_DISPLAY = "Funder";

	public static final String PERIOD_ID = "planPeriodID";
	private static final String PERIOD_ID_DISPLAY = "Plan Period ID";
	
	public static final String PERIOD_NAME = "planPeriodName";
	private static final String PERIOD_NAME_DISPLAY = "Period Name";
	
	public static final String STATUS_ID = "planStatusID";
	private static final String STATUS_ID_DISPLAY = "Status ID";
	
	public static final String STATUS_NAME = "planStatusName";
	private static final String STATUS_NAME_DISPLAY = "Status";
	
	public static final String COMMENT = "comment";
	private static final String COMMENT_DISPLAY = "Comment";
	
	public static final String ESTIMATED_COST = "estimatedCost";
	private static final String ESTIMATED_COST_DISPLAY = "Estimated Cost";
	public static final String PLAN_TYPE = "planType";
	private static final String PLAN_TYPE_DISPLAY = "Plan Type";

	public static final String OPERATION_LEVEL = "Level";
	public static final String OPERATION_LEVEL_DISPLAY = "Level";

	// Sub Plans
	public static final String PROCUREMENT_METHOD_ID = "procurementMethodID";
	private static final String PROCUREMENT_METHOD_ID_DISPLAY = "Method ID";
	public static final String PROCUREMENT_METHOD_NAME = "procurementMethodName";
	private static final String PROCUREMENT_METHOD_NAME_DISPLAY = "Procurement Method";
	public static final String DATE_REQUIRED = "dateRequired";
	private static final String DATE_REQUIRED_DISPLAY = "Date Required";
	public static final String UNITS_ID = "unitsID";
	private static final String UNITS_ID_DISPLAY = "Units ID";
	public static final String UNITS_NAME = "unitsName";
	private static final String UNITS_NAME_DISPLAY = "Units Name";
	public static final String UNITS_SYMBOL = "unitsSysmbol";
	private static final String UNITS_SYMBOL_DISPLAY = "Units Symbol";
	public static final String UNIT_COST = "unitCost";
	private static final String UNIT_COST_DISPLAY = "Unit Cost";
	public static final String QUANTITY = "quantity";
	private static final String QUANTITY_DISPLAY = "Quantity";
	public static final String DEPARTMENT_ID = "departmentID";
	private static final String DEPARTMENT_ID_DISPLAY = "Department ID";
	public static final String DEPARTMENT_CODE = "departmentCode";
	private static final String DEPARTMENT_CODE_DISPLAY = "Department Code";
	public static final String DEPARTMENT_NAME = "departmentName";
	private static final String DEPARTMENT_NAME_DISPLAY = "Department Name";
	public static final String DIVISION_CODE = "divisionCode";
	private static final String DIVISION_CODE_DISPLAY = "Division Code";
	public static final String DIVISION_ID = "divisionID";
	private static final String DIVISION_ID_DISPLAY = "Division ID";
	public static final String DIVISION_NAME = "divisionName";
	private static final String DIVISION_NAME_DISPLAY = "Division Name";
	public static final String ACCOUNT_ID = "accountID";
	private static final String ACCOUNT_ID_DISPLAY = "Account ID";
	public static final String ACCOUNT_CODE = "accountCode";
	private static final String ACCOUNT_CODE_DISPLAY = "Account Code";
	public static final String ACCOUNT_NAME = "accountName";
	private static final String ACCOUNT_NAME_DISPLAY = "Account Name";

	public static final String ACTIVITY_ID = "activityID";
	private static final String ACTIVITY_ID_DISPLAY = "Activity ID";
	public static final String ACTIVITY_CODE = "activityCode";
	private static final String ACTIVITY_CODE_DISPLAY = "Activity Code";
	public static final String ACTIVITY_NAME = "activityName";
	private static final String ACTIVITY_NAME_DISPLAY = "Activity Name";

	public static final String PROCUREMENT_TYPE_ID = "procurementTypeID";
	private static final String PROCUREMENT_TYPE_ID_DISPLAY = "Procurement Type ID";
	public static final String PROCUREMENT_TYPE_NAME = "procurementType";
	private static final String PROCUREMENT_TYPE_NAME_DISPLAY = "Procurement Type";

	public static final String PROCUREMENT_LENGTH = "procurementLength";
	private static final String PROCUREMENT_LENGTH_DISPLAY = "Procurement Length";

	public static final String CREATED_BY = "createdBy";
	private static final String CREATED_BY_DISPLAY = "Created By";
	public static final String CHANGED_BY = "changedBy";
	private static final String CHANGED_BY_DISPLAY = "ChangedBy";

	public static final String DATE_CREATED = "dateCreated";
	private static final String DATE_CREATED_DISPLAY = "Date Created";
	public static final String DATE_CHANGED = "dateChanged";
	private static final String DATE_CHANGED_DISPLAY = "Date Modified";

	private static final String EMPTY_FIELD = "emptyField";
	private static final String EMPTY_FIELD_DISPLAY_NAME = " ";
	private static final String URL_PREFIX = "icons/16/";
	private static final String URL_SUFFIX = ".png";

	private static final int ICON_COLUMN_LENGTH = 27;

	/*IButton workFlowButton = new IButton("Work Flow");
	IButton raiseLPOButton = new IButton("Raise LPO");
	IButton removeButton = new IButton("Remove Item");
	IButton printFormFive = new IButton("Print Preview");
	IButton cancelButton = new IButton("Cancel ");
	IButton closeButton = new IButton("Close ");
	IButton editPlanButton = new IButton("Edit Plan ");
	IButton deletePlanButton = new IButton("Delete Plan ");
*/
	TabSet tabSet = new TabSet();
	final Tab itemsTab = new Tab();
	final Tab othersTab = new Tab();
	final Tab approvalsTab = new Tab();
	final Tab workFlowTab = new Tab();

	final DetailViewer DV_Items = new DetailViewer();
	final DetailViewer DV_Others = new DetailViewer();
	final DetailViewer DV_Approvals = new DetailViewer();

	final DetailViewerRecord DR_Items = new DetailViewerRecord();
	final DetailViewerRecord DR_Others = new DetailViewerRecord();
	final DetailViewerRecord DR_Approvals = new DetailViewerRecord();

	final DynamicForm DF_APPROVE = new DynamicForm();
	HLayout HL_BUTTON = new HLayout();
	VLayout VL_APPROVE = new VLayout();

	Button submitApproval = new Button("Submit");
	Button cancelApproval = new Button("Cancel");

	ComboBoxItem approveStateCombo = new ComboBoxItem("approveStateCombo",
			"State ");
	TextAreaItem approveCommentItem = new TextAreaItem("approveCommentItem",
			"Comment ");

	HLayout hLayout = new HLayout(10);
	NumberFormat nf = NumberFormat.getFormat("#,##0");
	
/*	ProcurementPlanDataSource planDataSource;*/

	public ProcurementPlansListGrid() {
		super();

		// initialize the List Grid fields
		ListGridField iconField = new ListGridField(ICON, ICON_DISPLAY_NAME,
				ICON_COLUMN_LENGTH);
		iconField.setImageSize(16);
		iconField.setAlign(Alignment.CENTER);
		iconField.setType(ListGridFieldType.IMAGE);
		iconField.setImageURLPrefix(URL_PREFIX);
		iconField.setImageURLSuffix(URL_SUFFIX);

		ListGridField planIDField = new ListGridField(PLAN_ID, PLAN_ID_DISPLAY);
		planIDField.setHidden(true);

		ListGridField planPeriodIDField = new ListGridField(PERIOD_ID,
				PERIOD_ID_DISPLAY);
		planPeriodIDField.setHidden(true);

		ListGridField planPeriodNameField = new ListGridField(PERIOD_NAME,
				PERIOD_NAME_DISPLAY);
		planPeriodNameField.setHidden(true);

		ListGridField financialYearIDField = new ListGridField(
				FINANCIAL_YEAR_ID, FINANCIAL_YEAR_ID_DISPLAY);
		financialYearIDField.setHidden(true);

		ListGridField financialYearNameField = new ListGridField(
				FINANCIAL_YEAR_NAME, FINANCIAL_YEAR_NAME_DISPLAY);
		/*financialYearNameField.setHidden(true);*/

		ListGridField quarterNameField = new ListGridField(QUARTER_NAME,
				QUARTER_NAME_DISPLAY);
		quarterNameField.setWidth("10%");

		ListGridField itemIDField = new ListGridField(ITEM_ID, ITEM_ID_DISPLAY);
		itemIDField.setHidden(true);

		ListGridField itemNameField = new ListGridField(ITEM_NAME,
				ITEM_NAME_DISPLAY);
		itemNameField.setHidden(false);

		ListGridField itemCodeField = new ListGridField(ITEM_CODE,
				ITEM_CODE_DISPLAY);
		itemCodeField.setHidden(false);

		ListGridField itemCategoryIDField = new ListGridField(ITEM_CATEGORY_ID,
				ITEM_CATEGORY_ID_DISPLAY);
		itemCategoryIDField.setHidden(true);

		ListGridField itemCategoryNameField = new ListGridField(
				ITEM_CATEGORY_NAME, ITEM_CATEGORY_NAME_DISPLAY);
		itemCategoryNameField.setHidden(true);

		ListGridField itemCategoryCodeField = new ListGridField(
				ITEM_CATEGORY_CODE, ITEM_CATEGORY_CODE_DISPLAY);
		itemCategoryCodeField.setHidden(true);

		ListGridField funderIdField = new ListGridField(FUNDER_ID,
				FUNDER_ID_DISPLAY);
		funderIdField.setHidden(true);
		ListGridField funderField = new ListGridField(FUNDER_NAME,
				FUNDER_NAME_DISPLAY);
		funderField.setHidden(true);

		ListGridField currencyIDField = new ListGridField(CURRENCY_ID,
				CURRENCY_ID_DISPLAY);
		currencyIDField.setHidden(true);

		ListGridField currencyNameField = new ListGridField(CURRENCY_NAME,
				CURRENCY_NAME_DISPLAY);
		currencyNameField.setHidden(true);

		ListGridField planStatusIDField = new ListGridField(STATUS_ID,
				STATUS_ID_DISPLAY);
		planStatusIDField.setHidden(true);

		ListGridField planStatusNameField = new ListGridField(STATUS_NAME,
				STATUS_NAME_DISPLAY);
		ListGridField levelField = new ListGridField(OPERATION_LEVEL,
				OPERATION_LEVEL_DISPLAY);
		planStatusNameField.setHidden(false);
		planStatusNameField.setImageSize(16);
		planStatusNameField.setAlign(Alignment.CENTER);
		planStatusNameField.setType(ListGridFieldType.IMAGE);
		planStatusNameField.setImageURLPrefix("icons/16/");
		planStatusNameField.setImageURLSuffix(".png");

		ListGridField planCommentField = new ListGridField(COMMENT,
				COMMENT_DISPLAY);
		planCommentField.setHidden(true);

		ListGridField unitCostField = new ListGridField(UNIT_COST,
				UNIT_COST_DISPLAY);
		unitCostField.setCellAlign(Alignment.CENTER);
		unitCostField.setHidden(false);

		ListGridField quantityField = new ListGridField(QUANTITY,
				QUANTITY_DISPLAY);
		quantityField.setCellAlign(Alignment.CENTER);
		quantityField.setHidden(false);

		ListGridField estimatedCostField = new ListGridField(ESTIMATED_COST,
				ESTIMATED_COST_DISPLAY);
		estimatedCostField.setCellAlign(Alignment.CENTER);
		estimatedCostField.setHidden(false);

		ListGridField planTypeField = new ListGridField(PLAN_TYPE,
				PLAN_TYPE_DISPLAY);
		planTypeField.setHidden(true);

		ListGridField divisionIDField = new ListGridField(DIVISION_ID,
				DIVISION_ID_DISPLAY);
		divisionIDField.setHidden(true);

		ListGridField divisionCodeField = new ListGridField(DIVISION_CODE,
				DIVISION_CODE_DISPLAY);
		divisionCodeField.setHidden(true);

		ListGridField divisionNameField = new ListGridField(DIVISION_NAME,
				DIVISION_NAME_DISPLAY);
		divisionNameField.setWidth("10%");
		divisionNameField.setHidden(true);

		ListGridField accountIDField = new ListGridField(ACCOUNT_ID,
				ACCOUNT_ID_DISPLAY);
		accountIDField.setHidden(true);

		ListGridField accountNameField = new ListGridField(ACCOUNT_NAME,
				ACCOUNT_NAME_DISPLAY);
		accountNameField.setWidth("10%");
		accountNameField.setHidden(true);

		ListGridField accountCodeField = new ListGridField(ACCOUNT_CODE,
				ACCOUNT_CODE_DISPLAY);
		accountCodeField.setWidth("10%");

		ListGridField unitsIDField = new ListGridField(UNITS_ID,
				UNITS_ID_DISPLAY);
		unitsIDField.setHidden(true);

		ListGridField unitsNameField = new ListGridField(UNITS_NAME,
				UNITS_NAME_DISPLAY);
		unitsNameField.setHidden(true);

		ListGridField unitsSymbolField = new ListGridField(UNITS_SYMBOL,
				UNITS_SYMBOL_DISPLAY);
		unitsSymbolField.setHidden(true);

		ListGridField departmentIDField = new ListGridField(DEPARTMENT_ID,
				DEPARTMENT_ID_DISPLAY);
		departmentIDField.setHidden(true);

		ListGridField departmentCodeField = new ListGridField(DEPARTMENT_CODE,
				DEPARTMENT_CODE_DISPLAY);
		departmentCodeField.setWidth("10%");
		departmentCodeField.setHidden(true);

		ListGridField departmentNameField = new ListGridField(DEPARTMENT_NAME,
				DEPARTMENT_NAME_DISPLAY);
		departmentNameField.setWidth("10%");
		departmentNameField.setHidden(true);

		ListGridField procurementMethodIDField = new ListGridField(
				PROCUREMENT_METHOD_ID, PROCUREMENT_METHOD_ID_DISPLAY);
		procurementMethodIDField.setHidden(true);

		ListGridField procurementMethodNameField = new ListGridField(
				PROCUREMENT_METHOD_NAME, PROCUREMENT_METHOD_NAME_DISPLAY);
		procurementMethodNameField.setHidden(true);

		ListGridField activityIDField = new ListGridField(ACTIVITY_ID,
				ACTIVITY_ID_DISPLAY);
		activityIDField.setHidden(true);

		ListGridField activityNameField = new ListGridField(ACTIVITY_NAME,
				ACTIVITY_NAME_DISPLAY);
		activityNameField.setWidth("10%");
		activityNameField.setHidden(true);

		ListGridField activityCodeField = new ListGridField(ACTIVITY_CODE,
				ACTIVITY_CODE_DISPLAY);
		activityCodeField.setWidth("10%");
		activityCodeField.setHidden(true);

		ListGridField procurementTypeIDField = new ListGridField(
				PROCUREMENT_TYPE_ID, PROCUREMENT_TYPE_ID_DISPLAY);
		procurementTypeIDField.setHidden(true);

		ListGridField procurementTypeNameField = new ListGridField(
				PROCUREMENT_TYPE_NAME, PROCUREMENT_TYPE_NAME_DISPLAY);
		procurementTypeNameField.setHidden(true);

		ListGridField procurementLengthField = new ListGridField(
				PROCUREMENT_LENGTH, PROCUREMENT_LENGTH_DISPLAY);
		procurementLengthField.setHidden(true);

		ListGridField dateRequiredField = new ListGridField(DATE_REQUIRED,
				DATE_REQUIRED_DISPLAY);
		dateRequiredField.setHidden(true);

		ListGridField createdByField = new ListGridField(CREATED_BY,
				CREATED_BY_DISPLAY);
		createdByField.setHidden(true);
		
		ListGridField changedByField = new ListGridField(CHANGED_BY,
				CHANGED_BY_DISPLAY);
		changedByField.setHidden(true);

		ListGridField dateCreatedField = new ListGridField(DATE_CREATED,
				DATE_CREATED_DISPLAY);
		dateCreatedField.setHidden(true);
		
		ListGridField dateChangedField = new ListGridField(DATE_CHANGED,
				DATE_CHANGED_DISPLAY);
		dateChangedField.setHidden(true);

		this.setBaseStyle("myBoxedGridCell");
		this.setWrapCells(true);
		this.setFixedRecordHeights(false);
		this.setGroupByField(ACCOUNT_NAME,ACTIVITY_NAME);
		this.setGroupStartOpen(GroupStartOpen.ALL);
		this.setCanMultiSort(true);
		this.sort(DIVISION_CODE, SortDirection.ASCENDING);
		this.setDrawAheadRatio(4);
		this.setCanExpandRecords(true);
		this.setAlternateRecordStyles(true);
		this.setShowRowNumbers(true);
		this.setCanPickFields(false);
		//this.setAutoFetchData(true);
		this.setShowFilterEditor(true);
		this.setFilterOnKeypress(true);
		

		this.setSelectionAppearance(SelectionAppearance.CHECKBOX);
		
		/*planDataSource = new ProcurementPlanDataSource(this);*/
		 
	    ///this.setDataSource(planDataSource);
	
		this.setEmptyMessage("There are no Records");

		this.setFields(planIDField, financialYearIDField, itemIDField,
				planStatusIDField, departmentIDField, accountIDField,
				procurementMethodIDField, currencyIDField, currencyNameField,
				activityIDField, divisionIDField, procurementTypeIDField,
				unitsIDField, financialYearNameField,departmentNameField,
				departmentCodeField, activityCodeField, activityNameField,
				divisionCodeField, divisionNameField,accountNameField,
				procurementMethodNameField, procurementTypeNameField,
				procurementLengthField, itemCodeField, itemNameField,
				itemCategoryIDField, itemCategoryCodeField,
				itemCategoryNameField, unitsSymbolField, unitsNameField,
				quantityField, unitCostField, estimatedCostField,
				dateRequiredField, planStatusNameField, createdByField,
				changedByField, dateCreatedField, dateChangedField,
				funderIdField, funderField);

		DV_Items.setTop(250);
		DV_Items.setWidth100();
		DV_Items.setHeight100();

		DV_Items.setFields(

		new DetailViewerField(ITEM_CODE, ITEM_CODE_DISPLAY),
				new DetailViewerField(ITEM_NAME, ITEM_NAME_DISPLAY),
				new DetailViewerField(UNITS_NAME, UNITS_NAME_DISPLAY),
				new DetailViewerField(QUANTITY, QUANTITY_DISPLAY),
				new DetailViewerField(UNIT_COST, UNIT_COST_DISPLAY),
				new DetailViewerField(ESTIMATED_COST, ESTIMATED_COST_DISPLAY),
				new DetailViewerField(CURRENCY_NAME, CURRENCY_NAME_DISPLAY));
		DV_Items.setEmptyMessage("");

		DV_Items.setData(new DetailViewerRecord[] { DR_Items });

		DV_Others.setTop(250);
		DV_Others.setWidth100();
		DV_Others.setHeight100();
		DV_Others.setFields(

		new DetailViewerField(PLAN_TYPE, PLAN_TYPE_DISPLAY),
				new DetailViewerField(PROCUREMENT_METHOD_NAME,
						PROCUREMENT_METHOD_NAME_DISPLAY),
				new DetailViewerField(PROCUREMENT_LENGTH,
						PROCUREMENT_LENGTH_DISPLAY), new DetailViewerField(
						FINANCIAL_YEAR_NAME, FINANCIAL_YEAR_NAME_DISPLAY),
				new DetailViewerField(PROCUREMENT_TYPE_NAME,
						PROCUREMENT_TYPE_NAME_DISPLAY), new DetailViewerField(
						DATE_REQUIRED, DATE_REQUIRED_DISPLAY),
				new DetailViewerField(COMMENT, COMMENT_DISPLAY),
				new DetailViewerField(CREATED_BY, CREATED_BY_DISPLAY),
				new DetailViewerField(CHANGED_BY, CHANGED_BY_DISPLAY),
				new DetailViewerField(DATE_CREATED, DATE_CREATED_DISPLAY),
				new DetailViewerField(DATE_CHANGED, DATE_CHANGED_DISPLAY));
		DV_Others.setEmptyMessage("");

		DV_Others.setData(new DetailViewerRecord[] { DR_Others });

		DV_Approvals.setTop(250);
		DV_Approvals.setWidth100();
		DV_Approvals.setHeight100();
		DV_Approvals.setFields(

		new DetailViewerField(STATUS_NAME, STATUS_NAME_DISPLAY));
		DV_Approvals.setEmptyMessage("");

		DV_Approvals.setData(new DetailViewerRecord[] { DR_Approvals });

	}

	// Expansion Component
	protected Canvas getExpansionComponent(final ListGridRecord record) {

		// rollOverRecord = this.getRecord(rowNum);
		final ListGrid grid = this;

		for (ListGridRecord gr : grid.getRecords()) {
			if (gr != record) {
				grid.collapseRecord(gr);
			}
		}
		grid.selectRecord(record);

		VLayout layout = new VLayout(5);
		layout.setPadding(5);

		tabSet.setWidth100();
		tabSet.setHeight(224);

		itemsTab.setTitle("Item Details ");
		itemsTab.setID("planGridItemsTab");
		itemsTab.setCanClose(false);

		othersTab.setTitle("Other Details ");
		othersTab.setID("planGridOthersTab");
		othersTab.setCanClose(false);

		approvalsTab.setTitle("Approval Details ");
		approvalsTab.setID("planGridApprovalsTab");
		approvalsTab.setCanClose(false);

		workFlowTab.setTitle("Approve Plan ");
		workFlowTab.setID("planGridWorkFlowTab");
		workFlowTab.setCanClose(false);

		itemsTab.setPane(DV_Items);
		othersTab.setPane(DV_Others);
		approvalsTab.setPane(DV_Approvals);

		VL_APPROVE.setHeight100();
		VL_APPROVE.setWidth100();
		VL_APPROVE.setPadding(2);

		HL_BUTTON.setWidth100();
		HL_BUTTON.setMembersMargin(2);
		HL_BUTTON.setAlign(Alignment.CENTER);
		HL_BUTTON.addMember(submitApproval);
		HL_BUTTON.addMember(cancelApproval);

		VL_APPROVE.addMember(DF_APPROVE);
		VL_APPROVE.addMember(HL_BUTTON);

		tabSet.addTab(itemsTab);
		tabSet.addTab(othersTab);
		tabSet.addTab(approvalsTab);

		layout.addMember(tabSet);

		hLayout.setAlign(Alignment.CENTER);

		/*workFlowButton.setTop(250);
		workFlowButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				// permissionsGrid.saveAllEdits();
			}
		});*/
		// hLayout.addMember(workFlowButton);

	/*	removeButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				// permissionsGrid.discardAllEdits();
			}
		});*/
       /*
		hLayout.addMember(editPlanButton);
		hLayout.addMember(deletePlanButton);

		hLayout.addMember(cancelButton);*/

		/*
		 * IButton closeButton = new IButton("Close");
		 * closeButton.addClickHandler(new ClickHandler() { public void
		 * onClick(ClickEvent event) { grid.collapseRecord(record); } });
		 */
	    /*closeButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				grid.collapseRecord(record);
			}
		});
		hLayout.addMember(closeButton);*/

		//layout.addMember(hLayout);

		return layout;

	}

	/**
	 * @return the itemsTab
	 */
	public Tab getItemsTab() {
		return itemsTab;
	}

	/**
	 * @return the othersTab
	 */
	public Tab getOthersTab() {
		return othersTab;
	}

	/**
	 * @return the approvalsTab
	 */
	public Tab getApprovalsTab() {
		return approvalsTab;
	}

	/**
	 * @return the workFlowTab
	 */
	public Tab getWorkFlowTab() {
		return workFlowTab;
	}

	/**
	 * @return the dV_Items
	 */
	public DetailViewer getDV_Items() {
		return DV_Items;
	}

	/**
	 * @return the dV_Others
	 */
	public DetailViewer getDV_Others() {
		return DV_Others;
	}

	/**
	 * @return the dV_Approvals
	 */
	public DetailViewer getDV_Approvals() {
		return DV_Approvals;
	}

	/**
	 * @return the dR_Items
	 */
	public DetailViewerRecord getDR_Items() {
		return DR_Items;
	}

	/**
	 * @return the dR_Others
	 */
	public DetailViewerRecord getDR_Others() {
		return DR_Others;
	}

	/**
	 * @return the dR_Approvals
	 */
	public DetailViewerRecord getDR_Approvals() {
		return DR_Approvals;
	}

	/**
	 * @return the submitApproval
	 */
	public Button getSubmitApproval() {
		return submitApproval;
	}

	/**
	 * @return the cancelApproval
	 */
	public Button getCancelApproval() {
		return cancelApproval;
	}
    /*
	*//**
	 * @return the workFlowButton
	 *//*
	public IButton getWorkFlowButton() {
		return workFlowButton;
	}

	*//**
	 * @return the hLayout
	 *//*
	public HLayout gethLayout() {
		return hLayout;
	}

	
	public IButton getPrintFormFive() {
		return printFormFive;
	}

	
	public IButton getCloseButton() {
		return closeButton;
	}


	public IButton getEditPlanButton() {
		return editPlanButton;
	}

	public IButton getDeletePlanButton() {
		return deletePlanButton;
	}*/

	public void loadProcurementPlans(List<ProcurementPlan> plans) {

		ListGridRecord[] list = new ListGridRecord[plans.size()];
		int listCount = 0;
		ListGridRecord record;
		for (ProcurementPlan plan : plans) {

			record = new ListGridRecord();
			record.setAttribute(ICON, "calender");
			record.setAttribute(PLAN_ID, plan.getId());
			
			record.setAttribute(FINANCIAL_YEAR_ID, plan.getFinancialYear()
					.getId());
			record.setAttribute(FINANCIAL_YEAR_NAME, plan.getFinancialYear()
					.getDescription());
			
			/*if (plan.getPlanningPeriod() != null) {
				record.setAttribute(ProcurementPlansListGrid.PERIOD_ID, plan
						.getPlanningPeriod().getId());
				record.setAttribute(ProcurementPlansListGrid.PERIOD_NAME,
						plan.getPlanningPeriod().getPlanningPeriodName());
			}*/

	
			record.setAttribute(CURRENCY_ID, plan.getCurrency().getId());
			record.setAttribute(CURRENCY_NAME, plan.getCurrency().getCurrencyName());
			record.setAttribute(CURRENCY_SYMBOL, plan.getCurrency()
					.getSymbol());
			record.setAttribute(PROCUREMENT_TYPE_NAME, plan
					.getProcurementType().getProcurementType());

			/*if (plan.getPlanStatus() != null) {
				record.setAttribute(STATUS_NAME, plan.getPlanStatus()
						.getStatus().name());
			} else {
				record.setAttribute(STATUS_NAME, "NULL");
			}*/
            /*
			if (plan.getPlanType() != null) {
				record.setAttribute(PLAN_TYPE, plan.getPlanType().name());
			}
           */

			record.setAttribute(ESTIMATED_COST,
					nf.format(plan.getEstimatedCost()));
			record.setAttribute(COMMENT, plan.getComment());
			record.setAttribute(DATE_REQUIRED, plan.getDateRequired());


			record.setAttribute(ITEM_ID, plan.getItem().getId());
			record.setAttribute(ITEM_CODE, plan.getItem().getCode());
			record.setAttribute(ITEM_NAME, plan.getItem().getItemName());

			record.setAttribute(QUANTITY, plan.getQuantity());
			record.setAttribute(UNIT_COST, nf.format(plan.getUnitCost()));
			/*
			record.setAttribute(CREATED_BY, plan.getCreatedBy().getUsername());
			record.setAttribute(CHANGED_BY, plan.getChangedBy().getUsername());*/
			record.setAttribute(DATE_CREATED, plan.getDateCreated());
			record.setAttribute(DATE_CHANGED, plan.getDateChanged());
			
			record.setAttribute(UNITS_ID, plan.getMeasurementUnit().getId());
			record.setAttribute(UNITS_NAME, plan.getMeasurementUnit()
					.getName());
			record.setAttribute(UNITS_SYMBOL, plan.getMeasurementUnit()
					.getSymbol());

			record.setAttribute(FUNDER_ID, plan.getFundingAgency().getId());
			record.setAttribute(FUNDER_NAME, plan.getFundingAgency().getName());
			
			record.setAttribute(ACTIVITY_ID, plan.getActivity().getId());
			record.setAttribute(ACTIVITY_CODE, plan
					.getActivity().getActivityCode());
			record.setAttribute(ACTIVITY_NAME, plan
					.getActivity().getActivityName());
			
			record.setAttribute(ACCOUNT_ID, plan.getAccount().getId());
			record.setAttribute(ACCOUNT_CODE, plan.getAccount().getAccountCode());
			record.setAttribute(ACCOUNT_NAME, plan.getAccount().getAccountName());

			record.setAttribute("emptyField", "");

			if (plan.getChangedBy() != null) {

			} else {

			}

			if (plan.getCreatedBy() != null) {

			
			} else {

			}
			list[listCount] = record;
			listCount++;

		}
		if (list.length > 0) {
			this.setData(list);
			this.redraw();
			
		} else {

		}
	}

	/*
	 * Function calculates the Quarter a date belongs to Each quarter is 3
	 * months
	 */

	@SuppressWarnings("deprecation")
	public static String getDateQuarter(Date date) {

		String QUARTER = "";

		int month = date.getMonth();

		if (month <= 3) {

			QUARTER = "FIRST QUARTER";

		} else if (month > 3 && month <= 6) {

			QUARTER = "SECOND QUARTER";

		} else if (month > 6 && month <= 9) {

			QUARTER = "THIRD QUARTER";

		} else if (month > 9 && month <= 12) {

			QUARTER = "FOURTH QUARTER";

		}

		return QUARTER;
	}

/*	private class ProcurementPlanDataSource extends LocalDataSource {

		public ProcurementPlanDataSource(DataBoundComponent dbc) {
			super(dbc);

			DataSourceTextField icon = new DataSourceTextField(
					ProcurementPlansListGrid.ICON,
					ProcurementPlansListGrid.ICON_DISPLAY_NAME);
			
			DataSourceTextField planID = new DataSourceTextField(
					ProcurementPlansListGrid.PLAN_ID,
					ProcurementPlansListGrid.PLAN_ID_DISPLAY);
			
			DataSourceTextField financialYearID = new DataSourceTextField(
					ProcurementPlansListGrid.FINANCIAL_YEAR_ID,
					ProcurementPlansListGrid.FINANCIAL_YEAR_ID_DISPLAY);
			
			DataSourceTextField financialYearCode = new DataSourceTextField(
					ProcurementPlansListGrid.FINANCIAL_YEAR_NAME,
					ProcurementPlansListGrid.FINANCIAL_YEAR_NAME_DISPLAY);
			
			DataSourceTextField quarter = new DataSourceTextField(
					ProcurementPlansListGrid.QUARTER_NAME,
					ProcurementPlansListGrid.QUARTER_NAME_DISPLAY);

			DataSourceTextField itemName = new DataSourceTextField(
					ProcurementPlansListGrid.ITEM_NAME,
					ProcurementPlansListGrid.ITEM_NAME_DISPLAY);
			
			DataSourceTextField itemID = new DataSourceTextField(
					ProcurementPlansListGrid.ITEM_ID,
					ProcurementPlansListGrid.ITEM_ID_DISPLAY);
			
			DataSourceTextField itemCode = new DataSourceTextField(
					ProcurementPlansListGrid.ITEM_CODE,
					ProcurementPlansListGrid.ITEM_CODE_DISPLAY);
			
			DataSourceTextField itemCategoryID = new DataSourceTextField(
					ProcurementPlansListGrid.ITEM_CATEGORY_ID,
					ProcurementPlansListGrid.ITEM_CATEGORY_ID_DISPLAY);
			
			DataSourceTextField itemCategoryName = new DataSourceTextField(
					ProcurementPlansListGrid.ITEM_CATEGORY_NAME,
					ProcurementPlansListGrid.ITEM_CATEGORY_NAME_DISPLAY);
			
			DataSourceTextField itemCategoryCode = new DataSourceTextField(
					ProcurementPlansListGrid.ITEM_CATEGORY_CODE,
					ProcurementPlansListGrid.ITEM_CATEGORY_CODE_DISPLAY);

			DataSourceTextField funderID = new DataSourceTextField(
					ProcurementPlansListGrid.FUNDER_ID,
					ProcurementPlansListGrid.FUNDER_ID_DISPLAY);
			
			DataSourceTextField funderName = new DataSourceTextField(
					ProcurementPlansListGrid.FUNDER_NAME,
					ProcurementPlansListGrid.FUNDER_NAME_DISPLAY);

			DataSourceTextField periodID = new DataSourceTextField(
					ProcurementPlansListGrid.PERIOD_ID,
					ProcurementPlansListGrid.PERIOD_ID_DISPLAY);
			
			DataSourceTextField periodName = new DataSourceTextField(
					ProcurementPlansListGrid.PERIOD_NAME,
					ProcurementPlansListGrid.PERIOD_NAME_DISPLAY);

			DataSourceTextField statusID = new DataSourceTextField(
					ProcurementPlansListGrid.STATUS_ID,
					ProcurementPlansListGrid.STATUS_ID_DISPLAY);
			
			DataSourceTextField statusName = new DataSourceTextField(
					ProcurementPlansListGrid.STATUS_NAME,
					ProcurementPlansListGrid.STATUS_NAME_DISPLAY);

			DataSourceTextField comment = new DataSourceTextField(
					ProcurementPlansListGrid.COMMENT,
					ProcurementPlansListGrid.COMMENT_DISPLAY);
			
			DataSourceTextField operationalLevel = new DataSourceTextField(
					ProcurementPlansListGrid.OPERATION_LEVEL,
					ProcurementPlansListGrid.OPERATION_LEVEL_DISPLAY);

			DataSourceTextField dateRequired = new DataSourceTextField(
					ProcurementPlansListGrid.DATE_REQUIRED,
					ProcurementPlansListGrid.DATE_REQUIRED_DISPLAY);

			DataSourceTextField quantity = new DataSourceTextField(
					ProcurementPlansListGrid.QUANTITY,
					ProcurementPlansListGrid.QUANTITY_DISPLAY);
			
			DataSourceTextField estimatedTotalCost = new DataSourceTextField(
					ProcurementPlansListGrid.ESTIMATED_COST,
					ProcurementPlansListGrid.ESTIMATED_COST_DISPLAY);
			
			DataSourceTextField estimatedUnitCost = new DataSourceTextField(
					ProcurementPlansListGrid.UNIT_COST,
					ProcurementPlansListGrid.UNIT_COST_DISPLAY);

			DataSourceTextField accountID = new DataSourceTextField(
					ProcurementPlansListGrid.ACCOUNT_ID,
					ProcurementPlansListGrid.ACCOUNT_ID_DISPLAY);
			
			DataSourceTextField accountCode = new DataSourceTextField(
					ProcurementPlansListGrid.ACCOUNT_CODE,
					ProcurementPlansListGrid.ACCOUNT_CODE_DISPLAY);
			
			DataSourceTextField accountName = new DataSourceTextField(
					ProcurementPlansListGrid.ACCOUNT_NAME,
					ProcurementPlansListGrid.ACCOUNT_NAME_DISPLAY);

			DataSourceTextField activityID = new DataSourceTextField(
					ProcurementPlansListGrid.ACTIVITY_ID,
					ProcurementPlansListGrid.ACTIVITY_ID_DISPLAY);
			
			DataSourceTextField activityCode = new DataSourceTextField(
					ProcurementPlansListGrid.ACTIVITY_CODE,
					ProcurementPlansListGrid.ACTIVITY_CODE_DISPLAY);
			
			DataSourceTextField activityName = new DataSourceTextField(
					ProcurementPlansListGrid.ACTIVITY_NAME,
					ProcurementPlansListGrid.ACTIVITY_NAME_DISPLAY);

			DataSourceTextField divisionID = new DataSourceTextField(
					ProcurementPlansListGrid.DIVISION_ID,
					ProcurementPlansListGrid.DIVISION_ID_DISPLAY);
			
			DataSourceTextField divisionName = new DataSourceTextField(
					ProcurementPlansListGrid.DIVISION_NAME,
					ProcurementPlansListGrid.DIVISION_NAME_DISPLAY);
			
			DataSourceTextField divisionCode = new DataSourceTextField(
					ProcurementPlansListGrid.DIVISION_CODE,
					ProcurementPlansListGrid.DIVISION_CODE_DISPLAY);

			DataSourceTextField departmentID = new DataSourceTextField(
					ProcurementPlansListGrid.DEPARTMENT_ID,
					ProcurementPlansListGrid.DEPARTMENT_ID_DISPLAY);
			
			DataSourceTextField departmentName = new DataSourceTextField(
					ProcurementPlansListGrid.DEPARTMENT_NAME,
					ProcurementPlansListGrid.DEPARTMENT_NAME_DISPLAY);
			
			DataSourceTextField departmentCode = new DataSourceTextField(
					ProcurementPlansListGrid.DEPARTMENT_CODE,
					ProcurementPlansListGrid.DEPARTMENT_CODE_DISPLAY);

			DataSourceTextField procurementMethodID = new DataSourceTextField(
					ProcurementPlansListGrid.PROCUREMENT_METHOD_ID,
					ProcurementPlansListGrid.PROCUREMENT_METHOD_ID_DISPLAY);
			
			DataSourceTextField procurementMethodName = new DataSourceTextField(
					ProcurementPlansListGrid.PROCUREMENT_METHOD_NAME,
					ProcurementPlansListGrid.PROCUREMENT_METHOD_NAME_DISPLAY);

			DataSourceTextField unitID = new DataSourceTextField(
					ProcurementPlansListGrid.UNITS_ID,
					ProcurementPlansListGrid.UNITS_ID_DISPLAY);
			
			DataSourceTextField unitName = new DataSourceTextField(
					ProcurementPlansListGrid.UNITS_NAME,
					ProcurementPlansListGrid.UNITS_NAME_DISPLAY);
			
			DataSourceTextField unitSymbol = new DataSourceTextField(
					ProcurementPlansListGrid.UNITS_SYMBOL,
					ProcurementPlansListGrid.UNITS_SYMBOL_DISPLAY);

			DataSourceTextField createdBy = new DataSourceTextField(
					ProcurementPlansListGrid.CREATED_BY,
					ProcurementPlansListGrid.CREATED_BY_DISPLAY);
			
			DataSourceTextField changedBy = new DataSourceTextField(
					ProcurementPlansListGrid.CHANGED_BY,
					ProcurementPlansListGrid.CHANGED_BY_DISPLAY);
			
			DataSourceTextField dateCreated = new DataSourceTextField(
					ProcurementPlansListGrid.DATE_CREATED,
					ProcurementPlansListGrid.DATE_CREATED_DISPLAY);
			
			DataSourceTextField dateChanged = new DataSourceTextField(
					ProcurementPlansListGrid.DATE_CHANGED,
					ProcurementPlansListGrid.DATE_CHANGED_DISPLAY);

			DataSourceTextField procurementTypeID = new DataSourceTextField(
					ProcurementPlansListGrid.PROCUREMENT_TYPE_ID,
					ProcurementPlansListGrid.PROCUREMENT_TYPE_ID_DISPLAY);
			
			DataSourceTextField procurementTypeName = new DataSourceTextField(
					ProcurementPlansListGrid.PROCUREMENT_TYPE_NAME,
					ProcurementPlansListGrid.PROCUREMENT_TYPE_NAME_DISPLAY);

			DataSourceTextField procurementLength = new DataSourceTextField(
					ProcurementPlansListGrid.PROCUREMENT_LENGTH,
					ProcurementPlansListGrid.PROCUREMENT_LENGTH_DISPLAY);

			this.setClientOnly(true);
			this.setFields(icon, planID, financialYearID, financialYearCode,
					quarter, itemID, itemName, itemCode, itemCategoryID,
					itemCategoryName, itemCategoryCode, funderID, funderName,
					periodID, periodName, statusID, statusName, accountID,
					accountName, accountCode, activityID, activityCode,
					activityName, divisionID, divisionName, divisionCode,
					departmentID, departmentName, departmentCode,
					procurementMethodID, procurementMethodName, unitID,
					unitName, unitSymbol, createdBy, changedBy, dateCreated,
					dateChanged, procurementTypeID, procurementTypeName,
					procurementLength);

		}
	}
*/

}
