
package com.eduservices.schema.transcript;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CourseRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CourseRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CourseTitle" type="{http://eduservices.com/schema/transcript/}CourseTitleType"/>
 *         &lt;element name="CourseLevel" type="{http://eduservices.com/schema/transcript/}CourseLevelType"/>
 *         &lt;element name="CompletedDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CourseCode" type="{http://eduservices.com/schema/transcript/}CodeType" />
 *       &lt;attribute name="SectionCode" type="{http://eduservices.com/schema/transcript/}CodeType" />
 *       &lt;attribute name="Year" type="{http://www.w3.org/2001/XMLSchema}gYear" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourseRecordType", propOrder = {
    "courseTitle",
    "courseLevel",
    "completedDate",
    "score"
})
public class CourseRecordType {

    @XmlElement(name = "CourseTitle", required = true)
    protected String courseTitle;
    @XmlElement(name = "CourseLevel", required = true)
    protected String courseLevel;
    @XmlElement(name = "CompletedDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar completedDate;
    @XmlElement(name = "Score")
    protected short score;
    @XmlAttribute(name = "CourseCode")
    protected String courseCode;
    @XmlAttribute(name = "SectionCode")
    protected String sectionCode;
    @XmlAttribute(name = "Year")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar year;

    /**
     * Gets the value of the courseTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseTitle() {
        return courseTitle;
    }

    /**
     * Sets the value of the courseTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseTitle(String value) {
        this.courseTitle = value;
    }

    /**
     * Gets the value of the courseLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseLevel() {
        return courseLevel;
    }

    /**
     * Sets the value of the courseLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseLevel(String value) {
        this.courseLevel = value;
    }

    /**
     * Gets the value of the completedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletedDate() {
        return completedDate;
    }

    /**
     * Sets the value of the completedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletedDate(XMLGregorianCalendar value) {
        this.completedDate = value;
    }

    /**
     * Gets the value of the score property.
     * 
     */
    public short getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     */
    public void setScore(short value) {
        this.score = value;
    }

    /**
     * Gets the value of the courseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * Sets the value of the courseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseCode(String value) {
        this.courseCode = value;
    }

    /**
     * Gets the value of the sectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionCode() {
        return sectionCode;
    }

    /**
     * Sets the value of the sectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionCode(String value) {
        this.sectionCode = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYear(XMLGregorianCalendar value) {
        this.year = value;
    }

}
