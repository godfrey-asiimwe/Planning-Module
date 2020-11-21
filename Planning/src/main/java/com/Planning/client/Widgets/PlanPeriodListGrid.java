/**
 * 
 */
package com.Planning.client.Widgets;

import java.util.List;

import com.Planning.model.PlanningPeriod;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.ListGridFieldType;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridField;
import com.smartgwt.client.widgets.grid.ListGridRecord;

/**
 * @author Planet Developer 001
 *
 */
public class PlanPeriodListGrid extends ListGrid{

	private static final String ICON = "icon";
	private static final String ICON_DISPLAY_NAME="#";
	public static final String PERIOD_ID="planPeriodID";
	private static final String PERIOD_ID_DISPLAY="Plan Period ID";
	public static final String PERIOD_NAME="planPeriodName";
	private static final String PERIOD_NAME_DISPLAY="Period Name";
	public static final String FINANCIAL_YEAR_ID="finYearID";
	private static final String FINANCIAL_YEAR_ID_DISPLAY="Financial Year ID";
	private static final String FINANCIAL_YEAR_NAME="finYearName";
	private static final String FINANCIAL_YEAR_NAME_DISPLAY="Financial Year Name";
	public static final String PERIOD_START_DATE="periodStartDate";
	private static final String PERIOD_START_DATE_DISPLAY=" Period Date";
	public static final String PERIOD_END_DATE="periodEndDate";
	private static final String PERIOD_END_DATE_DISPLAY=" Period Date";
	private static final String DATE_CREATED="dateCreated";
	private static final String DATE_CREATED_DISPLAY="Date Created";
	private static final String EMPTY_FIELD = "emptyField"; 
	private static final String EMPTY_FIELD_DISPLAY_NAME = " "; 
	private static final String URL_PREFIX = "icons/16/";
	private static final String URL_SUFFIX = ".png";
	
	private static final int ICON_COLUMN_LENGTH = 27; 
	
	public PlanPeriodListGrid(){
		super();
		
		 // initialize the List Grid fields  
	    ListGridField iconField = new ListGridField(ICON, ICON_DISPLAY_NAME, ICON_COLUMN_LENGTH);
	    iconField.setImageSize(16); 
	    iconField.setAlign(Alignment.CENTER);
	    iconField.setType(ListGridFieldType.IMAGE);  
	    iconField.setImageURLPrefix(URL_PREFIX);  
	    iconField.setImageURLSuffix(URL_SUFFIX);
	    
	    ListGridField finYearIDField = new ListGridField(FINANCIAL_YEAR_ID, FINANCIAL_YEAR_ID_DISPLAY);  
	    finYearIDField.setHidden(true);
	    
	    ListGridField finYearNameField = new ListGridField(FINANCIAL_YEAR_NAME, FINANCIAL_YEAR_NAME_DISPLAY); 
	    finYearNameField.setWidth("15%");
	    ListGridField planPeriodIDField = new ListGridField(PERIOD_ID, PERIOD_ID_DISPLAY);  
	    planPeriodIDField.setHidden(true);
	   // planPeriodIDField.setWidth("30%");
	    ListGridField planPeriodNameField = new ListGridField(PERIOD_NAME, PERIOD_NAME_DISPLAY);  
	    planPeriodNameField.setWidth("20%");
	    
	    ListGridField startDateField = new ListGridField(PERIOD_START_DATE, PERIOD_START_DATE_DISPLAY);  
	    startDateField.setWidth("20%");
	    
	    ListGridField endDateField = new ListGridField(PERIOD_END_DATE, PERIOD_END_DATE_DISPLAY);  
	    endDateField.setWidth("20%");
	    
	    ListGridField dateCreatedField = new ListGridField(DATE_CREATED, DATE_CREATED_DISPLAY);  
	    dateCreatedField.setWidth("20%");
	    
	    ListGridField emptyField = new ListGridField(EMPTY_FIELD, EMPTY_FIELD_DISPLAY_NAME);
	    emptyField.setWidth("*");
	    this.setBaseStyle("myBoxedGridCell");
	    this.setFields(iconField,finYearIDField,planPeriodIDField,finYearNameField,planPeriodNameField,startDateField,endDateField,dateCreatedField,emptyField);
	}
	
	public ListGridRecord createRow(PlanningPeriod planningPeriod) {
		ListGridRecord record = new ListGridRecord();
		record.setAttribute(FINANCIAL_YEAR_NAME, planningPeriod.getFinancialYear().getDescription());
		record.setAttribute(FINANCIAL_YEAR_ID, planningPeriod.getFinancialYear().getId());
		record.setAttribute(PERIOD_ID, planningPeriod.getId());
		record.setAttribute(PERIOD_NAME, planningPeriod.getPeriodName());
		record.setAttribute(PERIOD_START_DATE, planningPeriod.getStartDate());
		record.setAttribute(PERIOD_END_DATE, planningPeriod.getEndDate());
		record.setAttribute(DATE_CREATED, planningPeriod.getDateCreated());
		return record;
	}

	public void addRecordsToGrid(List<PlanningPeriod> planningPeriods) {
		ListGridRecord[] records = new ListGridRecord[planningPeriods.size()];
		int row = 0;
		for (PlanningPeriod planningPeriod : planningPeriods) {
			records[row] = createRow(planningPeriod);
			row++;
		}
		this.setData(records);
	}
}
