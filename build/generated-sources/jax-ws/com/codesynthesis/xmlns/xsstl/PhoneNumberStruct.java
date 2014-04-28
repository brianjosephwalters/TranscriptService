
package com.codesynthesis.xmlns.xsstl;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Structured full international telephone number.
 *       
 * 
 * <p>Java class for PhoneNumberStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneNumberStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="country" type="{http://www.codesynthesis.com/xmlns/xsstl}PhoneCountryCode"/>
 *         &lt;element name="area" type="{http://www.codesynthesis.com/xmlns/xsstl}PhoneAreaCode" minOccurs="0"/>
 *         &lt;element name="subscriber" type="{http://www.codesynthesis.com/xmlns/xsstl}PhoneSubscriberNumber"/>
 *         &lt;element name="extension" type="{http://www.codesynthesis.com/xmlns/xsstl}PhoneExtensionNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneNumberStruct", propOrder = {
    "country",
    "area",
    "subscriber",
    "extension"
})
public class PhoneNumberStruct {

    protected int country;
    protected Long area;
    protected long subscriber;
    protected BigInteger extension;

    /**
     * Gets the value of the country property.
     * 
     */
    public int getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     */
    public void setCountry(int value) {
        this.country = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setArea(Long value) {
        this.area = value;
    }

    /**
     * Gets the value of the subscriber property.
     * 
     */
    public long getSubscriber() {
        return subscriber;
    }

    /**
     * Sets the value of the subscriber property.
     * 
     */
    public void setSubscriber(long value) {
        this.subscriber = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExtension(BigInteger value) {
        this.extension = value;
    }

}
