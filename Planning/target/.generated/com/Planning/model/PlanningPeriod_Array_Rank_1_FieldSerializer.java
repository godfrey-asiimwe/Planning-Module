package com.Planning.model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PlanningPeriod_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.Planning.model.PlanningPeriod[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.Planning.model.PlanningPeriod[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new com.Planning.model.PlanningPeriod[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.Planning.model.PlanningPeriod[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.Planning.model.PlanningPeriod_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.Planning.model.PlanningPeriod_Array_Rank_1_FieldSerializer.deserialize(reader, (com.Planning.model.PlanningPeriod[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.Planning.model.PlanningPeriod_Array_Rank_1_FieldSerializer.serialize(writer, (com.Planning.model.PlanningPeriod[])object);
  }
  
}
