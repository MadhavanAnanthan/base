package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"emailNotifications"}) 
public class ReturnAddressDetails {

	private String emailNotifications;

	// Getters and setters

	public String getEmailNotifications() {
		return emailNotifications;
	}

	public void setEmailNotifications(String emailNotifications) {
		this.emailNotifications = emailNotifications;
	}

}
