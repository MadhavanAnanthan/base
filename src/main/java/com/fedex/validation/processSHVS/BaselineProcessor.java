package com.fedex.validation.processSHVS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;

import com.fedex.framework.logging.FedExLogEntry;
import com.fedex.framework.logging.FedExLogger;
import com.fedex.framework.logging.FedExLoggerInterface;
import com.fedex.validation.DAO.ValidationDAO;
import com.fedex.validation.IO.ValidatedTinsValue;
import com.fedex.validation.common.ValidationConstants;
import com.fedex.validation.model.ShvsMultipleParentRequest;
import com.fedex.validation.service.SHVSMappingService;
import com.fedex.validation.service.SHVSMappingServiceImpl;
import com.fedex.validation.service.SHVSValidationService;
import com.fedex.validation.service.SHVSValidationServiceImpl;

@Controller
public class BaselineProcessor {

	private static final FedExLoggerInterface LOGGER = FedExLogger.getLogger(BaselineProcessor.class);
	private ValidationConstants Constants;

	public void processSHVS(int shipmentTypes) throws Exception {

		String shipmentType = "";
		String packageTable = "";
		String tableName = "";

		switch (shipmentTypes) {
		case 1: {
			shipmentType = "INTL_EXP";
			packageTable = "TBL_INTL_TEST_DATA_PKG";
			tableName = "TBL_INTL_TEST_DATA";
			break;
		}
		case 2: {
			shipmentType = "DOM_EXP";
			packageTable = "TBL_DOM_TEST_DATA_PKG";
			tableName = "TBL_DOM_TEST_DATA";
			break;
		}
		case 3: {
			shipmentType = "DOM_GRD";
			packageTable = "TBL_DOM_GRD_TEST_DATA_PKG";
			tableName = "TBL_DOM_GRD_TEST_DATA";
			break;
		}
		case 4: {
			shipmentType = "INTL_GRD";
			packageTable = "TBL_INTL_GRD_TEST_DATA_PKG";
			tableName = "TBL_INTL_GRD_TEST_DATA";
			break;
		}
		default: {
			return;
		}
		}
		// String[] shipmentTypes = Constants.shipmentTypes;
		// String[] packageTables = Constants.packageTables;
		String endPointUrl = Constants.endPointUrl_Test;
		int count = 0;
		// String tableName = "";
		// String shipmentType = "";
		// String packageTable = "";

		/*
		 * tableName = tablenames[count]; shipmentType = shipmentTypes[count];
		 * packageTable = packageTables[count];
		 */

		LOGGER.info(new FedExLogEntry("Selected TableName ========= " + tableName));

		List<String> tins = new ArrayList<String>();
		List<Map<String, String>> Parentlists = new ArrayList<Map<String, String>>();
		List<Map<String, String>> Childlists = new ArrayList<Map<String, String>>();
		String TINS = "";
		ValidationDAO validationDao = new ValidationDAO();
		tins = validationDao.getAllTins(tableName);

		LOGGER.info(new FedExLogEntry("Total fetched TINS Count From " + tableName + " ------------->" + tins.size()));

		int counter = 0;
		List<String> tinsList = new ArrayList<String>();
		while (counter < tins.size()) {
			tinsList.clear();
			for (int i = counter; i < counter + 100; i++) {
				try {
					TINS = TINS + "" + tins.get(i) + ","; // IndexOutOfBoundsException
					tinsList.add(tins.get(i));
				} catch (IndexOutOfBoundsException e) {

				} catch (InputMismatchException e) {

				}
			}
			TINS = TINS.substring(0, TINS.length() - 1).trim();

			LOGGER.info(new FedExLogEntry("Fetched TINS======================>" + TINS));

			Parentlists = validationDao.getParentTinsListForValidation(tableName, TINS);
			Childlists = validationDao.getChildTinsListForValidation(packageTable, TINS);
			Map<String, String> meterNumbers = validationDao.getMeterNumbers(TINS, tableName);
			SHVSMappingService interfaceDefinitionMap = new SHVSMappingServiceImpl();
			ShvsMultipleParentRequest shvsMultipleParentRequest = interfaceDefinitionMap
					.createJsonRequestForShvs(Parentlists, Childlists, meterNumbers, shipmentType);
			
			LOGGER.info(new FedExLogEntry("JSON request body is generated for processed TINS"));
			// To print JSON request body
			/*
			 * ObjectMapper Obj = new ObjectMapper(); try { String jsonStr =
			 * Obj.writeValueAsString(shvsMultipleParentRequest); // Displaying
			 * JSON String System.out.println(jsonStr); } catch (IOException e)
			 * { e.printStackTrace(); }
			 */
			SHVSValidationService interfaceDefinitionVal = new SHVSValidationServiceImpl();
			String jsonResponse = interfaceDefinitionVal.validateShipmentsOnWEBS(shvsMultipleParentRequest,
					endPointUrl);
			List<HashMap<String, String>> validationResults = interfaceDefinitionVal
					.extractValResultsFromJsonResponse(jsonResponse, Parentlists);
			List<ValidatedTinsValue> ValidatedTinsValueResults = interfaceDefinitionVal
					.createValidatedTinsValueResponse(validationResults, tinsList, tableName);
			counter += 100;

			LOGGER.info(new FedExLogEntry("Counter stops at--->" + counter));

			TINS = "";
		}

	}
}
