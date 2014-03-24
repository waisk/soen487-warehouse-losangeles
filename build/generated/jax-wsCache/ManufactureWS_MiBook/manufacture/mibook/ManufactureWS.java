
package manufacture.mibook;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ManufactureWS", targetNamespace = "http://manufacture/", wsdlLocation = "http://54.186.198.75:8080/ManufactureWS/ManufactureWS_MiBook?wsdl")
public class ManufactureWS
    extends Service
{

    private final static URL MANUFACTUREWS_WSDL_LOCATION;
    private final static WebServiceException MANUFACTUREWS_EXCEPTION;
    private final static QName MANUFACTUREWS_QNAME = new QName("http://manufacture/", "ManufactureWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://54.186.198.75:8080/ManufactureWS/ManufactureWS_MiBook?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MANUFACTUREWS_WSDL_LOCATION = url;
        MANUFACTUREWS_EXCEPTION = e;
    }

    public ManufactureWS() {
        super(__getWsdlLocation(), MANUFACTUREWS_QNAME);
    }

    public ManufactureWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), MANUFACTUREWS_QNAME, features);
    }

    public ManufactureWS(URL wsdlLocation) {
        super(wsdlLocation, MANUFACTUREWS_QNAME);
    }

    public ManufactureWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MANUFACTUREWS_QNAME, features);
    }

    public ManufactureWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ManufactureWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ManufactureWSMiBook
     */
    @WebEndpoint(name = "ManufactureWS_MiBookPort")
    public ManufactureWSMiBook getManufactureWSMiBookPort() {
        return super.getPort(new QName("http://manufacture/", "ManufactureWS_MiBookPort"), ManufactureWSMiBook.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ManufactureWSMiBook
     */
    @WebEndpoint(name = "ManufactureWS_MiBookPort")
    public ManufactureWSMiBook getManufactureWSMiBookPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://manufacture/", "ManufactureWS_MiBookPort"), ManufactureWSMiBook.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MANUFACTUREWS_EXCEPTION!= null) {
            throw MANUFACTUREWS_EXCEPTION;
        }
        return MANUFACTUREWS_WSDL_LOCATION;
    }

}
