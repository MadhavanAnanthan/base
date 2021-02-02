package com.fedex.validation.common;

public class ValidationConstants {
	

	public static final String[] shipmentTypes={"INTL_EXP","DOM_EXP","DOM_GRD","INTL_GRD"};
	public static final String[] packageTables = {"TBL_INTL_TEST_DATA_PKG","TBL_DOM_TEST_DATA_PKG","TBL_DOM_GRD_TEST_DATA_PKG","TBL_INTL_GRD_TEST_DATA_PKG"};
	
	public static final String endPointUrl_Dev=  "http://localhost:8083/shipment/validateShipment";
	public static final String endPointUrl_Test= "http://c0027979.test.cloud.fedex.com:8087/shipment/validateShipment";
	public static final String endPointUrl_Prod= "http://c0015508.prod.cloud.fedex.com:8088/shipment/validateShipment";
	}
