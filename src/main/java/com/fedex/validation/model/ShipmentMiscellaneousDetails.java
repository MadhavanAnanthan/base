package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"originLocationID","destinationLocationCode","VISA_SHELL","shippingPurpose","recipientDeliveryNotificationFlag",    
    "recipientExceptionNotificationFlag","recipientShipmentNotificationFlag","paaIndicator","20DollarSavingCertificate",
    "lithiumBatterySpecialService"})
public class ShipmentMiscellaneousDetails {

	private String originLocationID;

	private String destinationLocationCode;

	private String visaShell;

	private String shippingPurpose;

	private String recipientDeliveryNotificationFlag;

	private String recipientExceptionNotificationFlag;

	private String recipientShipmentNotificationFlag;

	private String paaIndicator;

	private String twentyDollarSavingCertificate;

	private String lithiumBatterySpecialService;

	// Getters and setters

	public String getOriginLocationID() {
		return originLocationID;
	}

	public void setOriginLocationID(String originLocationID) {
		this.originLocationID = originLocationID;
	}

	public String getDestinationLocationCode() {
		return destinationLocationCode;
	}

	public void setDestinationLocationCode(String destinationLocationCode) {
		this.destinationLocationCode = destinationLocationCode;
	}

	public String getVisaShell() {
		return visaShell;
	}

	public void setVisaShell(String visaShell) {
		this.visaShell = visaShell;
	}

	public String getShippingPurpose() {
		return shippingPurpose;
	}

	public void setShippingPurpose(String shippingPurpose) {
		this.shippingPurpose = shippingPurpose;
	}

	public String getRecipientDeliveryNotificationFlag() {
		return recipientDeliveryNotificationFlag;
	}

	public void setRecipientDeliveryNotificationFlag(String recipientDeliveryNotificationFlag) {
		this.recipientDeliveryNotificationFlag = recipientDeliveryNotificationFlag;
	}

	public String getRecipientExceptionNotificationFlag() {
		return recipientExceptionNotificationFlag;
	}

	public void setRecipientExceptionNotificationFlag(String recipientExceptionNotificationFlag) {
		this.recipientExceptionNotificationFlag = recipientExceptionNotificationFlag;
	}

	public String getRecipientShipmentNotificationFlag() {
		return recipientShipmentNotificationFlag;
	}

	public void setRecipientShipmentNotificationFlag(String recipientShipmentNotificationFlag) {
		this.recipientShipmentNotificationFlag = recipientShipmentNotificationFlag;
	}

	public String getPaaIndicator() {
		return paaIndicator;
	}

	public void setPaaIndicator(String paaIndicator) {
		this.paaIndicator = paaIndicator;
	}

	public String getTwentyDollarSavingCertificate() {
		return twentyDollarSavingCertificate;
	}

	public void setTwentyDollarSavingCertificate(String twentyDollarSavingCertificate) {
		this.twentyDollarSavingCertificate = twentyDollarSavingCertificate;
	}

	public String getLithiumBatterySpecialService() {
		return lithiumBatterySpecialService;
	}

	public void setLithiumBatterySpecialService(String lithiumBatterySpecialService) {
		this.lithiumBatterySpecialService = lithiumBatterySpecialService;
	}

}
