
package com.eduservices.schema.transcript;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.eduservices.schema.transcript package. 
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

    private final static QName _SSNumber_QNAME = new QName("http://eduservices.com/schema/transcript/", "SSNumber");
    private final static QName _Transcript_QNAME = new QName("http://eduservices.com/schema/transcript/", "Transcript");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.eduservices.schema.transcript
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TranscriptType }
     * 
     */
    public TranscriptType createTranscriptType() {
        return new TranscriptType();
    }

    /**
     * Create an instance of {@link PhoneNumbersType }
     * 
     */
    public PhoneNumbersType createPhoneNumbersType() {
        return new PhoneNumbersType();
    }

    /**
     * Create an instance of {@link CourseRecordsType }
     * 
     */
    public CourseRecordsType createCourseRecordsType() {
        return new CourseRecordsType();
    }

    /**
     * Create an instance of {@link CertificateRecordType }
     * 
     */
    public CertificateRecordType createCertificateRecordType() {
        return new CertificateRecordType();
    }

    /**
     * Create an instance of {@link StudentInfoType }
     * 
     */
    public StudentInfoType createStudentInfoType() {
        return new StudentInfoType();
    }

    /**
     * Create an instance of {@link StudentRecordsType }
     * 
     */
    public StudentRecordsType createStudentRecordsType() {
        return new StudentRecordsType();
    }

    /**
     * Create an instance of {@link AddressesType }
     * 
     */
    public AddressesType createAddressesType() {
        return new AddressesType();
    }

    /**
     * Create an instance of {@link CertificateRecordsType }
     * 
     */
    public CertificateRecordsType createCertificateRecordsType() {
        return new CertificateRecordsType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link CourseRecordType }
     * 
     */
    public CourseRecordType createCourseRecordType() {
        return new CourseRecordType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eduservices.com/schema/transcript/", name = "SSNumber")
    public JAXBElement<String> createSSNumber(String value) {
        return new JAXBElement<String>(_SSNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranscriptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eduservices.com/schema/transcript/", name = "Transcript")
    public JAXBElement<TranscriptType> createTranscript(TranscriptType value) {
        return new JAXBElement<TranscriptType>(_Transcript_QNAME, TranscriptType.class, null, value);
    }

}
