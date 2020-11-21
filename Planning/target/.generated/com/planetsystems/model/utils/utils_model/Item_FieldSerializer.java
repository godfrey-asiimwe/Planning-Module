package com.planetsystems.model.utils.utils_model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Item_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getCode(com.planetsystems.model.utils.utils_model.Item instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Item.class, instance, "code");
  }
  
  private static void setCode(com.planetsystems.model.utils.utils_model.Item instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Item.class, instance, "code", value);
  }
  
  private static java.lang.String getId(com.planetsystems.model.utils.utils_model.Item instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Item.class, instance, "id");
  }
  
  private static void setId(com.planetsystems.model.utils.utils_model.Item instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Item.class, instance, "id", value);
  }
  
  private static java.lang.String getItemDescription(com.planetsystems.model.utils.utils_model.Item instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Item.class, instance, "itemDescription");
  }
  
  private static void setItemDescription(com.planetsystems.model.utils.utils_model.Item instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Item.class, instance, "itemDescription", value);
  }
  
  private static java.lang.String getItemName(com.planetsystems.model.utils.utils_model.Item instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Item.class, instance, "itemName");
  }
  
  private static void setItemName(com.planetsystems.model.utils.utils_model.Item instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Item.class, instance, "itemName", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.planetsystems.model.utils.utils_model.Item instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setCode(instance, streamReader.readString());
    setId(instance, streamReader.readString());
    setItemDescription(instance, streamReader.readString());
    setItemName(instance, streamReader.readString());
    
  }
  
  public static com.planetsystems.model.utils.utils_model.Item instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.planetsystems.model.utils.utils_model.Item();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.planetsystems.model.utils.utils_model.Item instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeString(getCode(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getItemDescription(instance));
    streamWriter.writeString(getItemName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.planetsystems.model.utils.utils_model.Item_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.Item_FieldSerializer.deserialize(reader, (com.planetsystems.model.utils.utils_model.Item)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.Item_FieldSerializer.serialize(writer, (com.planetsystems.model.utils.utils_model.Item)object);
  }
  
}
