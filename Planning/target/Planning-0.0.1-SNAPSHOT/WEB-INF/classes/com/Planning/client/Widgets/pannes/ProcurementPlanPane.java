package com.Planning.client.Widgets.pannes;


import com.Planning.client.Widgets.buttons.CancelButton;
import com.Planning.client.Widgets.buttons.DeleteButton;
import com.Planning.client.Widgets.buttons.EditButton;
import com.Planning.client.Widgets.buttons.LoadButton;
import com.Planning.client.Widgets.buttons.PreviewButton;
import com.Planning.client.Widgets.buttons.SaveButton;
import com.google.gwt.i18n.client.NumberFormat;
import com.planetsystems.model.utils.utils_model.FinancialYear;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.ComboBoxItem;
import com.smartgwt.client.widgets.form.fields.DateItem;
import com.smartgwt.client.widgets.form.fields.FormItem;
import com.smartgwt.client.widgets.form.fields.TextAreaItem;
import com.smartgwt.client.widgets.form.fields.TextItem;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VLayout;

public class ProcurementPlanPane extends VLayout {
	
		DynamicForm DF_CREATE_ACCOUNT;
		DynamicForm DF_CREATE_ITEMS;
		DynamicForm DF_CREATE_COMMENT;
	
		DynamicForm DF_VIEW;
	
		DynamicForm DF_STATIC;
	
		HLayout HL_BUTTONS_CREATE = new HLayout();
		HLayout HL_BUTTONS_VIEW = new HLayout();
	
		private final CancelButton cancelButton = new CancelButton("Cancel");
		private final SaveButton saveButton = new SaveButton("Save");
		private final SaveButton addNewPlanButton = new SaveButton("New Plan");
		private final EditButton editButton = new EditButton("Save Changes");
		private final DeleteButton deletePlanButton = new DeleteButton("Delete");
		private final LoadButton loadButton = new LoadButton("Load All Plans");
		private final LoadButton loadByYearButton = new LoadButton("Load By Year");
		
		ComboBoxItem unitMeasureCombo = new ComboBoxItem("unitMeasureCombo", "Unit of Measure ");
		ComboBoxItem currencyCombo = new ComboBoxItem("currencyCombo", "Currency ");
		ComboBoxItem itemCombo = new ComboBoxItem("itemCombo", "Item ");
		ComboBoxItem financialYearCombo = new ComboBoxItem("financialYearCombo", "FinancialYear ");
		TextItem unitCostText = new TextItem("unitCostText", "Unit Cost");
	
		TextItem quantityText = new TextItem("quantityText", "Quantity");
		TextItem estimatedCostText = new TextItem("estimatedCostText", "Estimated Cost");
		TextItem defaultAmountText = new TextItem("defaultAmountText", "Default Amount");
		TextAreaItem commentText = new TextAreaItem("commentText", "Comment");
		TextAreaItem justificationtext = new TextAreaItem("justificationText", "Justification");
		TextAreaItem itemDescriptionText = new TextAreaItem("itemDescriptionText", "Item Description");
		TextItem procurementLenghtText = new TextItem("procurementLenghtText", "Procurement Length");
	
		DateItem dateRequiredItem = new DateItem("dateRequiredItem", "Date Required");
		ComboBoxItem fundingAgencyCombo = new ComboBoxItem("fundingAgencyCombo", "Funding Agency ");
		ComboBoxItem procurementTypeCombo = new ComboBoxItem("procurementTypeCombo", "Procurement Type");
		ComboBoxItem activitiesCombo = new ComboBoxItem("activity", "Activity");
		ComboBoxItem accountsCombo = new ComboBoxItem("account", "Account");
	
	    // Static Fields
		TextItem departmentText = new TextItem("departmentText", "Department");
		TextItem financialYearText = new TextItem("financialYearText", "Financial Year");
		TextItem organizationText = new TextItem("organizationText", "Organization");
		TextItem divisionText = new TextItem("divisionText", "Division");
		
		ComboBoxItem finYearCombo = new ComboBoxItem("finYearCombo","Financial Year");



		NumberFormat nf = NumberFormat.getFormat("#,##0.00");

		public static FinancialYear selectedFinancialYear = new FinancialYear();
		Label notificationLabel = new Label();
		String notificationContents = "<i>Notification Areas</i> for Planning Module";

		TextItem availableBalance = new TextItem("availableBalance", "Available Balance");
		PreviewButton previewReport=new PreviewButton("Report");


