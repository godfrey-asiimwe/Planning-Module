package com.Planning.core.Dao.impl;

import org.springframework.stereotype.Repository;

import com.Planning.core.Dao.ProcurementPlanDAO;
import com.Planning.model.ProcurementPlan;

@Repository("ProcurementPlanDAO")
public class ProcurementPlanDAOImpl extends PlanningBaseDaoImpl<ProcurementPlan> implements ProcurementPlanDAO{

}
