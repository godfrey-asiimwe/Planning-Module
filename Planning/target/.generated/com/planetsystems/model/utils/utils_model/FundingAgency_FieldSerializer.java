package com.planetsystems.model.utils.utils_model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class FundingAgency_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getCode(com.planetsystems.model.utils.utils_model.FundingAgency instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.FundingAgency.class, instance, "code");
  }
  
  private static void setCode(com.planetsystems.model.utils.utils_model.FundingAgency instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.FundingAgency.class, instance, "code", value);
  }
  
  private static java.lang.String getDescription(com.planetsystems.model.utils.utils_model.FundingAgency instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.FundingAgency.class, instance, "description");
  }
  
  private static void setDescription(com.planetsystems.model.utils.utils_model.FundingAgency instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.FundingAgency.class, instance, "description", value);
  }
  
  private static java.lang.String getId(com.planetsystems.model.utils.utils_model.FundingAgency instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.FundingAgency.class, instance, "id");
  }
  
  private static void setId(com.planetsystems.model.utils.utils_model.FundingAgency instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.FundingAgency.class, instance, "id", value);
  }
  
  private static java.lang.String getName(com.planetsystems.model.utils.utils_model.FundingAgency instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.FundingAgency.class, instance, "name");
  }
  
  private static void setName(com.planetsystems.model.utils.utils_model.FundingAgency instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.FundingAgency.class, instance, "name", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.planetsystems.model.utils.utils_model.FundingAgency instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setCode(instance, streamReader.readString());
    setDescription(instance, streamReader.readString());
    setId(instance, streamReader.readString());
    setName(instance, streamReader.readString());
    
  }
  
  public static com.planetsystems.model.utils.utils_model.FundingAgency instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.planetsystems.model.utils.utils_model.FundingAgency();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.planetsystems.model.utils.utils_model.FundingAgency instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeString(getCode(instance));
    streamWriter.writeString(getDescription(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.planetsystems.model.utils.utils_model.FundingAgency_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.FundingAgency_FieldSerializer.deserialize(reader, (com.planetsystems.model.utils.utils_model.FundingAgency)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.FundingAgency_FieldSerializer.serialize(writer, (com.planetsystems.model.utils.utils_model.FundingAgency)object);
  }
  
}
