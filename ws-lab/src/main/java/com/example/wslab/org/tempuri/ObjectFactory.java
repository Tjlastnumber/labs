
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


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

    private final static QName _String_QNAME = new QName("http://tempuri.org/", "string");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChangeUserPassword }
     * 
     */
    public ChangeUserPassword createChangeUserPassword() {
        return new ChangeUserPassword();
    }

    /**
     * Create an instance of {@link ChangeUserPasswordResponse }
     * 
     */
    public ChangeUserPasswordResponse createChangeUserPasswordResponse() {
        return new ChangeUserPasswordResponse();
    }

    /**
     * Create an instance of {@link GetDepartments }
     * 
     */
    public GetDepartments createGetDepartments() {
        return new GetDepartments();
    }

    /**
     * Create an instance of {@link GetDepartmentsResponse }
     * 
     */
    public GetDepartmentsResponse createGetDepartmentsResponse() {
        return new GetDepartmentsResponse();
    }

    /**
     * Create an instance of {@link GetMembers }
     * 
     */
    public GetMembers createGetMembers() {
        return new GetMembers();
    }

    /**
     * Create an instance of {@link GetMembersResponse }
     * 
     */
    public GetMembersResponse createGetMembersResponse() {
        return new GetMembersResponse();
    }

    /**
     * Create an instance of {@link GetCourtMembers }
     * 
     */
    public GetCourtMembers createGetCourtMembers() {
        return new GetCourtMembers();
    }

    /**
     * Create an instance of {@link GetCourtMembersResponse }
     * 
     */
    public GetCourtMembersResponse createGetCourtMembersResponse() {
        return new GetCourtMembersResponse();
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

}
