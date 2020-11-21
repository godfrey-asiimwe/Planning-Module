package com.planetsystems.model.utils.utils_model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Item_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.planetsystems.model.utils.utils_model.Item[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.planetsystems.model.utils.utils_model.Item[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new com.planetsystems.model.utils.utils_model.Item[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.planetsystems.model.utils.utils_model.Item[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.planetsystems.model.utils.utils_model.Item_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.Item_Array_Rank_1_FieldSerializer.deserialize(reader, (com.planetsystems.model.utils.utils_model.Item[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.Item_Array_Rank_1_FieldSerializer.serialize(writer, (com.planetsystems.model.utils.utils_model.Item[])object);
  }
  
}
