package com.Planning.core.services;

import java.util.List;

import com.Planning.model.PlanningPeriod;
import com.Planning.model.ProcurementPlan;
import com.planetsystems.model.utils.utils_model.FinancialYear;

public interface PlanningService {
	
	public String save(PlanningPeriod planningPeriod);
	public String Edit(PlanningPeriod planningPeriod);
	public String Delete(PlanningPeriod planningPeriod);
	public String Delete(String PlanningPeriodId);
	public PlanningPeriod find(String PlanningPeriodId);
	public List<PlanningPeriod> findAll();
	public List<PlanningPeriod> findPlanningPeriodByFinancial(FinancialYear financialYear);
	
	//Procurement Plans
	//2/11/2015
	public String save(ProcurementPlan procurementPlan);
	public List<ProcurementPlan> findAllProcurementPlans();
	public String Edit(ProcurementPlan procurementPlan);
	public String Delete(ProcurementPlan procurementPlan);

}
