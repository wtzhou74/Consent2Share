/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package gov.samhsa.schemas.client;

import gov.va.ehtac.ds4p.ws.DS4PContextHandler;
import gov.va.ehtac.ds4p.ws.EnforcePolicyResponse.Return;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2012-09-19T15:30:49.499-04:00
 * Generated source version: 2.6.0
 * 
 */

@javax.jws.WebService(
                      serviceName = "DS4PContextHandler",
                      portName = "DS4PContextHandlerPort",
                      targetNamespace = "http://ws.ds4p.ehtac.va.gov/",
                      wsdlLocation = "DS4PContextHandler.wsdl",
                      endpointInterface = "gov.va.ehtac.ds4p.ws.DS4PContextHandler")
                      
public class DS4PContextHandlerImpl implements DS4PContextHandler {

    private static final Logger LOG = Logger.getLogger(DS4PContextHandlerImpl.class.getName());
    public static Return returnedValueOfEnforcePolicy;

    /* (non-Javadoc)
     * @see gov.va.ehtac.ds4p.ws.DS4PContextHandler#enforcePolicy(gov.va.ehtac.ds4p.ws.EnforcePolicy.Xspasubject  xspasubject ,)gov.va.ehtac.ds4p.ws.EnforcePolicy.Xsparesource  xsparesource )*
     */
    public gov.va.ehtac.ds4p.ws.EnforcePolicyResponse.Return enforcePolicy(gov.va.ehtac.ds4p.ws.EnforcePolicy.Xspasubject xspasubject,gov.va.ehtac.ds4p.ws.EnforcePolicy.Xsparesource xsparesource) { 
        LOG.info("Executing operation enforcePolicy");
        System.out.println(xspasubject);
        System.out.println(xsparesource);
        try {
            gov.va.ehtac.ds4p.ws.EnforcePolicyResponse.Return _return = returnedValueOfEnforcePolicy;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gov.va.ehtac.ds4p.ws.DS4PContextHandler#getAuthorizationObligations(java.lang.String  messageId )*
     */
    public gov.va.ehtac.ds4p.ws.GetAuthorizationObligationsResponse.Return getAuthorizationObligations(java.lang.String messageId) { 
        LOG.info("Executing operation getAuthorizationObligations");
        System.out.println(messageId);
        try {
            gov.va.ehtac.ds4p.ws.GetAuthorizationObligationsResponse.Return _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}

