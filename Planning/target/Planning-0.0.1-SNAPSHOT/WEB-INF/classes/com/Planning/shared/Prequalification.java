package com.Planning.shared;

import java.util.List;

import com.Planning.model.ApplicationReceipt;
import com.Planning.model.ApplicationSubmissionSheet;
import com.Planning.model.EvaluationSummary;
import com.Planning.model.EvaluationType;
import com.Planning.model.PQCriteriaCategory;
import com.Planning.model.PQQualificationEvaluation;
import com.Planning.model.PQQualificationEvaluationCriteria;
import com.Planning.model.PQSubcriteriaCategory;
import com.Planning.model.PrequalificationBid;
import com.Planning.model.PrequalificationCurrency;
import com.Planning.model.PrequalificationEvaluator;
import com.Planning.model.PrequalificationFinancialYear;
import com.Planning.model.PrequalificationSupplier;
import com.Planning.model.PrequalificationUser;
import com.Planning.model.ProcurementType;
import com.gwtplatform.dispatch.shared.UnsecuredActionImpl;

public class Prequalification extends UnsecuredActionImpl<PrequalificationResult> {
	private String operation;
	
	private PrequalificationFinancialYear prequalificationFinancialYear;

	private List<PrequalificationFinancialYear> prequalificationFinancialYears;

	private PrequalificationBid prequalificationBid;

	private PrequalificationSupplier prequalificationSupplier;

	private ApplicationReceipt applicationReceipt;

	private PQCriteriaCategory pqCriteriaCategory;

	private PQSubcriteriaCategory pqSubcriteriaCategory;

	private PQQualificationEvaluationCriteria pqQualificationEvaluationCriteria;

	private PrequalificationUser prequalificationUser;
	private List<PrequalificationUser> prequalificationUsers;

	private PrequalificationEvaluator prequalificationEvaluator;

	private EvaluationType evaluationType;

	private ProcurementType procurementType;

	private EvaluationSummary summary;

	private List<PQQualificationEvaluation> qualificationEvaluations;

	private PrequalificationCurrency prequalificationCurrency;
	private List<PrequalificationCurrency> prequalificationCurrencies;

	private ApplicationSubmissionSheet applicationSubmissionSheet;

	public Prequalification() {
		
	}

	public Prequalification(String operation) {
		this.operation = operation;
	}
	public Prequalification(String operation,List<PrequalificationCurrency> prequalificationCurrencies,PrequalificationCurrency currency){
		this.operation = operation;
		this.prequalificationCurrencies = prequalificationCurrencies;
		
	}
	public Prequalification(String operation, List<PrequalificationFinancialYear> prequalificationFinancialYears, PrequalificationFinancialYear prequalificationFinancialYear) {
		this.operation = operation;
		this.prequalificationFinancialYears = prequalificationFinancialYears;
	}

	public Prequalification(String operation, List<PrequalificationUser> prequalificationUsers, PrequalificationUser user) {
		this.operation = operation;
		this.prequalificationUsers = prequalificationUsers;

	}

	public Prequalification(String operation, ApplicationSubmissionSheet applicationSubmissionSheet) {
		this.operation = operation;
		this.applicationSubmissionSheet = applicationSubmissionSheet;
	}

	public Prequalification(String operation, PrequalificationCurrency prequalificationCurrency) {
		this.operation = operation;
		this.prequalificationCurrency = prequalificationCurrency;
	}

	public Prequalification(String operation, EvaluationSummary summary) {
		this.operation = operation;
		this.summary = summary;
	}

	public Prequalification(String operation, PrequalificationBid prequalificationBid, ProcurementType procurementType) {
		this.operation = operation;
		this.prequalificationBid = prequalificationBid;
		this.procurementType = procurementType;
	}

	public Prequalification(String operation, PrequalificationBid prequalificationBid, ProcurementType procurementType, EvaluationType evaluationType) {
		this.operation = operation;
		this.prequalificationBid = prequalificationBid;
		this.procurementType = procurementType;
		this.evaluationType = evaluationType;
	}

	public Prequalification(String operation, PrequalificationBid prequalificationBid, PrequalificationEvaluator prequalificationEvaluator, ProcurementType procurementType, EvaluationType evaluationType) {
		this.operation = operation;
		this.prequalificationBid = prequalificationBid;
		this.prequalificationEvaluator = prequalificationEvaluator;
		this.procurementType = procurementType;
		this.evaluationType = evaluationType;
	}

	public Prequalification(String operation, List<PQQualificationEvaluation> qualificationEvaluations, PQQualificationEvaluation evaluation) {
		this.operation = operation;
		this.qualificationEvaluations = qualificationEvaluations;
	}

