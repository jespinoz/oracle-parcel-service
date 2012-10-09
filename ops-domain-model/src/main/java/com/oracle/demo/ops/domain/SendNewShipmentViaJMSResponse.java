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
 * <p>Java class for SendNewShipmentViaJMSResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendNewShipmentViaJMSResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseHeader" type="{http://demo.oracle.com/ops/domain/services/common}WebServiceResponseHeaderType"/>
 *         &lt;element name="Shipment" type="{http://demo.oracle.com/ops/domain/schema/shipping}ShipmentType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendNewShipmentViaJMSResponseType", propOrder = {
    "responseHeader",
    "shipment"
})
@XmlRootElement(name = "SendNewShipmentViaJMSResponse")
public class SendNewShipmentViaJMSResponse
    implements Serializable
{

    private final static long serialVersionUID = 678L;
    @XmlElement(name = "ResponseHeader", required = true)
    protected WebServiceResponseHeader responseHeader;
    @XmlElement(name = "Shipment", required = true)
    protected Shipment shipment;

    /**
     * Gets the value of the responseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link WebServiceResponseHeader }
     *     
     */
    public WebServiceResponseHeader getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the value of the responseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebServiceResponseHeader }
     *     
     */
    public void setResponseHeader(WebServiceResponseHeader value) {
        this.responseHeader = value;
    }

    /**
     * Gets the value of the shipment property.
     * 
     * @return
     *     possible object is
     *     {@link Shipment }
     *     
     */
    public Shipment getShipment() {
        return shipment;
    }

    /**
     * Sets the value of the shipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shipment }
     *     
     */
    public void setShipment(Shipment value) {
        this.shipment = value;
    }

}
