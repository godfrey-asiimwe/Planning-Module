package com.Planning.client.presenters;

import com.Planning.client.Widgets.PlanPeriodListGrid;
import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.planetsystems.ui.utils.utils_ui.client.widgets.CancelButton;
import com.planetsystems.ui.utils.utils_ui.client.widgets.DeleteButton;
import com.planetsystems.ui.utils.utils_ui.client.widgets.EditButton;
import com.planetsystems.ui.utils.utils_ui.client.widgets.SaveButton;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.ComboBoxItem;
import com.smartgwt.client.widgets.form.fields.DateItem;
import com.smartgwt.client.widgets.form.fields.FormItem;
import com.smartgwt.client.widgets.form.fields.TextItem;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VLayout;

public class PlanningPeriodView extends ViewImpl implements
		PlanningPeriodPresenter.MyView {
	
	private static final String CONTEXT_AREA_WIDTH = "100%";
	private VLayout panel;
	
	private final PlanPeriodListGrid planPeriodListGrid;
	
	private DynamicForm DF_FORM;
	
	private DynamicForm DF_FORM2;
	private DynamicForm DF_FORM3;
	private DynamicForm DF_FORM4;
	
	private HLayout HL_BUTTONS;
	
	final CancelButton cancelButton;
	final SaveButton saveButton;
	final EditButton editButton;
	final DeleteButton deleteButton;

	ComboBoxItem finYearCombo = new ComboBoxItem("finYearCombo","Financial Year");
	DateItem startDateItem = new DateItem("startDateItem","Start Date"); 
	DateItem endDateItem = new DateItem("endDateItem","End Date"); 
	TextItem periodNameText = new TextItem("periodNameText","Period Name");
	
	@Inject
	public PlanningPeriodView(){
	
		finYearCombo.setRequired(true);
		startDateItem.setRequired(true);
		endDateItem.setRequired(true);
		periodNameText.setRequired(true);
		
		cancelButton = new CancelButton("Cancel");
		saveButton = new SaveButton("Add New");
		saveButton.setAutoFit(true);
		editButton= new EditButton("Save Changes");
		editButton.setAutoFit(true);
		deleteButton= new DeleteButton("Delete");
		deleteButton.setAutoFit(true);

		panel = new VLayout();
		panel.setWidth(CONTEXT_AREA_WIDTH);
		panel.setBackgroundColor("white");
		panel.setHeight100();
		
		planPeriodListGrid=new PlanPeriodListGrid();
		
		this.planPeriodListGrid.setHeight("80%");

		DF_FORM = new DynamicForm();
		DF_FORM.setHeight(100);
		DF_FORM.setShowEdges(true);
		DF_FORM.setEdgeSize(3);
		DF_FORM.setWidth100();
		DF_FORM.setNumCols(6);
		DF_FORM.setWrapItemTitles(false);
		DF_FORM.setItems(finYearCombo,periodNameText,startDateItem,endDateItem);
		for(FormItem FI:DF_FORM.getFields())
		{
			FI.setWidth(200);
			FI.setCellHeight(47);
		}
		
		
		DF_FORM2 = new DynamicForm();
		DF_FORM2.setAutoHeight();
		DF_FORM2.setAutoWidth();
		DF_FORM2.setNumCols(6);
		DF_FORM2.setFields(saveButton);
	
		DF_FORM3 = new DynamicForm();
		DF_FORM3.setAutoHeight();
		DF_FORM3.setAutoWidth();
		DF_FORM3.setNumCols(6);
		DF_FORM3.setFields(editButton);
		
		DF_FORM4 = new DynamicForm();
		DF_FORM4.setAutoHeight();
		DF_FORM4.setAutoWidth();
		DF_FORM4.setNumCols(6);
		DF_FORM4.setFields(deleteButton);
		
		
		HL_BUTTONS = new HLayout();
		HL_BUTTONS.setMembersMargin(10);
		HL_BUTTONS.setAlign(Alignment.LEFT);
		HL_BUTTONS.setAutoHeight();
		HL_BUTTONS.setAutoWidth();
		HL_BUTTONS.setMembers(DF_FORM2,DF_FORM3,DF_FORM4);
		
		Label headerAdd = new Label();
		headerAdd = new Label();
		headerAdd.setStyleName("crm-ContextArea-Header-Label");
		headerAdd.setHeight("1%");
		headerAdd.setContents("Set Up Planning Periods");
		headerAdd.setWidth("100%");
		headerAdd.setAlign(Alignment.LEFT);
		
		panel.addMember(headerAdd);
		panel.addMember(DF_FORM);
		panel.addMember(HL_BUTTONS);
		panel.addMember(planPeriodListGrid);
		
	}
	
	public Widget asWidget() {
		return panel;
	}


	public ComboBoxItem getFinYearCombo() {
		return finYearCombo;
	}


	public DateItem getStartDateItem() {
		return startDateItem;
	}


	public DateItem getEndDateItem() {
		return endDateItem;
	}


	public TextItem getPeriodNameText() {
		return periodNameText;
	}


	public PlanPeriodListGrid getPlanPeriodListGrid() {
		return planPeriodListGrid;
	}

	public SaveButton getSaveButton() {
		return saveButton;
	}

	public EditButton getEditButton() {
		return editButton;
	}

	public DeleteButton getDeleteButton() {
		return deleteButton;
	}

	public DynamicForm getDF_FORM() {
		return DF_FORM;
	}

}
