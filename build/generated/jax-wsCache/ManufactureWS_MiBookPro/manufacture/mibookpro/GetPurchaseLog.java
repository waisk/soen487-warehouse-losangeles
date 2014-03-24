
package manufacture.mibookpro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPurchaseLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPurchaseLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wareHouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPurchaseLog", propOrder = {
    "wareHouseName"
})
public class GetPurchaseLog {

    protected String wareHouseName;

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

}
