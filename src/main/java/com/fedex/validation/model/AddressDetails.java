package com.fedex.validation.model;


import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"SenderDetails","RecipientDetails","HoldAtLocationDetails","AlternateAddressDetails"})
public class AddressDetails {

	private SenderDetails senderDetails;

	private RecipientDetails recipientDetails;

	private AlternateAddressDetails alternateAddressDetails;

	private HoldAtLocationDetails holdAtLocationDetails;

	// Getters and Setters

	public SenderDetails getSenderDetails() {
		return senderDetails;
	}

	public void setSenderDetails(SenderDetails senderDetails) {
		this.senderDetails = senderDetails;
	}

	public RecipientDetails getRecipientDetails() {
		return recipientDetails;
	}

	public void setRecipientDetails(RecipientDetails recipientDetails) {
		this.recipientDetails = recipientDetails;
	}

	public AlternateAddressDetails getAlternateAddressDetails() {
		return alternateAddressDetails;
	}

	public void setAlternateAddressDetails(AlternateAddressDetails alternateAddressDetails) {
		this.alternateAddressDetails = alternateAddressDetails;
	}

	public HoldAtLocationDetails getHoldAtLocationDetails() {
		return holdAtLocationDetails;
	}

	public void setHoldAtLocationDetails(HoldAtLocationDetails holdAtLocationDetails) {
		this.holdAtLocationDetails = holdAtLocationDetails;
	}

}