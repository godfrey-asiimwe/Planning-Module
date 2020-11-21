package com.Planning.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PlanningResult_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.util.List getPlanningPeriodList(com.Planning.shared.PlanningResult instance) {
    return (java.util.List) ReflectionHelper.getField(com.Planning.shared.PlanningResult.class, instance, "planningPeriodList");
  }
  
  private static void setPlanningPeriodList(com.Planning.shared.PlanningResult instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.Planning.shared.PlanningResult.class, instance, "planningPeriodList", value);
  }
  
  private static java.util.List getProcurementPlanList(com.Planning.shared.PlanningResult instance) {
    return (java.util.List) ReflectionHelper.getField(com.Planning.shared.PlanningResult.class, instance, "procurementPlanList");
  }
  
  private static void setProcurementPlanList(com.Planning.shared.PlanningResult instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.Planning.shared.PlanningResult.class, instance, "procurementPlanList", value);
  }
  
  private static java.lang.String getResponse(com.Planning.shared.PlanningResult instance) {
    return (java.lang.String) ReflectionHelper.getField(com.Planning.shared.PlanningResult.class, instance, "response");
  }
  
  private static void setResponse(com.Planning.shared.PlanningResult instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.Planning.shared.PlanningResult.class, instance, "response", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.Planning.shared.PlanningResult instance) throws SerializationException {
    setPlanningPeriodList(instance, (java.util.List) streamReader.readObject());
    setProcurementPlanList(instance, (java.util.List) streamReader.readObject());
    setResponse(instance, streamReader.readString());
    
  }
  
  public static com.Planning.shared.PlanningResult instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.Planning.shared.PlanningResult();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.Planning.shared.PlanningResult instance) throws SerializationException {
    streamWriter.writeObject(getPlanningPeriodList(instance));
    streamWriter.writeObject(getProcurementPlanList(instance));
    streamWriter.writeString(getResponse(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.Planning.shared.PlanningResult_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.Planning.shared.PlanningResult_FieldSerializer.deserialize(reader, (com.Planning.shared.PlanningResult)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.Planning.shared.PlanningResult_FieldSerializer.serialize(writer, (com.Planning.shared.PlanningResult)object);
  }
  
}
