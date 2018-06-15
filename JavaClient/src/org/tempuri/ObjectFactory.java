
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.storeserverlibrary.ArrayOfInventoryDTO;
import org.datacontract.schemas._2004._07.storeserverlibrary.ArrayOfProductDTO;
import org.datacontract.schemas._2004._07.storeserverlibrary.UserDTO;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _FindUserResponseFindUserResult_QNAME = new QName("http://tempuri.org/", "FindUserResult");
    private final static QName _LoginResponseLoginResult_QNAME = new QName("http://tempuri.org/", "LoginResult");
    private final static QName _GetProductsResponseGetProductsResult_QNAME = new QName("http://tempuri.org/", "GetProductsResult");
    private final static QName _GetInventoryResponseGetInventoryResult_QNAME = new QName("http://tempuri.org/", "GetInventoryResult");
    private final static QName _RegisterUsername_QNAME = new QName("http://tempuri.org/", "username");
    private final static QName _RegisterResponseRegisterResult_QNAME = new QName("http://tempuri.org/", "RegisterResult");
    private final static QName _BuyProductUser_QNAME = new QName("http://tempuri.org/", "user");
    private final static QName _LoginPassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _GetInventoryCurrentUser_QNAME = new QName("http://tempuri.org/", "currentUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuyProductResponse }
     * 
     */
    public BuyProductResponse createBuyProductResponse() {
        return new BuyProductResponse();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link BuyProduct }
     * 
     */
    public BuyProduct createBuyProduct() {
        return new BuyProduct();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link GetProducts }
     * 
     */
    public GetProducts createGetProducts() {
        return new GetProducts();
    }

    /**
     * Create an instance of {@link GetProductsResponse }
     * 
     */
    public GetProductsResponse createGetProductsResponse() {
        return new GetProductsResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link FindUser }
     * 
     */
    public FindUser createFindUser() {
        return new FindUser();
    }

    /**
     * Create an instance of {@link FindUserResponse }
     * 
     */
    public FindUserResponse createFindUserResponse() {
        return new FindUserResponse();
    }

    /**
     * Create an instance of {@link GetInventoryResponse }
     * 
     */
    public GetInventoryResponse createGetInventoryResponse() {
        return new GetInventoryResponse();
    }

    /**
     * Create an instance of {@link GetInventory }
     * 
     */
    public GetInventory createGetInventory() {
        return new GetInventory();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FindUserResult", scope = FindUserResponse.class)
    public JAXBElement<UserDTO> createFindUserResponseFindUserResult(UserDTO value) {
        return new JAXBElement<UserDTO>(_FindUserResponseFindUserResult_QNAME, UserDTO.class, FindUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LoginResult", scope = LoginResponse.class)
    public JAXBElement<UserDTO> createLoginResponseLoginResult(UserDTO value) {
        return new JAXBElement<UserDTO>(_LoginResponseLoginResult_QNAME, UserDTO.class, LoginResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetProductsResult", scope = GetProductsResponse.class)
    public JAXBElement<ArrayOfProductDTO> createGetProductsResponseGetProductsResult(ArrayOfProductDTO value) {
        return new JAXBElement<ArrayOfProductDTO>(_GetProductsResponseGetProductsResult_QNAME, ArrayOfProductDTO.class, GetProductsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetInventoryResult", scope = GetInventoryResponse.class)
    public JAXBElement<ArrayOfInventoryDTO> createGetInventoryResponseGetInventoryResult(ArrayOfInventoryDTO value) {
        return new JAXBElement<ArrayOfInventoryDTO>(_GetInventoryResponseGetInventoryResult_QNAME, ArrayOfInventoryDTO.class, GetInventoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = Register.class)
    public JAXBElement<String> createRegisterUsername(String value) {
        return new JAXBElement<String>(_RegisterUsername_QNAME, String.class, Register.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegisterResult", scope = RegisterResponse.class)
    public JAXBElement<UserDTO> createRegisterResponseRegisterResult(UserDTO value) {
        return new JAXBElement<UserDTO>(_RegisterResponseRegisterResult_QNAME, UserDTO.class, RegisterResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = BuyProduct.class)
    public JAXBElement<UserDTO> createBuyProductUser(UserDTO value) {
        return new JAXBElement<UserDTO>(_BuyProductUser_QNAME, UserDTO.class, BuyProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = Login.class)
    public JAXBElement<String> createLoginPassword(String value) {
        return new JAXBElement<String>(_LoginPassword_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = Login.class)
    public JAXBElement<String> createLoginUsername(String value) {
        return new JAXBElement<String>(_RegisterUsername_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "currentUser", scope = GetInventory.class)
    public JAXBElement<UserDTO> createGetInventoryCurrentUser(UserDTO value) {
        return new JAXBElement<UserDTO>(_GetInventoryCurrentUser_QNAME, UserDTO.class, GetInventory.class, value);
    }

}
