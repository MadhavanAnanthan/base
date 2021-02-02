package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"transborderDistributionPayor","transborderDistributionAccount","transborderDistributionLinehaulFlag","IPDAppointmentDelivery", 
    "IPD_OR_IPF_Clearance_Location","transborderDistributionIndicator","commodityFlowSurveyPostalCode","admissabilityPackageType",    
    "groupIndicator","commdityPurposeType"})
public class IPDTDDetails {

	private String transborderDistributionPayor;

	private String transborderDistributionAccount;

	private String transborderDistributionLinehaulFlag;

	private String ipdAppointmentDelivery;

	private String ipdOrIpfClearanceLocation;

	private String transborderDistributionIndicator;

	private String commodityFlowSurveyPostalCode;

	private String admissabilityPackageType;

	private String groupIndicator;

	private String commdityPurposeType;

	// Getters and Setters

	public String getTransborderDistributionPayor() {
		return transborderDistributionPayor;
	}

	public void setTransborderDistributionPayor(String transborderDistributionPayor) {
		this.transborderDistributionPayor = transborderDistributionPayor;
	}

	public String getTransborderDistributionAccount() {
		return transborderDistributionAccount;
	}

	public void setTransborderDistributionAccount(String transborderDistributionAccount) {
		this.transborderDistributionAccount = transborderDistributionAccount;
	}

	public String getTransborderDistributionLinehaulFlag() {
		return transborderDistributionLinehaulFlag;
	}

	public void setTransborderDistributionLinehaulFlag(String transborderDistributionLinehaulFlag) {
		this.transborderDistributionLinehaulFlag = transborderDistributionLinehaulFlag;
	}

	public String getIpdAppointmentDelivery() {
		return ipdAppointmentDelivery;
	}

	public void setIpdAppointmentDelivery(String ipdAppointmentDelivery) {
		this.ipdAppointmentDelivery = ipdAppointmentDelivery;
	}

	public String getIpdOrIpfClearanceLocation() {
		return ipdOrIpfClearanceLocation;
	}

	public void setIpdOrIpfClearanceLocation(String ipdOrIpfClearanceLocation) {
		this.ipdOrIpfClearanceLocation = ipdOrIpfClearanceLocation;
	}

	public String getTransborderDistributionIndicator() {
		return transborderDistributionIndicator;
	}

	public void setTransborderDistributionIndicator(String transborderDistributionIndicator) {
		this.transborderDistributionIndicator = transborderDistributionIndicator;
	}

	public String getCommodityFlowSurveyPostalCode() {
		return commodityFlowSurveyPostalCode;
	}

	public void setCommodityFlowSurveyPostalCode(String commodityFlowSurveyPostalCode) {
		this.commodityFlowSurveyPostalCode = commodityFlowSurveyPostalCode;
	}

	public String getAdmissabilityPackageType() {
		return admissabilityPackageType;
	}

	public void setAdmissabilityPackageType(String admissabilityPackageType) {
		this.admissabilityPackageType = admissabilityPackageType;
	}

	public String getGroupIndicator() {
		return groupIndicator;
	}

	public void setGroupIndicator(String groupIndicator) {
		this.groupIndicator = groupIndicator;
	}

	public String getCommdityPurposeType() {
		return commdityPurposeType;
	}

	public void setCommdityPurposeType(String commdityPurposeType) {
		this.commdityPurposeType = commdityPurposeType;
	}

}