package com.planetsystems.ui.utils.utils_ui.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class UtilResult_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.planetsystems.ui.utils.utils_ui.shared.UtilResult[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.planetsystems.ui.utils.utils_ui.shared.UtilResult[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new com.planetsystems.ui.utils.utils_ui.shared.UtilResult[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.planetsystems.ui.utils.utils_ui.shared.UtilResult[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.planetsystems.ui.utils.utils_ui.shared.UtilResult_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.planetsystems.ui.utils.utils_ui.shared.UtilResult_Array_Rank_1_FieldSerializer.deserialize(reader, (com.planetsystems.ui.utils.utils_ui.shared.UtilResult[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.planetsystems.ui.utils.utils_ui.shared.UtilResult_Array_Rank_1_FieldSerializer.serialize(writer, (com.planetsystems.ui.utils.utils_ui.shared.UtilResult[])object);
  }
  
}
