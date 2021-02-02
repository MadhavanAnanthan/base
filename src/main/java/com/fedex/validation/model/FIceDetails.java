package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
@JsonPropertyOrder({"FICE","FICE Type","Expiration Date","B13AFileOption","FTSRExemptionNumber","FICECodeNumber","foreignTradeZoneCode","B13AFileDetail"})
public class FIceDetails {

	private String fIceFlg;

	private String fIceType;

	private String expirationDate;

	private String b13AFileOption;

	private String ftsrExemptionNumber;

	private String fIceCodeNumber;

	private String foreignTradeZoneCode;

	private String b13AFileDetail;

	// Getters and Setters

	public String getfIceFlg() {
		return fIceFlg;
	}

	public void setfIceFlg(String fIceFlg) {
		this.fIceFlg = fIceFlg;
	}

	public String getfIceType() {
		return fIceType;
	}

	public void setfIceType(String fIceType) {
		this.fIceType = fIceType;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getB13AFileOption() {
		return b13AFileOption;
	}

	public void setB13AFileOption(String b13aFileOption) {
		b13AFileOption = b13aFileOption;
	}

	public String getFtsrExemptionNumber() {
		return ftsrExemptionNumber;
	}

	public void setFtsrExemptionNumber(String ftsrExemptionNumber) {
		this.ftsrExemptionNumber = ftsrExemptionNumber;
	}

	public String getfIceCodeNumber() {
		return fIceCodeNumber;
	}

	public void setfIceCodeNumber(String fIceCodeNumber) {
		this.fIceCodeNumber = fIceCodeNumber;
	}

	public String getForeignTradeZoneCode() {
		return foreignTradeZoneCode;
	}

	public void setForeignTradeZoneCode(String foreignTradeZoneCode) {
		this.foreignTradeZoneCode = foreignTradeZoneCode;
	}

	public String getB13AFileDetail() {
		return b13AFileDetail;
	}

	public void setB13AFileDetail(String b13aFileDetail) {
		b13AFileDetail = b13aFileDetail;
	}

}