package com.fedex.validation.model;


import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
public class ShipmentMassUpdate {

	private List<ShipmentRequestData> requestedShipments;

	public List<ShipmentRequestData> getRequestedShipments() {
		return requestedShipments;
	}

	public void setRequestedShipments(List<ShipmentRequestData> requestedShipments) {
		this.requestedShipments = requestedShipments;
	}

}
