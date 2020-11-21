package com.planetsystems.ui.utils.utils_ui.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class UtilResult_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.util.List getAccounts(com.planetsystems.ui.utils.utils_ui.shared.UtilResult instance) {
    return (java.util.List) ReflectionHelper.getField(com.planetsystems.ui.utils.utils_ui.shared.UtilResult.class, instance, "accounts");
  }
  
  private static void setAccounts(com.planetsystems.ui.utils.utils_ui.shared.UtilResult instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.planetsystems.ui.utils.utils_ui.shared.UtilResult.class, instance, "accounts", value);
  }
  
  private static java.util.List getActivities(com.planetsystems.ui.utils.utils_ui.shared.UtilResult instance) {
    return (java.util.List) ReflectionHelper.getField(com.planetsystems.ui.utils.utils_ui.shared.UtilResult.class, instance, "activities");
  }
  
  private static void setActivities(com.planetsystems.ui.utils.utils_ui.shared.UtilResult instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.planetsystems.ui.utils.utils_ui.shared.UtilResult.class, instance, "activities", value);
  }
  
  private static java.util.List getAddresses(com.planetsystems.ui.utils.utils_ui.shared.UtilResult instance) {
    return (java.util.List) ReflectionHelper.getField(com.planetsystems.ui.utils.utils_ui.shared.UtilResult.class, instance, "addresses");
  }
  
  private static void setAddresses(com.planetsystems.ui.utils.utils_ui.shared.UtilResult instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.planetsystems.ui.utils.utils_ui.shared.UtilResult.class, instance, "addresses", value);
  }
  
  private static java.util.List getCurrencies(com.planetsystems.ui.utils.utils_ui.shared.UtilResult instance) {
    return (java.util.List) ReflectionHelper.getField(com.planetsystems.ui.utils.utils_ui.shared.UtilResult.class, instance, "currencies");
  }
  
  private static void setCurrencies(com.planetsystems.ui.utils.utils_ui.shared.UtilResult instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.planetsystems.ui.utils.utils_ui.shared.UtilResult.class, instance, "currencies", value);
  }
  
  private static java.util.List getFinancialYears(com.planetsystems.ui.utils.utils_ui.shared.UtilResult instance) {
    return (java.util.List) ReflectionHelper.getField(com.planetsystems.ui.utils.utils_ui.shared.UtilResult.class, instance, "financialYears");
  }
  
  private static void setFinancialYears(com.planetsystems.ui.utils.utils_ui.shared.UtilResult instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.planetsystems.ui.utils.utils_ui.shared.UtilResult.class, instance, "financialYears", value);
  }
  
  private static java.util.List getFundingAgencies(com.planetsystems.ui.utils.utils_ui.shared.UtilResult instance) {
    return (java.util.List) ReflectionHelper.getField(com.planetsystems.ui.utils.utils_ui.shared.UtilResult.class, instance, "fundingAgencies");
  }
  
  private static void setFundingAgencies(com.planetsystems.ui.utils.utils_ui.shared.UtilResult instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.planetsystems.ui.utils.utils_ui.shared.UtilResult.class, instance, "fundingAgencies", value);
  }
  
  private static java.util.List getItems(com.planetsystems.ui.utils.utils_ui.shared.UtilResult instance) {
    return (java.util.List) ReflectionHelper.getField(com.planetsystems.ui.utils.utils_ui.shared.UtilResult.class, instance, "items");
  }
  
  private static void setItems(com.planetsystems.ui.utils.utils_ui.shared.UtilResult instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.planetsystems.ui.utils.utils_ui.shared.UtilResult.class, instance, "items", value);
  }
  
  private static java.util.List getMeasurementUnits(com.planetsystems.ui.utils.utils_ui.shared.UtilResult instance) {
    return (java.util.List) ReflectionHelper.getField(com.planetsystems.ui.utils.utils_ui.shared.UtilResult.class, instance, "measurementUnits");
  }
  
  private static void setMeasurementUnits(com.planetsystems.ui.utils.utils_ui.shared.UtilResult instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.planetsystems.ui.utils.utils_ui.shared.UtilResult.class, instance, "measurementUnits", value);
  }
  
  private static boolean getResponse(com.planetsystems.ui.utils.utils_ui.shared.UtilResult instance) {
    return (java.lang.Boolean) ReflectionHelper.getField(com.planetsystems.ui.utils.utils_ui.shared.UtilResult.class, instance, "response");
  }
  
  private static void setResponse(com.planetsystems.ui.utils.utils_ui.shared.UtilResult instance, boolean value) 
  {
    ReflectionHelper.setField(com.planetsystems.ui.utils.utils_ui.shared.UtilResult.class, instance, "response", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.planetsystems.ui.utils.utils_ui.shared.UtilResult instance) throws SerializationException {
    setAccounts(instance, (java.util.List) streamReader.readObject());
    setActivities(instance, (java.util.List) streamReader.readObject());
    setAddresses(instance, (java.util.List) streamReader.readObject());
    setCurrencies(instance, (java.util.List) streamReader.readObject());
    setFinancialYears(instance, (java.util.List) streamReader.readObject());
    setFundingAgencies(instance, (java.util.List) streamReader.readObject());
    setItems(instance, (java.util.List) streamReader.readObject());
    setMeasurementUnits(instance, (java.util.List) streamReader.readObject());
    setResponse(instance, streamReader.readBoolean());
    
  }
  
  public static com.planetsystems.ui.utils.utils_ui.shared.UtilResult instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.planetsystems.ui.utils.utils_ui.shared.UtilResult();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.planetsystems.ui.utils.utils_ui.shared.UtilResult instance) throws SerializationException {
    streamWriter.writeObject(getAccounts(instance));
    streamWriter.writeObject(getActivities(instance));
    streamWriter.writeObject(getAddresses(instance));
    streamWriter.writeObject(getCurrencies(instance));
    streamWriter.writeObject(getFinancialYears(instance));
    streamWriter.writeObject(getFundingAgencies(instance));
    streamWriter.writeObject(getItems(instance));
    streamWriter.writeObject(getMeasurementUnits(instance));
    streamWriter.writeBoolean(getResponse(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.planetsystems.ui.utils.utils_ui.shared.UtilResult_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.planetsystems.ui.utils.utils_ui.shared.UtilResult_FieldSerializer.deserialize(reader, (com.planetsystems.ui.utils.utils_ui.shared.UtilResult)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.planetsystems.ui.utils.utils_ui.shared.UtilResult_FieldSerializer.serialize(writer, (com.planetsystems.ui.utils.utils_ui.shared.UtilResult)object);
  }
  
}
