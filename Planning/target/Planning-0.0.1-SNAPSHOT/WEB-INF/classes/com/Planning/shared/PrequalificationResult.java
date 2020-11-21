package com.Planning.shared;

import java.util.List;
import java.util.Set;

import com.Planning.model.ApplicationReceipt;
import com.Planning.model.ApplicationSubmissionSheet;
import com.Planning.model.ApplicationSubmissionSheetItem;
import com.Planning.model.EvaluationSummary;
import com.Planning.model.PQCriteriaCategory;
import com.Planning.model.PQQualificationEvaluation;
import com.Planning.model.PQQualificationEvaluationCriteria;
import com.Planning.model.PQSubcriteriaCategory;
import com.Planning.model.PayableFee;
import com.Planning.model.PrequalificationBid;
import com.Planning.model.PrequalificationCurrency;
import com.Planning.model.PrequalificationEvaluator;
import com.Planning.model.PrequalificationFinancialYear;
import com.Planning.model.PrequalificationItem;
import com.Planning.model.PrequalificationSupplier;
import com.Planning.model.PrequalificationUser;
import com.gwtplatform.dispatch.shared.Result;

public class PrequalificationResult implements Result {

	private String response;

	private List<PrequalificationFinancialYear> prequalificationFinancialYears;

	private List<PrequalificationBid> prequalificationBids;

	private List<PrequalificationItem> prequalificationItems;

	private List<PrequalificationSupplier> prequalificationSuppliers;

	private List<ApplicationReceipt> applicationReceipts;

	private List<PQCriteriaCategory> pqCriteriaCategories;

	private List<PQSubcriteriaCategory> pqSubcriteriaCategories;

	private List<PQQualificationEvaluationCriteria> pqQualificationEvaluationCriterias;

	private List<PrequalificationUser> prequalificationUsers;

	private List<PrequalificationEvaluator> prequalificationEvaluators;

	private List<PQQualificationEvaluation> qualificationEvaluations;

	private Set<PrequalificationSupplier> evaluatedSuppliers;

	private EvaluationSummary summary;

	private List<PrequalificationCurrency> prequalificationCurrencies;

	private List<ApplicationSubmissionSheet> applicationSubmissionSheets;

	private List<ApplicationSubmissionSheetItem> applicationSubmissionSheetItems;
	
	/*Suppliers that applied to be evaluated under a particular procurementType items*/
	private Set<PrequalificationSupplier> procurementTypeSuppliers;
	
	private List<PayableFee> payableFees;

	public PrequalificationResult() {
	}

	public PrequalificationResult(String response) {
		this.response = response;
	}

	public PrequalificationResult( Set<PrequalificationSupplier> procurementTypeSuppliers, PrequalificationSupplier prequalificationSupplier) {
		this.procurementTypeSuppliers = procurementTypeSuppliers;
	}
	public PrequalificationResult(List<ApplicationSubmissionSheetItem> applicationSubmissionSheetItems, List<PayableFee> payableFees) {
		this.applicationSubmissionSheetItems = applicationSubmissionSheetItems;
		this.payableFees = payableFees;
	}

	public PrequalificationResult(String response, List<ApplicationSubmissionSheet> applicationSubmissionSheets, ApplicationSubmissionSheet applicationSubmissionSheet) {
		this.response = response;
		this.applicationSubmissionSheets = applicationSubmissionSheets;
	}

	public PrequalificationResult(String response, List<PrequalificationCurrency> prequalificationCurrencies, PrequalificationCurrency currency) {
		this.response = response;
		this.prequalificationCurrencies = prequalificationCurrencies;
	}

	public PrequalificationResult(List<PrequalificationSupplier> prequalificationSuppliers, List<PrequalificationEvaluator> prequalificationEvaluators, List<PQQualificationEvaluation> qualificationEvaluations) {
		this.prequalificationSuppliers = prequalificationSuppliers;
		this.prequalificationEvaluators = prequalificationEvaluators;
		this.qualificationEvaluations = qualificationEvaluations;
	}

	public PrequalificationResult(String response, EvaluationSummary summary) {
		this.response = response;
		this.summary = summary;
	}

	public PrequalificationResult(EvaluationSummary summary, List<PQQualificationEvaluation> qualificationEvaluations, Set<PrequalificationSupplier> evaluatedSuppliers, List<PQQualificationEvaluationCriteria> pqQualificationEvaluationCriterias) {
		this.pqQualificationEvaluationCriterias = pqQualificationEvaluationCriterias;
		this.evaluatedSuppliers = evaluatedSuppliers;
		this.qualificationEvaluations = qualificationEvaluations;
		this.summary = summary;
	}

	public PrequalificationResult(List<PQQualificationEvaluation> qualificationEvaluations, Set<PrequalificationSupplier> evaluatedSuppliers, List<PQQualificationEvaluationCriteria> pqQualificationEvaluationCriterias) {
		this.pqQualificationEvaluationCriterias = pqQualificationEvaluationCriterias;
		this.evaluatedSuppliers = evaluatedSuppliers;
		this.qualificationEvaluations = qualificationEvaluations;
	}

