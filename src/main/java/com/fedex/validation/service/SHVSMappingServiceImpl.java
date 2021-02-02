package com.fedex.validation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.fedex.validation.model.AddressDetails;
import com.fedex.validation.model.AlcoholDetails;
import com.fedex.validation.model.AlternateAddressDetails;
import com.fedex.validation.model.BillingDetails;
import com.fedex.validation.model.BillingOtherDetails;
import com.fedex.validation.model.BsoDetails;
import com.fedex.validation.model.CollectOnDeliveryDetails;
import com.fedex.validation.model.CommercialInvoice;
import com.fedex.validation.model.CommercialInvoiceDetails;
import com.fedex.validation.model.DryiceDetails;
import com.fedex.validation.model.DutyTaxDetails;
import com.fedex.validation.model.EmailNotificationDetails;
import com.fedex.validation.model.FIceDetails;
import com.fedex.validation.model.FreightDetails;
import com.fedex.validation.model.GeneralInformation;
import com.fedex.validation.model.HoldAtLocationDetails;
import com.fedex.validation.model.HomeDeliveryType;
import com.fedex.validation.model.IPDTDDetails;
import com.fedex.validation.model.ITARDetails;
import com.fedex.validation.model.MiscellaneousDetails;
import com.fedex.validation.model.MultipleShipmentDetails;
import com.fedex.validation.model.ParentShvsPojo;
import com.fedex.validation.model.RecipientDetails;
import com.fedex.validation.model.RequestedShipment;
import com.fedex.validation.model.RequestedShipments;
import com.fedex.validation.model.ReturnAddressDetails;
import com.fedex.validation.model.ReturnDetails;
import com.fedex.validation.model.ReturnInformation;
import com.fedex.validation.model.SenderDetails;
import com.fedex.validation.model.ShipmentData;
import com.fedex.validation.model.ShipmentMassUpdate;
import com.fedex.validation.model.ShipmentMiscellaneousDetails;
import com.fedex.validation.model.ShipmentRequestData;
import com.fedex.validation.model.ShippingDetails;
import com.fedex.validation.model.ShippingInformation;
import com.fedex.validation.model.ShvsMultipleParentRequest;
import com.fedex.validation.model.SmartPostDetailsType;
import com.fedex.validation.model.SpecialServices;

@Service
@Scope (value="prototype")
@ComponentScan("com.fedex.datamining.model")
public class SHVSMappingServiceImpl implements SHVSMappingService {

	//@Autowired
	GeneralInformation generalInformation = new GeneralInformation();

	//@Autowired
	AddressDetails addressDetails = new AddressDetails();

	//@Autowired
	SenderDetails senderDetails = new SenderDetails();

	//@Autowired
	RecipientDetails recipientDetails = new RecipientDetails();

	//@Autowired
	HoldAtLocationDetails holdAtLocationDetails = new HoldAtLocationDetails();

	//@Autowired
	AlternateAddressDetails alternateAddressDetails = new AlternateAddressDetails();

	//@Autowired
	CommercialInvoice commercialInvoice = new CommercialInvoice();

	//@Autowired
	FIceDetails fIceDetails = new FIceDetails();

	//@Autowired
	BsoDetails bSODetails = new BsoDetails();

	//@Autowired
	ITARDetails iTARDetails = new ITARDetails();

	//@Autowired
	MiscellaneousDetails miscellaneousDetails = new MiscellaneousDetails();

	//@Autowired
	DryiceDetails dryiceDetails = new DryiceDetails();

	//@Autowired
	EmailNotificationDetails emailNotificationDetails = new EmailNotificationDetails();

	//@Autowired
	ShipmentMiscellaneousDetails shipmentMiscellaneousDetails = new ShipmentMiscellaneousDetails();

	//@Autowired
	ShippingInformation shippingInformation = new ShippingInformation();

	//@Autowired
	MultipleShipmentDetails[] multipleShipmentDetails;

	//@Autowired
	IPDTDDetails iPDTDDetails = new IPDTDDetails();

	//@Autowired
	DutyTaxDetails dutyTaxDetails = new DutyTaxDetails();

	//@Autowired
	BillingOtherDetails billingOtherDetails = new BillingOtherDetails();

	//@Autowired
	ReturnInformation returnInformation = new ReturnInformation();

	//@Autowired
	ReturnAddressDetails returnAddressDetails = new ReturnAddressDetails();

	//@Autowired
	AlcoholDetails alcoholDetails = new AlcoholDetails();

	//@Autowired
	CollectOnDeliveryDetails collectOnDeliveryDetails = new CollectOnDeliveryDetails();

	//@Autowired
	FreightDetails freightDetails = new FreightDetails();

	//@Autowired
	RequestedShipment requestedShipment = new RequestedShipment();

	//@Autowired
	ShippingDetails shippingDetails = new ShippingDetails();

	//@Autowired
	CommercialInvoiceDetails commercialInvoiceDetails = new CommercialInvoiceDetails();

	//@Autowired
	BillingDetails billingDetails = new BillingDetails();

	//@Autowired
	ReturnDetails returnDetails = new ReturnDetails();

	//@Autowired
	SpecialServices specialServices = new SpecialServices();


	//@Autowired
	ParentShvsPojo parentShvsPojo = new ParentShvsPojo();
	
