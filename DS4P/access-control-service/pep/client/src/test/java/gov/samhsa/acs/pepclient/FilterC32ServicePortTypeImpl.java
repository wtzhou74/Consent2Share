package gov.samhsa.acs.pepclient;

import gov.samhsa.ds4ppilot.contract.pep.FilterC32ServicePortType;
import gov.samhsa.ds4ppilot.schema.pep.FilterC32Request;
import gov.samhsa.ds4ppilot.schema.pep.FilterC32Response;
import gov.samhsa.ds4ppilot.schema.pep.RegisteryStoredQueryRequest;
import gov.samhsa.ds4ppilot.schema.pep.RegisteryStoredQueryResponse;
import gov.samhsa.ds4ppilot.schema.pep.RetrieveDocumentSetRequest;
import gov.samhsa.ds4ppilot.schema.pep.RetrieveDocumentSetResponse;

import java.util.logging.Logger;

import javax.jws.WebService;

/**
 * This class was generated by Apache CXF 2.7.6 2013-11-15T14:57:25.401-05:00
 * Generated source version: 2.7.6
 * 
 */

@WebService(serviceName = "FilterC32Service", portName = "FilterC32Port", targetNamespace = "http://www.samhsa.gov/ds4ppilot/contract/pep", wsdlLocation = "classpath:FilterC32Service.wsdl", endpointInterface = "gov.samhsa.ds4ppilot.contract.pep.FilterC32ServicePortType")
public class FilterC32ServicePortTypeImpl implements FilterC32ServicePortType {

	public static RetrieveDocumentSetResponse returnedValueOfRetrieveDocumentSet = null;
	public static RegisteryStoredQueryResponse returnedValueOfRegisteryStoredQuery = null;
	public static FilterC32Response returnedValueOfFilterC32 = null;
	
	private static final Logger LOG = Logger
			.getLogger(FilterC32ServicePortTypeImpl.class.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see gov.samhsa.ds4ppilot.contract.pep.FilterC32ServicePortType#
	 * retrieveDocumentSet
	 * (gov.samhsa.ds4ppilot.schema.pep.RetrieveDocumentSetRequest parameters )*
	 */
	public RetrieveDocumentSetResponse retrieveDocumentSet(
			RetrieveDocumentSetRequest parameters) {
		LOG.info("Executing operation retrieveDocumentSet");
		System.out.println(parameters);
		try {
			RetrieveDocumentSetResponse _return = returnedValueOfRetrieveDocumentSet;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see gov.samhsa.ds4ppilot.contract.pep.FilterC32ServicePortType#
	 * registeryStoredQuery
	 * (gov.samhsa.ds4ppilot.schema.pep.RegisteryStoredQueryRequest parameters
	 * )*
	 */
	public RegisteryStoredQueryResponse registeryStoredQuery(
			RegisteryStoredQueryRequest parameters) {
		LOG.info("Executing operation registeryStoredQuery");
		System.out.println(parameters);
		try {
			RegisteryStoredQueryResponse _return = returnedValueOfRegisteryStoredQuery;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * gov.samhsa.ds4ppilot.contract.pep.FilterC32ServicePortType#filterC32(
	 * gov.samhsa.ds4ppilot.schema.pep.FilterC32Request parameters )*
	 */
	public FilterC32Response filterC32(
			FilterC32Request parameters) {
		LOG.info("Executing operation filterC32");
		System.out.println(parameters);
		try {
			FilterC32Response _return = returnedValueOfFilterC32;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}
}
