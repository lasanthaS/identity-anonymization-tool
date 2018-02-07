//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.29 at 10:53:27 AM IST 
//


package org.wso2.carbon.privacy.forgetme.logs.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pattern" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="detectPattern" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="replacePattern" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pattern"
})
@XmlRootElement(name = "patterns")
public class Patterns {

    protected List<Pattern> pattern;

    /**
     * Gets the value of the pattern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pattern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPattern().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pattern }
     * 
     * 
     */
    public List<Pattern> getPattern() {
        if (pattern == null) {
            pattern = new ArrayList<Pattern>();
        }
        return this.pattern;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="detectPattern" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="replacePattern" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "detectPattern",
        "replacePattern"
    })
    public static class Pattern {

        @XmlElement(required = true)
        protected String detectPattern;
        @XmlElement(required = true)
        protected String replacePattern;
        @XmlAttribute(name = "key")
        protected String key;

        /**
         * Gets the value of the detectPattern property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDetectPattern() {
            return detectPattern;
        }

        /**
         * Sets the value of the detectPattern property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDetectPattern(String value) {
            this.detectPattern = value;
        }

        /**
         * Gets the value of the replacePattern property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReplacePattern() {
            return replacePattern;
        }

        /**
         * Sets the value of the replacePattern property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReplacePattern(String value) {
            this.replacePattern = value;
        }

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

    }

}
