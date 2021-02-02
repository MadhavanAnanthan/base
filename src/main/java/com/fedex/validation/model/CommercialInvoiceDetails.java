package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"commercialInvoice","fIceDetails","bsoDetails","itarDetails"})
public class CommercialInvoiceDetails {
	private CommercialInvoice commercialInvoice;
	private FIceDetails fIceDetails;
	private BsoDetails bsoDetails;
	private ITARDetails itarDetails;

	// Getters and Setters

	public CommercialInvoice getCommercialInvoice() {
		return commercialInvoice;
	}

	public void setCommercialInvoice(CommercialInvoice commercialInvoice) {
		this.commercialInvoice = commercialInvoice;
	}

	public FIceDetails getfIceDetails() {
		return fIceDetails;
	}

	public void setfIceDetails(FIceDetails fIceDetails) {
		this.fIceDetails = fIceDetails;
	}

	public BsoDetails getBsoDetails() {
		return bsoDetails;
	}

	public void setBsoDetails(BsoDetails bsoDetails) {
		this.bsoDetails = bsoDetails;
	}

	public ITARDetails getItarDetails() {
		return itarDetails;
	}

	public void setItarDetails(ITARDetails itarDetails) {
		this.itarDetails = itarDetails;
	}

}