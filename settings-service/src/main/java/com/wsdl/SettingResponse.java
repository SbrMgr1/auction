//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.04 at 12:06:27 AM CST 
//


package com.wsdl;

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
 *       &lt;sequence&gt;
 *         &lt;element name="siteName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="loginCredit" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="auctionResetTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "siteName",
    "loginCredit",
    "auctionResetTime"
})
@XmlRootElement(name = "SettingResponse")
public class SettingResponse {

    @XmlElement(required = true)
    protected String siteName;
    protected long loginCredit;
    protected int auctionResetTime;

    /**
     * Gets the value of the siteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Sets the value of the siteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteName(String value) {
        this.siteName = value;
    }

    /**
     * Gets the value of the loginCredit property.
     * 
     */
    public long getLoginCredit() {
        return loginCredit;
    }

    /**
     * Sets the value of the loginCredit property.
     * 
     */
    public void setLoginCredit(long value) {
        this.loginCredit = value;
    }

    /**
     * Gets the value of the auctionResetTime property.
     * 
     */
    public int getAuctionResetTime() {
        return auctionResetTime;
    }

    /**
     * Sets the value of the auctionResetTime property.
     * 
     */
    public void setAuctionResetTime(int value) {
        this.auctionResetTime = value;
    }

}
