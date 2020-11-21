package com.Planning.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Planning.client.util.PlanningConstants;
import com.Planning.core.services.PlanningService;
import com.Planning.model.PlanningPeriod;
import com.Planning.model.ProcurementPlan;
import com.Planning.shared.Planning;
import com.Planning.shared.PlanningResult;
import com.gwtplatform.dispatch.server.actionhandler.AbstractActionHandler;
import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.shared.ActionException;

public class PlanningActionHandler extends AbstractActionHandler<Planning, PlanningResult> {
	
	@Autowired
	PlanningService planningService;


	public PlanningActionHandler() {
		super(Planning.class);
	}

	public PlanningResult execute(Planning action, ExecutionContext context) throws ActionException {
		if (action.getOperation().equalsIgnoreCase(PlanningConstants.SAVE_PLANNING_PERIOD)) {

			String response = planningService.save(action.getPlanningPeriod());
			List<PlanningPeriod> planningPeriod = planningService.findAll();
			return new PlanningResult(response, planningPeriod, null);
		}
		else if (action.getOperation().equalsIgnoreCase(PlanningConstants.RETRIEVE_PLANNING_PERIOD)) {

			List<PlanningPeriod> planningPeriod = planningService.findAll();
			return new PlanningResult("Success", planningPeriod, null);
		}else if (action.getOperation().equalsIgnoreCase(PlanningConstants.EDIT_PLANNING_PERIOD)) {

			String response = planningService.Edit(action.getPlanningPeriod());
			List<PlanningPeriod> planningPeriod = planningService.findAll();
			return new PlanningResult(response, planningPeriod, null);
		}else if (action.getOperation().equalsIgnoreCase(PlanningConstants.DELETE_PLANNING_PERIOD)) {

			String response = planningService.Delete(action.getPlanningPeriod());
			List<PlanningPeriod> planningPeriod = planningService.findAll();
			return new PlanningResult(response, planningPeriod, null);
		}else if (action.getOperation().equalsIgnoreCase(PlanningConstants.SAVE_PROCUREMENT_PLAN)) {

			String response = planningService.save(action.getProcurementPlan());
			List<ProcurementPlan> procurementPlanList = planningService.findAllProcurementPlans();
			return new PlanningResult(response, procurementPlanList, null);

		}else if (action.getOperation().equalsIgnoreCase(PlanningConstants.RETRIEVE_PROCUREMENT_PLAN)) {

			List<ProcurementPlan> procurementPlanList = planningService.findAllProcurementPlans();
			return new PlanningResult("Success",procurementPlanList, null);
		}else if (action.getOperation().equalsIgnoreCase(PlanningConstants.EDIT_PROCUREMENT_PLAN)) {

			String response = planningService.Edit(action.getProcurementPlan());
			List<ProcurementPlan> procurementPlanList = planningService.findAllProcurementPlans();
			return new PlanningResult(response, procurementPlanList, null);

		}else if (action.getOperation().equalsIgnoreCase(PlanningConstants.DELETE_PROCUREMENT_PLAN)) {

			String response = planningService.Delete(action.getProcurementPlan());
			List<ProcurementPlan> procurementPlanList = planningService.findAllProcurementPlans();
			return new PlanningResult(response, procurementPlanList, null);

		}

		return null;
	}

	public void undo(Planning action, PlanningResult result, ExecutionContext context) throws ActionException {
		
	}

	@Override
	public Class<Planning> getActionType() {
		return Planning.class;
	}
}
