package com.planetsystems.model.utils.utils_model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Activity_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getActivityCode(com.planetsystems.model.utils.utils_model.Activity instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Activity.class, instance, "activityCode");
  }
  
  private static void setActivityCode(com.planetsystems.model.utils.utils_model.Activity instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Activity.class, instance, "activityCode", value);
  }
  
  private static java.lang.String getActivityDesc(com.planetsystems.model.utils.utils_model.Activity instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Activity.class, instance, "activityDesc");
  }
  
  private static void setActivityDesc(com.planetsystems.model.utils.utils_model.Activity instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Activity.class, instance, "activityDesc", value);
  }
  
  private static java.lang.String getActivityName(com.planetsystems.model.utils.utils_model.Activity instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Activity.class, instance, "activityName");
  }
  
  private static void setActivityName(com.planetsystems.model.utils.utils_model.Activity instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Activity.class, instance, "activityName", value);
  }
  
  private static java.lang.String getId(com.planetsystems.model.utils.utils_model.Activity instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Activity.class, instance, "id");
  }
  
  private static void setId(com.planetsystems.model.utils.utils_model.Activity instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Activity.class, instance, "id", value);
  }
  
  private static com.planetsystems.model.utils.utils_model.Status getStatus(com.planetsystems.model.utils.utils_model.Activity instance) {
    return (com.planetsystems.model.utils.utils_model.Status) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Activity.class, instance, "status");
  }
  
  private static void setStatus(com.planetsystems.model.utils.utils_model.Activity instance, com.planetsystems.model.utils.utils_model.Status value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Activity.class, instance, "status", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.planetsystems.model.utils.utils_model.Activity instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setActivityCode(instance, streamReader.readString());
    setActivityDesc(instance, streamReader.readString());
    setActivityName(instance, streamReader.readString());
    setId(instance, streamReader.readString());
    setStatus(instance, (com.planetsystems.model.utils.utils_model.Status) streamReader.readObject());
    
  }
  
  public static com.planetsystems.model.utils.utils_model.Activity instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.planetsystems.model.utils.utils_model.Activity();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.planetsystems.model.utils.utils_model.Activity instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeString(getActivityCode(instance));
    streamWriter.writeString(getActivityDesc(instance));
    streamWriter.writeString(getActivityName(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeObject(getStatus(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.planetsystems.model.utils.utils_model.Activity_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.Activity_FieldSerializer.deserialize(reader, (com.planetsystems.model.utils.utils_model.Activity)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.Activity_FieldSerializer.serialize(writer, (com.planetsystems.model.utils.utils_model.Activity)object);
  }
  
}
