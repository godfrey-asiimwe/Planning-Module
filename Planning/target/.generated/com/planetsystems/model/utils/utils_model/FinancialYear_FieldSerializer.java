package com.planetsystems.model.utils.utils_model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class FinancialYear_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getCode(com.planetsystems.model.utils.utils_model.FinancialYear instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.FinancialYear.class, instance, "code");
  }
  
  private static void setCode(com.planetsystems.model.utils.utils_model.FinancialYear instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.FinancialYear.class, instance, "code", value);
  }
  
  private static java.lang.String getDescription(com.planetsystems.model.utils.utils_model.FinancialYear instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.FinancialYear.class, instance, "description");
  }
  
  private static void setDescription(com.planetsystems.model.utils.utils_model.FinancialYear instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.FinancialYear.class, instance, "description", value);
  }
  
  private static java.lang.String getId(com.planetsystems.model.utils.utils_model.FinancialYear instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.FinancialYear.class, instance, "id");
  }
  
  private static void setId(com.planetsystems.model.utils.utils_model.FinancialYear instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.FinancialYear.class, instance, "id", value);
  }
  
  private static java.lang.String getInheritatedId(com.planetsystems.model.utils.utils_model.FinancialYear instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.FinancialYear.class, instance, "inheritatedId");
  }
  
  private static void setInheritatedId(com.planetsystems.model.utils.utils_model.FinancialYear instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.FinancialYear.class, instance, "inheritatedId", value);
  }
  
  private static java.lang.String getName(com.planetsystems.model.utils.utils_model.FinancialYear instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.FinancialYear.class, instance, "name");
  }
  
  private static void setName(com.planetsystems.model.utils.utils_model.FinancialYear instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.FinancialYear.class, instance, "name", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.planetsystems.model.utils.utils_model.FinancialYear instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setCode(instance, streamReader.readString());
    setDescription(instance, streamReader.readString());
    setId(instance, streamReader.readString());
    setInheritatedId(instance, streamReader.readString());
    setName(instance, streamReader.readString());
    
  }
  
  public static com.planetsystems.model.utils.utils_model.FinancialYear instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.planetsystems.model.utils.utils_model.FinancialYear();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.planetsystems.model.utils.utils_model.FinancialYear instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeString(getCode(instance));
    streamWriter.writeString(getDescription(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getInheritatedId(instance));
    streamWriter.writeString(getName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.planetsystems.model.utils.utils_model.FinancialYear_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.FinancialYear_FieldSerializer.deserialize(reader, (com.planetsystems.model.utils.utils_model.FinancialYear)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.FinancialYear_FieldSerializer.serialize(writer, (com.planetsystems.model.utils.utils_model.FinancialYear)object);
  }
  
}
