package com.fedex.validation.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fedex.framework.logging.FedExLogEntry;
import com.fedex.framework.logging.FedExLogger;
import com.fedex.framework.logging.FedExLoggerInterface;
//import com.fedex.framework.logging.FedExLogEntry;
import com.fedex.validation.DAO.ValidationDAO;
import com.fedex.validation.IO.ValidatedTinsValue;
import com.fedex.validation.IO.ValidationDetails;
import com.fedex.validation.model.MultipleShipmentDetails;
import com.fedex.validation.model.ParentShvsPojo;
import com.fedex.validation.model.RequestedShipment;
import com.fedex.validation.model.RequestedShipments;
import com.fedex.validation.model.ShvsMultipleParentRequest;

@Service
@ComponentScan("com.fedex.validation.model")
public class SHVSValidationServiceImpl implements SHVSValidationService {

	private static final FedExLoggerInterface LOGGER = FedExLogger.getLogger(SHVSValidationServiceImpl.class);
	//@Autowired
	ValidationDAO validationDao;

	//@Autowired
	SHVSMappingService shvsMappingService;

	//@Autowired
	RequestedShipment requestedShipment;

	//@Autowired
	RequestedShipments requestedShipments;
	//@Autowired
	MultipleShipmentDetails multipleShipmentDetails;

	//@Autowired
	ShvsMultipleParentRequest shvsMultipleParentRequest;

	static String message = null;
    String returnMessage = null;
	static String trackingNumber = "No Tracking Id Returned";
	static String returnTrackingNumber = "No Return Tracking Id Returned";
	static String emailLabelUrl="No Email Label Url is returned";
	static String returnTrackingIdType="No return tracking Id type is returned";
	static HashMap<String, String> validationStringNew = null;
	static List<MultipleShipmentDetails> multipleShipmentList = null;
	static ParentShvsPojo[] parentShvsPojos = null;
	static RequestedShipments[] requestedShvsShipments = null;
	static List<RequestedShipments> requestedShvsShipmentsPojoList = new ArrayList<RequestedShipments>();
	List<HashMap<String, String>> shipmentReplyData = null;
	static HashMap<String, String> daoValidationString = null;
	String validationMessage = "";
	int count = 0;



	public String createShvsJsonRequest(Map<String, String> fieldsMap, String shipmentType) {
		SHVSMappingService shvsMappingService = new SHVSMappingServiceImpl();
		return createPojoToShvsRequest(shvsMappingService.setRequestedShipment(fieldsMap, shipmentType));

	}

	public String createPojoToShvsRequest(RequestedShipments parentShvsPojo) {

		if (multipleShipmentList != null && multipleShipmentList.size() > 0) {
			MultipleShipmentDetails[] mpsDetails = new MultipleShipmentDetails[multipleShipmentList.size()];
			mpsDetails = multipleShipmentList.toArray(mpsDetails);

			parentShvsPojo.getRequestedShipment().getShippingDetails().setMultipleShipmentDetails(mpsDetails);

		}
		ObjectMapper mapper = new ObjectMapper();
		requestedShvsShipmentsPojoList.add(parentShvsPojo);
		ShvsMultipleParentRequest shvsMultipleParentRequest = new ShvsMultipleParentRequest();
		if (requestedShvsShipmentsPojoList != null && requestedShvsShipmentsPojoList.size() > 0) {
			RequestedShipments[] parentShvsPojos = new RequestedShipments[requestedShvsShipmentsPojoList.size()];
			requestedShvsShipments = requestedShvsShipmentsPojoList.toArray(parentShvsPojos);
			shvsMultipleParentRequest.setRequestedShipments(requestedShvsShipments);
		}
		try {
			multipleShipmentList.clear();
			requestedShvsShipmentsPojoList.clear();
			return mapper.writeValueAsString(shvsMultipleParentRequest);
		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}
		return "";

	}
	
