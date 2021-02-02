package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"testInputNumber","shipmentType","shipmentsQuantity","shipmentSequenceNumber","meterNumber","accountNumber","routingPath"})
public class GeneralInformation {

	private String testInputNumber;

	private String shipmentType;

	private String meterNumber;

	private String accountNumber;

	private String shipmentsQuantity;

	private String shipmentSequenceNumber;

	private String device;
	
	private String routingPath;

	// Getters and Setters

	public String getTestInputNumber() {
		return testInputNumber;
	}

	public void setTestInputNumber(String testInputNumber) {
		this.testInputNumber = testInputNumber;
	}

	public String getShipmentType() {
		return shipmentType;
	}

	public void setShipmentType(String shipmentType) {
		this.shipmentType = shipmentType;
	}

	public String getMeterNumber() {
		return meterNumber;
	}

	public void setMeterNumber(String meterNumber) {
		this.meterNumber = meterNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getShipmentsQuantity() {
		return shipmentsQuantity;
	}

	public void setShipmentsQuantity(String shipmentsQuantity) {
		this.shipmentsQuantity = shipmentsQuantity;
	}

	public String getShipmentSequenceNumber() {
		return shipmentSequenceNumber;
	}

	public void setShipmentSequenceNumber(String shipmentSequenceNumber) {
		this.shipmentSequenceNumber = shipmentSequenceNumber;
	}

	public String getRoutingPath() {
		return routingPath;
	}

	public void setRoutingPath(String routingPath) {
		this.routingPath = routingPath;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

}