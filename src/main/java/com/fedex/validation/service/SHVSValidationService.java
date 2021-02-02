package com.fedex.validation.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fedex.validation.IO.ValidatedTinsValue;
import com.fedex.validation.IO.ValidationDetails;
import com.fedex.validation.model.ShvsMultipleParentRequest;

public interface SHVSValidationService {

	public String createShvsJsonRequest(Map<String, String> fieldsMap, String shipmentType);
	public List<HashMap<String, String>> extractValResultsFromJsonResponse(String shvsResponse, List<Map<String, String>> parentTinsForValidation) throws Exception;
	public List<ValidatedTinsValue> createValidatedTinsValueResponse(List<HashMap<String, String>> validationResults, List<String> tins, String baselineTblNm) throws Exception;
	public List<ValidatedTinsValue> createMassUpdateAndValidationResponse(List<HashMap<String, String>> validationResults, String employeeId, String baselineTblNm) throws Exception;
	public String validateShipmentsOnWEBS(ShvsMultipleParentRequest shvsMultipleParentRequest, String shvsEndpointUrl);
	public String saveValidationIgnoreDetails(List<ValidationDetails> validationDetailsList) throws Exception;
	

}
