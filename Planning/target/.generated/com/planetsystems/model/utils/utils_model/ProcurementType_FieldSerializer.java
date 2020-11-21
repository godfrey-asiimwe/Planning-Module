package com.planetsystems.model.utils.utils_model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ProcurementType_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getProcurementType(com.planetsystems.model.utils.utils_model.ProcurementType instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.ProcurementType.class, instance, "procurementType");
  }
  
  private static void setProcurementType(com.planetsystems.model.utils.utils_model.ProcurementType instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.ProcurementType.class, instance, "procurementType", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.planetsystems.model.utils.utils_model.ProcurementType instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static com.planetsystems.model.utils.utils_model.ProcurementType instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    com.planetsystems.model.utils.utils_model.ProcurementType[] values = com.planetsystems.model.utils.utils_model.ProcurementType.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.planetsystems.model.utils.utils_model.ProcurementType instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.planetsystems.model.utils.utils_model.ProcurementType_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.ProcurementType_FieldSerializer.deserialize(reader, (com.planetsystems.model.utils.utils_model.ProcurementType)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.ProcurementType_FieldSerializer.serialize(writer, (com.planetsystems.model.utils.utils_model.ProcurementType)object);
  }
  
}