	//@Autowired
	RequestedShipments requestedShipments = new RequestedShipments();
	
	//@Autowired
	HomeDeliveryType homeDeliveryType = new HomeDeliveryType();
	
	//@Autowired
	SmartPostDetailsType smartPostDetailsType = new SmartPostDetailsType();
	
	//@Autowired
	ShipmentData shipmentData = new ShipmentData();
	
	//@Autowired
    ShipmentRequestData shipmentRequestData = new ShipmentRequestData();
	
	//@Autowired
	ShipmentMassUpdate shipmentMassUpdate = new ShipmentMassUpdate();
	
	public RequestedShipments setRequestedShipment(Map<String, String> fieldsMap, String shipmentType) {
		requestedShipment.setGeneralInformation(setGeneralInformation(fieldsMap, shipmentType));
		requestedShipment.setAddressDetails(setAddressDetails(fieldsMap));
		requestedShipment.setShippingDetails(setShippingDetails(fieldsMap));
		requestedShipment.setIpdtdDetails(setIPDTDDetails(fieldsMap));
		requestedShipment.setCommercialInvoiceDetails(setCommercialInvoiceDetails(fieldsMap));
		requestedShipment.setBillingDetails(setBillingDetails(fieldsMap));
		requestedShipment.setReturnDetails(setReturnDetails(fieldsMap));
		requestedShipment.setSpecialServices(setSpecialServices(fieldsMap));
		requestedShipment.setShipmentMiscellaneousDetails(setShipmentMiscellaneousDetails(fieldsMap));
		requestedShipments.setRequestedShipment(requestedShipment);
		return requestedShipments;
	}

	public GeneralInformation setGeneralInformation(Map<String, String> fieldsMap, String shipmentType) {
		GeneralInformation gi = new GeneralInformation();
		gi.setTestInputNumber(fieldsMap.get("TEST_INPUT_NBR"));
		gi.setShipmentType(shipmentType);
		gi.setMeterNumber(fieldsMap.get("METERNBR"));
		gi.setAccountNumber(fieldsMap.get("CUSTNBR"));
		gi.setShipmentsQuantity(fieldsMap.get("SHPPCEQTY"));
		gi.setShipmentSequenceNumber(fieldsMap.get("SHP_SEQ_NBR"));
		gi.setRoutingPath(fieldsMap.get("ROUTING_PATH"));
		gi.setDevice("WEBS");
		return gi;
	}

	public AddressDetails setAddressDetails(Map<String, String> fieldsMap) {

		addressDetails.setSenderDetails(setSenderDetails(fieldsMap));
		addressDetails.setRecipientDetails(setRecipientDetails(fieldsMap));
		addressDetails.setAlternateAddressDetails(setAlternateAddressDetails(fieldsMap));
		addressDetails.setHoldAtLocationDetails(setHoldAtLocationDetails(fieldsMap));

		return addressDetails;
	}

	public SenderDetails setSenderDetails(Map<String, String> fieldsMap) {

		senderDetails.setName(fieldsMap.get("SNDRNM"));
		senderDetails.setCompanyName(fieldsMap.get("SNDRCONM"));
		senderDetails.setAddressLane1(fieldsMap.get("SNDRADDRLN1"));
		senderDetails.setAddressLane2(fieldsMap.get("SNDRADDRLN2"));
		senderDetails.setCity(fieldsMap.get("SNDRCITYNM"));
		senderDetails.setStateOrProvince(fieldsMap.get("SNDRSTCD"));
		senderDetails.setPostalCode(fieldsMap.get("SNDRPSTLCD"));
		senderDetails.setCountry(fieldsMap.get("SNDRCNTRYCD"));
		senderDetails.setPhoneNumber(fieldsMap.get("SNDRPHONENBR"));
		senderDetails.setEmailId(fieldsMap.get("SNDREMAIL"));
		senderDetails.setStateTaxId(fieldsMap.get("SNDR_ST_TAX"));
		senderDetails.setFederalTaxID(fieldsMap.get("SNDR_FED_TAX"));
		senderDetails.setTaxPayerIdNumber(fieldsMap.get("SNDREINIRSNBR"));
		senderDetails.setDepartmentName(fieldsMap.get("SNDRDEPTNM"));
		senderDetails.setUltimateDestinationCountry(fieldsMap.get("ULTDESTCNTRYCD"));
		senderDetails.setShipToThisAddressFlag(fieldsMap.get("SHPSNDRADDRFLG"));

		return senderDetails;
	}

