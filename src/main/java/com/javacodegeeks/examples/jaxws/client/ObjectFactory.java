
package com.javacodegeeks.examples.jaxws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.javacodegeeks.examples.jaxws.client package. 
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

    private final static QName _ChangeMessageResponse_QNAME = new QName("http://service.jaxws.examples.javacodegeeks.com/", "changeMessageResponse");
    private final static QName _ChangeMessage_QNAME = new QName("http://service.jaxws.examples.javacodegeeks.com/", "changeMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.javacodegeeks.examples.jaxws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChangeMessage_Type }
     * 
     */
    public ChangeMessage_Type createChangeMessage_Type() {
        return new ChangeMessage_Type();
    }

    /**
     * Create an instance of {@link TestMessage }
     * 
     */
    public TestMessage createTestMessage() {
        return new TestMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jaxws.examples.javacodegeeks.com/", name = "changeMessageResponse")
    public JAXBElement<TestMessage> createChangeMessageResponse(TestMessage value) {
        return new JAXBElement<TestMessage>(_ChangeMessageResponse_QNAME, TestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeMessage_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jaxws.examples.javacodegeeks.com/", name = "changeMessage")
    public JAXBElement<ChangeMessage_Type> createChangeMessage(ChangeMessage_Type value) {
        return new JAXBElement<ChangeMessage_Type>(_ChangeMessage_QNAME, ChangeMessage_Type.class, null, value);
    }

}
