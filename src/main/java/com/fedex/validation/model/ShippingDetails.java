package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"ShippingInformation","MultipleShipmentDetails"})
public class ShippingDetails {
	
	private ShippingInformation shippingInformation;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	//private List<MultipleShipmentDetails> multipleShipmentDetails;
	private MultipleShipmentDetails[] multipleShipmentDetails;


	// Getters and Setters

	public ShippingInformation getShippingInformation() {
		return shippingInformation;
	}

	public void setShippingInformation(ShippingInformation shippingInformation) {
		this.shippingInformation = shippingInformation;
	}

	public MultipleShipmentDetails[] getMultipleShipmentDetails() {
		return multipleShipmentDetails;
	}

	public void setMultipleShipmentDetails(MultipleShipmentDetails[] multipleShipmentDetails) {
		this.multipleShipmentDetails = multipleShipmentDetails;
	}

}