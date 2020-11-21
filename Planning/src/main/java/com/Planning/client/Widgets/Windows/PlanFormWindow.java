package com.Planning.client.Widgets.Windows;

import com.Planning.client.Widgets.pannes.ProcurementPlanPane;
import com.smartgwt.client.widgets.Window;

public class PlanFormWindow extends Window{
	private ProcurementPlanPane procurementPlanPane;
	
	public PlanFormWindow(){	
		procurementPlanPane=new ProcurementPlanPane();
		this.setWidth("85%");
		this.setHeight("55%");
		this.setAutoCenter(true);
		this.setPadding(50);
		this.setTitle("Procurement Plan");
		this.setIsModal(true);
		this.setShowModalMask(true);
		this.addItem(procurementPlanPane);	
	}
	
	public ProcurementPlanPane getProcurementPlan() {
		return procurementPlanPane;
	}

}
