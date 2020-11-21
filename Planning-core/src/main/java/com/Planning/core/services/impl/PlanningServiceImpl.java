package com.Planning.core.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Planning.core.Dao.PlanningPeriodDAO;
import com.Planning.core.Dao.ProcurementPlanDAO;
import com.Planning.core.services.PlanningService;
import com.Planning.model.PlanningPeriod;
import com.Planning.model.ProcurementPlan;
import com.googlecode.genericdao.search.Search;
import com.planetsystems.model.utils.utils_model.FinancialYear;

@Service("PlanningService")
@Transactional
public class PlanningServiceImpl implements PlanningService{
	
	@Autowired
	private PlanningPeriodDAO planningPeriodDAO;
	
	@Autowired
	private ProcurementPlanDAO procurementPlanDAO;

	@Transactional
	public String save(PlanningPeriod planningPeriod) {
		try {
			planningPeriodDAO.save(planningPeriod);
			return "Successfully Saved";
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return ex.getMessage();
		}
	}
	
	@Transactional
	public String Edit(PlanningPeriod planningPeriod) {
		try {
			planningPeriodDAO.update(planningPeriod);
			return "Successfully updated";
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return ex.getMessage();
		}
	}

	@Transactional
	public String Delete(PlanningPeriod planningPeriod) {
		try {
			planningPeriodDAO.delete(planningPeriod);
			return "Successfully Deleted";
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return ex.getMessage();
		}
	}

	@Transactional
	public String Delete(String PlanningPeriodId) {
		try {
			//planningPeriodDAO.
			return "Successfully deleted";
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return ex.getMessage();
		}
	}

	@Transactional
	public PlanningPeriod find(String PlanningPeriodId) {
		try {
			return planningPeriodDAO.find(PlanningPeriodId);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	
	@Transactional
	public List<PlanningPeriod> findAll() {
		try {
			return planningPeriodDAO.findAll();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}
		return null;
	}

	@Transactional
	public List<PlanningPeriod> findPlanningPeriodByFinancial(
			FinancialYear financialYear) {
		List<PlanningPeriod> list = new ArrayList<PlanningPeriod>();
		try {
			Search search = new Search();
			search.addFilterEqual("financialYear", financialYear);
			List<PlanningPeriod> planningPeriods = planningPeriodDAO.search(search);

			for (PlanningPeriod planningPeriod : planningPeriods) {
				PlanningPeriod planningPeriodDTO = new PlanningPeriod();
				
				planningPeriodDTO.setId(planningPeriod.getId());
				planningPeriodDTO.setChangedBy(planningPeriod.getChangedBy());
				planningPeriodDTO.setCreatedBy(planningPeriod.getCreatedBy());
				planningPeriodDTO.setDateChanged(planningPeriod.getDateChanged());
				planningPeriodDTO.setDateCreated(planningPeriod.getDateCreated());
				planningPeriodDTO.setEndDate(planningPeriod.getEndDate());
				planningPeriodDTO.setStartDate(planningPeriod.getStartDate());
				planningPeriodDTO.setPeriodName(planningPeriod.getPeriodName());

				list.add(planningPeriodDTO);
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}
		return list;
	}
	
	//Procurment Plans
	
	//2/11/2015
	@Transactional
	public String save(ProcurementPlan procurementPlan) {
		try {
			procurementPlanDAO.save(procurementPlan);
			return "Successfully Saved";
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return ex.getMessage();
		}
	}

	@Transactional
	public List<ProcurementPlan> findAllProcurementPlans() {
		try {
			return procurementPlanDAO.findAll();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}
		return null;
	}
	

	@Transactional
	public String Edit(ProcurementPlan procurementPlan) {
		try {
			procurementPlanDAO.update(procurementPlan);
			return "Successfully updated";
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return ex.getMessage();
		}
	}

	@Transactional
	public String Delete(ProcurementPlan procurementPlan) {
		try {
			procurementPlanDAO.delete(procurementPlan);
			return "Successfully Deleted";
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return ex.getMessage();
		}
	}

}
