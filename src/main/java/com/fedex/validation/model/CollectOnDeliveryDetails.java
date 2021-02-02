package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"collectOnDeliveryFlag","collectOnDeliveryAmount","collectOnDeliveryAirbill","charge","collectionType","declaredValueFlag",    
    "referenceIndicator","screenFlag"}) 
public class CollectOnDeliveryDetails {

	private String collectOnDeliveryFlag;

	private String collectOnDeliveryAmount;

	private String collectOnDeliveryAirbill;

	private String charge;

	private String collectionType;

	private String declaredValueFlag;

	private String referenceIndicator;

	private String screenFlag;
	
	private String addCODFreightCharges;
	// Getters and setters

	public String getCollectOnDeliveryFlag() {
		return collectOnDeliveryFlag;
	}

	public void setCollectOnDeliveryFlag(String collectOnDeliveryFlag) {
		this.collectOnDeliveryFlag = collectOnDeliveryFlag;
	}

	public String getCollectOnDeliveryAmount() {
		return collectOnDeliveryAmount;
	}

	public void setCollectOnDeliveryAmount(String collectOnDeliveryAmount) {
		this.collectOnDeliveryAmount = collectOnDeliveryAmount;
	}

	public String getCollectOnDeliveryAirbill() {
		return collectOnDeliveryAirbill;
	}

	public void setCollectOnDeliveryAirbill(String collectOnDeliveryAirbill) {
		this.collectOnDeliveryAirbill = collectOnDeliveryAirbill;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public String getCollectionType() {
		return collectionType;
	}

	public void setCollectionType(String collectionType) {
		this.collectionType = collectionType;
	}

	public String getDeclaredValueFlag() {
		return declaredValueFlag;
	}

	public void setDeclaredValueFlag(String declaredValueFlag) {
		this.declaredValueFlag = declaredValueFlag;
	}

	public String getReferenceIndicator() {
		return referenceIndicator;
	}

	public void setReferenceIndicator(String referenceIndicator) {
		this.referenceIndicator = referenceIndicator;
	}

	public String getScreenFlag() {
		return screenFlag;
	}

	public void setScreenFlag(String screenFlag) {
		this.screenFlag = screenFlag;
	}

	public String getAddCODFreightCharges() {
		return addCODFreightCharges;
	}

	public void setAddCODFreightCharges(String addCODFreightCharges) {
		this.addCODFreightCharges = addCODFreightCharges;
	}

}
