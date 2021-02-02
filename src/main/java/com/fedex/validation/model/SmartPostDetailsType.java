package com.fedex.validation.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope (proxyMode=ScopedProxyMode.DEFAULT, value="prototype")
public class SmartPostDetailsType {

	private String isThisSmartPostShipment;

	private String deliveryDistributionCenter;

	private String endorsement;

	private String hubId;

	private String smartPostGroundEnableFlag;

	public String getIsThisSmartPostShipment() {
		return isThisSmartPostShipment;
	}

	public void setIsThisSmartPostShipment(String isThisSmartPostShipment) {
		this.isThisSmartPostShipment = isThisSmartPostShipment;
	}

	public String getDeliveryDistributionCenter() {
		return deliveryDistributionCenter;
	}

	public void setDeliveryDistributionCenter(String deliveryDistributionCenter) {
		this.deliveryDistributionCenter = deliveryDistributionCenter;
	}

	public String getEndorsement() {
		return endorsement;
	}

	public void setEndorsement(String endorsement) {
		this.endorsement = endorsement;
	}

	public String getHubId() {
		return hubId;
	}

	public void setHubId(String hubId) {
		this.hubId = hubId;
	}

	public String getSmartPostGroundEnableFlag() {
		return smartPostGroundEnableFlag;
	}

	public void setSmartPostGroundEnableFlag(String smartPostGroundEnableFlag) {
		this.smartPostGroundEnableFlag = smartPostGroundEnableFlag;
	}

}
