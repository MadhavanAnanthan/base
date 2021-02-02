package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"saturdayDelivery","saturdayPickup","sundayDelivery","holidayDelivery","insidePickup","insideDelivery","priorityAlert",    
    "priorityAlertPlus","pharmacyDeliveryIndicator","specialDeliveryFlag","Dropoff","FutureDate","documentShipment",    
    "thirdPartyConsignee","nonStandardPackaging","posType","podScanFlag","shipPriority","groundAccount"}) 
public class MiscellaneousDetails {

	private String saturdayDelivery;

	private String saturdayPickup;

	private String sundayDelivery;

	private String holidayDelivery;

	private String insidePickup;

	private String insideDelivery;

	private String priorityAlert;

	private String priorityAlertPlus;

	private String pharmacyDeliveryIndicator;

	private String specialDeliveryFlag;

	private String dropoff;

	private String futureDate;

	private String documentShipment;

	private String shipPriority;

	private String groundAccount;

	private String posType;

	private String thirdPartyConsignee;

	private String podScanFlag;

	private String nonStandardPackaging;
	
	private String otherRegulatedMaterials;

	private String hazardeousMaterial;

	// Getters and setters

	public String getSaturdayDelivery() {
		return saturdayDelivery;
	}

	public void setSaturdayDelivery(String saturdayDelivery) {
		this.saturdayDelivery = saturdayDelivery;
	}

	public String getSaturdayPickup() {
		return saturdayPickup;
	}

	public void setSaturdayPickup(String saturdayPickup) {
		this.saturdayPickup = saturdayPickup;
	}

	public String getSundayDelivery() {
		return sundayDelivery;
	}

	public void setSundayDelivery(String sundayDelivery) {
		this.sundayDelivery = sundayDelivery;
	}

	public String getHolidayDelivery() {
		return holidayDelivery;
	}

	public void setHolidayDelivery(String holidayDelivery) {
		this.holidayDelivery = holidayDelivery;
	}

	public String getInsidePickup() {
		return insidePickup;
	}

	public void setInsidePickup(String insidePickup) {
		this.insidePickup = insidePickup;
	}

	public String getInsideDelivery() {
		return insideDelivery;
	}

	public void setInsideDelivery(String insideDelivery) {
		this.insideDelivery = insideDelivery;
	}

	public String getPriorityAlert() {
		return priorityAlert;
	}

	public void setPriorityAlert(String priorityAlert) {
		this.priorityAlert = priorityAlert;
	}

	public String getPriorityAlertPlus() {
		return priorityAlertPlus;
	}

	public void setPriorityAlertPlus(String priorityAlertPlus) {
		this.priorityAlertPlus = priorityAlertPlus;
	}

	public String getPharmacyDeliveryIndicator() {
		return pharmacyDeliveryIndicator;
	}

	public void setPharmacyDeliveryIndicator(String pharmacyDeliveryIndicator) {
		this.pharmacyDeliveryIndicator = pharmacyDeliveryIndicator;
	}

	public String getSpecialDeliveryFlag() {
		return specialDeliveryFlag;
	}

	public void setSpecialDeliveryFlag(String specialDeliveryFlag) {
		this.specialDeliveryFlag = specialDeliveryFlag;
	}

	public String getDropoff() {
		return dropoff;
	}

	public void setDropoff(String dropoff) {
		this.dropoff = dropoff;
	}

	public String getFutureDate() {
		return futureDate;
	}

	public void setFutureDate(String futureDate) {
		this.futureDate = futureDate;
	}

	public String getDocumentShipment() {
		return documentShipment;
	}

	public void setDocumentShipment(String documentShipment) {
		this.documentShipment = documentShipment;
	}

	public String getShipPriority() {
		return shipPriority;
	}

	public void setShipPriority(String shipPriority) {
		this.shipPriority = shipPriority;
	}

	public String getGroundAccount() {
		return groundAccount;
	}

	public void setGroundAccount(String groundAccount) {
		this.groundAccount = groundAccount;
	}

	public String getPosType() {
		return posType;
	}

	public void setPosType(String posType) {
		this.posType = posType;
	}

	public String getThirdPartyConsignee() {
		return thirdPartyConsignee;
	}

	public void setThirdPartyConsignee(String thirdPartyConsignee) {
		this.thirdPartyConsignee = thirdPartyConsignee;
	}

	public String getPodScanFlag() {
		return podScanFlag;
	}

	public void setPodScanFlag(String podScanFlag) {
		this.podScanFlag = podScanFlag;
	}

	public String getNonStandardPackaging() {
		return nonStandardPackaging;
	}

	public void setNonStandardPackaging(String nonStandardPackaging) {
		this.nonStandardPackaging = nonStandardPackaging;
	}

	public String getOtherRegulatedMaterials() {
		return otherRegulatedMaterials;
	}

	public void setOtherRegulatedMaterials(String otherRegulatedMaterials) {
		this.otherRegulatedMaterials = otherRegulatedMaterials;
	}

	public String getHazardeousMaterial() {
		return hazardeousMaterial;
	}

	public void setHazardeousMaterial(String hazardeousMaterial) {
		this.hazardeousMaterial = hazardeousMaterial;
	}

}
