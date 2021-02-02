package com.fedex.validation.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder
@XmlRootElement
public class ShvsMultipleParentRequest {

		private RequestedShipments[] requestedShipments;

		public final RequestedShipments[] getRequestedShipments() {
			return requestedShipments;
		}

		public final void setRequestedShipments(RequestedShipments[] requestedShipments) {
			this.requestedShipments = requestedShipments;
		}

 
		
}
