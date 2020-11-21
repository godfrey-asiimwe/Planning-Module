package com.Planning.shared;

import com.Planning.model.PlanningPeriod;
import com.Planning.model.ProcurementPlan;
import com.gwtplatform.dispatch.shared.UnsecuredActionImpl;

public class Planning extends UnsecuredActionImpl<PlanningResult> {
	private String operation;
	private PlanningPeriod planningPeriod;
	private ProcurementPlan procurementPlan;
	
	public Planning() {
		
	}

	public Planning(String operation) {
		this.setOperation(operation);
	}
	
	public Planning(String operation,PlanningPeriod planningPeriod){
		this.planningPeriod=planningPeriod;
		this.setOperation(operation);
	}
	
	public Planning(String operation,ProcurementPlan procurementPlan){
		this.procurementPlan=procurementPlan;
		this.operation=operation;
	}

	/**
	 * @return the planningPeriod
	 */
	public PlanningPeriod getPlanningPeriod() {
		return planningPeriod;
	}

	/**
	 * @param planningPeriod the planningPeriod to set
	 */
	public void setPlanningPeriod(PlanningPeriod planningPeriod) {
		this.planningPeriod = planningPeriod;
	}

	/**
	 * @return the operation
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * @param operation the operation to set
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}

	/**
	 * @return the procurementPlan
	 */
	public ProcurementPlan getProcurementPlan() {
		return procurementPlan;
	}

	/**
	 * @param procurementPlan the procurementPlan to set
	 */
	public void setProcurementPlan(ProcurementPlan procurementPlan) {
		this.procurementPlan = procurementPlan;
	}
	
	

}
