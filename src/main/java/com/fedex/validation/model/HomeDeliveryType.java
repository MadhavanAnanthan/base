package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
public class HomeDeliveryType {

	private String homeDeliveryType;

	private String homeDeliveryPhoneNumber;

	public String getHomeDeliveryType() {
		return homeDeliveryType;
	}

	public void setHomeDeliveryType(String homeDeliveryType) {
		this.homeDeliveryType = homeDeliveryType;
	}

	public String getHomeDeliveryPhoneNumber() {
		return homeDeliveryPhoneNumber;
	}

	public void setHomeDeliveryPhoneNumber(String homeDeliveryPhoneNumber) {
		this.homeDeliveryPhoneNumber = homeDeliveryPhoneNumber;
	}


}