	public RecipientDetails setRecipientDetails(Map<String, String> fieldsMap) {

		recipientDetails.setName(fieldsMap.get("RECPNM"));
		recipientDetails.setCompanyName(fieldsMap.get("RECPCONM"));
		recipientDetails.setAddressLane1(fieldsMap.get("RECPADDRLN1"));
		recipientDetails.setAddressLane2(fieldsMap.get("RECPADDRLN2"));
		recipientDetails.setCity(fieldsMap.get("RECPCITYNM"));
		recipientDetails.setStateOrProvince(fieldsMap.get("RECPSTCD"));
		recipientDetails.setPostalCode(fieldsMap.get("RECPPSTLCD"));
		recipientDetails.setCountry(fieldsMap.get("RECPCNTRYCD"));
		recipientDetails.setPhoneNumber(fieldsMap.get("RECPPHONENBR"));
		recipientDetails.setEmailId(fieldsMap.get("RECPNOTIFEMAIL"));
		recipientDetails.setStateTaxId(fieldsMap.get("RECP_ST_TAX"));
		recipientDetails.setFederalTaxID(fieldsMap.get("RECP_FED_TAX"));
		recipientDetails.setReferenceInformation(fieldsMap.get("REFINFODESC"));
		recipientDetails.setDepartmentName(fieldsMap.get("RECPDEPTNM"));
		recipientDetails.setCustomerReference4(fieldsMap.get("REFINFODESC4"));
		recipientDetails.setThisIsResidentialAddressFlag(fieldsMap.get("RESFLG"));
		recipientDetails.setRecipientEinIrsNumber(fieldsMap.get("RECPEINIRSNBR"));
		return recipientDetails;

	}

	public HoldAtLocationDetails setHoldAtLocationDetails(Map<String, String> fieldsMap) {

		holdAtLocationDetails.setHalRequiredFlag(fieldsMap.get("HALFLG"));
		holdAtLocationDetails.setCountry(fieldsMap.get("HALCNTRYCD"));
		holdAtLocationDetails.setAddress(fieldsMap.get("HALADDR"));
		holdAtLocationDetails.setPostalCode(fieldsMap.get("HALPSTLCD"));
		holdAtLocationDetails.setCity(fieldsMap.get("HALCITYNM"));
		holdAtLocationDetails.setState(fieldsMap.get("HALSTCD"));
		holdAtLocationDetails.setPhone(fieldsMap.get("HALPHONENBR"));
		holdAtLocationDetails.setLocationType(fieldsMap.get("HALSTYCD"));
		return holdAtLocationDetails;
	}

	public AlternateAddressDetails setAlternateAddressDetails(Map<String, String> fieldsMap) {

		alternateAddressDetails.setName(fieldsMap.get("ALTRNM"));
		alternateAddressDetails.setDepartment(fieldsMap.get("ALTRDEPTNM"));
		alternateAddressDetails.setAddressLine1(fieldsMap.get("ALTRADDRLN1"));
		alternateAddressDetails.setAddressLine2(fieldsMap.get("ALTRADDRLN2"));
		alternateAddressDetails.setCity(fieldsMap.get("ALTRCITYNM"));
		alternateAddressDetails.setState(fieldsMap.get("ALTRSTCD"));
		alternateAddressDetails.setPostalCode(fieldsMap.get("ALTRPSTLCD"));
		alternateAddressDetails.setCountry(fieldsMap.get("ALTRCNTRYCD"));
		alternateAddressDetails.setPhone(fieldsMap.get("ALTRPHONENBR"));
		alternateAddressDetails.setAlternateAccountNumber(fieldsMap.get("ALTERNATEACCOUNT"));
		alternateAddressDetails.setAlternateLocationCode(fieldsMap.get("ALTRLOCD"));
		return alternateAddressDetails;

	}

	public ShippingDetails setShippingDetails(Map<String, String> fieldsMap) {
		shippingDetails.setShippingInformation(setShippingInformation(fieldsMap));
		////shippingDetails.setMultipleShipmentDetails(setMultipleShipmentDetails(fieldsMap));
		return shippingDetails;

	}

	public ShippingInformation setShippingInformation(Map<String, String> fieldsMap) {

		shippingInformation.setShipPieceQuantity(fieldsMap.get("SHPPCEQTY"));
		shippingInformation.setShipWeight(fieldsMap.get("SHPWGT"));
		shippingInformation.setShipWeightUOM(fieldsMap.get("SHPUMCD"));
		shippingInformation.setServiceCode(fieldsMap.get("SVCTYPCD"));
		shippingInformation.setPackagingType(fieldsMap.get("PACKAGING"));
		shippingInformation.setDimensionLength(fieldsMap.get("DIMLTHQTY"));
		shippingInformation.setDimensionWidth(fieldsMap.get("DIMWIDTHQTY"));
		shippingInformation.setDimensionHeight(fieldsMap.get("DIMHGTQTY"));
		shippingInformation.setDimensions(fieldsMap.get("DIMUMCD"));
		shippingInformation.setDeclaredValue(fieldsMap.get("DECVVALAMT"));
		shippingInformation.setCurrencyType(fieldsMap.get("CARRCURRTYPCD"));
		shippingInformation.setCarriageValue(fieldsMap.get("CARRVALAMT"));
		shippingInformation.setPieceCountVerificationFlag(fieldsMap.get("PCVFLG"));
		shippingInformation.setPieceCountVerificationBoxCount(fieldsMap.get("PCVBOXCNT"));
		shippingInformation.setAppointmentDeliveryPayor(fieldsMap.get("APDPCVPAYTYP"));
		shippingInformation.setAppointmentDeliveryAccount(fieldsMap.get("APDPCVACCT"));
		shippingInformation.setPackageAssociationAndPrintModeCode(fieldsMap.get("PKG_ASSC_PRT_MD_CD"));
		shippingInformation.setPickUpDropOff(fieldsMap.get("PUDO"));
		shippingInformation.setPaymentTypeCode(fieldsMap.get("PMTTYPCD"));
		shippingInformation.setTotalCustomsValue(fieldsMap.get("TOTALCUSTOMSVALUE"));
		shippingInformation.setShipDay(fieldsMap.get("SHIPDAY"));
		shippingInformation.setRma(fieldsMap.get("RMA"));
		shippingInformation.setPackageWeight(fieldsMap.get("MPSSHPWGT"));
		shippingInformation.setReferenceInformation1(fieldsMap.get("REFINFODESC"));
		shippingInformation.setReferenceInformation2(fieldsMap.get("REFINFODESC2"));
		shippingInformation.setReferenceInformation3(fieldsMap.get("REFINFODESC3"));
		shippingInformation.setSignType(fieldsMap.get("RELSIGTYP"));
		return shippingInformation;
	}

