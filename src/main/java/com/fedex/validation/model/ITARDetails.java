package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"internationalTraffic","ITAR_FTSR_Exempt"})
public class ITARDetails {

	private String internationalTraffic;

	private String itarFtsrExempt;

	// Getters and Setters

	public String getInternationalTraffic() {
		return internationalTraffic;
	}

	public void setInternationalTraffic(String internationalTraffic) {
		this.internationalTraffic = internationalTraffic;
	}

	public String getItarFtsrExempt() {
		return itarFtsrExempt;
	}

	public void setItarFtsrExempt(String itarFtsrExempt) {
		this.itarFtsrExempt = itarFtsrExempt;
	}

}