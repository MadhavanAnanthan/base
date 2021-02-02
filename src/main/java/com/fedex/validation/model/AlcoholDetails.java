package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"alcoholFlag","pacakgingType","numberOfPackages","alcoholType","quantity","dangerousGoodType","signatureRequired"})
public class AlcoholDetails {

	private String alcoholFlag;

	private String packagingType;

	private String numberOfPackages;

	private String alcoholType;

	private String quantity;

	private String dangerousGoodType;

	private String signatureRequired;
	
	private String recipientType;

	private String shipmentLabelType;

	// Getters and setters

		public String getAlcoholFlag() {
			return alcoholFlag;
		}

		public void setAlcoholFlag(String alcoholFlag) {
			this.alcoholFlag = alcoholFlag;
		}

		public String getPackagingType() {
			return packagingType;
		}

		public void setPackagingType(String packagingType) {
			this.packagingType = packagingType;
		}

		public String getNumberOfPackages() {
			return numberOfPackages;
		}

		public void setNumberOfPackages(String numberOfPackages) {
			this.numberOfPackages = numberOfPackages;
		}

		public String getAlcoholType() {
			return alcoholType;
		}

		public void setAlcoholType(String alcoholType) {
			this.alcoholType = alcoholType;
		}

		public String getQuantity() {
			return quantity;
		}

		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}

		public String getDangerousGoodType() {
			return dangerousGoodType;
		}

		public void setDangerousGoodType(String dangerousGoodType) {
			this.dangerousGoodType = dangerousGoodType;
		}

		public String getSignatureRequired() {
			return signatureRequired;
		}

		public void setSignatureRequired(String signatureRequired) {
			this.signatureRequired = signatureRequired;
		}

		public String getRecipientType() {
			return recipientType;
		}

		public void setRecipientType(String recipientType) {
			this.recipientType = recipientType;
		}

		public String getShipmentLabelType() {
			return shipmentLabelType;
		}

		public void setShipmentLabelType(String shipmentLabelType) {
			this.shipmentLabelType = shipmentLabelType;
		}
	
}
