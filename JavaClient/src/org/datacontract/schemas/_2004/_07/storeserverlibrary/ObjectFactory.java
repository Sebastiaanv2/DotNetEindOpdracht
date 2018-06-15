
package org.datacontract.schemas._2004._07.storeserverlibrary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.storeserverlibrary package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfInventoryDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto", "ArrayOfInventoryDTO");
    private final static QName _ArrayOfProductDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto", "ArrayOfProductDTO");
    private final static QName _InventoryDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto", "InventoryDTO");
    private final static QName _UserDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto", "UserDTO");
    private final static QName _ProductDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto", "ProductDTO");
    private final static QName _InventoryDTOProduct_QNAME = new QName("http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto", "product");
    private final static QName _ProductDTOName_QNAME = new QName("http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto", "name");
    private final static QName _UserDTOUsername_QNAME = new QName("http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto", "username");
    private final static QName _UserDTOInventory_QNAME = new QName("http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto", "inventory");
    private final static QName _UserDTOPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto", "password");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.storeserverlibrary
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserDTO }
     * 
     */
    public UserDTO createUserDTO() {
        return new UserDTO();
    }

    /**
     * Create an instance of {@link ArrayOfProductDTO }
     * 
     */
    public ArrayOfProductDTO createArrayOfProductDTO() {
        return new ArrayOfProductDTO();
    }

    /**
     * Create an instance of {@link ArrayOfInventoryDTO }
     * 
     */
    public ArrayOfInventoryDTO createArrayOfInventoryDTO() {
        return new ArrayOfInventoryDTO();
    }

    /**
     * Create an instance of {@link InventoryDTO }
     * 
     */
    public InventoryDTO createInventoryDTO() {
        return new InventoryDTO();
    }

    /**
     * Create an instance of {@link ProductDTO }
     * 
     */
    public ProductDTO createProductDTO() {
        return new ProductDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto", name = "ArrayOfInventoryDTO")
    public JAXBElement<ArrayOfInventoryDTO> createArrayOfInventoryDTO(ArrayOfInventoryDTO value) {
        return new JAXBElement<ArrayOfInventoryDTO>(_ArrayOfInventoryDTO_QNAME, ArrayOfInventoryDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto", name = "ArrayOfProductDTO")
    public JAXBElement<ArrayOfProductDTO> createArrayOfProductDTO(ArrayOfProductDTO value) {
        return new JAXBElement<ArrayOfProductDTO>(_ArrayOfProductDTO_QNAME, ArrayOfProductDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto", name = "InventoryDTO")
    public JAXBElement<InventoryDTO> createInventoryDTO(InventoryDTO value) {
        return new JAXBElement<InventoryDTO>(_InventoryDTO_QNAME, InventoryDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto", name = "UserDTO")
    public JAXBElement<UserDTO> createUserDTO(UserDTO value) {
        return new JAXBElement<UserDTO>(_UserDTO_QNAME, UserDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto", name = "ProductDTO")
    public JAXBElement<ProductDTO> createProductDTO(ProductDTO value) {
        return new JAXBElement<ProductDTO>(_ProductDTO_QNAME, ProductDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto", name = "product", scope = InventoryDTO.class)
    public JAXBElement<ProductDTO> createInventoryDTOProduct(ProductDTO value) {
        return new JAXBElement<ProductDTO>(_InventoryDTOProduct_QNAME, ProductDTO.class, InventoryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto", name = "name", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTOName(String value) {
        return new JAXBElement<String>(_ProductDTOName_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto", name = "username", scope = UserDTO.class)
    public JAXBElement<String> createUserDTOUsername(String value) {
        return new JAXBElement<String>(_UserDTOUsername_QNAME, String.class, UserDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto", name = "inventory", scope = UserDTO.class)
    public JAXBElement<ArrayOfInventoryDTO> createUserDTOInventory(ArrayOfInventoryDTO value) {
        return new JAXBElement<ArrayOfInventoryDTO>(_UserDTOInventory_QNAME, ArrayOfInventoryDTO.class, UserDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StoreServerLibrary.dto", name = "password", scope = UserDTO.class)
    public JAXBElement<String> createUserDTOPassword(String value) {
        return new JAXBElement<String>(_UserDTOPassword_QNAME, String.class, UserDTO.class, value);
    }

}
