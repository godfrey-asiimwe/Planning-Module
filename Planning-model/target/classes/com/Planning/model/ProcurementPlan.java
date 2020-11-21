package com.Planning.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.planetsystems.model.utils.utils_model.Account;
import com.planetsystems.model.utils.utils_model.Activity;
import com.planetsystems.model.utils.utils_model.Currency;
import com.planetsystems.model.utils.utils_model.FinancialYear;
import com.planetsystems.model.utils.utils_model.FundingAgency;
import com.planetsystems.model.utils.utils_model.Item;
import com.planetsystems.model.utils.utils_model.MeasurementUnit;
import com.planetsystems.model.utils.utils_model.ProcurementType;

@Entity
public class ProcurementPlan extends ParentEntity{

	private static final long serialVersionUID = 1L;
	private Date dateRequired;
	private FundingAgency fundingAgency;
	private Activity activity;
	private Account account;
	private FinancialYear financialYear;
	private ProcurementType procurementType;
	private Item item;
	private MeasurementUnit measurementUnit;
	private String quantity;
	private double unitCost;
	private double estimatedCost;
	private Currency currency;
	private String comment;
	
	
	public ProcurementPlan(){
		super();
	}
	
	/**
	 * @return the dateRequired
	 */
	public Date getDateRequired() {
		return dateRequired;
	}
	/**
	 * @param dateRequired the dateRequired to set
	 */
	public void setDateRequired(Date dateRequired) {
		this.dateRequired = dateRequired;
	}

	/**
	 * @return the fundingAgency
	 */
	@ManyToOne
	public FundingAgency getFundingAgency() {
		return fundingAgency;
	}

	/**
	 * @param fundingAgency the fundingAgency to set
	 */
	public void setFundingAgency(FundingAgency fundingAgency) {
		this.fundingAgency = fundingAgency;
	}

	/**
	 * @return the procurementType
	 */
	public ProcurementType getProcurementType() {
		return procurementType;
	}

	/**
	 * @param procurementType the procurementType to set
	 */
	public void setProcurementType(ProcurementType procurementType) {
		this.procurementType = procurementType;
	}

	/**
	 * @return the measurementUnit
	 */
	@ManyToOne
	public MeasurementUnit getMeasurementUnit() {
		return measurementUnit;
	}

	/**
	 * @param measurementUnit the measurementUnit to set
	 */
	public void setMeasurementUnit(MeasurementUnit measurementUnit) {
		this.measurementUnit = measurementUnit;
	}

	/**
	 * @return the item
	 */
	@ManyToOne
	public Item getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(Item item) {
		this.item = item;
	}

	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the unitCost
	 */
	public double getUnitCost() {
		return unitCost;
	}

	/**
	 * @param unitCost the unitCost to set
	 */
	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}

	/**
	 * @return the currency
	 */
	@ManyToOne
	public Currency getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the estimatedCost
	 */
	public double getEstimatedCost() {
		return estimatedCost;
	}

	/**
	 * @param estimatedCost the estimatedCost to set
	 */
	public void setEstimatedCost(double estimatedCost) {
		this.estimatedCost = estimatedCost;
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
	 * @return the activity
	 */
	@ManyToOne
	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	/**
	 * @return the account
	 */
	@ManyToOne
	public Account getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

}
