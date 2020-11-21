package com.Planning.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Planning_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getOperation(com.Planning.shared.Planning instance) {
    return (java.lang.String) ReflectionHelper.getField(com.Planning.shared.Planning.class, instance, "operation");
  }
  
  private static void setOperation(com.Planning.shared.Planning instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.Planning.shared.Planning.class, instance, "operation", value);
  }
  
  private static com.Planning.model.PlanningPeriod getPlanningPeriod(com.Planning.shared.Planning instance) {
    return (com.Planning.model.PlanningPeriod) ReflectionHelper.getField(com.Planning.shared.Planning.class, instance, "planningPeriod");
  }
  
  private static void setPlanningPeriod(com.Planning.shared.Planning instance, com.Planning.model.PlanningPeriod value) 
  {
    ReflectionHelper.setField(com.Planning.shared.Planning.class, instance, "planningPeriod", value);
  }
  
  private static com.Planning.model.ProcurementPlan getProcurementPlan(com.Planning.shared.Planning instance) {
    return (com.Planning.model.ProcurementPlan) ReflectionHelper.getField(com.Planning.shared.Planning.class, instance, "procurementPlan");
  }
  
  private static void setProcurementPlan(com.Planning.shared.Planning instance, com.Planning.model.ProcurementPlan value) 
  {
    ReflectionHelper.setField(com.Planning.shared.Planning.class, instance, "procurementPlan", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.Planning.shared.Planning instance) throws SerializationException {
    setOperation(instance, streamReader.readString());
    setPlanningPeriod(instance, (com.Planning.model.PlanningPeriod) streamReader.readObject());
    setProcurementPlan(instance, (com.Planning.model.ProcurementPlan) streamReader.readObject());
    
    com.gwtplatform.dispatch.shared.UnsecuredActionImpl_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.Planning.shared.Planning instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.Planning.shared.Planning();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.Planning.shared.Planning instance) throws SerializationException {
    streamWriter.writeString(getOperation(instance));
    streamWriter.writeObject(getPlanningPeriod(instance));
    streamWriter.writeObject(getProcurementPlan(instance));
    
    com.gwtplatform.dispatch.shared.UnsecuredActionImpl_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.Planning.shared.Planning_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.Planning.shared.Planning_FieldSerializer.deserialize(reader, (com.Planning.shared.Planning)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.Planning.shared.Planning_FieldSerializer.serialize(writer, (com.Planning.shared.Planning)object);
  }
  
}
