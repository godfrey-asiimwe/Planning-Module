package com.Planning.client.util;

import com.google.gwt.http.client.URL;

public class ReportGenetor {
	
	public static final String DEFAULT_REPORTS_SERVICE_PATH = "prequalificationReports";
	private static String REPORT_FILENAME = "reportFilename";
	private static String reportFilename = null;

	public ReportGenetor() {

	}

	public static void generateStandardPrequalificationDocument(String bidId) {

		reportFilename = "StandardPrequalificationDocument.jrxml";
		StringBuilder url = new StringBuilder();
		url.append(DEFAULT_REPORTS_SERVICE_PATH).append("?");// .append(HOST_FILENAME)
		String arg0Name = URL.encodeQueryString(REPORT_FILENAME);
		url.append(arg0Name);
		url.append("=");
		String arg0Value = URL.encodeQueryString(reportFilename);
		url.append(arg0Value).append("&request=" + ReportParameter.StandardPrequalificationDocument_REPORT + "&" + ReportParameter.bidId_PARAMETER + "=" + bidId);
		//ReportDisplayWindow window = new ReportDisplayWindow(url.toString(), "Standard Prequalification Document Preview");
		//window.show();

	}
	public static void generatePrequalificationShortList(String bidId) {

		reportFilename = "prequalificationShortList.jrxml";
		StringBuilder url = new StringBuilder();
		url.append(DEFAULT_REPORTS_SERVICE_PATH).append("?");// .append(HOST_FILENAME)
		String arg0Name = URL.encodeQueryString(REPORT_FILENAME);
		url.append(arg0Name);
		url.append("=");
		String arg0Value = URL.encodeQueryString(reportFilename);
		url.append(arg0Value).append("&request=" + ReportParameter.prequalificationShortList_REPORT + "&" + ReportParameter.bidId_PARAMETER + "=" + bidId);
		//ReportDisplayWindow window = new ReportDisplayWindow(url.toString(), "Standard Prequalification Document Preview");
		//window.show();

	}
}
