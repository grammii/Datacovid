
package server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server package. 
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

    private final static QName _Findbyear_QNAME = new QName("http://Server/", "Findbyear");
    private final static QName _Datacovid_QNAME = new QName("http://Server/", "datacovid");
    private final static QName _FindbyearResponse_QNAME = new QName("http://Server/", "FindbyearResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Datacovid }
     * 
     */
    public Datacovid createDatacovid() {
        return new Datacovid();
    }

    /**
     * Create an instance of {@link Findbyear }
     * 
     */
    public Findbyear createFindbyear() {
        return new Findbyear();
    }

    /**
     * Create an instance of {@link FindbyearResponse }
     * 
     */
    public FindbyearResponse createFindbyearResponse() {
        return new FindbyearResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Findbyear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "Findbyear")
    public JAXBElement<Findbyear> createFindbyear(Findbyear value) {
        return new JAXBElement<Findbyear>(_Findbyear_QNAME, Findbyear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Datacovid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "datacovid")
    public JAXBElement<Datacovid> createDatacovid(Datacovid value) {
        return new JAXBElement<Datacovid>(_Datacovid_QNAME, Datacovid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindbyearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "FindbyearResponse")
    public JAXBElement<FindbyearResponse> createFindbyearResponse(FindbyearResponse value) {
        return new JAXBElement<FindbyearResponse>(_FindbyearResponse_QNAME, FindbyearResponse.class, null, value);
    }

}
