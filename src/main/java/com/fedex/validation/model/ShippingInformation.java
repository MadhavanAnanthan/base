package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"shipPieceQuantity","shipWeight","shipWeightUOM","serviceCode","packagingType","dimensions","dimentionLength","dimentionWidth","dimentionHeight",        
    "declaredValue","currencyType","carriageValue","pieceCountVerificationFlag","pieceCountVerificationBoxCount","appointmentDeliveryPayor",    
    "appointmentDeliveryAccount","packageAssociationAndPrintModeCode","pickUpDropOff","paymentTypeCode","totalCustomsValue","shipDay","RMA"    })
public class ShippingInformation {

	private String shipPieceQuantity;

	private String shipWeight;

	private String shipWeightUOM;

	private String serviceCode;

	private String packagingType;

	private String dimensionLength;

	private String dimensionWidth;

	private String dimensionHeight;

	private String dimensions;

	private String declaredValue;

	private String currencyType;

	private String carriageValue;

	private String pieceCountVerificationFlag;

	private String pieceCountVerificationBoxCount;

	private String appointmentDeliveryPayor;

	private String appointmentDeliveryAccount;

	private String packageAssociationAndPrintModeCode;

	private String pickUpDropOff;

	private String paymentTypeCode;

	private String totalCustomsValue;

	private String shipDay;

	private String rma;

	private String packageWeight;
	
	private String referenceInformation1;
	
	private String referenceInformation2;
	
	private String referenceInformation3;
	
	private String signType;
	
	// Getters and Setters

	public String getShipPieceQuantity() {
		return shipPieceQuantity;
	}

	public void setShipPieceQuantity(String shipPieceQuantity) {
		this.shipPieceQuantity = shipPieceQuantity;
	}

	public String getShipWeight() {
		return shipWeight;
	}

	public void setShipWeight(String shipWeight) {
		this.shipWeight = shipWeight;
	}

	public String getShipWeightUOM() {
		return shipWeightUOM;
	}

	public void setShipWeightUOM(String shipWeightUOM) {
		this.shipWeightUOM = shipWeightUOM;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getPackagingType() {
		return packagingType;
	}

	public void setPackagingType(String packagingType) {
		this.packagingType = packagingType;
	}

	public String getDimensionLength() {
		return dimensionLength;
	}

	public void setDimensionLength(String dimensionLength) {
		this.dimensionLength = dimensionLength;
	}

	public String getDimensionWidth() {
		return dimensionWidth;
	}

	public void setDimensionWidth(String dimensionWidth) {
		this.dimensionWidth = dimensionWidth;
	}

	public String getDimensionHeight() {
		return dimensionHeight;
	}

	public void setDimensionHeight(String dimensionHeight) {
		this.dimensionHeight = dimensionHeight;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public String getDeclaredValue() {
		return declaredValue;
	}

	public void setDeclaredValue(String declaredValue) {
		this.declaredValue = declaredValue;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public String getCarriageValue() {
		return carriageValue;
	}

	public void setCarriageValue(String carriageValue) {
		this.carriageValue = carriageValue;
	}

	public String getPieceCountVerificationFlag() {
		return pieceCountVerificationFlag;
	}

	public void setPieceCountVerificationFlag(String pieceCountVerificationFlag) {
		this.pieceCountVerificationFlag = pieceCountVerificationFlag;
	}

	public String getPieceCountVerificationBoxCount() {
		return pieceCountVerificationBoxCount;
	}

	public void setPieceCountVerificationBoxCount(String pieceCountVerificationBoxCount) {
		this.pieceCountVerificationBoxCount = pieceCountVerificationBoxCount;
	}

	public String getAppointmentDeliveryPayor() {
		return appointmentDeliveryPayor;
	}

	public void setAppointmentDeliveryPayor(String appointmentDeliveryPayor) {
		this.appointmentDeliveryPayor = appointmentDeliveryPayor;
	}

	public String getAppointmentDeliveryAccount() {
		return appointmentDeliveryAccount;
	}

	public void setAppointmentDeliveryAccount(String appointmentDeliveryAccount) {
		this.appointmentDeliveryAccount = appointmentDeliveryAccount;
	}

	public String getPackageAssociationAndPrintModeCode() {
		return packageAssociationAndPrintModeCode;
	}

	public void setPackageAssociationAndPrintModeCode(String packageAssociationAndPrintModeCode) {
		this.packageAssociationAndPrintModeCode = packageAssociationAndPrintModeCode;
	}

	public String getPickUpDropOff() {
		return pickUpDropOff;
	}

	public void setPickUpDropOff(String pickUpDropOff) {
		this.pickUpDropOff = pickUpDropOff;
	}

	public String getPaymentTypeCode() {
		return paymentTypeCode;
	}

	public void setPaymentTypeCode(String paymentTypeCode) {
		this.paymentTypeCode = paymentTypeCode;
	}

	public String getTotalCustomsValue() {
		return totalCustomsValue;
	}

	public void setTotalCustomsValue(String totalCustomsValue) {
		this.totalCustomsValue = totalCustomsValue;
	}

	public String getShipDay() {
		return shipDay;
	}

	public void setShipDay(String shipDay) {
		this.shipDay = shipDay;
	}

	public String getRma() {
		return rma;
	}

	public void setRma(String rma) {
		this.rma = rma;
	}

	public String getPackageWeight() {
		return packageWeight;
	}

	public void setPackageWeight(String packageWeight) {
		this.packageWeight = packageWeight;
	}

	public String getReferenceInformation1() {
		return referenceInformation1;
	}

	public void setReferenceInformation1(String referenceInformation1) {
		this.referenceInformation1 = referenceInformation1;
	}

	public String getReferenceInformation2() {
		return referenceInformation2;
	}

	public void setReferenceInformation2(String referenceInformation2) {
		this.referenceInformation2 = referenceInformation2;
	}

	public String getReferenceInformation3() {
		return referenceInformation3;
	}

	public void setReferenceInformation3(String referenceInformation3) {
		this.referenceInformation3 = referenceInformation3;
	}

	public String getSignType() {
		return signType;
	}

	public void setSignType(String signType) {
		this.signType = signType;
	}

}