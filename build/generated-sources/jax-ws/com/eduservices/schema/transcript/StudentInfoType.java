
package com.eduservices.schema.transcript;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SSNumber" type="{http://eduservices.com/schema/transcript/}SSNumberType"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Addresses" type="{http://eduservices.com/schema/transcript/}AddressesType"/>
 *         &lt;element name="PhoneNumbers" type="{http://eduservices.com/schema/transcript/}PhoneNumbersType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentInfoType", propOrder = {
    "ssNumber",
    "firstName",
    "lastName",
    "addresses",
    "phoneNumbers"
})
public class StudentInfoType {

    @XmlElement(name = "SSNumber", required = true)
    protected String ssNumber;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "Addresses", required = true)
    protected AddressesType addresses;
    @XmlElement(name = "PhoneNumbers", required = true)
    protected PhoneNumbersType phoneNumbers;

    /**
     * Gets the value of the ssNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSNumber() {
        return ssNumber;
    }

    /**
     * Sets the value of the ssNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSNumber(String value) {
        this.ssNumber = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link AddressesType }
     *     
     */
    public AddressesType getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressesType }
     *     
     */
    public void setAddresses(AddressesType value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the phoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumbersType }
     *     
     */
    public PhoneNumbersType getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * Sets the value of the phoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumbersType }
     *     
     */
    public void setPhoneNumbers(PhoneNumbersType value) {
        this.phoneNumbers = value;
    }

}
