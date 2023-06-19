package com.stackroute.datamunger.query.parser;

/*
 * This class is used for storing name of field, condition and value for 
 * each conditions
 * */
public class Restriction {
	private String PropertyName;
	private String PropertyValue;
	private String Condition;
	public String getPropertyName() {
		return PropertyName;
	}
	public void setPropertyName(String propertyName) {
		PropertyName = propertyName;
	}
	public String getPropertyValue() {
		return PropertyValue;
	}
	public void setPropertyValue(String propertyValue) {
		PropertyValue = propertyValue;
	}
	public String getCondition() {
		return Condition;
	}
	public void setCondition(String condition) {
		Condition = condition;
	}
	public Restriction() {
		
	}
	public Restriction(String propertyName, String propertyValue, String condition) {
		super();
		PropertyName = propertyName;
		PropertyValue = propertyValue;
		Condition = condition;
	}
	@Override
	public String toString() {
		return "Restriction [PropertyName=" + PropertyName + ", PropertyValue=" + PropertyValue + ", Condition="
				+ Condition + "]";
	}


	
	

}
