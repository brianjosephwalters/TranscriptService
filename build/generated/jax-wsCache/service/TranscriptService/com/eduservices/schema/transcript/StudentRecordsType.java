
package com.eduservices.schema.transcript;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentRecordsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentRecordsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CourseRecords" type="{http://eduservices.com/schema/transcript/}CourseRecordsType"/>
 *         &lt;element name="CertificateRecords" type="{http://eduservices.com/schema/transcript/}CertificateRecordsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentRecordsType", propOrder = {
    "courseRecords",
    "certificateRecords"
})
public class StudentRecordsType {

    @XmlElement(name = "CourseRecords", required = true)
    protected CourseRecordsType courseRecords;
    @XmlElement(name = "CertificateRecords", required = true)
    protected CertificateRecordsType certificateRecords;

    /**
     * Gets the value of the courseRecords property.
     * 
     * @return
     *     possible object is
     *     {@link CourseRecordsType }
     *     
     */
    public CourseRecordsType getCourseRecords() {
        return courseRecords;
    }

    /**
     * Sets the value of the courseRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseRecordsType }
     *     
     */
    public void setCourseRecords(CourseRecordsType value) {
        this.courseRecords = value;
    }

    /**
     * Gets the value of the certificateRecords property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateRecordsType }
     *     
     */
    public CertificateRecordsType getCertificateRecords() {
        return certificateRecords;
    }

    /**
     * Sets the value of the certificateRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateRecordsType }
     *     
     */
    public void setCertificateRecords(CertificateRecordsType value) {
        this.certificateRecords = value;
    }

}
