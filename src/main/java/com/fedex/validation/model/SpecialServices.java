package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"AlcoholDetails","CollectOnDeliveryDetails","FreightDetails","MiscellaneousDetails","dryiceDetails","emailNotificationDetails"})  
public class SpecialServices {
	private AlcoholDetails alcoholDetails;

	private CollectOnDeliveryDetails collectOnDeliveryDetails;

	private FreightDetails freightDetails;

	private MiscellaneousDetails miscellaneousDetails;

	private DryiceDetails dryiceDetails;

	private EmailNotificationDetails emailNotificationDetails;

	// Getters and setters

	public AlcoholDetails getAlcoholDetails() {
		return alcoholDetails;
	}

	public void setAlcoholDetails(AlcoholDetails alcoholDetails) {
		this.alcoholDetails = alcoholDetails;
	}

	public CollectOnDeliveryDetails getCollectOnDeliveryDetails() {
		return collectOnDeliveryDetails;
	}

	public void setCollectOnDeliveryDetails(CollectOnDeliveryDetails collectOnDeliveryDetails) {
		this.collectOnDeliveryDetails = collectOnDeliveryDetails;
	}

	public FreightDetails getFreightDetails() {
		return freightDetails;
	}

	public void setFreightDetails(FreightDetails freightDetails) {
		this.freightDetails = freightDetails;
	}

	public MiscellaneousDetails getMiscellaneousDetails() {
		return miscellaneousDetails;
	}

	public void setMiscellaneousDetails(MiscellaneousDetails miscellaneousDetails) {
		this.miscellaneousDetails = miscellaneousDetails;
	}

	public DryiceDetails getDryiceDetails() {
		return dryiceDetails;
	}

	public void setDryiceDetails(DryiceDetails dryiceDetails) {
		this.dryiceDetails = dryiceDetails;
	}

	public EmailNotificationDetails getEmailNotificationDetails() {
		return emailNotificationDetails;
	}

	public void setEmailNotificationDetails(EmailNotificationDetails emailNotificationDetails) {
		this.emailNotificationDetails = emailNotificationDetails;
	}

}
