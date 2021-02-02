package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"commercialInvoiceFlag","commodity","DDCommodityCode","commodityWeight","commodityCustomsValue","Units1","unitValueAmount", 
    "automatedExportSystemFilingStatus","commodityExportLicenseNumber","commercialInvoiceNumber","UoM","countryOfManufacture","customDetailReportFlag",    
    "externalTransactionNumber"})
public class CommercialInvoice {

	private String commercialInvoiceFlag;

	private String commodity;

	private String ddCommodityCode;

	private String commodityExportLicenseExpiryDate;

	private String commodityWeight;

	private String commodityCustomsValue;

	private String units1;

	private String unitValueAmount;

	private String automatedExportSystemFilingStatus;

	private String commodityExportLicenseNumber;

	private String commercialInvoiceNumber;

	private String uom;

	private String countryOfManufacture;

	private String customDetailReportFlag;

	private String externalTransactionNumber;
	
	

	// Getters and Setters

	public String getCommercialInvoiceFlag() {
		return commercialInvoiceFlag;
	}

	public void setCommercialInvoiceFlag(String commercialInvoiceFlag) {
		this.commercialInvoiceFlag = commercialInvoiceFlag;
	}

	public String getCommodity() {
		return commodity;
	}

	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}

	public String getDdCommodityCode() {
		return ddCommodityCode;
	}

	public void setDdCommodityCode(String ddCommodityCode) {
		this.ddCommodityCode = ddCommodityCode;
	}

	public String getCommodityExportLicenseExpiryDate() {
		return commodityExportLicenseExpiryDate;
	}

	public void setCommodityExportLicenseExpiryDate(String commodityExportLicenseExpiryDate) {
		this.commodityExportLicenseExpiryDate = commodityExportLicenseExpiryDate;
	}

	public String getCommodityWeight() {
		return commodityWeight;
	}

	public void setCommodityWeight(String commodityWeight) {
		this.commodityWeight = commodityWeight;
	}

	public String getCommodityCustomsValue() {
		return commodityCustomsValue;
	}

	public void setCommodityCustomsValue(String commodityCustomsValue) {
		this.commodityCustomsValue = commodityCustomsValue;
	}

	public String getUnits1() {
		return units1;
	}

	public void setUnits1(String units1) {
		this.units1 = units1;
	}

	public String getUnitValueAmount() {
		return unitValueAmount;
	}

	public void setUnitValueAmount(String unitValueAmount) {
		this.unitValueAmount = unitValueAmount;
	}

	public String getAutomatedExportSystemFilingStatus() {
		return automatedExportSystemFilingStatus;
	}

	public void setAutomatedExportSystemFilingStatus(String automatedExportSystemFilingStatus) {
		this.automatedExportSystemFilingStatus = automatedExportSystemFilingStatus;
	}

	public String getCommodityExportLicenseNumber() {
		return commodityExportLicenseNumber;
	}

	public void setCommodityExportLicenseNumber(String commodityExportLicenseNumber) {
		this.commodityExportLicenseNumber = commodityExportLicenseNumber;
	}

	public String getCommercialInvoiceNumber() {
		return commercialInvoiceNumber;
	}

	public void setCommercialInvoiceNumber(String commercialInvoiceNumber) {
		this.commercialInvoiceNumber = commercialInvoiceNumber;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getCountryOfManufacture() {
		return countryOfManufacture;
	}

	public void setCountryOfManufacture(String countryOfManufacture) {
		this.countryOfManufacture = countryOfManufacture;
	}

	public String getCustomDetailReportFlag() {
		return customDetailReportFlag;
	}

	public void setCustomDetailReportFlag(String customDetailReportFlag) {
		this.customDetailReportFlag = customDetailReportFlag;
	}

	public String getExternalTransactionNumber() {
		return externalTransactionNumber;
	}

	public void setExternalTransactionNumber(String externalTransactionNumber) {
		this.externalTransactionNumber = externalTransactionNumber;
	}

}