	//***************** Uncommented and added by Rajul 10/02/2020 *******************/
	public MultipleShipmentDetails setMultipleShipmentDetails(Map<String, String> fieldsMap) {
		MultipleShipmentDetails childRequest = new MultipleShipmentDetails();
		
		String DIMUMCD = fieldsMap.get("DIMUMCD");

		if (DIMUMCD != null && DIMUMCD.trim().equalsIgnoreCase("I")) {
			childRequest.setDimensions("IN");
		}
		if (DIMUMCD != null && DIMUMCD.trim().equalsIgnoreCase("C")) {
			childRequest.setDimensions("CM");
		}
		
		String DIM1 = fieldsMap.get("DIM1");
		if(DIM1==null || DIM1.isEmpty() || "".equalsIgnoreCase(DIM1.trim()))
		{
			childRequest.setDimensionLength("");
			childRequest.setDimensionWidth("");
			childRequest.setDimensionHeight("");
		}	
		else{
		/*	childRequest.setDimensionLength(fieldsMap.get("DIMLTHQTY")); //Not Found
			childRequest.setDimensionWidth(fieldsMap.get("DIMWIDTHQTY")); //Not Found
			childRequest.setDimensionHeight(fieldsMap.get("DIMHGTQTY")); //Not Found
		 */			
			String[] dim = DIM1.split("x");
			childRequest.setDimensionLength(dim[0]);
			/*if(dim[1] == null){
			childRequest.setDimensionWidth("");
			}else{*/
				childRequest.setDimensionWidth(dim[1]);	
			/*}
			if(dim[2] == null){
				childRequest.setDimensionHeight("");
			}else{*/
				childRequest.setDimensionHeight(dim[2]);	
			//}
		}
		
		childRequest.setPackageSequenceNumber(fieldsMap.get("PKGSEQUENCE"));
		
		//childRequest.setDimensions(fieldsMap.get("DIMUMCD")); //Not Found
		childRequest.setDeclaredValue(fieldsMap.get("DECVALAMT"));
		childRequest.setDim(fieldsMap.get("DIM"));
		childRequest.setSignType(fieldsMap.get("RELSIGTYP"));
		childRequest.setReferenceInformation1(fieldsMap.get("REFINFODESC"));
		childRequest.setReferenceInformation2(fieldsMap.get("REFINFODESC2"));
		childRequest.setReferenceInformation3(fieldsMap.get("REFINFODESC3"));
		childRequest.setDryIceFlg(fieldsMap.get("DRYICEFLG"));
		childRequest.setDryIceUoM(fieldsMap.get("DRYICEUM"));
		childRequest.setDryIceWeight(fieldsMap.get("DRYICEWGT"));
		childRequest.setDangerousGoodsFlag(fieldsMap.get("DANGGOODSFLG"));
		childRequest.setAlcoholFlag(fieldsMap.get("ALCFLG"));
		childRequest.setRscBundleID(fieldsMap.get("RSCBNDLID"));
		childRequest.setHarmonizedCode(fieldsMap.get("HARMCD"));
		childRequest.setCarriageValue(fieldsMap.get("CARRVALAMT"));
		childRequest.setPaaIndicator(fieldsMap.get("PAAIND"));
		childRequest.setTwentyDollarSavingCertificate(fieldsMap.get("SAVECERTI"));
		childRequest.setTotalCustomsValue(fieldsMap.get("MPS_TOTCUSTVAL")); //Not Found
		childRequest.setTotalDeclaredOrCarriageValue(fieldsMap.get("MPS_DECVAL_AMT")); //Not Found
		childRequest.setCollectOnDeliveryAmount(fieldsMap.get("CODAMT"));
		childRequest.setPackageWeight(fieldsMap.get("SHPWGT"));  //Not Found
		childRequest.setRecipientType(fieldsMap.get("ALCRECPTYP")); 
		childRequest.setShipmentLabelType(fieldsMap.get("ALCLBLTYP")); 
		childRequest.setShipWeight(fieldsMap.get("SHPWGT")); 
		childRequest.setShipWeightUOM(fieldsMap.get("SHPUMCD")); 
		childRequest.setOtherRegulatedMaterials(fieldsMap.get("ORMD")); 
		childRequest.setHazardeousMaterial(fieldsMap.get("HAZMATFLG")); 
		childRequest.setAddCODFreightCharges(fieldsMap.get("ADDCODCHRGFLG")); 
		
		return childRequest;

	}

