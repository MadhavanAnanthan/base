package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"packageSequenceNumber","DIM","dimensions","dimentionLength","dimentionWidth","dimentionHeight","declaredValue","signType",        
    "referenceInformation1","referenceInformation2","referenceInformation3","dangerousGoodFlag","dryIce","dryIceWeight","dryIceUoM",        
    "alcoholFlag","collectOnDeliveryAmount","PAA_Indicator","twentyDollarSavingCertificate","carriageValue","rscBundleID","harmonizedCode",            
    "packageWeight","totalCustomsValue","totalDeclaredOrCarriageValue"})
public class MultipleShipmentDetails {

	private String packageSequenceNumber;

	private String dimensionLength;

	private String dimensionWidth;

	private String dimensionHeight;

	private String dimensions;

	private String declaredValue;

	private String dim;

	private String signType;

	private String referenceInformation1;

	private String referenceInformation2;

	private String referenceInformation3;

	private String dryIceFlg;

	private String dryIceUoM;

	private String dryIceWeight;

	private String dangerousGoodsFlag;

	private String alcoholFlag;

	private String rscBundleID;

	private String harmonizedCode;

	private String carriageValue;

	private String paaIndicator;
	@JsonProperty("20DollarSavingCertificate")
	private String twentyDollarSavingCertificate;
	
	private String totalCustomsValue;

	private String totalDeclaredOrCarriageValue;

	private String collectOnDeliveryAmount;

	private String packageWeight;

	private String recipientType;

	private String shipmentLabelType;
	
	private String shipWeight;
	
	private String shipWeightUOM;

	private String otherRegulatedMaterials;

	private String hazardeousMaterial;
	
	private String addCODFreightCharges;

	public String getPackageSequenceNumber() {
		return packageSequenceNumber;
	}

	public void setPackageSequenceNumber(String packageSequenceNumber) {
		this.packageSequenceNumber = packageSequenceNumber;
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

	public String getDim() {
		return dim;
	}

	public void setDim(String dim) {
		this.dim = dim;
	}

	public String getSignType() {
		return signType;
	}

	public void setSignType(String signType) {
		this.signType = signType;
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

	public String getDryIceFlg() {
		return dryIceFlg;
	}

	public void setDryIceFlg(String dryIceFlg) {
		this.dryIceFlg = dryIceFlg;
	}

	public String getDryIceUoM() {
		return dryIceUoM;
	}

	public void setDryIceUoM(String dryIceUoM) {
		this.dryIceUoM = dryIceUoM;
	}

	public String getDryIceWeight() {
		return dryIceWeight;
	}

	public void setDryIceWeight(String dryIceWeight) {
		this.dryIceWeight = dryIceWeight;
	}

	public String getDangerousGoodsFlag() {
		return dangerousGoodsFlag;
	}

	public void setDangerousGoodsFlag(String dangerousGoodsFlag) {
		this.dangerousGoodsFlag = dangerousGoodsFlag;
	}

	public String getAlcoholFlag() {
		return alcoholFlag;
	}

	public void setAlcoholFlag(String alcoholFlag) {
		this.alcoholFlag = alcoholFlag;
	}

	public String getRscBundleID() {
		return rscBundleID;
	}

	public void setRscBundleID(String rscBundleID) {
		this.rscBundleID = rscBundleID;
	}

	public String getHarmonizedCode() {
		return harmonizedCode;
	}

	public void setHarmonizedCode(String harmonizedCode) {
		this.harmonizedCode = harmonizedCode;
	}

	public String getCarriageValue() {
		return carriageValue;
	}

	public void setCarriageValue(String carriageValue) {
		this.carriageValue = carriageValue;
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

	public String getTotalCustomsValue() {
		return totalCustomsValue;
	}

	public void setTotalCustomsValue(String totalCustomsValue) {
		this.totalCustomsValue = totalCustomsValue;
	}

	public String getTotalDeclaredOrCarriageValue() {
		return totalDeclaredOrCarriageValue;
	}

	public void setTotalDeclaredOrCarriageValue(String totalDeclaredOrCarriageValue) {
		this.totalDeclaredOrCarriageValue = totalDeclaredOrCarriageValue;
	}

	public String getCollectOnDeliveryAmount() {
		return collectOnDeliveryAmount;
	}

	public void setCollectOnDeliveryAmount(String collectOnDeliveryAmount) {
		this.collectOnDeliveryAmount = collectOnDeliveryAmount;
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

	public String getAddCODFreightCharges() {
		return addCODFreightCharges;
	}

	public void setAddCODFreightCharges(String addCODFreightCharges) {
		this.addCODFreightCharges = addCODFreightCharges;
	}	

	public String getPackageWeight() {
		return packageWeight;
	}

	public void setPackageWeight(String packageWeight) {
		this.packageWeight = packageWeight;
	}

}