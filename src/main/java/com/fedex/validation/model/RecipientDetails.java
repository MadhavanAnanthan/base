package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({ "name","companyName","departmentName","addressLane1","addressLane2","city","stateOrProvince","postalCode","Country","phoneNumber","emailId","stateTaxId","federalTaxID","referenceInformation","customerReference4","thisIsResidentialAddressFlag"})
public class RecipientDetails {

	private String name;

	private String companyName;

	private String addressLane1;

	private String addressLane2;

	private String city;

	private String stateOrProvince;

	private String postalCode;

	private String country;

	private String phoneNumber;

	private String emailId;

	private String stateTaxId;

	private String federalTaxID;

	private String referenceInformation;

	private String departmentName;

	private String customerReference4;

	private String thisIsResidentialAddressFlag;
	
	private String recipientEinIrsNumber;

	// Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddressLane1() {
		return addressLane1;
	}

	public void setAddressLane1(String addressLane1) {
		this.addressLane1 = addressLane1;
	}

	public String getAddressLane2() {
		return addressLane2;
	}

	public void setAddressLane2(String addressLane2) {
		this.addressLane2 = addressLane2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateOrProvince() {
		return stateOrProvince;
	}

	public void setStateOrProvince(String stateOrProvince) {
		this.stateOrProvince = stateOrProvince;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getStateTaxId() {
		return stateTaxId;
	}

	public void setStateTaxId(String stateTaxId) {
		this.stateTaxId = stateTaxId;
	}

	public String getFederalTaxID() {
		return federalTaxID;
	}

	public void setFederalTaxID(String federalTaxID) {
		this.federalTaxID = federalTaxID;
	}

	public String getReferenceInformation() {
		return referenceInformation;
	}

	public void setReferenceInformation(String referenceInformation) {
		this.referenceInformation = referenceInformation;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getCustomerReference4() {
		return customerReference4;
	}

	public void setCustomerReference4(String customerReference4) {
		this.customerReference4 = customerReference4;
	}

	public String getThisIsResidentialAddressFlag() {
		return thisIsResidentialAddressFlag;
	}

	public void setThisIsResidentialAddressFlag(String thisIsResidentialAddressFlag) {
		this.thisIsResidentialAddressFlag = thisIsResidentialAddressFlag;
	}

	public String getRecipientEinIrsNumber() {
		return recipientEinIrsNumber;
	}

	public void setRecipientEinIrsNumber(String recipientEinIrsNumber) {
		this.recipientEinIrsNumber = recipientEinIrsNumber;
	}

}