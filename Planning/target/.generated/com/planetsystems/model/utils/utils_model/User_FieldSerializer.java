package com.planetsystems.model.utils.utils_model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class User_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getId(com.planetsystems.model.utils.utils_model.User instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.User.class, instance, "id");
  }
  
  private static void setId(com.planetsystems.model.utils.utils_model.User instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.User.class, instance, "id", value);
  }
  
  private static java.lang.String getPassword(com.planetsystems.model.utils.utils_model.User instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.User.class, instance, "password");
  }
  
  private static void setPassword(com.planetsystems.model.utils.utils_model.User instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.User.class, instance, "password", value);
  }
  
  private static com.planetsystems.model.utils.utils_model.Person getPerson(com.planetsystems.model.utils.utils_model.User instance) {
    return (com.planetsystems.model.utils.utils_model.Person) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.User.class, instance, "person");
  }
  
  private static void setPerson(com.planetsystems.model.utils.utils_model.User instance, com.planetsystems.model.utils.utils_model.Person value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.User.class, instance, "person", value);
  }
  
  private static java.lang.String getUsername(com.planetsystems.model.utils.utils_model.User instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.User.class, instance, "username");
  }
  
  private static void setUsername(com.planetsystems.model.utils.utils_model.User instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.User.class, instance, "username", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.planetsystems.model.utils.utils_model.User instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setId(instance, streamReader.readString());
    setPassword(instance, streamReader.readString());
    setPerson(instance, (com.planetsystems.model.utils.utils_model.Person) streamReader.readObject());
    setUsername(instance, streamReader.readString());
    
  }
  
  public static com.planetsystems.model.utils.utils_model.User instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.planetsystems.model.utils.utils_model.User();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.planetsystems.model.utils.utils_model.User instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getPassword(instance));
    streamWriter.writeObject(getPerson(instance));
    streamWriter.writeString(getUsername(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.planetsystems.model.utils.utils_model.User_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.User_FieldSerializer.deserialize(reader, (com.planetsystems.model.utils.utils_model.User)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.User_FieldSerializer.serialize(writer, (com.planetsystems.model.utils.utils_model.User)object);
  }
  
}
