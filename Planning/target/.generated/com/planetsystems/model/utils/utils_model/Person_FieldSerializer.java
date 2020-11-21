package com.planetsystems.model.utils.utils_model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Person_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getEmail(com.planetsystems.model.utils.utils_model.Person instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Person.class, instance, "email");
  }
  
  private static void setEmail(com.planetsystems.model.utils.utils_model.Person instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Person.class, instance, "email", value);
  }
  
  private static java.lang.String getFirstName(com.planetsystems.model.utils.utils_model.Person instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Person.class, instance, "firstName");
  }
  
  private static void setFirstName(com.planetsystems.model.utils.utils_model.Person instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Person.class, instance, "firstName", value);
  }
  
  private static java.lang.String getId(com.planetsystems.model.utils.utils_model.Person instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Person.class, instance, "id");
  }
  
  private static void setId(com.planetsystems.model.utils.utils_model.Person instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Person.class, instance, "id", value);
  }
  
  private static java.lang.String getLastName(com.planetsystems.model.utils.utils_model.Person instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Person.class, instance, "lastName");
  }
  
  private static void setLastName(com.planetsystems.model.utils.utils_model.Person instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Person.class, instance, "lastName", value);
  }
  
  private static java.lang.String getPhoneNumber(com.planetsystems.model.utils.utils_model.Person instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Person.class, instance, "phoneNumber");
  }
  
  private static void setPhoneNumber(com.planetsystems.model.utils.utils_model.Person instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Person.class, instance, "phoneNumber", value);
  }
  
  private static com.planetsystems.model.utils.utils_model.Status getStatus(com.planetsystems.model.utils.utils_model.Person instance) {
    return (com.planetsystems.model.utils.utils_model.Status) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Person.class, instance, "status");
  }
  
  private static void setStatus(com.planetsystems.model.utils.utils_model.Person instance, com.planetsystems.model.utils.utils_model.Status value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Person.class, instance, "status", value);
  }
  
  private static java.lang.String getUsername(com.planetsystems.model.utils.utils_model.Person instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Person.class, instance, "username");
  }
  
  private static void setUsername(com.planetsystems.model.utils.utils_model.Person instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Person.class, instance, "username", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.planetsystems.model.utils.utils_model.Person instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setEmail(instance, streamReader.readString());
    setFirstName(instance, streamReader.readString());
    setId(instance, streamReader.readString());
    setLastName(instance, streamReader.readString());
    setPhoneNumber(instance, streamReader.readString());
    setStatus(instance, (com.planetsystems.model.utils.utils_model.Status) streamReader.readObject());
    setUsername(instance, streamReader.readString());
    
  }
  
  public static com.planetsystems.model.utils.utils_model.Person instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.planetsystems.model.utils.utils_model.Person();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.planetsystems.model.utils.utils_model.Person instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeString(getEmail(instance));
    streamWriter.writeString(getFirstName(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getLastName(instance));
    streamWriter.writeString(getPhoneNumber(instance));
    streamWriter.writeObject(getStatus(instance));
    streamWriter.writeString(getUsername(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.planetsystems.model.utils.utils_model.Person_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.Person_FieldSerializer.deserialize(reader, (com.planetsystems.model.utils.utils_model.Person)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.Person_FieldSerializer.serialize(writer, (com.planetsystems.model.utils.utils_model.Person)object);
  }
  
}
