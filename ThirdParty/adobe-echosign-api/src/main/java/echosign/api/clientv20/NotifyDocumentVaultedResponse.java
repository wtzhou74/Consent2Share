
package echosign.api.clientv20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import echosign.api.clientv20.dto17.NotifyDocumentVaultedResult;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notifyDocumentVaultedResult" type="{http://dto17.api.echosign}NotifyDocumentVaultedResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "notifyDocumentVaultedResult"
})
@XmlRootElement(name = "notifyDocumentVaultedResponse")
public class NotifyDocumentVaultedResponse {

    @XmlElement(required = true, nillable = true)
    protected NotifyDocumentVaultedResult notifyDocumentVaultedResult;

    /**
     * Gets the value of the notifyDocumentVaultedResult property.
     * 
     * @return
     *     possible object is
     *     {@link NotifyDocumentVaultedResult }
     *     
     */
    public NotifyDocumentVaultedResult getNotifyDocumentVaultedResult() {
        return notifyDocumentVaultedResult;
    }

    /**
     * Sets the value of the notifyDocumentVaultedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifyDocumentVaultedResult }
     *     
     */
    public void setNotifyDocumentVaultedResult(NotifyDocumentVaultedResult value) {
        this.notifyDocumentVaultedResult = value;
    }

}
