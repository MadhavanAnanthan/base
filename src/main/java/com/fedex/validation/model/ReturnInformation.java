package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"returnShipIndicator","allowReturnShipmentToBeEdited","clearanceSpecialService","groupIndicator","clearanceSpecialService"}) 
public class ReturnInformation {

	private String returnShipIndicator;

	private String allowReturnShipmentToBeEdited;

	private String clearanceSpecialService;

	private String groupIndicator;

	private String clearanceSpecialServiceFlag;

	// Getters and setters

	public String getReturnShipIndicator() {
		return returnShipIndicator;
	}

	public void setReturnShipIndicator(String returnShipIndicator) {
		this.returnShipIndicator = returnShipIndicator;
	}

	public String getAllowReturnShipmentToBeEdited() {
		return allowReturnShipmentToBeEdited;
	}

	public void setAllowReturnShipmentToBeEdited(String allowReturnShipmentToBeEdited) {
		this.allowReturnShipmentToBeEdited = allowReturnShipmentToBeEdited;
	}

	public String getClearanceSpecialService() {
		return clearanceSpecialService;
	}

	public void setClearanceSpecialService(String clearanceSpecialService) {
		this.clearanceSpecialService = clearanceSpecialService;
	}

	public String getGroupIndicator() {
		return groupIndicator;
	}

	public void setGroupIndicator(String groupIndicator) {
		this.groupIndicator = groupIndicator;
	}

	public String getClearanceSpecialServiceFlag() {
		return clearanceSpecialServiceFlag;
	}

	public void setClearanceSpecialServiceFlag(String clearanceSpecialServiceFlag) {
		this.clearanceSpecialServiceFlag = clearanceSpecialServiceFlag;
	}

}
