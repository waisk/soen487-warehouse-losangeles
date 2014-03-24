
package manufacture.mibookair;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for miBookAir complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="miBookAir">
 *   &lt;complexContent>
 *     &lt;extension base="{http://manufacture/}manufactureItem">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="XMLPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "miBookAir", propOrder = {
    "id",
    "xmlPath"
})
public class MiBookAir
    extends ManufactureItem
{

    protected Long id;
    @XmlElement(name = "XMLPath")
    protected String xmlPath;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the xmlPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLPath() {
        return xmlPath;
    }

    /**
     * Sets the value of the xmlPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLPath(String value) {
        this.xmlPath = value;
    }

}