	public IPDTDDetails setIPDTDDetails(Map<String, String> fieldsMap) {

		iPDTDDetails.setTransborderDistributionPayor(fieldsMap.get("NATBLTLPAYTYP"));
		iPDTDDetails.setTransborderDistributionAccount(fieldsMap.get("NATBLTLBILLTOACCTNBR"));
		iPDTDDetails.setTransborderDistributionLinehaulFlag(fieldsMap.get("LTLFLG"));
		iPDTDDetails.setIpdAppointmentDelivery(fieldsMap.get("APDFLG"));
		iPDTDDetails.setIpdOrIpfClearanceLocation(fieldsMap.get("IPDCLRLOC"));
		iPDTDDetails.setTransborderDistributionIndicator(fieldsMap.get("NATBIND"));
		iPDTDDetails.setCommodityFlowSurveyPostalCode(fieldsMap.get("CFSPSTLCD"));
		iPDTDDetails.setAdmissabilityPackageType(fieldsMap.get("ADMPACKTYPE"));
		iPDTDDetails.setGroupIndicator(fieldsMap.get("GRPIND"));
		iPDTDDetails.setCommdityPurposeType(fieldsMap.get("COMMPURTYP"));
		return iPDTDDetails;
	}

	public CommercialInvoiceDetails setCommercialInvoiceDetails(Map<String, String> fieldsMap) {
		commercialInvoiceDetails.setCommercialInvoice(setCommercialInvoice(fieldsMap));
		commercialInvoiceDetails.setfIceDetails(setFICEDetails(fieldsMap));
		commercialInvoiceDetails.setBsoDetails(setBSODetails(fieldsMap));
		commercialInvoiceDetails.setItarDetails(setITARDetails(fieldsMap));
		return commercialInvoiceDetails;
	}

	public CommercialInvoice setCommercialInvoice(Map<String, String> fieldsMap) {

		commercialInvoice.setCommercialInvoiceFlag(fieldsMap.get("CIFLG"));
		commercialInvoice.setCommodity(fieldsMap.get("COMMODITY"));
		commercialInvoice.setDdCommodityCode(fieldsMap.get("DD_COMMODITY_CODE"));
		commercialInvoice.setCommodityWeight(fieldsMap.get("CMDYWGT"));
		commercialInvoice.setCommodityCustomsValue(fieldsMap.get("CMDYCSTMAMT"));
		commercialInvoice.setUnits1(fieldsMap.get("UNITQTY"));
		commercialInvoice.setUnitValueAmount(fieldsMap.get("UNITVALAMT"));
		commercialInvoice.setAutomatedExportSystemFilingStatus(fieldsMap.get("AESSTATCD"));
		commercialInvoice.setCommodityExportLicenseNumber(fieldsMap.get("EXPTLICNBR"));
		commercialInvoice.setCommercialInvoiceNumber(fieldsMap.get("CI_NBR"));
		commercialInvoice.setUom(fieldsMap.get("UNITMEAS"));
		commercialInvoice.setCountryOfManufacture(fieldsMap.get("CNTRYOFMANU"));
		commercialInvoice.setCustomDetailReportFlag(fieldsMap.get("CUSTDETAILREPFLG"));
		commercialInvoice.setExternalTransactionNumber(fieldsMap.get("XTN"));
		commercialInvoice.setCommodityExportLicenseExpiryDate(fieldsMap.get("EXPTLICEXPRDT"));
		
		return commercialInvoice;
	}

	public FIceDetails setFICEDetails(Map<String, String> fieldsMap) {

		fIceDetails.setfIceFlg(fieldsMap.get("FICEFLG"));
		fIceDetails.setfIceType(fieldsMap.get("FICETYP"));
		fIceDetails.setExpirationDate(fieldsMap.get("FICEEXPDT"));
		fIceDetails.setB13AFileOption(fieldsMap.get("B13A_FILE_OPTION"));
		fIceDetails.setFtsrExemptionNumber(fieldsMap.get("FTSREXMP"));
		fIceDetails.setfIceCodeNumber(fieldsMap.get("FICENBR"));
		fIceDetails.setForeignTradeZoneCode(fieldsMap.get("FTZCD"));
		fIceDetails.setB13AFileDetail(fieldsMap.get("B13A_FILE_DETAIL"));
		return fIceDetails;
	}

	public BsoDetails setBSODetails(Map<String, String> fieldsMap) {

		bSODetails.setName(fieldsMap.get("BRKRNM"));
		bSODetails.setAddressLine1(fieldsMap.get("BRKRADDRLN1"));
		bSODetails.setAddressLine2(fieldsMap.get("BRKRADDRLN2"));
		bSODetails.setCity(fieldsMap.get("BRKRCITYNM"));
		bSODetails.setPostalCode(fieldsMap.get("BRKRPSTLCD"));
		bSODetails.setBrokerSelectionOption(fieldsMap.get("BSOFLG"));
		bSODetails.setBrokerNumber(fieldsMap.get("BRKRIDNBR"));
		bSODetails.setCompanyName(fieldsMap.get("BRKRCONM"));
		bSODetails.setState(fieldsMap.get("BRKRSTCD"));
		bSODetails.setCountry(fieldsMap.get("BRKRCNTRYCD"));
		bSODetails.setPhoneNumber(fieldsMap.get("BRKRPHONENBR"));
		return bSODetails;
	}

