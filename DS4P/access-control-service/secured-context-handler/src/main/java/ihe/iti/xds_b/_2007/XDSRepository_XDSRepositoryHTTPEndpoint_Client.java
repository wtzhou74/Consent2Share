
package ihe.iti.xds_b._2007;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import org.tempuri.DocumentRepositoryService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2012-12-04T11:19:24.221-07:00
 * Generated source version: 2.6.0
 * 
 */
public final class XDSRepository_XDSRepositoryHTTPEndpoint_Client {

    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "DocumentRepositoryService");

    private XDSRepository_XDSRepositoryHTTPEndpoint_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = DocumentRepositoryService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        DocumentRepositoryService ss = new DocumentRepositoryService(wsdlURL, SERVICE_NAME);
        XDSRepository port = ss.getXDSRepositoryHTTPEndpoint();  
        
        {
        System.out.println("Invoking retrieveDocumentSet...");
        ihe.iti.xds_b._2007.RetrieveDocumentSetRequest _retrieveDocumentSet_input = null;
        ihe.iti.xds_b._2007.RetrieveDocumentSetResponse _retrieveDocumentSet__return = port.retrieveDocumentSet(_retrieveDocumentSet_input);
        System.out.println("retrieveDocumentSet.result=" + _retrieveDocumentSet__return);


        }
        {
        System.out.println("Invoking provideAndRegisterDocumentSet...");
        ihe.iti.xds_b._2007.ProvideAndRegisterDocumentSetRequest _provideAndRegisterDocumentSet_input = null;
        ihe.iti.xds_b._2007.ProvideAndRegisterDocumentSetResponse _provideAndRegisterDocumentSet__return = port.provideAndRegisterDocumentSet(_provideAndRegisterDocumentSet_input);
        System.out.println("provideAndRegisterDocumentSet.result=" + _provideAndRegisterDocumentSet__return);


        }

        System.exit(0);
    }

}
