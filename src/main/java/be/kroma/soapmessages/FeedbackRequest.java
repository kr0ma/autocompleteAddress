//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.17 at 01:00:20 PM CET 
//


package be.kroma.soapmessages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="auth_key" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nl_sixpp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="streetnumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "feedbackRequest")
public class FeedbackRequest {

    @XmlElement(name = "auth_key", required = true)
    protected String authKey;
    @XmlElement(name = "nl_sixpp", required = true)
    protected String nlSixpp;
    @XmlElement(required = true)
    protected String street;
    protected int streetnumber;

    /**
     * Gets the value of the authKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthKey() {
        return authKey;
    }

    /**
     * Sets the value of the authKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthKey(String value) {
        this.authKey = value;
    }

    /**
     * Gets the value of the nlSixpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNlSixpp() {
        return nlSixpp;
    }

    /**
     * Sets the value of the nlSixpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNlSixpp(String value) {
        this.nlSixpp = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the streetnumber property.
     * 
     */
    public int getStreetnumber() {
        return streetnumber;
    }

    /**
     * Sets the value of the streetnumber property.
     * 
     */
    public void setStreetnumber(int value) {
        this.streetnumber = value;
    }

}
