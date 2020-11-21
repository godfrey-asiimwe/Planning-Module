package com.planetsystems.model.utils.utils_model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class MeasurementUnit_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getId(com.planetsystems.model.utils.utils_model.MeasurementUnit instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.MeasurementUnit.class, instance, "id");
  }
  
  private static void setId(com.planetsystems.model.utils.utils_model.MeasurementUnit instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.MeasurementUnit.class, instance, "id", value);
  }
  
  private static java.lang.String getName(com.planetsystems.model.utils.utils_model.MeasurementUnit instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.MeasurementUnit.class, instance, "name");
  }
  
  private static void setName(com.planetsystems.model.utils.utils_model.MeasurementUnit instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.MeasurementUnit.class, instance, "name", value);
  }
  
  private static java.lang.String getSymbol(com.planetsystems.model.utils.utils_model.MeasurementUnit instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.MeasurementUnit.class, instance, "symbol");
  }
  
  private static void setSymbol(com.planetsystems.model.utils.utils_model.MeasurementUnit instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.MeasurementUnit.class, instance, "symbol", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.planetsystems.model.utils.utils_model.MeasurementUnit instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setId(instance, streamReader.readString());
    setName(instance, streamReader.readString());
    setSymbol(instance, streamReader.readString());
    
  }
  
  public static com.planetsystems.model.utils.utils_model.MeasurementUnit instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.planetsystems.model.utils.utils_model.MeasurementUnit();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.planetsystems.model.utils.utils_model.MeasurementUnit instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getSymbol(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.planetsystems.model.utils.utils_model.MeasurementUnit_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.MeasurementUnit_FieldSerializer.deserialize(reader, (com.planetsystems.model.utils.utils_model.MeasurementUnit)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.MeasurementUnit_FieldSerializer.serialize(writer, (com.planetsystems.model.utils.utils_model.MeasurementUnit)object);
  }
  
}
