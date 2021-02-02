package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"dutyPayType","dutyPayTypeAccount"}) 
public class DutyTaxDetails {

	private String dutyPayType;

	private String dutyPayTypeAccount;

	public String getDutyPayType() {
		return dutyPayType;
	}

	public void setDutyPayType(String dutyPayType) {
		this.dutyPayType = dutyPayType;
	}

	public String getDutyPayTypeAccount() {
		return dutyPayTypeAccount;
	}

	public void setDutyPayTypeAccount(String dutyPayTypeAccount) {
		this.dutyPayTypeAccount = dutyPayTypeAccount;
	}

}
