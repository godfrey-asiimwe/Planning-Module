package com.Planning.model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ProcurementPlan_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static com.planetsystems.model.utils.utils_model.Account getAccount(com.Planning.model.ProcurementPlan instance) {
    return (com.planetsystems.model.utils.utils_model.Account) ReflectionHelper.getField(com.Planning.model.ProcurementPlan.class, instance, "account");
  }
  
  private static void setAccount(com.Planning.model.ProcurementPlan instance, com.planetsystems.model.utils.utils_model.Account value) 
  {
    ReflectionHelper.setField(com.Planning.model.ProcurementPlan.class, instance, "account", value);
  }
  
  private static com.planetsystems.model.utils.utils_model.Activity getActivity(com.Planning.model.ProcurementPlan instance) {
    return (com.planetsystems.model.utils.utils_model.Activity) ReflectionHelper.getField(com.Planning.model.ProcurementPlan.class, instance, "activity");
  }
  
  private static void setActivity(com.Planning.model.ProcurementPlan instance, com.planetsystems.model.utils.utils_model.Activity value) 
  {
    ReflectionHelper.setField(com.Planning.model.ProcurementPlan.class, instance, "activity", value);
  }
  
  private static java.lang.String getComment(com.Planning.model.ProcurementPlan instance) {
    return (java.lang.String) ReflectionHelper.getField(com.Planning.model.ProcurementPlan.class, instance, "comment");
  }
  
  private static void setComment(com.Planning.model.ProcurementPlan instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.Planning.model.ProcurementPlan.class, instance, "comment", value);
  }
  
  private static com.planetsystems.model.utils.utils_model.Currency getCurrency(com.Planning.model.ProcurementPlan instance) {
    return (com.planetsystems.model.utils.utils_model.Currency) ReflectionHelper.getField(com.Planning.model.ProcurementPlan.class, instance, "currency");
  }
  
  private static void setCurrency(com.Planning.model.ProcurementPlan instance, com.planetsystems.model.utils.utils_model.Currency value) 
  {
    ReflectionHelper.setField(com.Planning.model.ProcurementPlan.class, instance, "currency", value);
  }
  
  private static java.util.Date getDateRequired(com.Planning.model.ProcurementPlan instance) {
    return (java.util.Date) ReflectionHelper.getField(com.Planning.model.ProcurementPlan.class, instance, "dateRequired");
  }
  
  private static void setDateRequired(com.Planning.model.ProcurementPlan instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.Planning.model.ProcurementPlan.class, instance, "dateRequired", value);
  }
  
  private static double getEstimatedCost(com.Planning.model.ProcurementPlan instance) {
    return (java.lang.Double) ReflectionHelper.getField(com.Planning.model.ProcurementPlan.class, instance, "estimatedCost");
  }
  
  private static void setEstimatedCost(com.Planning.model.ProcurementPlan instance, double value) 
  {
    ReflectionHelper.setField(com.Planning.model.ProcurementPlan.class, instance, "estimatedCost", value);
  }
  
  private static com.planetsystems.model.utils.utils_model.FinancialYear getFinancialYear(com.Planning.model.ProcurementPlan instance) {
    return (com.planetsystems.model.utils.utils_model.FinancialYear) ReflectionHelper.getField(com.Planning.model.ProcurementPlan.class, instance, "financialYear");
  }
  
  private static void setFinancialYear(com.Planning.model.ProcurementPlan instance, com.planetsystems.model.utils.utils_model.FinancialYear value) 
  {
    ReflectionHelper.setField(com.Planning.model.ProcurementPlan.class, instance, "financialYear", value);
  }
  
  private static com.planetsystems.model.utils.utils_model.FundingAgency getFundingAgency(com.Planning.model.ProcurementPlan instance) {
    return (com.planetsystems.model.utils.utils_model.FundingAgency) ReflectionHelper.getField(com.Planning.model.ProcurementPlan.class, instance, "fundingAgency");
  }
  
  private static void setFundingAgency(com.Planning.model.ProcurementPlan instance, com.planetsystems.model.utils.utils_model.FundingAgency value) 
  {
    ReflectionHelper.setField(com.Planning.model.ProcurementPlan.class, instance, "fundingAgency", value);
  }
  
  private static com.planetsystems.model.utils.utils_model.Item getItem(com.Planning.model.ProcurementPlan instance) {
    return (com.planetsystems.model.utils.utils_model.Item) ReflectionHelper.getField(com.Planning.model.ProcurementPlan.class, instance, "item");
  }
  
  private static void setItem(com.Planning.model.ProcurementPlan instance, com.planetsystems.model.utils.utils_model.Item value) 
  {
    ReflectionHelper.setField(com.Planning.model.ProcurementPlan.class, instance, "item", value);
  }
  
  private static com.planetsystems.model.utils.utils_model.MeasurementUnit getMeasurementUnit(com.Planning.model.ProcurementPlan instance) {
    return (com.planetsystems.model.utils.utils_model.MeasurementUnit) ReflectionHelper.getField(com.Planning.model.ProcurementPlan.class, instance, "measurementUnit");
  }
  
  private static void setMeasurementUnit(com.Planning.model.ProcurementPlan instance, com.planetsystems.model.utils.utils_model.MeasurementUnit value) 
  {
    ReflectionHelper.setField(com.Planning.model.ProcurementPlan.class, instance, "measurementUnit", value);
  }
  
  private static com.planetsystems.model.utils.utils_model.ProcurementType getProcurementType(com.Planning.model.ProcurementPlan instance) {
    return (com.planetsystems.model.utils.utils_model.ProcurementType) ReflectionHelper.getField(com.Planning.model.ProcurementPlan.class, instance, "procurementType");
  }
  
  private static void setProcurementType(com.Planning.model.ProcurementPlan instance, com.planetsystems.model.utils.utils_model.ProcurementType value) 
  {
    ReflectionHelper.setField(com.Planning.model.ProcurementPlan.class, instance, "procurementType", value);
  }
  
  private static java.lang.String getQuantity(com.Planning.model.ProcurementPlan instance) {
    return (java.lang.String) ReflectionHelper.getField(com.Planning.model.ProcurementPlan.class, instance, "quantity");
  }
  
  private static void setQuantity(com.Planning.model.ProcurementPlan instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.Planning.model.ProcurementPlan.class, instance, "quantity", value);
  }
  
  private static double getUnitCost(com.Planning.model.ProcurementPlan instance) {
    return (java.lang.Double) ReflectionHelper.getField(com.Planning.model.ProcurementPlan.class, instance, "unitCost");
  }
  
  private static void setUnitCost(com.Planning.model.ProcurementPlan instance, double value) 
  {
    ReflectionHelper.setField(com.Planning.model.ProcurementPlan.class, instance, "unitCost", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.Planning.model.ProcurementPlan instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-2", streamReader.readString());
    setAccount(instance, (com.planetsystems.model.utils.utils_model.Account) streamReader.readObject());
    setActivity(instance, (com.planetsystems.model.utils.utils_model.Activity) streamReader.readObject());
    setComment(instance, streamReader.readString());
    setCurrency(instance, (com.planetsystems.model.utils.utils_model.Currency) streamReader.readObject());
    setDateRequired(instance, (java.util.Date) streamReader.readObject());
    setEstimatedCost(instance, streamReader.readDouble());
    setFinancialYear(instance, (com.planetsystems.model.utils.utils_model.FinancialYear) streamReader.readObject());
    setFundingAgency(instance, (com.planetsystems.model.utils.utils_model.FundingAgency) streamReader.readObject());
    setItem(instance, (com.planetsystems.model.utils.utils_model.Item) streamReader.readObject());
    setMeasurementUnit(instance, (com.planetsystems.model.utils.utils_model.MeasurementUnit) streamReader.readObject());
    setProcurementType(instance, (com.planetsystems.model.utils.utils_model.ProcurementType) streamReader.readObject());
    setQuantity(instance, streamReader.readString());
    setUnitCost(instance, streamReader.readDouble());
    
    com.Planning.model.ParentEntity_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.Planning.model.ProcurementPlan instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.Planning.model.ProcurementPlan();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.Planning.model.ProcurementPlan instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-2"));
    streamWriter.writeObject(getAccount(instance));
    streamWriter.writeObject(getActivity(instance));
    streamWriter.writeString(getComment(instance));
    streamWriter.writeObject(getCurrency(instance));
    streamWriter.writeObject(getDateRequired(instance));
    streamWriter.writeDouble(getEstimatedCost(instance));
    streamWriter.writeObject(getFinancialYear(instance));
    streamWriter.writeObject(getFundingAgency(instance));
    streamWriter.writeObject(getItem(instance));
    streamWriter.writeObject(getMeasurementUnit(instance));
    streamWriter.writeObject(getProcurementType(instance));
    streamWriter.writeString(getQuantity(instance));
    streamWriter.writeDouble(getUnitCost(instance));
    
    com.Planning.model.ParentEntity_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.Planning.model.ProcurementPlan_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.Planning.model.ProcurementPlan_FieldSerializer.deserialize(reader, (com.Planning.model.ProcurementPlan)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.Planning.model.ProcurementPlan_FieldSerializer.serialize(writer, (com.Planning.model.ProcurementPlan)object);
  }
  
}
