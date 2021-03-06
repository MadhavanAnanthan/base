package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder
public class ParentShvsPojo {

	private RequestedShipment requestedShipment;

	public RequestedShipment getRequestedShipment() {
		return requestedShipment;
	}

	public void setRequestedShipment(RequestedShipment requestedShipment) {
		this.requestedShipment = requestedShipment;
	}
	
}