	//******************* Added by Rajul 10/02/2020 ******************************
	public List<HashMap<String, String>> extractValResultsFromJsonResponse(String shvsResponse, List<Map<String, String>> Parentlists) throws Exception{
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(shvsResponse);
		JSONArray shvsValResponseArray = (JSONArray) json.get("shipmentReply");
		
		List<HashMap<String, String>> shipmentReplyData = new ArrayList<HashMap<String, String>>();
		
		ListIterator shvsResponseItr = shvsValResponseArray.listIterator();

		while(shvsResponseItr.hasNext()){
			JSONObject shvsValResponse = (JSONObject) shvsResponseItr.next();
			if (shvsValResponse != null && shvsValResponse.containsKey("trackingIds")) {
				String testInputNumber = (String) shvsValResponse.get("testInputNumber");
				String shipmentSequenceNumber = (String) shvsValResponse.get("shipmentSequenceNumber");
				String shipmentType = (String) shvsValResponse.get("shipmentType");
				String device = (String) shvsValResponse.get("device");
				JSONObject TrackingIds = (JSONObject) shvsValResponse.get("trackingIds");
				trackingNumber = (String) TrackingIds.get("TrackingNumber");

				HashMap<String, String> shipmentReplySuccess = new HashMap<String, String>();
				shipmentReplySuccess.put("testInputNumber", testInputNumber);
				shipmentReplySuccess.put("shipmentSequenceNumber", shipmentSequenceNumber);
				shipmentReplySuccess.put("shipmentType", shipmentType);
				shipmentReplySuccess.put("Severity", "SUCCESS");
				shipmentReplySuccess.put("device", device);
				shipmentReplySuccess.put("Message", "");
				shipmentReplySuccess.put("trackingNumber", trackingNumber);
				
				for(Map<String, String> parentTinsForShppSeqQty : Parentlists){
			    	if(parentTinsForShppSeqQty.get("TEST_INPUT_NBR").equalsIgnoreCase(testInputNumber)){
			    		shipmentReplySuccess.put("SHPPCEQTY", parentTinsForShppSeqQty.get("SHPPCEQTY"));
			    	}
			    }
				
				shipmentReplyData.add(shipmentReplySuccess);
			}
			else if (shvsValResponse != null && !shvsValResponse.containsKey("trackingIds") && shvsValResponse.containsKey("notifications")) {
				JSONArray notificationsArray = (JSONArray) shvsValResponse.get("notifications");
				final String testInputNumber = (String) shvsValResponse.get("testInputNumber");
				if(testInputNumber != null){
					final String shipmentSequenceNumber = (String) shvsValResponse.get("shipmentSequenceNumber");
					final String shipmentType = (String) shvsValResponse.get("shipmentType");
					final String device = (String) shvsValResponse.get("device");
					
					HashMap<String, String> shipmentReplyError = new HashMap<String, String>();
					
					ListIterator notificationItr = notificationsArray.listIterator();
					while(notificationItr.hasNext()){
						JSONObject notification = (JSONObject) notificationItr.next();
						if (notification.get("Severity").toString().equalsIgnoreCase("ERROR")) {
							if(notification.get("Message") != null){
								validationMessage = notification.get("Message").toString();
							}
							} 
						}
					shipmentReplyError.put("testInputNumber", testInputNumber);
					shipmentReplyError.put("shipmentSequenceNumber", shipmentSequenceNumber);
					shipmentReplyError.put("shipmentType", shipmentType);
					shipmentReplyError.put("Severity", "ERROR");
					shipmentReplyError.put("device", device);
					shipmentReplyError.put("Message", "Error" + " : " + validationMessage);
					shipmentReplyError.put("trackingNumber", "Not Generated");
					shipmentReplyData.add(shipmentReplyError);
				}
				
				}
			}
		LOGGER.info(new FedExLogEntry("Total number of TINS processed ========"+shipmentReplyData.size()));
		return shipmentReplyData;
	}
	
