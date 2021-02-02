package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"senderEmail","Ship","tendered","exception","delivery","otherNotificationEmail1","otherNotificationEmail2","emailExpirationDays"}) 
public class EmailNotificationDetails {

	private String senderEmail;

	private String ship;

	private String tendered;

	private String exception;

	private String delivery;

	private String otherNotificationEmail1;

	private String otherNotificationEmail2;

	private String emailExpirationDays;

	// Getters and setters

	public String getSenderEmail() {
		return senderEmail;
	}

	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}

	public String getShip() {
		return ship;
	}

	public void setShip(String ship) {
		this.ship = ship;
	}

	public String getTendered() {
		return tendered;
	}

	public void setTendered(String tendered) {
		this.tendered = tendered;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public String getOtherNotificationEmail1() {
		return otherNotificationEmail1;
	}

	public void setOtherNotificationEmail1(String otherNotificationEmail1) {
		this.otherNotificationEmail1 = otherNotificationEmail1;
	}

	public String getOtherNotificationEmail2() {
		return otherNotificationEmail2;
	}

	public void setOtherNotificationEmail2(String otherNotificationEmail2) {
		this.otherNotificationEmail2 = otherNotificationEmail2;
	}

	public String getEmailExpirationDays() {
		return emailExpirationDays;
	}

	public void setEmailExpirationDays(String emailExpirationDays) {
		this.emailExpirationDays = emailExpirationDays;
	}

}
