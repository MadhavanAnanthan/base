package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"dryIce","dryIceUoM","dryIceWeight"}) 
public class DryiceDetails {

	private String dryIce;

	private String dryIceUoM;

	private String dryIceWeight;

	// Getters and setters

	public String getDryIce() {
		return dryIce;
	}

	public void setDryIce(String dryIce) {
		this.dryIce = dryIce;
	}

	public String getDryIceUoM() {
		return dryIceUoM;
	}

	public void setDryIceUoM(String dryIceUoM) {
		this.dryIceUoM = dryIceUoM;
	}

	public String getDryIceWeight() {
		return dryIceWeight;
	}

	public void setDryIceWeight(String dryIceWeight) {
		this.dryIceWeight = dryIceWeight;
	}

}
