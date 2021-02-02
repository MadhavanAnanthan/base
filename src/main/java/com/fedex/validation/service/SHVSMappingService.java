package com.fedex.validation.service;
import java.util.List;
import java.util.Map;

import com.fedex.validation.model.MultipleShipmentDetails;
import com.fedex.validation.model.RequestedShipments;
import com.fedex.validation.model.ShvsMultipleParentRequest;


public interface SHVSMappingService {
	public RequestedShipments setRequestedShipment(Map<String, String> fieldsMap, String shipmentType) ;
	MultipleShipmentDetails setMultipleShipmentDetails(Map<String, String> fieldsMap);
	public ShvsMultipleParentRequest createJsonRequestForShvs(List<Map<String, String>> Parentlists, List<Map<String, String>> Childlists, Map<String, String> meterNumbers, String shipmentType);

}
	
