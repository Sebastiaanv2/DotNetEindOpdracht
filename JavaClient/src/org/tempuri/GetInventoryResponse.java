
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.storeserverlibrary.ArrayOfInventoryDTO;


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
 *         &lt;element name="GetInventoryResult" type="{http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto}ArrayOfInventoryDTO" minOccurs="0"/>
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
    "getInventoryResult"
})
@XmlRootElement(name = "GetInventoryResponse")
public class GetInventoryResponse {

    @XmlElementRef(name = "GetInventoryResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInventoryDTO> getInventoryResult;

    /**
     * Gets the value of the getInventoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventoryDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInventoryDTO> getGetInventoryResult() {
        return getInventoryResult;
    }

    /**
     * Sets the value of the getInventoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventoryDTO }{@code >}
     *     
     */
    public void setGetInventoryResult(JAXBElement<ArrayOfInventoryDTO> value) {
        this.getInventoryResult = value;
    }

}
