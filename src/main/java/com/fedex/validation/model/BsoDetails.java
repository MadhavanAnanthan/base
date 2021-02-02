package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"name","addressLine1","addressLine2","city","postalCode","brokerSelectionOption","brokerNumber","companyName","state","country","phoneNumber"})  
public class BsoDetails {

	private String name;

	private String addressLine1;

	private String addressLine2;

	private String city;

	private String postalCode;

	private String brokerSelectionOption;

	private String brokerNumber;

	private String companyName;

	private String state;

	private String country;

	private String phoneNumber;

	// Getters and Setters

	public String getBrokerInclusiveFlag() {
		return brokerSelectionOption;
	}

	public void setBrokerInclusiveFlag(String brokerInclusiveFlag) {
		this.brokerSelectionOption = brokerInclusiveFlag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getBrokerSelectionOption() {
		return brokerSelectionOption;
	}

	public void setBrokerSelectionOption(String brokerSelectionOption) {
		this.brokerSelectionOption = brokerSelectionOption;
	}

	public String getBrokerNumber() {
		return brokerNumber;
	}

	public void setBrokerNumber(String brokerNumber) {
		this.brokerNumber = brokerNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}