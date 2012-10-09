//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.09 at 02:50:05 PM PDT 
//


package com.oracle.demo.ops.domain;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebServiceResponseHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebServiceResponseHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestHeader" type="{http://demo.oracle.com/ops/domain/services/common}WebServiceRequestHeaderType" minOccurs="0"/>
 *         &lt;element name="TxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestSuccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebServiceResponseHeaderType", namespace = "http://demo.oracle.com/ops/domain/services/common", propOrder = {
    "requestHeader",
    "txId",
    "requestSuccess",
    "responseMessage"
})
@XmlRootElement(name = "WebServiceResponseHeader", namespace = "http://demo.oracle.com/ops/domain/services/common")
public class WebServiceResponseHeader
    implements Serializable
{

    private final static long serialVersionUID = 678L;
    @XmlElement(name = "RequestHeader")
    protected WebServiceRequestHeader requestHeader;
    @XmlElement(name = "TxId")
    protected String txId;
    @XmlElement(name = "RequestSuccess")
    protected String requestSuccess;
    @XmlElement(name = "ResponseMessage")
    protected String responseMessage;

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link WebServiceRequestHeader }
     *     
     */
    public WebServiceRequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebServiceRequestHeader }
     *     
     */
    public void setRequestHeader(WebServiceRequestHeader value) {
        this.requestHeader = value;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxId(String value) {
        this.txId = value;
    }

    /**
     * Gets the value of the requestSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestSuccess() {
        return requestSuccess;
    }

    /**
     * Sets the value of the requestSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestSuccess(String value) {
        this.requestSuccess = value;
    }

    /**
     * Gets the value of the responseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     * Sets the value of the responseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseMessage(String value) {
        this.responseMessage = value;
    }

}