	public ITARDetails setITARDetails(Map<String, String> fieldsMap) {

		iTARDetails.setInternationalTraffic(fieldsMap.get("ITARFLG"));
		iTARDetails.setItarFtsrExempt(fieldsMap.get("ITAREXMP"));
		return iTARDetails;

	}

	public BillingDetails setBillingDetails(Map<String, String> fieldsMap) {
		billingDetails.setBillingOtherDetails(setBillingOtherDetails(fieldsMap));
		billingDetails.setDutyTaxDetails(setDutyTaxDetails(fieldsMap));
		return billingDetails;
	}

	public DutyTaxDetails setDutyTaxDetails(Map<String, String> fieldsMap) {

		dutyTaxDetails.setDutyPayType(fieldsMap.get("DUTYBILLTOCD"));
		dutyTaxDetails.setDutyPayTypeAccount(fieldsMap.get("DUTYBILLACCTNBR"));

		return dutyTaxDetails;
	}

	public BillingOtherDetails setBillingOtherDetails(Map<String, String> fieldsMap) {

		billingOtherDetails.setPayorAccountNumber(fieldsMap.get("BILLACCTNBR"));
		return billingOtherDetails;
	}

	public ReturnDetails setReturnDetails(Map<String, String> fieldsMap) {
		returnDetails.setReturnAddressDetails(setReturnAddressDetails(fieldsMap));
		returnDetails.setReturnInformation(setReturnInformation(fieldsMap));
		return returnDetails;
	}

	public ReturnInformation setReturnInformation(Map<String, String> fieldsMap) {

		returnInformation.setReturnShipIndicator(fieldsMap.get("RTRNSHPIND"));
		returnInformation.setAllowReturnShipmentToBeEdited(fieldsMap.get("RTRNSHP_EDIT"));
		returnInformation.setClearanceSpecialService(fieldsMap.get("RTRN_REASON_TYPE"));
		returnInformation.setGroupIndicator(fieldsMap.get("RTRNGRPIND"));
		returnInformation.setClearanceSpecialServiceFlag(fieldsMap.get("RTRN_CLEARANCE_FLG"));

		return returnInformation;
	}

	public ReturnAddressDetails setReturnAddressDetails(Map<String, String> fieldsMap) {

		returnAddressDetails.setEmailNotifications(fieldsMap.get("RTRNEMAILTO"));
		return returnAddressDetails;
	}

	public SpecialServices setSpecialServices(Map<String, String> fieldsMap) {
		specialServices.setAlcoholDetails(setAlcoholDetails(fieldsMap));
		specialServices.setCollectOnDeliveryDetails(setCollectOnDeliveryDetails(fieldsMap));
		specialServices.setFreightDetails(setFreightDetails(fieldsMap));
		specialServices.setMiscellaneousDetails(setMiscellaneousDetails(fieldsMap));
		specialServices.setDryiceDetails(setDryiceDetails(fieldsMap));
		specialServices.setEmailNotificationDetails(setEmailNotificationDetails(fieldsMap));

		return specialServices;
	}

	public AlcoholDetails setAlcoholDetails(Map<String, String> fieldsMap) {

		alcoholDetails.setAlcoholFlag(fieldsMap.get("ALCFLG"));
		alcoholDetails.setPackagingType(fieldsMap.get("ALCPKGING"));
		alcoholDetails.setNumberOfPackages(fieldsMap.get("ALCPKGS"));
		alcoholDetails.setAlcoholType(fieldsMap.get("ALCTYP"));
		alcoholDetails.setQuantity(fieldsMap.get("ALCVOL"));
		alcoholDetails.setDangerousGoodType(fieldsMap.get("DANGGOODSFLG"));
		alcoholDetails.setSignatureRequired(fieldsMap.get("SIGNREQFLG"));
		alcoholDetails.setRecipientType(fieldsMap.get("ALCRECPTYP"));
		alcoholDetails.setShipmentLabelType(fieldsMap.get("ALCLBLTYP"));
		return alcoholDetails;
	}

	public CollectOnDeliveryDetails setCollectOnDeliveryDetails(Map<String, String> fieldsMap) {

		collectOnDeliveryDetails.setCollectOnDeliveryFlag(fieldsMap.get("CODFLG"));
		collectOnDeliveryDetails.setCollectOnDeliveryAmount(fieldsMap.get("CODAMT"));
		collectOnDeliveryDetails.setCollectOnDeliveryAirbill(fieldsMap.get("CODAB"));
		collectOnDeliveryDetails.setCharge(fieldsMap.get("CODCHG"));
		collectOnDeliveryDetails.setCollectionType(fieldsMap.get("CODCOLLTYP"));
		collectOnDeliveryDetails.setDeclaredValueFlag(fieldsMap.get("CODDVFLG"));
		collectOnDeliveryDetails.setReferenceIndicator(fieldsMap.get("CODREFIND"));
		collectOnDeliveryDetails.setScreenFlag(fieldsMap.get("CODSCRFLAG"));
		collectOnDeliveryDetails.setAddCODFreightCharges(fieldsMap.get("ADDCODCHRGFLG"));
		

		return collectOnDeliveryDetails;
	}

