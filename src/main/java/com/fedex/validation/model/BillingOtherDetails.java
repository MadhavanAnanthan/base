package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"payorAccountNumber"})    
public class BillingOtherDetails {

	private String payorAccountNumber;

	public String getPayorAccountNumber() {
		return payorAccountNumber;
	}

	public void setPayorAccountNumber(String payorAccountNumber) {
		this.payorAccountNumber = payorAccountNumber;
	}
}
