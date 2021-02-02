package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"returnInformation","ReturnAddressDetails"})    
public class ReturnDetails {

	private ReturnInformation returnInformation;

	private ReturnAddressDetails returnAddressDetails;

	public ReturnInformation getReturnInformation() {
		return returnInformation;
	}

	public void setReturnInformation(ReturnInformation returnInformation) {
		this.returnInformation = returnInformation;
	}

	public ReturnAddressDetails getReturnAddressDetails() {
		return returnAddressDetails;
	}

	public void setReturnAddressDetails(ReturnAddressDetails returnAddressDetails) {
		this.returnAddressDetails = returnAddressDetails;
	}

}