	public FreightDetails setFreightDetails(Map<String, String> fieldsMap) {

		freightDetails.setFreightToCollectOption(fieldsMap.get("FTC"));
		freightDetails.setFreightOnValue(fieldsMap.get("FRTVAL"));
		freightDetails.setFreightChargeAmount(fieldsMap.get("FRTAMT"));
		return freightDetails;

	}

	public MiscellaneousDetails setMiscellaneousDetails(Map<String, String> fieldsMap) {

		miscellaneousDetails.setSaturdayDelivery(fieldsMap.get("SATDELFLG"));
		miscellaneousDetails.setSaturdayPickup(fieldsMap.get("SATPUFLG"));
		miscellaneousDetails.setSaturdayDelivery(fieldsMap.get("SUNDELFLG"));
		miscellaneousDetails.setHolidayDelivery(fieldsMap.get("HOLDELFLG"));
		miscellaneousDetails.setInsidePickup(fieldsMap.get("INSIDEPUFLG"));
		miscellaneousDetails.setInsideDelivery(fieldsMap.get("INSIDEDELFLG"));
		miscellaneousDetails.setPriorityAlert(fieldsMap.get("PAFLG"));
		miscellaneousDetails.setPriorityAlertPlus(fieldsMap.get("PAPLUSFLG"));
		miscellaneousDetails.setPharmacyDeliveryIndicator(fieldsMap.get("PHDELFLG"));
		miscellaneousDetails.setSpecialDeliveryFlag(fieldsMap.get("SPLDELFLG"));
		miscellaneousDetails.setDropoff(fieldsMap.get("DROPOFFFLG"));
		miscellaneousDetails.setFutureDate(fieldsMap.get("FUTDTFLG"));
		miscellaneousDetails.setDocumentShipment(fieldsMap.get("DIAFLG"));
		miscellaneousDetails.setThirdPartyConsignee(fieldsMap.get("TPCFLG"));
		miscellaneousDetails.setNonStandardPackaging(fieldsMap.get("NSPFLG"));
		miscellaneousDetails.setPosType(fieldsMap.get("POS_TYPE"));
		miscellaneousDetails.setPodScanFlag(fieldsMap.get("POD_SCAN"));
		miscellaneousDetails.setShipPriority(fieldsMap.get("SHIPPRTY"));
		miscellaneousDetails.setGroundAccount(fieldsMap.get("FXGRDACCTNBR"));
		miscellaneousDetails.setOtherRegulatedMaterials(fieldsMap.get("ORMD"));
		miscellaneousDetails.setHazardeousMaterial(fieldsMap.get("HAZMATFLG"));
		return miscellaneousDetails;

	}

	public DryiceDetails setDryiceDetails(Map<String, String> fieldsMap) {

		dryiceDetails.setDryIce(fieldsMap.get("DRYICEFLG"));
		dryiceDetails.setDryIceUoM(fieldsMap.get("DRYICEUM"));
		dryiceDetails.setDryIceWeight(fieldsMap.get("DRYICEWGT"));
		return dryiceDetails;

	}

	public EmailNotificationDetails setEmailNotificationDetails(Map<String, String> fieldsMap) {

		emailNotificationDetails.setSenderEmail(fieldsMap.get("SHIPNOTIFEMAIL"));
		emailNotificationDetails.setShip(fieldsMap.get("SHIPNOTIFFLG"));
		emailNotificationDetails.setTendered(fieldsMap.get("TENDERNOTIFFLG"));
		emailNotificationDetails.setException(fieldsMap.get("EXCPNOTIFFLG"));
		emailNotificationDetails.setDelivery(fieldsMap.get("DELIVERNOTIFFLG"));
		emailNotificationDetails.setOtherNotificationEmail1(fieldsMap.get("OTHER1NOTIFEMAIL"));
		emailNotificationDetails.setOtherNotificationEmail2(fieldsMap.get("OTHER2NOTIFEMAIL"));
		emailNotificationDetails.setEmailExpirationDays(fieldsMap.get("EMAILEXPIRATIONDAYS"));
		return emailNotificationDetails;
	}

