package com.gwtplatform.dispatch.shared;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class DispatchService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final Map<String, String> methodMapJava;
  private static final Map<String, String> signatureMapJava;
  
  static {
    methodMapJava = loadMethodsJava();
    signatureMapJava = loadSignaturesJava();
  }
  
  private static void populateLoadMethodsJavaMap0
  (Map<String, String> result) {
    result.put("com.Planning.model.PlanningPeriod/1750083940", "com.Planning.model.PlanningPeriod_FieldSerializer");
    result.put("[Lcom.Planning.model.PlanningPeriod;/4030687624", "com.Planning.model.PlanningPeriod_Array_Rank_1_FieldSerializer");
    result.put("com.Planning.model.ProcurementPlan/218590384", "com.Planning.model.ProcurementPlan_FieldSerializer");
    result.put("[Lcom.Planning.model.ProcurementPlan;/388301204", "com.Planning.model.ProcurementPlan_Array_Rank_1_FieldSerializer");
    result.put("com.Planning.shared.Planning/1490963770", "com.Planning.shared.Planning_FieldSerializer");
    result.put("com.Planning.shared.PlanningResult/3093127035", "com.Planning.shared.PlanningResult_FieldSerializer");
    result.put("[Lcom.Planning.shared.PlanningResult;/3781309702", "com.Planning.shared.PlanningResult_Array_Rank_1_FieldSerializer");
    result.put("com.google.gwt.i18n.shared.impl.DateRecord/3375188634", "com.google.gwt.i18n.shared.impl.DateRecord_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException/2345075298", "com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.XsrfToken/4254043109", "com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer");
    result.put("com.gwtplatform.dispatch.shared.ActionException/2451163915", "com.gwtplatform.dispatch.shared.ActionException_FieldSerializer");
    result.put("com.gwtplatform.dispatch.shared.ActionImpl/2338109017", "com.gwtplatform.dispatch.shared.ActionImpl_FieldSerializer");
    result.put("com.gwtplatform.dispatch.shared.BatchResult/3569380335", "com.gwtplatform.dispatch.shared.BatchResult_FieldSerializer");
    result.put("[Lcom.gwtplatform.dispatch.shared.BatchResult;/569845401", "com.gwtplatform.dispatch.shared.BatchResult_Array_Rank_1_FieldSerializer");
    result.put("[Lcom.gwtplatform.dispatch.shared.Result;/3987005119", "com.gwtplatform.dispatch.shared.Result_Array_Rank_1_FieldSerializer");
    result.put("com.gwtplatform.dispatch.shared.ServiceException/918872072", "com.gwtplatform.dispatch.shared.ServiceException_FieldSerializer");
    result.put("com.gwtplatform.dispatch.shared.UnsecuredActionImpl/3290230922", "com.gwtplatform.dispatch.shared.UnsecuredActionImpl_FieldSerializer");
    result.put("com.gwtplatform.dispatch.shared.UnsupportedActionException/26432650", "com.gwtplatform.dispatch.shared.UnsupportedActionException_FieldSerializer");
    result.put("com.planetsystems.model.utils.utils_model.Account/3262165666", "com.planetsystems.model.utils.utils_model.Account_FieldSerializer");
    result.put("[Lcom.planetsystems.model.utils.utils_model.Account;/3484156111", "com.planetsystems.model.utils.utils_model.Account_Array_Rank_1_FieldSerializer");
    result.put("com.planetsystems.model.utils.utils_model.Activity/2779159292", "com.planetsystems.model.utils.utils_model.Activity_FieldSerializer");
    result.put("[Lcom.planetsystems.model.utils.utils_model.Activity;/2185087440", "com.planetsystems.model.utils.utils_model.Activity_Array_Rank_1_FieldSerializer");
    result.put("com.planetsystems.model.utils.utils_model.Address/677869923", "com.planetsystems.model.utils.utils_model.Address_FieldSerializer");
    result.put("[Lcom.planetsystems.model.utils.utils_model.Address;/3181665826", "com.planetsystems.model.utils.utils_model.Address_Array_Rank_1_FieldSerializer");
    result.put("com.planetsystems.model.utils.utils_model.Currency/3771736647", "com.planetsystems.model.utils.utils_model.Currency_FieldSerializer");
    result.put("[Lcom.planetsystems.model.utils.utils_model.Currency;/39715998", "com.planetsystems.model.utils.utils_model.Currency_Array_Rank_1_FieldSerializer");
    result.put("com.planetsystems.model.utils.utils_model.FinancialYear/3367388765", "com.planetsystems.model.utils.utils_model.FinancialYear_FieldSerializer");
    result.put("[Lcom.planetsystems.model.utils.utils_model.FinancialYear;/950113110", "com.planetsystems.model.utils.utils_model.FinancialYear_Array_Rank_1_FieldSerializer");
    result.put("com.planetsystems.model.utils.utils_model.FundingAgency/1159279281", "com.planetsystems.model.utils.utils_model.FundingAgency_FieldSerializer");
    result.put("[Lcom.planetsystems.model.utils.utils_model.FundingAgency;/3119277454", "com.planetsystems.model.utils.utils_model.FundingAgency_Array_Rank_1_FieldSerializer");
    result.put("com.planetsystems.model.utils.utils_model.Item/1827571350", "com.planetsystems.model.utils.utils_model.Item_FieldSerializer");
    result.put("[Lcom.planetsystems.model.utils.utils_model.Item;/573775482", "com.planetsystems.model.utils.utils_model.Item_Array_Rank_1_FieldSerializer");
    result.put("com.planetsystems.model.utils.utils_model.MeasurementUnit/2075751375", "com.planetsystems.model.utils.utils_model.MeasurementUnit_FieldSerializer");
    result.put("[Lcom.planetsystems.model.utils.utils_model.MeasurementUnit;/4053298773", "com.planetsystems.model.utils.utils_model.MeasurementUnit_Array_Rank_1_FieldSerializer");
    result.put("com.planetsystems.model.utils.utils_model.Person/1575531069", "com.planetsystems.model.utils.utils_model.Person_FieldSerializer");
    result.put("com.planetsystems.model.utils.utils_model.ProcurementType/755158987", "com.planetsystems.model.utils.utils_model.ProcurementType_FieldSerializer");
    result.put("com.planetsystems.model.utils.utils_model.Status/3876039545", "com.planetsystems.model.utils.utils_model.Status_FieldSerializer");
    result.put("com.planetsystems.model.utils.utils_model.User/3122215348", "com.planetsystems.model.utils.utils_model.User_FieldSerializer");
    result.put("com.planetsystems.ui.utils.utils_ui.shared.Util/3468166202", "com.planetsystems.ui.utils.utils_ui.shared.Util_FieldSerializer");
    result.put("com.planetsystems.ui.utils.utils_ui.shared.UtilResult/2843874527", "com.planetsystems.ui.utils.utils_ui.shared.UtilResult_FieldSerializer");
    result.put("[Lcom.planetsystems.ui.utils.utils_ui.shared.UtilResult;/3733349800", "com.planetsystems.ui.utils.utils_ui.shared.UtilResult_Array_Rank_1_FieldSerializer");
    result.put("com.smartgwt.client.util.LogicalDate/1452805037", "com.smartgwt.client.util.LogicalDate_FieldSerializer");
    result.put("com.smartgwt.client.util.LogicalTime/644891758", "com.smartgwt.client.util.LogicalTime_FieldSerializer");
    result.put("java.lang.String/2004016611", "com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer");
    result.put("java.sql.Date/730999118", "com.google.gwt.user.client.rpc.core.java.sql.Date_FieldSerializer");
    result.put("java.sql.Time/1816797103", "com.google.gwt.user.client.rpc.core.java.sql.Time_FieldSerializer");
    result.put("java.sql.Timestamp/3040052672", "com.google.gwt.user.client.rpc.core.java.sql.Timestamp_FieldSerializer");
    result.put("java.util.ArrayList/4159755760", "com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer");
    result.put("java.util.Arrays$ArrayList/2507071751", "com.google.gwt.user.client.rpc.core.java.util.Arrays_ArrayList_FieldSerializer");
    result.put("java.util.Collections$EmptyList/4157118744", "com.google.gwt.user.client.rpc.core.java.util.Collections_EmptyList_FieldSerializer");
    result.put("java.util.Collections$SingletonList/1586180994", "com.google.gwt.user.client.rpc.core.java.util.Collections_SingletonList_FieldSerializer");
  }
  
  private static void populateLoadMethodsJavaMap1
  (Map<String, String> result) {
    result.put("java.util.Date/3385151746", "com.google.gwt.user.client.rpc.core.java.util.Date_FieldSerializer");
    result.put("java.util.LinkedList/3953877921", "com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer");
    result.put("java.util.Stack/1346942793", "com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer");
    result.put("java.util.Vector/3057315478", "com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer");
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadMethodsJava() {
    Map<String, String> result = new HashMap<String, String>();
    populateLoadMethodsJavaMap0(result);
    populateLoadMethodsJavaMap1(result);
    return result;
  }
  
  private static void populateLoadSignaturesJavaMap0
  (Map<String, String> result) {
    result.put("com.Planning.model.PlanningPeriod", "com.Planning.model.PlanningPeriod/1750083940");
    result.put("[Lcom.Planning.model.PlanningPeriod;", "[Lcom.Planning.model.PlanningPeriod;/4030687624");
    result.put("com.Planning.model.ProcurementPlan", "com.Planning.model.ProcurementPlan/218590384");
    result.put("[Lcom.Planning.model.ProcurementPlan;", "[Lcom.Planning.model.ProcurementPlan;/388301204");
    result.put("com.Planning.shared.Planning", "com.Planning.shared.Planning/1490963770");
    result.put("com.Planning.shared.PlanningResult", "com.Planning.shared.PlanningResult/3093127035");
    result.put("[Lcom.Planning.shared.PlanningResult;", "[Lcom.Planning.shared.PlanningResult;/3781309702");
    result.put("com.google.gwt.i18n.shared.impl.DateRecord", "com.google.gwt.i18n.shared.impl.DateRecord/3375188634");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException", "com.google.gwt.user.client.rpc.RpcTokenException/2345075298");
    result.put("com.google.gwt.user.client.rpc.XsrfToken", "com.google.gwt.user.client.rpc.XsrfToken/4254043109");
    result.put("com.gwtplatform.dispatch.shared.ActionException", "com.gwtplatform.dispatch.shared.ActionException/2451163915");
    result.put("com.gwtplatform.dispatch.shared.ActionImpl", "com.gwtplatform.dispatch.shared.ActionImpl/2338109017");
    result.put("com.gwtplatform.dispatch.shared.BatchResult", "com.gwtplatform.dispatch.shared.BatchResult/3569380335");
    result.put("[Lcom.gwtplatform.dispatch.shared.BatchResult;", "[Lcom.gwtplatform.dispatch.shared.BatchResult;/569845401");
    result.put("[Lcom.gwtplatform.dispatch.shared.Result;", "[Lcom.gwtplatform.dispatch.shared.Result;/3987005119");
    result.put("com.gwtplatform.dispatch.shared.ServiceException", "com.gwtplatform.dispatch.shared.ServiceException/918872072");
    result.put("com.gwtplatform.dispatch.shared.UnsecuredActionImpl", "com.gwtplatform.dispatch.shared.UnsecuredActionImpl/3290230922");
    result.put("com.gwtplatform.dispatch.shared.UnsupportedActionException", "com.gwtplatform.dispatch.shared.UnsupportedActionException/26432650");
    result.put("com.planetsystems.model.utils.utils_model.Account", "com.planetsystems.model.utils.utils_model.Account/3262165666");
    result.put("[Lcom.planetsystems.model.utils.utils_model.Account;", "[Lcom.planetsystems.model.utils.utils_model.Account;/3484156111");
    result.put("com.planetsystems.model.utils.utils_model.Activity", "com.planetsystems.model.utils.utils_model.Activity/2779159292");
    result.put("[Lcom.planetsystems.model.utils.utils_model.Activity;", "[Lcom.planetsystems.model.utils.utils_model.Activity;/2185087440");
    result.put("com.planetsystems.model.utils.utils_model.Address", "com.planetsystems.model.utils.utils_model.Address/677869923");
    result.put("[Lcom.planetsystems.model.utils.utils_model.Address;", "[Lcom.planetsystems.model.utils.utils_model.Address;/3181665826");
    result.put("com.planetsystems.model.utils.utils_model.Currency", "com.planetsystems.model.utils.utils_model.Currency/3771736647");
    result.put("[Lcom.planetsystems.model.utils.utils_model.Currency;", "[Lcom.planetsystems.model.utils.utils_model.Currency;/39715998");
    result.put("com.planetsystems.model.utils.utils_model.FinancialYear", "com.planetsystems.model.utils.utils_model.FinancialYear/3367388765");
    result.put("[Lcom.planetsystems.model.utils.utils_model.FinancialYear;", "[Lcom.planetsystems.model.utils.utils_model.FinancialYear;/950113110");
    result.put("com.planetsystems.model.utils.utils_model.FundingAgency", "com.planetsystems.model.utils.utils_model.FundingAgency/1159279281");
    result.put("[Lcom.planetsystems.model.utils.utils_model.FundingAgency;", "[Lcom.planetsystems.model.utils.utils_model.FundingAgency;/3119277454");
    result.put("com.planetsystems.model.utils.utils_model.Item", "com.planetsystems.model.utils.utils_model.Item/1827571350");
    result.put("[Lcom.planetsystems.model.utils.utils_model.Item;", "[Lcom.planetsystems.model.utils.utils_model.Item;/573775482");
    result.put("com.planetsystems.model.utils.utils_model.MeasurementUnit", "com.planetsystems.model.utils.utils_model.MeasurementUnit/2075751375");
    result.put("[Lcom.planetsystems.model.utils.utils_model.MeasurementUnit;", "[Lcom.planetsystems.model.utils.utils_model.MeasurementUnit;/4053298773");
    result.put("com.planetsystems.model.utils.utils_model.Person", "com.planetsystems.model.utils.utils_model.Person/1575531069");
    result.put("com.planetsystems.model.utils.utils_model.ProcurementType", "com.planetsystems.model.utils.utils_model.ProcurementType/755158987");
    result.put("com.planetsystems.model.utils.utils_model.Status", "com.planetsystems.model.utils.utils_model.Status/3876039545");
    result.put("com.planetsystems.model.utils.utils_model.User", "com.planetsystems.model.utils.utils_model.User/3122215348");
    result.put("com.planetsystems.ui.utils.utils_ui.shared.Util", "com.planetsystems.ui.utils.utils_ui.shared.Util/3468166202");
    result.put("com.planetsystems.ui.utils.utils_ui.shared.UtilResult", "com.planetsystems.ui.utils.utils_ui.shared.UtilResult/2843874527");
    result.put("[Lcom.planetsystems.ui.utils.utils_ui.shared.UtilResult;", "[Lcom.planetsystems.ui.utils.utils_ui.shared.UtilResult;/3733349800");
    result.put("com.smartgwt.client.util.LogicalDate", "com.smartgwt.client.util.LogicalDate/1452805037");
    result.put("com.smartgwt.client.util.LogicalTime", "com.smartgwt.client.util.LogicalTime/644891758");
    result.put("java.lang.String", "java.lang.String/2004016611");
    result.put("java.sql.Date", "java.sql.Date/730999118");
    result.put("java.sql.Time", "java.sql.Time/1816797103");
    result.put("java.sql.Timestamp", "java.sql.Timestamp/3040052672");
    result.put("java.util.ArrayList", "java.util.ArrayList/4159755760");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer.concreteType(), "java.util.Arrays$ArrayList/2507071751");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptyList/4157118744");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer.concreteType(), "java.util.Collections$SingletonList/1586180994");
    result.put("java.util.Date", "java.util.Date/3385151746");
    result.put("java.util.LinkedList", "java.util.LinkedList/3953877921");
    result.put("java.util.Stack", "java.util.Stack/1346942793");
    result.put("java.util.Vector", "java.util.Vector/3057315478");
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadSignaturesJava() {
    Map<String, String> result = new HashMap<String, String>();
    populateLoadSignaturesJavaMap0(result);
    return result;
  }
  
  public DispatchService_TypeSerializer() {
    super(methodMapJava, null, signatureMapJava, null);
  }
  
}