	public PrequalificationResult(String response, List<PQQualificationEvaluation> qualificationEvaluations, PQQualificationEvaluation evaluation) {
		this.response = response;
		this.qualificationEvaluations = qualificationEvaluations;
	}

	public PrequalificationResult(String response, List<PrequalificationEvaluator> prequalificationEvaluators, PrequalificationEvaluator evaluator) {
		this.response = response;
		this.prequalificationEvaluators = prequalificationEvaluators;
	}

	public PrequalificationResult(String response, List<PrequalificationUser> prequalificationUsers, PrequalificationUser user) {
		this.response = response;
		this.prequalificationUsers = prequalificationUsers;
	}

	public PrequalificationResult(String response, List<PQQualificationEvaluationCriteria> pqQualificationEvaluationCriterias, PQQualificationEvaluationCriteria criteria) {
		this.response = response;
		this.pqQualificationEvaluationCriterias = pqQualificationEvaluationCriterias;
	}

	public PrequalificationResult(String response, List<PQSubcriteriaCategory> pqSubcriteriaCategories, PQSubcriteriaCategory category) {
		this.response = response;
		this.pqSubcriteriaCategories = pqSubcriteriaCategories;
	}

	public PrequalificationResult(String response, List<PQCriteriaCategory> pqCriteriaCategories, PQCriteriaCategory pqCriteriaCategory) {
		this.response = response;
		this.pqCriteriaCategories = pqCriteriaCategories;
	}

	public PrequalificationResult(String response, List<ApplicationReceipt> applicationReceipts, ApplicationReceipt applicationReceipt) {
		this.response = response;
		this.applicationReceipts = applicationReceipts;
	}

	public PrequalificationResult(String response, List<PrequalificationSupplier> prequalificationSuppliers, PrequalificationSupplier prequalificationSupplier) {
		this.response = response;
		this.prequalificationSuppliers = prequalificationSuppliers;
	}

	public PrequalificationResult(String response, List<PrequalificationItem> prequalificationItems, PrequalificationItem item) {
		this.response = response;
		this.prequalificationItems = prequalificationItems;
	}

	public PrequalificationResult(String response, List<PrequalificationBid> prequalificationBids, PrequalificationBid bid) {
		this.response = response;
		this.prequalificationBids = prequalificationBids;
	}

	public PrequalificationResult(String response, List<PrequalificationFinancialYear> prequalificationFinancialYears, PrequalificationFinancialYear financialYear) {
		this.response = response;
		this.prequalificationFinancialYears = prequalificationFinancialYears;
	}

	public String getResponse() {
		return response;
	}

	public List<PrequalificationFinancialYear> getPrequalificationFinancialYears() {
		return prequalificationFinancialYears;
	}

	public List<PrequalificationBid> getPrequalificationBids() {
		return prequalificationBids;
	}

	public List<PrequalificationItem> getPrequalificationItems() {
		return prequalificationItems;
	}

	public List<PrequalificationSupplier> getPrequalifiedSuppliers() {
		return prequalificationSuppliers;
	}

	public List<PrequalificationSupplier> getPrequalificationSuppliers() {
		return prequalificationSuppliers;
	}

	public List<ApplicationReceipt> getApplicationReceipts() {
		return applicationReceipts;
	}

	public List<PQCriteriaCategory> getPqCriteriaCategories() {
		return pqCriteriaCategories;
	}

	public List<PQSubcriteriaCategory> getPqSubcriteriaCategories() {
		return pqSubcriteriaCategories;
	}

	public List<PQQualificationEvaluationCriteria> getPqQualificationEvaluationCriterias() {
		return pqQualificationEvaluationCriterias;
	}

	public List<PrequalificationUser> getPrequalificationUsers() {
		return prequalificationUsers;
	}

	public List<PrequalificationEvaluator> getPrequalificationEvaluators() {
		return prequalificationEvaluators;
	}

	public List<PQQualificationEvaluation> getQualificationEvaluations() {
		return qualificationEvaluations;
	}

	public Set<PrequalificationSupplier> getEvaluatedSuppliers() {
		return evaluatedSuppliers;
	}

	public EvaluationSummary getSummary() {
		return summary;
	}

	public List<PrequalificationCurrency> getPrequalificationCurrencies() {
		return prequalificationCurrencies;
	}

	public List<ApplicationSubmissionSheet> getApplicationSubmissionSheets() {
		return applicationSubmissionSheets;
	}

	public List<ApplicationSubmissionSheetItem> getApplicationSubmissionSheetItems() {
		return applicationSubmissionSheetItems;
	}

	public List<PayableFee> getPayableFees() {
		return payableFees;
	}

	public Set<PrequalificationSupplier> getProcurementTypeSuppliers() {
		return procurementTypeSuppliers;
	}

}
