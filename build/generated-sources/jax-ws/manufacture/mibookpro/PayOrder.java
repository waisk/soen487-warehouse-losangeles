
package manufacture.mibookpro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wareHouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payOrder", propOrder = {
    "wareHouseName",
    "customerRef"
})
public class PayOrder {

    protected String wareHouseName;
    protected String customerRef;

    /**
     * Gets the value of the wareHouseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWareHouseName() {
        return wareHouseName;
    }

    /**
     * Sets the value of the wareHouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWareHouseName(String value) {
        this.wareHouseName = value;
    }

    /**
     * Gets the value of the customerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerRef() {
        return customerRef;
    }

    /**
     * Sets the value of the customerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerRef(String value) {
        this.customerRef = value;
    }

}
