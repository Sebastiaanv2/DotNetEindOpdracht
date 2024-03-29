
package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "StoreService", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://localhost:8733/Design_Time_Addresses/StoreServerLibrary/StoreService/?wsdl")
public class StoreService
    extends Service
{

    private final static URL STORESERVICE_WSDL_LOCATION;
    private final static WebServiceException STORESERVICE_EXCEPTION;
    private final static QName STORESERVICE_QNAME = new QName("http://tempuri.org/", "StoreService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8733/Design_Time_Addresses/StoreServerLibrary/StoreService/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STORESERVICE_WSDL_LOCATION = url;
        STORESERVICE_EXCEPTION = e;
    }

    public StoreService() {
        super(__getWsdlLocation(), STORESERVICE_QNAME);
    }

    public StoreService(WebServiceFeature... features) {
        super(__getWsdlLocation(), STORESERVICE_QNAME, features);
    }

    public StoreService(URL wsdlLocation) {
        super(wsdlLocation, STORESERVICE_QNAME);
    }

    public StoreService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STORESERVICE_QNAME, features);
    }

    public StoreService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StoreService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IStoreService
     */
    @WebEndpoint(name = "BasicHttpBinding_IStoreService")
    public IStoreService getBasicHttpBindingIStoreService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IStoreService"), IStoreService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IStoreService
     */
    @WebEndpoint(name = "BasicHttpBinding_IStoreService")
    public IStoreService getBasicHttpBindingIStoreService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IStoreService"), IStoreService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STORESERVICE_EXCEPTION!= null) {
            throw STORESERVICE_EXCEPTION;
        }
        return STORESERVICE_WSDL_LOCATION;
    }

}
