package com.Planning.model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PlanningPeriod_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getPeriodName(com.Planning.model.PlanningPeriod instance) {
    return (java.lang.String) ReflectionHelper.getField(com.Planning.model.PlanningPeriod.class, instance, "PeriodName");
  }
  
  private static void setPeriodName(com.Planning.model.PlanningPeriod instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.Planning.model.PlanningPeriod.class, instance, "PeriodName", value);
  }
  
  private static java.util.Date getEndDate(com.Planning.model.PlanningPeriod instance) {
    return (java.util.Date) ReflectionHelper.getField(com.Planning.model.PlanningPeriod.class, instance, "endDate");
  }
  
  private static void setEndDate(com.Planning.model.PlanningPeriod instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.Planning.model.PlanningPeriod.class, instance, "endDate", value);
  }
  
  private static com.planetsystems.model.utils.utils_model.FinancialYear getFinancialYear(com.Planning.model.PlanningPeriod instance) {
    return (com.planetsystems.model.utils.utils_model.FinancialYear) ReflectionHelper.getField(com.Planning.model.PlanningPeriod.class, instance, "financialYear");
  }
  
  private static void setFinancialYear(com.Planning.model.PlanningPeriod instance, com.planetsystems.model.utils.utils_model.FinancialYear value) 
  {
    ReflectionHelper.setField(com.Planning.model.PlanningPeriod.class, instance, "financialYear", value);
  }
  
  private static java.util.Date getStartDate(com.Planning.model.PlanningPeriod instance) {
    return (java.util.Date) ReflectionHelper.getField(com.Planning.model.PlanningPeriod.class, instance, "startDate");
  }
  
  private static void setStartDate(com.Planning.model.PlanningPeriod instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.Planning.model.PlanningPeriod.class, instance, "startDate", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.Planning.model.PlanningPeriod instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-2", streamReader.readString());
    setPeriodName(instance, streamReader.readString());
    setEndDate(instance, (java.util.Date) streamReader.readObject());
    setFinancialYear(instance, (com.planetsystems.model.utils.utils_model.FinancialYear) streamReader.readObject());
    setStartDate(instance, (java.util.Date) streamReader.readObject());
    
    com.Planning.model.ParentEntity_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.Planning.model.PlanningPeriod instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.Planning.model.PlanningPeriod();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.Planning.model.PlanningPeriod instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-2"));
    streamWriter.writeString(getPeriodName(instance));
    streamWriter.writeObject(getEndDate(instance));
    streamWriter.writeObject(getFinancialYear(instance));
    streamWriter.writeObject(getStartDate(instance));
    
    com.Planning.model.ParentEntity_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.Planning.model.PlanningPeriod_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.Planning.model.PlanningPeriod_FieldSerializer.deserialize(reader, (com.Planning.model.PlanningPeriod)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.Planning.model.PlanningPeriod_FieldSerializer.serialize(writer, (com.Planning.model.PlanningPeriod)object);
  }
  
}
