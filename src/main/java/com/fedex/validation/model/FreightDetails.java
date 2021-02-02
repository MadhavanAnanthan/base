package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"freightToCollectOption","freightOnValue","freightChargeAmount"})    
public class FreightDetails {

	private String freightToCollectOption;

	private String freightOnValue;

	private String freightChargeAmount;

	// Getters and setters

	public String getFreightToCollectOption() {
		return freightToCollectOption;
	}

	public void setFreightToCollectOption(String freightToCollectOption) {
		this.freightToCollectOption = freightToCollectOption;
	}

	public String getFreightOnValue() {
		return freightOnValue;
	}

	public void setFreightOnValue(String freightOnValue) {
		this.freightOnValue = freightOnValue;
	}

	public String getFreightChargeAmount() {
		return freightChargeAmount;
	}

	public void setFreightChargeAmount(String freightChargeAmount) {
		this.freightChargeAmount = freightChargeAmount;
	}

}
