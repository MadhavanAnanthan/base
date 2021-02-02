package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
public class ShipmentRequestData {

	private ShipmentData requestedShipment;

	public ShipmentData getRequestedShipment() {
		return requestedShipment;
	}

	public void setRequestedShipment(ShipmentData requestedShipment) {
		this.requestedShipment = requestedShipment;
	}

}
