package com.planetsystems.model.utils.utils_model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Address_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getCountry(com.planetsystems.model.utils.utils_model.Address instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Address.class, instance, "country");
  }
  
  private static void setCountry(com.planetsystems.model.utils.utils_model.Address instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Address.class, instance, "country", value);
  }
  
  private static java.lang.String getFloorOrRoomNo(com.planetsystems.model.utils.utils_model.Address instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Address.class, instance, "floorOrRoomNo");
  }
  
  private static void setFloorOrRoomNo(com.planetsystems.model.utils.utils_model.Address instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Address.class, instance, "floorOrRoomNo", value);
  }
  
  private static java.lang.String getId(com.planetsystems.model.utils.utils_model.Address instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Address.class, instance, "id");
  }
  
  private static void setId(com.planetsystems.model.utils.utils_model.Address instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Address.class, instance, "id", value);
  }
  
  private static java.lang.String getOfficeName(com.planetsystems.model.utils.utils_model.Address instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Address.class, instance, "officeName");
  }
  
  private static void setOfficeName(com.planetsystems.model.utils.utils_model.Address instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Address.class, instance, "officeName", value);
  }
  
  private static java.lang.String getPostalAdress(com.planetsystems.model.utils.utils_model.Address instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Address.class, instance, "postalAdress");
  }
  
  private static void setPostalAdress(com.planetsystems.model.utils.utils_model.Address instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Address.class, instance, "postalAdress", value);
  }
  
  private static java.lang.String getStreetAddress(com.planetsystems.model.utils.utils_model.Address instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Address.class, instance, "streetAddress");
  }
  
  private static void setStreetAddress(com.planetsystems.model.utils.utils_model.Address instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Address.class, instance, "streetAddress", value);
  }
  
  private static java.lang.String getTownOrCity(com.planetsystems.model.utils.utils_model.Address instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.model.utils.utils_model.Address.class, instance, "townOrCity");
  }
  
  private static void setTownOrCity(com.planetsystems.model.utils.utils_model.Address instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.model.utils.utils_model.Address.class, instance, "townOrCity", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.planetsystems.model.utils.utils_model.Address instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setCountry(instance, streamReader.readString());
    setFloorOrRoomNo(instance, streamReader.readString());
    setId(instance, streamReader.readString());
    setOfficeName(instance, streamReader.readString());
    setPostalAdress(instance, streamReader.readString());
    setStreetAddress(instance, streamReader.readString());
    setTownOrCity(instance, streamReader.readString());
    
  }
  
  public static com.planetsystems.model.utils.utils_model.Address instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.planetsystems.model.utils.utils_model.Address();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.planetsystems.model.utils.utils_model.Address instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeString(getCountry(instance));
    streamWriter.writeString(getFloorOrRoomNo(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getOfficeName(instance));
    streamWriter.writeString(getPostalAdress(instance));
    streamWriter.writeString(getStreetAddress(instance));
    streamWriter.writeString(getTownOrCity(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.planetsystems.model.utils.utils_model.Address_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.Address_FieldSerializer.deserialize(reader, (com.planetsystems.model.utils.utils_model.Address)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.planetsystems.model.utils.utils_model.Address_FieldSerializer.serialize(writer, (com.planetsystems.model.utils.utils_model.Address)object);
  }
  
}
