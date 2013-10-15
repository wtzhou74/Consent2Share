package gov.samhsa.schemas.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import gov.samhsa.consent2share.contract.documentsegmentation.DocumentSegmentationServicePortType;
import gov.samhsa.consent2share.schema.documentsegmentation.SegmentDocumentResponse;


/**
 * This class was generated by Apache CXF 2.6.0
 * 2013-08-26T14:18:03.795-04:00
 * Generated source version: 2.6.0
 * 
 */

@javax.jws.WebService(
                      serviceName = "DocumentSegmentationService",
                      portName = "DocumentSegmentationServicePort",
                      targetNamespace = "http://www.samhsa.gov/consent2share/contract/documentsegmentation",
                      wsdlLocation = "classpath:DocumentSegmentationService.wsdl",
                      endpointInterface = "gov.samhsa.consent2share.contract.documentsegmentation.DocumentSegmentationServicePortType")
                      
public class DocumentSegmentationServicePortTypeImpl implements DocumentSegmentationServicePortType {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    public static SegmentDocumentResponse returnedValueOfProcessDocument;

    /* (non-Javadoc)
     * @see gov.samhsa.consent2share.contract.documentsegmentation.DocumentSegmentationServicePortType#segmentDocument(gov.samhsa.consent2share.schema.documentsegmentation.SegmentDocumentRequest  parameters )*
     */
    public gov.samhsa.consent2share.schema.documentsegmentation.SegmentDocumentResponse segmentDocument(gov.samhsa.consent2share.schema.documentsegmentation.SegmentDocumentRequest parameters) { 
    	logger.debug("Executing operation segmentDocument");
    	logger.debug(parameters.toString());
        try {
            gov.samhsa.consent2share.schema.documentsegmentation.SegmentDocumentResponse _return = returnedValueOfProcessDocument;
            return _return;
        } catch (java.lang.Exception ex) {
        	logger.error(ex.getMessage(),ex);
            throw new RuntimeException(ex);
        }
    }
}