	public String validateShipmentsOnWEBS(ShvsMultipleParentRequest shvsMultipleParentRequest, String shvsEndpointUrl){
		
		/*JAXBContext jaxbContext;
 		StringWriter sw = new StringWriter();
        try {
            jaxbContext = JAXBContext.newInstance(ShvsMultipleParentRequest.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(
            		shvsMultipleParentRequest, sw);
           System.out.println(sw.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }*/  // code for generate XML request
 		
 		 
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders restHeaders = new HttpHeaders();
		restHeaders.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<ShvsMultipleParentRequest> entity = new HttpEntity<ShvsMultipleParentRequest>(shvsMultipleParentRequest, restHeaders);
		String jsonResponse = restTemplate.postForObject(shvsEndpointUrl, entity, String.class);
		LOGGER.info(new FedExLogEntry("JSON response body is generated for processed TINS"));
		return jsonResponse;
	}

	
	public List<ValidatedTinsValue> createValidatedTinsValueResponse(List<HashMap<String, String>> validationResults, List<String> tins, String baselineTblNm)throws Exception{
		List<ValidatedTinsValue> validatedTinsResults = new ArrayList<ValidatedTinsValue>();
		List<ValidationDetails> validationDetailsList = new ArrayList<ValidationDetails>();
		List<ValidationDetails> validationDetailsListError = new ArrayList<ValidationDetails>();
		for(HashMap<String, String> valResults : validationResults){
			
			String employeeId="DEFAULT";
			String severity = valResults.get("Severity");
			String message = valResults.get("Message");
			String testInputNumber = valResults.get("testInputNumber");
			//for(String clonedTinDetails :  tins){
			if(severity != null && testInputNumber != null && severity.trim().equalsIgnoreCase("Success")){
				
					if(testInputNumber!=null ){
						ValidatedTinsValue result= new ValidatedTinsValue();
						List<String> resultRow = new ArrayList<String>();
						resultRow.add(valResults.get("testInputNumber"));
						resultRow.add(valResults.get("shipmentSequenceNumber"));
						resultRow.add(valResults.get("trackingNumber"));
						resultRow.add(valResults.get("Message"));
 						result.setRowvalue(resultRow);
						
						ValidationDetails validationDetails = new ValidationDetails();
						validationDetails.setTestInputNbr(valResults.get("testInputNumber"));
						validationDetails.setShpSequenceNbr(valResults.get("shipmentSequenceNumber"));
						validationDetails.setShpSequenceQty(valResults.get("SHPPCEQTY")); // Value is not available now, need to add as part of json response
						validationDetails.setValidationStatus(severity);
						validationDetails.setValidationMessage("Success");
						validationDetails.setWebsTrkngNbr(valResults.get("trackingNumber"));
						validationDetails.setIgnoreFlag("NA");
						validationDetails.setIgnoreReason("NA");
						validationDetails.setIgnoreComments("NA");
						validationDetails.setValidatedBy(employeeId);
						validationDetails.setBaselineTableName(baselineTblNm);
						validationDetailsList.add(validationDetails);
						validatedTinsResults.add(result);
					}
				}
	
				else if(severity != null && testInputNumber != null && severity.trim().equalsIgnoreCase("ERROR"))
				{
				ValidatedTinsValue resultError= new ValidatedTinsValue();
						ValidationDetails validationDetails = new ValidationDetails();
						validationDetails.setTestInputNbr(valResults.get("testInputNumber"));
						validationDetails.setShpSequenceNbr(valResults.get("shipmentSequenceNumber"));
						validationDetails.setShpSequenceQty(valResults.get("SHPPCEQTY")); // Value is not available now, need to add as part of json response
						validationDetails.setValidationStatus("FAILED");
						validationDetails.setValidationMessage(message);
						validationDetails.setWebsTrkngNbr(valResults.get("trackingNumber"));
						validationDetails.setIgnoreFlag("NA");
						validationDetails.setIgnoreReason("NA");
						validationDetails.setIgnoreComments("NA");
						validationDetails.setValidatedBy(employeeId);
						validationDetails.setBaselineTableName(baselineTblNm);
						validationDetailsListError.add(validationDetails);
						validatedTinsResults.add(resultError);
				}
			
			
			}
		if(validationDetailsList.size() > 0 ){
			ValidationDAO dataInsertion=new ValidationDAO();			
			dataInsertion.insertValidationDetails(validationDetailsList);
			
			
		}
		if(validationDetailsListError.size() > 0 ){
			ValidationDAO dataInsertion=new ValidationDAO();
			dataInsertion.insertValidationDetails(validationDetailsListError);
			
		}
		
		return validatedTinsResults;		
	}

	
	public String saveValidationIgnoreDetails(List<ValidationDetails> validationDetailsList) throws Exception{
		if(validationDetailsList.size() > 0){
			validationDao.insertValidationDetails(validationDetailsList);
		}
		return "";
	}

	public List<ValidatedTinsValue> createMassUpdateAndValidationResponse(
			List<HashMap<String, String>> validationResults, String employeeId, String baselineTblNm) throws Exception {
		return null;
	}

	
	
	
}