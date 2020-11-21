package com.Planning.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.planetsystems.model.utils.utils_model.FinancialYear;

@Entity
public class PlanningPeriod extends ParentEntity{

	private static final long serialVersionUID =1L;
	private FinancialYear financialYear;
	private String PeriodName;
	private Date startDate;
	private Date endDate;

	public PlanningPeriod(){
		
	}
	
	/**
	 * @return the financialYear
	 */
	@ManyToOne
	public FinancialYear getFinancialYear() {
		return financialYear;
	}

	/**
	 * @param financialYear the financialYear to set
	 */
	public void setFinancialYear(FinancialYear financialYear) {
		this.financialYear = financialYear;
	}
	/**
	 * @return the periodName
	 */
	public String getPeriodName() {
		return PeriodName;
	}
	/**
	 * @param periodName the periodName to set
	 */
	public void setPeriodName(String periodName) {
		PeriodName = periodName;
	}
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
