
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.storeserverlibrary.ArrayOfProductDTO;


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
 *         &lt;element name="GetProductsResult" type="{http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto}ArrayOfProductDTO" minOccurs="0"/>
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
    "getProductsResult"
})
@XmlRootElement(name = "GetProductsResponse")
public class GetProductsResponse {

    @XmlElementRef(name = "GetProductsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProductDTO> getProductsResult;

    /**
     * Gets the value of the getProductsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProductDTO> getGetProductsResult() {
        return getProductsResult;
    }

    /**
     * Sets the value of the getProductsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductDTO }{@code >}
     *     
     */
    public void setGetProductsResult(JAXBElement<ArrayOfProductDTO> value) {
        this.getProductsResult = value;
    }

}
