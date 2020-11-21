package com.Planning.shared;

import java.util.List;

import com.Planning.model.PlanningPeriod;
import com.Planning.model.ProcurementPlan;
import com.gwtplatform.dispatch.shared.Result;

public class PlanningResult implements Result {

	private String response;
	private List<PlanningPeriod> planningPeriodList;
	private List<ProcurementPlan> procurementPlanList;


	public PlanningResult() {
		
	}

	public PlanningResult(String response) {
		this.setResponse(response);
	}
	
	public PlanningResult(String response,List<PlanningPeriod> planningPeriodList,PlanningPeriod planningPeriod){
		this.response=response;
		this.planningPeriodList=planningPeriodList;
	}
	
	public PlanningResult(String response,List<ProcurementPlan> procurementPlanList,ProcurementPlan procurementPlan){
		this.procurementPlanList=procurementPlanList;
		this.response=response;
	}

	/**
	 * @return the response
	 */
	public String getResponse() {
		return response;
	}

	/**
	 * @param response the response to set
	 */
	public void setResponse(String response) {
		this.response = response;
	}

	/**
	 * @return the planningPeriodList
	 */
	public List<PlanningPeriod> getPlanningPeriodList() {
		return planningPeriodList;
	}

	/**
	 * @param planningPeriodList the planningPeriodList to set
	 */
	public void setPlanningPeriodList(List<PlanningPeriod> planningPeriodList) {
		this.planningPeriodList = planningPeriodList;
	}

	/**
	 * @return the procurementPlanList
	 */
	public List<ProcurementPlan> getProcurementPlanList() {
		return procurementPlanList;
	}

	/**
	 * @param procurementPlanList the procurementPlanList to set
	 */
	public void setProcurementPlanList(List<ProcurementPlan> procurementPlanList) {
		this.procurementPlanList = procurementPlanList;
	}

}
