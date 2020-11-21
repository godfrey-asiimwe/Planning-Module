package com.planetsystems.model.utils.utils_model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Account_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getAccountCode(com.planetsystems.model.utils.utils_model.Account instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Account.class, instance, "accountCode");
  }
  
  private static void setAccountCode(com.planetsystems.model.utils.utils_model.Account instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Account.class, instance, "accountCode", value);
  }
  
  private static java.lang.String getAccountDesc(com.planetsystems.model.utils.utils_model.Account instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Account.class, instance, "accountDesc");
  }
  
  private static void setAccountDesc(com.planetsystems.model.utils.utils_model.Account instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Account.class, instance, "accountDesc", value);
  }
  
  private static java.lang.String getAccountName(com.planetsystems.model.utils.utils_model.Account instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Account.class, instance, "accountName");
  }
  
  private static void setAccountName(com.planetsystems.model.utils.utils_model.Account instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Account.class, instance, "accountName", value);
  }
  
  private static java.lang.String getId(com.planetsystems.model.utils.utils_model.Account instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Account.class, instance, "id");
  }
  
  private static void setId(com.planetsystems.model.utils.utils_model.Account instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Account.class, instance, "id", value);
  }
  
  private static com.planetsystems.model.utils.utils_model.Status getStatus(com.planetsystems.model.utils.utils_model.Account instance) {
    return (com.planetsystems.model.utils.utils_model.Status) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Account.class, instance, "status");
  }
  
  private static void setStatus(com.planetsystems.model.utils.utils_model.Account instance, com.planetsystems.model.utils.utils_model.Status value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Account.class, instance, "status", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.planetsystems.model.utils.utils_model.Account instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setAccountCode(instance, streamReader.readString());
    setAccountDesc(instance, streamReader.readString());
    setAccountName(instance, streamReader.readString());
    setId(instance, streamReader.readString());
    setStatus(instance, (com.planetsystems.model.utils.utils_model.Status) streamReader.readObject());
    
  }
  
  public static com.planetsystems.model.utils.utils_model.Account instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.planetsystems.model.utils.utils_model.Account();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.planetsystems.model.utils.utils_model.Account instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeString(getAccountCode(instance));
    streamWriter.writeString(getAccountDesc(instance));
    streamWriter.writeString(getAccountName(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeObject(getStatus(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.planetsystems.model.utils.utils_model.Account_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.Account_FieldSerializer.deserialize(reader, (com.planetsystems.model.utils.utils_model.Account)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.Account_FieldSerializer.serialize(writer, (com.planetsystems.model.utils.utils_model.Account)object);
  }
  
}
