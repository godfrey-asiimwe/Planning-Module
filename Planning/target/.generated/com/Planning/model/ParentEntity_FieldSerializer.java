package com.Planning.model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ParentEntity_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static com.planetsystems.model.utils.utils_model.User getChangedBy(com.Planning.model.ParentEntity instance) {
    return (com.planetsystems.model.utils.utils_model.User) ReflectionHelper.getField(com.Planning.model.ParentEntity.class, instance, "changedBy");
  }
  
  private static void setChangedBy(com.Planning.model.ParentEntity instance, com.planetsystems.model.utils.utils_model.User value) 
  {
    ReflectionHelper.setField(com.Planning.model.ParentEntity.class, instance, "changedBy", value);
  }
  
  private static com.planetsystems.model.utils.utils_model.User getCreatedBy(com.Planning.model.ParentEntity instance) {
    return (com.planetsystems.model.utils.utils_model.User) ReflectionHelper.getField(com.Planning.model.ParentEntity.class, instance, "createdBy");
  }
  
  private static void setCreatedBy(com.Planning.model.ParentEntity instance, com.planetsystems.model.utils.utils_model.User value) 
  {
    ReflectionHelper.setField(com.Planning.model.ParentEntity.class, instance, "createdBy", value);
  }
  
  private static java.util.Date getDateChanged(com.Planning.model.ParentEntity instance) {
    return (java.util.Date) ReflectionHelper.getField(com.Planning.model.ParentEntity.class, instance, "dateChanged");
  }
  
  private static void setDateChanged(com.Planning.model.ParentEntity instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.Planning.model.ParentEntity.class, instance, "dateChanged", value);
  }
  
  private static java.util.Date getDateCreated(com.Planning.model.ParentEntity instance) {
    return (java.util.Date) ReflectionHelper.getField(com.Planning.model.ParentEntity.class, instance, "dateCreated");
  }
  
  private static void setDateCreated(com.Planning.model.ParentEntity instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.Planning.model.ParentEntity.class, instance, "dateCreated", value);
  }
  
  private static java.lang.String getId(com.Planning.model.ParentEntity instance) {
    return (java.lang.String) ReflectionHelper.getField(com.Planning.model.ParentEntity.class, instance, "id");
  }
  
  private static void setId(com.Planning.model.ParentEntity instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.Planning.model.ParentEntity.class, instance, "id", value);
  }
  
  private static com.planetsystems.model.utils.utils_model.Status getRecordStatus(com.Planning.model.ParentEntity instance) {
    return (com.planetsystems.model.utils.utils_model.Status) ReflectionHelper.getField(com.Planning.model.ParentEntity.class, instance, "recordStatus");
  }
  
  private static void setRecordStatus(com.Planning.model.ParentEntity instance, com.planetsystems.model.utils.utils_model.Status value) 
  {
    ReflectionHelper.setField(com.Planning.model.ParentEntity.class, instance, "recordStatus", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.Planning.model.ParentEntity instance) throws SerializationException {
    setChangedBy(instance, (com.planetsystems.model.utils.utils_model.User) streamReader.readObject());
    setCreatedBy(instance, (com.planetsystems.model.utils.utils_model.User) streamReader.readObject());
    setDateChanged(instance, (java.util.Date) streamReader.readObject());
    setDateCreated(instance, (java.util.Date) streamReader.readObject());
    setId(instance, streamReader.readString());
    setRecordStatus(instance, (com.planetsystems.model.utils.utils_model.Status) streamReader.readObject());
    
  }
  
  public static com.Planning.model.ParentEntity instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.Planning.model.ParentEntity();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.Planning.model.ParentEntity instance) throws SerializationException {
    streamWriter.writeObject(getChangedBy(instance));
    streamWriter.writeObject(getCreatedBy(instance));
    streamWriter.writeObject(getDateChanged(instance));
    streamWriter.writeObject(getDateCreated(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeObject(getRecordStatus(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.Planning.model.ParentEntity_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.Planning.model.ParentEntity_FieldSerializer.deserialize(reader, (com.Planning.model.ParentEntity)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.Planning.model.ParentEntity_FieldSerializer.serialize(writer, (com.Planning.model.ParentEntity)object);
  }
  
}