	public ProcurementPlanPane() {
		super();

		DF_STATIC = new DynamicForm();
		DF_STATIC.setWidth100();
		DF_STATIC.setWrapItemTitles(false);
		DF_STATIC.setNumCols(8);
		DF_STATIC.setIsGroup(true);
		DF_STATIC.setShowEdges(true);
		DF_STATIC.setEdgeSize(3);

		organizationText.setDisabled(true);
		financialYearText.setDisabled(true);
		departmentText.setDisabled(true);
		divisionText.setDisabled(true);
		DF_STATIC.setFields(finYearCombo,organizationText, financialYearText, departmentText, divisionText);

		for (FormItem FI : DF_STATIC.getFields()) {
			FI.setWidth(200);
			FI.setCellHeight(47);
		}

		DF_CREATE_ACCOUNT = new DynamicForm();
		DF_CREATE_ACCOUNT.setWidth100();
		DF_CREATE_ACCOUNT.setWrapItemTitles(false);
		DF_CREATE_ACCOUNT.setNumCols(6);
		DF_CREATE_ACCOUNT.setIsGroup(true);
		DF_CREATE_ACCOUNT.setShowEdges(true);
		DF_CREATE_ACCOUNT.setEdgeSize(3);
		DF_CREATE_ACCOUNT.setGroupTitle("Main ");
		DF_CREATE_ACCOUNT.setFields(finYearCombo,dateRequiredItem,fundingAgencyCombo,procurementTypeCombo,activitiesCombo,accountsCombo);

		for (FormItem FI : DF_CREATE_ACCOUNT.getFields()) {
			FI.setWidth(250);
			FI.setCellHeight(47);
		}

		DF_CREATE_ITEMS = new DynamicForm();
		DF_CREATE_ITEMS.setWidth100();
		DF_CREATE_ITEMS.setWrapItemTitles(false);
		DF_CREATE_ITEMS.setNumCols(6);
		DF_CREATE_ITEMS.setIsGroup(true);
		DF_CREATE_ITEMS.setGroupTitle("Items ");
		DF_CREATE_ITEMS.setShowEdges(true);
		DF_CREATE_ITEMS.setEdgeSize(3);

		procurementLenghtText.setDisabled(true);
		estimatedCostText.setDisabled(true);
		DF_CREATE_ITEMS.setFields(itemCombo, unitMeasureCombo, quantityText, unitCostText, estimatedCostText, currencyCombo);

		for (FormItem FI : DF_CREATE_ITEMS.getFields()) {
			FI.setWidth(250);
			FI.setCellHeight(47);
		}

		DF_CREATE_COMMENT = new DynamicForm();
		DF_CREATE_COMMENT.setWidth100();
		DF_CREATE_COMMENT.setWrapItemTitles(false);
		DF_CREATE_COMMENT.setNumCols(6);
		DF_CREATE_COMMENT.setFields(commentText);
		DF_CREATE_COMMENT.setGroupTitle("Others ");
		for (FormItem FI : DF_CREATE_COMMENT.getFields()) {
			FI.setWidth(250);
			FI.setCellHeight(47);
		}
		commentText.setColSpan(6);
		commentText.setWidth(1000);
		commentText.setHeight(35);


		HL_BUTTONS_CREATE.setMembersMargin(10);
		HL_BUTTONS_CREATE.setAlign(Alignment.CENTER);
		HL_BUTTONS_CREATE.setWidth100();
		HL_BUTTONS_CREATE.setMembersMargin(10);
		HL_BUTTONS_CREATE.setHeight("2%");
		HL_BUTTONS_CREATE.setMembers(saveButton, editButton, cancelButton);

        this.addMember(DF_CREATE_ACCOUNT);
        this.addMember(DF_CREATE_ITEMS);
        this.addMember(DF_CREATE_COMMENT);
        this.addMember(HL_BUTTONS_CREATE);
		
	}

	public CancelButton getCancelButton() {
		return cancelButton;
	}

	public SaveButton getSaveButton() {
		return saveButton;
	}


	public SaveButton getAddNewPlanButton() {
		return addNewPlanButton;
	}


	public EditButton getEditButton() {
		return editButton;
	}


	public DeleteButton getDeletePlanButton() {
		return deletePlanButton;
	}


	public LoadButton getLoadButton() {
		return loadButton;
	}

	public LoadButton getLoadByYearButton() {
		return loadByYearButton;
	}

	public ComboBoxItem getUnitMeasureCombo() {
		return unitMeasureCombo;
	}

	public ComboBoxItem getCurrencyCombo() {
		return currencyCombo;
	}

	public ComboBoxItem getItemCombo() {
		return itemCombo;
	}

	public ComboBoxItem getFinancialYearCombo() {
		return financialYearCombo;
	}

	public TextItem getUnitCostText() {
		return unitCostText;
	}

	public TextItem getQuantityText() {
		return quantityText;
	}

	public TextItem getEstimatedCostText() {
		return estimatedCostText;
	}


	public TextAreaItem getCommentText() {
		return commentText;
	}

	public DateItem getDateRequiredItem() {
		return dateRequiredItem;
	}


	public ComboBoxItem getFundingAgencyCombo() {
		return fundingAgencyCombo;
	}

	public ComboBoxItem getProcurementTypeCombo() {
		return procurementTypeCombo;
	}

	public NumberFormat getNf() {
		return nf;
	}

	public ComboBoxItem getFinYearCombo() {
		return finYearCombo;
	}

	public ComboBoxItem getActivitiesCombo() {
		return activitiesCombo;
	}

	public ComboBoxItem getAccountsCombo() {
		return accountsCombo;
	}

}