	public ShipmentMiscellaneousDetails setShipmentMiscellaneousDetails(Map<String, String> fieldsMap) {

		shipmentMiscellaneousDetails.setOriginLocationID(fieldsMap.get("ORIGLOCCD"));
		shipmentMiscellaneousDetails.setDestinationLocationCode(fieldsMap.get("DESTLOCCD"));
		shipmentMiscellaneousDetails.setVisaShell(fieldsMap.get("VISA_SHELL"));
		shipmentMiscellaneousDetails.setShippingPurpose(fieldsMap.get("SHIPPURPOSE"));
		shipmentMiscellaneousDetails.setRecipientDeliveryNotificationFlag(fieldsMap.get("RECDELIVERNOTIFFLG"));
		shipmentMiscellaneousDetails.setRecipientExceptionNotificationFlag(fieldsMap.get("RECEXCPNOTIFFLG"));
		shipmentMiscellaneousDetails.setRecipientShipmentNotificationFlag(fieldsMap.get("RECSHIPNOTIFFLG"));
		shipmentMiscellaneousDetails.setPaaIndicator(fieldsMap.get("PAAIND"));
		shipmentMiscellaneousDetails.setTwentyDollarSavingCertificate(fieldsMap.get("SAVECERTI"));
		shipmentMiscellaneousDetails.setLithiumBatterySpecialService(fieldsMap.get("LITBATSPSRV"));
		return shipmentMiscellaneousDetails;

	}
	public HomeDeliveryType setHomeDeliveryType(Map<String, String> fieldsMap) {

		homeDeliveryType.setHomeDeliveryType(fieldsMap.get("HMDELTYP"));
		homeDeliveryType.setHomeDeliveryPhoneNumber(fieldsMap.get("HMDELPHN"));
		return homeDeliveryType;

	}
	public SmartPostDetailsType setSmartPostDetailsType(Map<String, String> fieldsMap) {

		smartPostDetailsType.setIsThisSmartPostShipment(fieldsMap.get("SP_FLG"));
		smartPostDetailsType.setDeliveryDistributionCenter(fieldsMap.get("SP_DISTRIBUTIONCTR"));
		smartPostDetailsType.setEndorsement(fieldsMap.get("SP_ENDORSEMENT"));
		smartPostDetailsType.setHubId(fieldsMap.get("SP_HUBID"));
		smartPostDetailsType.setSmartPostGroundEnableFlag(fieldsMap.get("SP_GRND_ENABLE_FLG"));
		return smartPostDetailsType;

	}
	
	public ShipmentData setShipmentData(Map<String, String> fieldsMap,String shipmentType) {

		shipmentData.setGeneralInformation(generalInformation);
		shipmentData.setAddressDetails(setAddressDetails(fieldsMap));
		shipmentData.setShippingDetails(setShippingDetails(fieldsMap));
		shipmentData.setIpdtdDetails(setIPDTDDetails(fieldsMap));
		shipmentData.setCommercialInvoiceDetails(setCommercialInvoiceDetails(fieldsMap));
		shipmentData.setBillingDetails(setBillingDetails(fieldsMap));
		shipmentData.setReturnDetails(setReturnDetails(fieldsMap));
		shipmentData.setSpecialServices(setSpecialServices(fieldsMap));
		shipmentData.setShipmentMiscellaneousDetails(setShipmentMiscellaneousDetails(fieldsMap));
		shipmentData.setHomeDeliveryType(setHomeDeliveryType(fieldsMap));
		shipmentData.setSmartPostDetailsType(setSmartPostDetailsType(fieldsMap));
		return shipmentData;

	}
	public ShipmentRequestData setShipmentRequestData(Map<String, String> fieldsMap) {

		shipmentRequestData.setRequestedShipment(shipmentData);
		return shipmentRequestData;

	}
	
	
	public ShvsMultipleParentRequest createJsonRequestForShvs(List<Map<String, String>> parentTinsForValidation, List<Map<String, String>> childTinsForValidation, Map<String, String> meterNumbers, String shipmentType)
	{
	     	List<RequestedShipments> requestShipmentsList = new ArrayList<RequestedShipments>();
	     	
	     	for(Map<String, String> parentShipment : parentTinsForValidation){
	     		SHVSMappingServiceImpl shvsMappingServiceImpl = new SHVSMappingServiceImpl();
	     		String parentTIN = parentShipment.get("TEST_INPUT_NBR");
	     		RequestedShipments parentJsonRequest = shvsMappingServiceImpl.setRequestedShipment(parentShipment, shipmentType);
	     		parentJsonRequest.getRequestedShipment().getGeneralInformation().setMeterNumber(meterNumbers.get(parentShipment.get("TEST_INPUT_NBR")));
	     		parentJsonRequest.getRequestedShipment().getGeneralInformation().setShipmentSequenceNumber("1");
	     		
	     		List<MultipleShipmentDetails> multipleShipmentList = new ArrayList<MultipleShipmentDetails>();
	     		for(Map<String, String> childShipment : childTinsForValidation){
	     			String childTIN = childShipment.get("TEST_INPUT_NBR");
	     			if(childTIN != null && parentTIN != null && childTIN.trim().equalsIgnoreCase(parentTIN.trim())){
	     				MultipleShipmentDetails childJsonRequest = setMultipleShipmentDetails(childShipment);
	     				multipleShipmentList.add(childJsonRequest);
	     			}
	     		}
	     		MultipleShipmentDetails[] mpsDetails = new MultipleShipmentDetails[multipleShipmentList.size()];
				mpsDetails = multipleShipmentList.toArray(mpsDetails);
	     		parentJsonRequest.getRequestedShipment().getShippingDetails().setMultipleShipmentDetails(mpsDetails);
	     		
	     		requestShipmentsList.add(parentJsonRequest);
	     	}
	     	
	     	ShvsMultipleParentRequest shvsMultipleParentRequest = null;
	     	if (requestShipmentsList != null && requestShipmentsList.size() > 0) {
	     		shvsMultipleParentRequest = new ShvsMultipleParentRequest();
				RequestedShipments[] parentShvsPojos = new RequestedShipments[requestShipmentsList.size()];
				parentShvsPojos = requestShipmentsList.toArray(parentShvsPojos);
				shvsMultipleParentRequest.setRequestedShipments(parentShvsPojos);
			}
	     	return shvsMultipleParentRequest;
	     	
		
		
	}
	
}
