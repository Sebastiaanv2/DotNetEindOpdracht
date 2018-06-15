
package org.datacontract.schemas._2004._07.storeserverlibrary;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInventoryDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInventoryDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InventoryDTO" type="{http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto}InventoryDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInventoryDTO", propOrder = {
    "inventoryDTO"
})
public class ArrayOfInventoryDTO {

    @XmlElement(name = "InventoryDTO", nillable = true)
    protected List<InventoryDTO> inventoryDTO;

    /**
     * Gets the value of the inventoryDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryDTO }
     * 
     * 
     */
    public List<InventoryDTO> getInventoryDTO() {
        if (inventoryDTO == null) {
            inventoryDTO = new ArrayList<InventoryDTO>();
        }
        return this.inventoryDTO;
    }

}
