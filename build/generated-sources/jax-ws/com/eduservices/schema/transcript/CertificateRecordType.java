
package com.eduservices.schema.transcript;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CertificateRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CertificateTitle" type="{http://eduservices.com/schema/transcript/}CertificateTitleType"/>
 *         &lt;element name="CertificateExpiration" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CertificateCode" type="{http://eduservices.com/schema/transcript/}CodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateRecordType", propOrder = {
    "certificateTitle",
    "certificateExpiration"
})
public class CertificateRecordType {

    @XmlElement(name = "CertificateTitle", required = true)
    protected String certificateTitle;
    @XmlElement(name = "CertificateExpiration", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar certificateExpiration;
    @XmlAttribute(name = "CertificateCode")
    protected String certificateCode;

    /**
     * Gets the value of the certificateTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateTitle() {
        return certificateTitle;
    }

    /**
     * Sets the value of the certificateTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateTitle(String value) {
        this.certificateTitle = value;
    }

    /**
     * Gets the value of the certificateExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCertificateExpiration() {
        return certificateExpiration;
    }

    /**
     * Sets the value of the certificateExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCertificateExpiration(XMLGregorianCalendar value) {
        this.certificateExpiration = value;
    }

    /**
     * Gets the value of the certificateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateCode() {
        return certificateCode;
    }

    /**
     * Sets the value of the certificateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateCode(String value) {
        this.certificateCode = value;
    }

}
