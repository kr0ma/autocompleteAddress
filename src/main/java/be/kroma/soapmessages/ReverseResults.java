//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.17 at 01:00:20 PM CET 
//


package be.kroma.soapmessages;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReverseResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReverseResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="precision" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="province" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="municipality" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nl_fourpp" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="lng" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="nl_sixpp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="streets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReverseResults", propOrder = {

})
public class ReverseResults {

    protected int precision;
    @XmlElement(required = true)
    protected String province;
    @XmlElement(required = true)
    protected String municipality;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(name = "nl_fourpp")
    protected int nlFourpp;
    @XmlElement(required = true)
    protected BigDecimal lat;
    @XmlElement(required = true)
    protected BigDecimal lng;
    @XmlElement(name = "nl_sixpp")
    protected String nlSixpp;
    protected String streets;

    /**
     * Gets the value of the precision property.
     * 
     */
    public int getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     */
    public void setPrecision(int value) {
        this.precision = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * Gets the value of the municipality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipality() {
        return municipality;
    }

    /**
     * Sets the value of the municipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipality(String value) {
        this.municipality = value;
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
     * Gets the value of the nlFourpp property.
     * 
     */
    public int getNlFourpp() {
        return nlFourpp;
    }

    /**
     * Sets the value of the nlFourpp property.
     * 
     */
    public void setNlFourpp(int value) {
        this.nlFourpp = value;
    }

    /**
     * Gets the value of the lat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLat() {
        return lat;
    }

    /**
     * Sets the value of the lat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLat(BigDecimal value) {
        this.lat = value;
    }

    /**
     * Gets the value of the lng property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLng() {
        return lng;
    }

    /**
     * Sets the value of the lng property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLng(BigDecimal value) {
        this.lng = value;
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
     * Gets the value of the streets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreets() {
        return streets;
    }

    /**
     * Sets the value of the streets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreets(String value) {
        this.streets = value;
    }

}