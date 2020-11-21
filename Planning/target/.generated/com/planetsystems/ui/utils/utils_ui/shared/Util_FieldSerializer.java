package com.planetsystems.ui.utils.utils_ui.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Util_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static com.planetsystems.model.utils.utils_model.Account getAccount(com.planetsystems.ui.utils.utils_ui.shared.Util instance) {
    return (com.planetsystems.model.utils.utils_model.Account) ReflectionHelper.getField(com.planetsystems.ui.utils.utils_ui.shared.Util.class, instance, "account");
  }
  
  private static void setAccount(com.planetsystems.ui.utils.utils_ui.shared.Util instance, com.planetsystems.model.utils.utils_model.Account value) 
  {
    ReflectionHelper.setField(com.planetsystems.ui.utils.utils_ui.shared.Util.class, instance, "account", value);
  }
  
  private static com.planetsystems.model.utils.utils_model.Activity getActivity(com.planetsystems.ui.utils.utils_ui.shared.Util instance) {
    return (com.planetsystems.model.utils.utils_model.Activity) ReflectionHelper.getField(com.planetsystems.ui.utils.utils_ui.shared.Util.class, instance, "activity");
  }
  
  private static void setActivity(com.planetsystems.ui.utils.utils_ui.shared.Util instance, com.planetsystems.model.utils.utils_model.Activity value) 
  {
    ReflectionHelper.setField(com.planetsystems.ui.utils.utils_ui.shared.Util.class, instance, "activity", value);
  }
  
  private static com.planetsystems.model.utils.utils_model.Address getAddress(com.planetsystems.ui.utils.utils_ui.shared.Util instance) {
    return (com.planetsystems.model.utils.utils_model.Address) ReflectionHelper.getField(com.planetsystems.ui.utils.utils_ui.shared.Util.class, instance, "address");
  }
  
  private static void setAddress(com.planetsystems.ui.utils.utils_ui.shared.Util instance, com.planetsystems.model.utils.utils_model.Address value) 
  {
    ReflectionHelper.setField(com.planetsystems.ui.utils.utils_ui.shared.Util.class, instance, "address", value);
  }
  
  private static com.planetsystems.model.utils.utils_model.Currency getCurrency(com.planetsystems.ui.utils.utils_ui.shared.Util instance) {
    return (com.planetsystems.model.utils.utils_model.Currency) ReflectionHelper.getField(com.planetsystems.ui.utils.utils_ui.shared.Util.class, instance, "currency");
  }
  
  private static void setCurrency(com.planetsystems.ui.utils.utils_ui.shared.Util instance, com.planetsystems.model.utils.utils_model.Currency value) 
  {
    ReflectionHelper.setField(com.planetsystems.ui.utils.utils_ui.shared.Util.class, instance, "currency", value);
  }
  
  private static com.planetsystems.model.utils.utils_model.FinancialYear getFinancialYear(com.planetsystems.ui.utils.utils_ui.shared.Util instance) {
    return (com.planetsystems.model.utils.utils_model.FinancialYear) ReflectionHelper.getField(com.planetsystems.ui.utils.utils_ui.shared.Util.class, instance, "financialYear");
  }
  
  private static void setFinancialYear(com.planetsystems.ui.utils.utils_ui.shared.Util instance, com.planetsystems.model.utils.utils_model.FinancialYear value) 
  {
    ReflectionHelper.setField(com.planetsystems.ui.utils.utils_ui.shared.Util.class, instance, "financialYear", value);
  }
  
  private static com.planetsystems.model.utils.utils_model.FundingAgency getFundingAgency(com.planetsystems.ui.utils.utils_ui.shared.Util instance) {
    return (com.planetsystems.model.utils.utils_model.FundingAgency) ReflectionHelper.getField(com.planetsystems.ui.utils.utils_ui.shared.Util.class, instance, "fundingAgency");
  }
  
  private static void setFundingAgency(com.planetsystems.ui.utils.utils_ui.shared.Util instance, com.planetsystems.model.utils.utils_model.FundingAgency value) 
  {
    ReflectionHelper.setField(com.planetsystems.ui.utils.utils_ui.shared.Util.class, instance, "fundingAgency", value);
  }
  
  private static com.planetsystems.model.utils.utils_model.Item getItem(com.planetsystems.ui.utils.utils_ui.shared.Util instance) {
    return (com.planetsystems.model.utils.utils_model.Item) ReflectionHelper.getField(com.planetsystems.ui.utils.utils_ui.shared.Util.class, instance, "item");
  }
  
  private static void setItem(com.planetsystems.ui.utils.utils_ui.shared.Util instance, com.planetsystems.model.utils.utils_model.Item value) 
  {
    ReflectionHelper.setField(com.planetsystems.ui.utils.utils_ui.shared.Util.class, instance, "item", value);
  }
  
  private static com.planetsystems.model.utils.utils_model.MeasurementUnit getMeasurementUnit(com.planetsystems.ui.utils.utils_ui.shared.Util instance) {
    return (com.planetsystems.model.utils.utils_model.MeasurementUnit) ReflectionHelper.getField(com.planetsystems.ui.utils.utils_ui.shared.Util.class, instance, "measurementUnit");
  }
  
  private static void setMeasurementUnit(com.planetsystems.ui.utils.utils_ui.shared.Util instance, com.planetsystems.model.utils.utils_model.MeasurementUnit value) 
  {
    ReflectionHelper.setField(com.planetsystems.ui.utils.utils_ui.shared.Util.class, instance, "measurementUnit", value);
  }
  
  private static java.lang.String getOperation(com.planetsystems.ui.utils.utils_ui.shared.Util instance) {
    return (java.lang.String) ReflectionHelper.getField(com.planetsystems.ui.utils.utils_ui.shared.Util.class, instance, "operation");
  }
  
  private static void setOperation(com.planetsystems.ui.utils.utils_ui.shared.Util instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.planetsystems.ui.utils.utils_ui.shared.Util.class, instance, "operation", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.planetsystems.ui.utils.utils_ui.shared.Util instance) throws SerializationException {
    setAccount(instance, (com.planetsystems.model.utils.utils_model.Account) streamReader.readObject());
    setActivity(instance, (com.planetsystems.model.utils.utils_model.Activity) streamReader.readObject());
    setAddress(instance, (com.planetsystems.model.utils.utils_model.Address) streamReader.readObject());
    setCurrency(instance, (com.planetsystems.model.utils.utils_model.Currency) streamReader.readObject());
    setFinancialYear(instance, (com.planetsystems.model.utils.utils_model.FinancialYear) streamReader.readObject());
    setFundingAgency(instance, (com.planetsystems.model.utils.utils_model.FundingAgency) streamReader.readObject());
    setItem(instance, (com.planetsystems.model.utils.utils_model.Item) streamReader.readObject());
    setMeasurementUnit(instance, (com.planetsystems.model.utils.utils_model.MeasurementUnit) streamReader.readObject());
    setOperation(instance, streamReader.readString());
    
    com.gwtplatform.dispatch.shared.UnsecuredActionImpl_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.planetsystems.ui.utils.utils_ui.shared.Util instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.planetsystems.ui.utils.utils_ui.shared.Util();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.planetsystems.ui.utils.utils_ui.shared.Util instance) throws SerializationException {
    streamWriter.writeObject(getAccount(instance));
    streamWriter.writeObject(getActivity(instance));
    streamWriter.writeObject(getAddress(instance));
    streamWriter.writeObject(getCurrency(instance));
    streamWriter.writeObject(getFinancialYear(instance));
    streamWriter.writeObject(getFundingAgency(instance));
    streamWriter.writeObject(getItem(instance));
    streamWriter.writeObject(getMeasurementUnit(instance));
    streamWriter.writeString(getOperation(instance));
    
    com.gwtplatform.dispatch.shared.UnsecuredActionImpl_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.planetsystems.ui.utils.utils_ui.shared.Util_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.planetsystems.ui.utils.utils_ui.shared.Util_FieldSerializer.deserialize(reader, (com.planetsystems.ui.utils.utils_ui.shared.Util)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.planetsystems.ui.utils.utils_ui.shared.Util_FieldSerializer.serialize(writer, (com.planetsystems.ui.utils.utils_ui.shared.Util)object);
  }
  
}
