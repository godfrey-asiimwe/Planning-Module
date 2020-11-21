package com.planetsystems.model.utils.utils_model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Currency_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getCurrencyName(com.planetsystems.model.utils.utils_model.Currency instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Currency.class, instance, "currencyName");
  }
  
  private static void setCurrencyName(com.planetsystems.model.utils.utils_model.Currency instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Currency.class, instance, "currencyName", value);
  }
  
  private static java.lang.String getId(com.planetsystems.model.utils.utils_model.Currency instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Currency.class, instance, "id");
  }
  
  private static void setId(com.planetsystems.model.utils.utils_model.Currency instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Currency.class, instance, "id", value);
  }
  
  private static java.lang.String getSymbol(com.planetsystems.model.utils.utils_model.Currency instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Currency.class, instance, "symbol");
  }
  
  private static void setSymbol(com.planetsystems.model.utils.utils_model.Currency instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Currency.class, instance, "symbol", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.planetsystems.model.utils.utils_model.Currency instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setCurrencyName(instance, streamReader.readString());
    setId(instance, streamReader.readString());
    setSymbol(instance, streamReader.readString());
    
  }
  
  public static com.planetsystems.model.utils.utils_model.Currency instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.planetsystems.model.utils.utils_model.Currency();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.planetsystems.model.utils.utils_model.Currency instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeString(getCurrencyName(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getSymbol(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.planetsystems.model.utils.utils_model.Currency_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.Currency_FieldSerializer.deserialize(reader, (com.planetsystems.model.utils.utils_model.Currency)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.Currency_FieldSerializer.serialize(writer, (com.planetsystems.model.utils.utils_model.Currency)object);
  }
  
}
