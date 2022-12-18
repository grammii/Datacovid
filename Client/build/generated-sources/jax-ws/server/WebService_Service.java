
package server;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WebService", targetNamespace = "http://Server/", wsdlLocation = "http://localhost:8080/Server/WebService?WSDL")
public class WebService_Service
    extends Service
{

    private final static URL WEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException WEBSERVICE_EXCEPTION;
    private final static QName WEBSERVICE_QNAME = new QName("http://Server/", "WebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Server/WebService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVICE_WSDL_LOCATION = url;
        WEBSERVICE_EXCEPTION = e;
    }

    public WebService_Service() {
        super(__getWsdlLocation(), WEBSERVICE_QNAME);
    }

    public WebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVICE_QNAME, features);
    }

    public WebService_Service(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVICE_QNAME);
    }

    public WebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVICE_QNAME, features);
    }

    public WebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebService
     */
    @WebEndpoint(name = "WebServicePort")
    public WebService getWebServicePort() {
        return super.getPort(new QName("http://Server/", "WebServicePort"), WebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebService
     */
    @WebEndpoint(name = "WebServicePort")
    public WebService getWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Server/", "WebServicePort"), WebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVICE_EXCEPTION!= null) {
            throw WEBSERVICE_EXCEPTION;
        }
        return WEBSERVICE_WSDL_LOCATION;
    }

}