	public Prequalification(String operation, List<PQQualificationEvaluation> qualificationEvaluations, PrequalificationBid prequalificationBid, PrequalificationEvaluator prequalificationEvaluator, PrequalificationSupplier prequalificationSupplier,
			EvaluationType evaluationType, ProcurementType procurementType) {
		this.operation = operation;
		this.prequalificationEvaluator = prequalificationEvaluator;
		this.prequalificationBid = prequalificationBid;
		this.prequalificationSupplier = prequalificationSupplier;
		this.qualificationEvaluations = qualificationEvaluations;
		this.evaluationType = evaluationType;
		this.procurementType = procurementType;
	}

	public Prequalification(String operation, PrequalificationBid prequalificationBid, PrequalificationEvaluator prequalificationEvaluator, PrequalificationSupplier prequalificationSupplier, EvaluationType evaluationType,
			ProcurementType procurementType) {
		this.operation = operation;
		this.prequalificationEvaluator = prequalificationEvaluator;
		this.prequalificationBid = prequalificationBid;
		this.prequalificationSupplier = prequalificationSupplier;
		this.evaluationType = evaluationType;
		this.procurementType = procurementType;
	}

	public Prequalification(String operation, PrequalificationBid prequalificationBid, PrequalificationEvaluator prequalificationEvaluator, PrequalificationSupplier prequalificationSupplier) {
		this.operation = operation;
		this.prequalificationEvaluator = prequalificationEvaluator;
		this.prequalificationBid = prequalificationBid;
		this.prequalificationSupplier = prequalificationSupplier;
	}

	public Prequalification(String operation, PrequalificationEvaluator prequalificationEvaluator) {
		this.operation = operation;
		this.prequalificationEvaluator = prequalificationEvaluator;
	}

	public Prequalification(String operation, PrequalificationUser prequalificationUser) {
		this.operation = operation;
		this.prequalificationUser = prequalificationUser;
	}

	public Prequalification(String operation, PQQualificationEvaluationCriteria pqQualificationEvaluationCriteria) {
		this.operation = operation;
		this.pqQualificationEvaluationCriteria = pqQualificationEvaluationCriteria;
	}

	public Prequalification(String operation, PQSubcriteriaCategory pqSubcriteriaCategory) {
		this.operation = operation;
		this.pqSubcriteriaCategory = pqSubcriteriaCategory;
	}

	public Prequalification(String operation, PQCriteriaCategory pqCriteriaCategory) {
		this.operation = operation;
		this.pqCriteriaCategory = pqCriteriaCategory;
	}

	public Prequalification(String operation, ApplicationReceipt applicationReceipt) {
		this.operation = operation;
		this.applicationReceipt = applicationReceipt;
	}

	public Prequalification(String operation, PrequalificationSupplier prequalificationSupplier) {
		this.operation = operation;
		this.prequalificationSupplier = prequalificationSupplier;
	}

	public Prequalification(String operation, PrequalificationFinancialYear prequalificationFinancialYear) {
		this.operation = operation;
		this.prequalificationFinancialYear = prequalificationFinancialYear;
	}

	public Prequalification(String operation, PrequalificationBid prequalificationBid) {
		this.operation = operation;
		this.prequalificationBid = prequalificationBid;
	}

	public String getOperation() {
		return operation;
	}

	public PrequalificationFinancialYear getPrequalificationFinancialYear() {
		return prequalificationFinancialYear;
	}

	public PrequalificationBid getPrequalificationBid() {
		return prequalificationBid;
	}

	public PrequalificationSupplier getPrequalificationSupplier() {
		return prequalificationSupplier;
	}

	public ApplicationReceipt getApplicationReceipt() {
		return applicationReceipt;
	}

	public PQCriteriaCategory getPqCriteriaCategory() {
		return pqCriteriaCategory;
	}

	public PQSubcriteriaCategory getPqSubcriteriaCategory() {
		return pqSubcriteriaCategory;
	}

	public PQQualificationEvaluationCriteria getPqQualificationEvaluationCriteria() {
		return pqQualificationEvaluationCriteria;
	}

	public PrequalificationUser getPrequalificationUser() {
		return prequalificationUser;
	}

	public PrequalificationEvaluator getPrequalificationEvaluator() {
		return prequalificationEvaluator;
	}

	public EvaluationType getEvaluationType() {
		return evaluationType;
	}

	public List<PQQualificationEvaluation> getQualificationEvaluations() {
		return qualificationEvaluations;
	}

	public ProcurementType getProcurementType() {
		return procurementType;
	}

	public EvaluationSummary getSummary() {
		return summary;
	}

	public PrequalificationCurrency getPrequalificationCurrency() {
		return prequalificationCurrency;
	}

	public ApplicationSubmissionSheet getApplicationSubmissionSheet() {
		return applicationSubmissionSheet;
	}

	public List<PrequalificationFinancialYear> getPrequalificationFinancialYears() {
		return prequalificationFinancialYears;
	}

	public List<PrequalificationUser> getPrequalificationUsers() {
		return prequalificationUsers;
	}

	public List<PrequalificationCurrency> getPrequalificationCurrencies() {
		return prequalificationCurrencies;
	}
	
	

}
