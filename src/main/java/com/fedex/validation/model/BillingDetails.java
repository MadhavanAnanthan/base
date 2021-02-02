package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"DutyTaxDetails","BillingOtherDetails"}) 
public class BillingDetails {
	private DutyTaxDetails dutyTaxDetails;
	private BillingOtherDetails billingOtherDetails;

	public DutyTaxDetails getDutyTaxDetails() {
		return dutyTaxDetails;
	}

	public void setDutyTaxDetails(DutyTaxDetails dutyTaxDetails) {
		this.dutyTaxDetails = dutyTaxDetails;
	}

	public BillingOtherDetails getBillingOtherDetails() {
		return billingOtherDetails;
	}

	public void setBillingOtherDetails(BillingOtherDetails billingOtherDetails) {
		this.billingOtherDetails = billingOtherDetails;
	}

}
