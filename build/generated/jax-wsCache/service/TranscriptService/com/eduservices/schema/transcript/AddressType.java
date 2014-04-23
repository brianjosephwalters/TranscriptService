
package com.eduservices.schema.transcript;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressCode" type="{http://eduservices.com/schema/transcript/}CodeType"/>
 *         &lt;element name="AddressType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FirstLine" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SecondLine" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "addressCode",
    "addressType",
    "firstLine",
    "secondLine",
    "city",
    "zipCode"
})
public class AddressType {

    @XmlElement(name = "AddressCode", required = true)
    protected String addressCode;
    @XmlElement(name = "AddressType", required = true)
    protected String addressType;
    @XmlElement(name = "FirstLine", required = true)
    protected String firstLine;
    @XmlElement(name = "SecondLine", required = true)
    protected String secondLine;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "ZipCode", required = true)
    protected String zipCode;

    /**
     * Gets the value of the addressCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCode() {
        return addressCode;
    }

    /**
     * Sets the value of the addressCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCode(String value) {
        this.addressCode = value;
    }

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the firstLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstLine() {
        return firstLine;
    }

    /**
     * Sets the value of the firstLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstLine(String value) {
        this.firstLine = value;
    }

    /**
     * Gets the value of the secondLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondLine() {
        return secondLine;
    }

    /**
     * Sets the value of the secondLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondLine(String value) {
        this.secondLine = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

}
