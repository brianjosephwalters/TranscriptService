
package com.eduservices.schema.transcript;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TranscriptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranscriptType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentInfo" type="{http://eduservices.com/schema/transcript/}StudentInfoType"/>
 *         &lt;element name="StudentRecords" type="{http://eduservices.com/schema/transcript/}StudentRecordsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranscriptType", propOrder = {
    "studentInfo",
    "studentRecords"
})
public class TranscriptType {

    @XmlElement(name = "StudentInfo", required = true)
    protected StudentInfoType studentInfo;
    @XmlElement(name = "StudentRecords", required = true)
    protected StudentRecordsType studentRecords;

    /**
     * Gets the value of the studentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StudentInfoType }
     *     
     */
    public StudentInfoType getStudentInfo() {
        return studentInfo;
    }

    /**
     * Sets the value of the studentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentInfoType }
     *     
     */
    public void setStudentInfo(StudentInfoType value) {
        this.studentInfo = value;
    }

    /**
     * Gets the value of the studentRecords property.
     * 
     * @return
     *     possible object is
     *     {@link StudentRecordsType }
     *     
     */
    public StudentRecordsType getStudentRecords() {
        return studentRecords;
    }

    /**
     * Sets the value of the studentRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentRecordsType }
     *     
     */
    public void setStudentRecords(StudentRecordsType value) {
        this.studentRecords = value;
    }

}
