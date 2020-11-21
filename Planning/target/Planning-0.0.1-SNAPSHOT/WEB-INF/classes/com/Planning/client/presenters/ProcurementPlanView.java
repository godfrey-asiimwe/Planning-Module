package com.Planning.client.presenters;

import com.Planning.client.Widgets.ProcurementPlansListGrid;
import com.Planning.client.Widgets.Windows.PlanFormWindow;
import com.Planning.client.Widgets.buttons.CancelButton;
import com.Planning.client.Widgets.buttons.DeleteButton;
import com.Planning.client.Widgets.buttons.EditButton;
import com.Planning.client.Widgets.buttons.LoadButton;
import com.Planning.client.Widgets.buttons.SaveButton;
import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VLayout;

public class ProcurementPlanView extends ViewImpl implements
		ProcurementPlanPresenter.MyView {

	private static final String CONTEXT_AREA_WIDTH = "100%";
	private VLayout panel;
	
	HLayout HL_BUTTONS_VIEW = new HLayout();
	
	private ProcurementPlansListGrid procurementPlansListGrid;
	
	private final CancelButton cancelButton = new CancelButton("Cancel");
	private final SaveButton saveButton = new SaveButton("Save");
	private final SaveButton addNewPlanButton = new SaveButton("New Plan");
	private final EditButton editPlanButton = new EditButton("Save Changes");
	private final DeleteButton deletePlanButton = new DeleteButton("Delete");
	private final LoadButton loadButton = new LoadButton("Load All Plans");
	private final LoadButton loadByYearButton = new LoadButton("Load By Year");
	
	
	private PlanFormWindow planFormWindow;
	
	
	@Inject
	public ProcurementPlanView(){
	
		this.procurementPlansListGrid=new ProcurementPlansListGrid();
		planFormWindow =new PlanFormWindow();
		
		panel = new VLayout();
		panel.setWidth(CONTEXT_AREA_WIDTH);
		panel.setBackgroundColor("white");
		panel.setHeight100();

		Label headerAdd = new Label();
		headerAdd = new Label();
		headerAdd.setStyleName("crm-ContextArea-Header-Label");
		headerAdd.setHeight("1%");
		headerAdd.setContents("Procurement Plans");
		headerAdd.setWidth("100%");
		headerAdd.setAlign(Alignment.LEFT);
		
		HL_BUTTONS_VIEW.setMembersMargin(10);
		HL_BUTTONS_VIEW.setAlign(Alignment.CENTER);
		HL_BUTTONS_VIEW.setWidth100();
		HL_BUTTONS_VIEW.setHeight("3%");
		HL_BUTTONS_VIEW.setPadding(8);
		HL_BUTTONS_VIEW.setMembers(addNewPlanButton);
		
		panel.addMember(headerAdd);
		panel.addMember(procurementPlansListGrid);
		panel.addMember(HL_BUTTONS_VIEW);
		
	}
	
	public Widget asWidget() {
		return panel;
	}

	
	public ProcurementPlansListGrid getProcurementPlansListGrid() {
		return procurementPlansListGrid;
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
		return editPlanButton;
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

	public PlanFormWindow getPlanFormWindow() {
		return planFormWindow;
	}

}