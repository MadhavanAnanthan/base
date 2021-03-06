package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"GeneralInformation","AddressDetails","ShippingDetails","IPDTDDetails","CommercialInvoiceDetails","BillingDetails","ReturnDetails","SpecialServices","ShipmentMiscellaneousDetails"})
public class RequestedShipment {

	private GeneralInformation generalInformation;

	private AddressDetails addressDetails;

	private ShippingDetails shippingDetails;

	private IPDTDDetails ipdtdDetails;

	private CommercialInvoiceDetails commercialInvoiceDetails;
	
	private BillingDetails billingDetails;
	
	private ReturnDetails returnDetails;
	
	private SpecialServices specialServices;
	
	private ShipmentMiscellaneousDetails shipmentMiscellaneousDetails;

	// Getters and Setters
	
	public GeneralInformation getGeneralInformation() {
		return generalInformation;
	}

	public void setGeneralInformation(GeneralInformation generalInformation) {
		this.generalInformation = generalInformation;
	}

	public AddressDetails getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(AddressDetails addressDetails) {
		this.addressDetails = addressDetails;
	}

	public ShippingDetails getShippingDetails() {
		return shippingDetails;
	}

	public void setShippingDetails(ShippingDetails shippingDetails) {
		this.shippingDetails = shippingDetails;
	}

	public IPDTDDetails getIpdtdDetails() {
		return ipdtdDetails;
	}

	public void setIpdtdDetails(IPDTDDetails ipdtdDetails) {
		this.ipdtdDetails = ipdtdDetails;
	}

	public CommercialInvoiceDetails getCommercialInvoiceDetails() {
		return commercialInvoiceDetails;
	}

	public void setCommercialInvoiceDetails(CommercialInvoiceDetails commercialInvoiceDetails) {
		this.commercialInvoiceDetails = commercialInvoiceDetails;
	}

	public BillingDetails getBillingDetails() {
		return billingDetails;
	}

	public void setBillingDetails(BillingDetails billingDetails) {
		this.billingDetails = billingDetails;
	}

	public ReturnDetails getReturnDetails() {
		return returnDetails;
	}

	public void setReturnDetails(ReturnDetails returnDetails) {
		this.returnDetails = returnDetails;
	}

	public SpecialServices getSpecialServices() {
		return specialServices;
	}

	public void setSpecialServices(SpecialServices specialServices) {
		this.specialServices = specialServices;
	}

	public ShipmentMiscellaneousDetails getShipmentMiscellaneousDetails() {
		return shipmentMiscellaneousDetails;
	}

	public void setShipmentMiscellaneousDetails(ShipmentMiscellaneousDetails shipmentMiscellaneousDetails) {
		this.shipmentMiscellaneousDetails = shipmentMiscellaneousDetails;
	}

}