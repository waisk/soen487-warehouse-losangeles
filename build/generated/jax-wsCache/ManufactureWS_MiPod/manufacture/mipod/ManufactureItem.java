
package manufacture.mipod;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for manufactureItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="manufactureItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="dimensionWeightFactor" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeToProduce" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "manufactureItem", propOrder = {
    "cost",
    "dimensionWeightFactor",
    "name",
    "timeToProduce"
})
@XmlSeeAlso({
    MiPod.class
})
public abstract class ManufactureItem {

    protected float cost;
    protected float dimensionWeightFactor;
    protected String name;
    protected int timeToProduce;

    /**
     * Gets the value of the cost property.
     * 
     */
    public float getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     */
    public void setCost(float value) {
        this.cost = value;
    }

    /**
     * Gets the value of the dimensionWeightFactor property.
     * 
     */
    public float getDimensionWeightFactor() {
        return dimensionWeightFactor;
    }

    /**
     * Sets the value of the dimensionWeightFactor property.
     * 
     */
    public void setDimensionWeightFactor(float value) {
        this.dimensionWeightFactor = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the timeToProduce property.
     * 
     */
    public int getTimeToProduce() {
        return timeToProduce;
    }

    /**
     * Sets the value of the timeToProduce property.
     * 
     */
    public void setTimeToProduce(int value) {
        this.timeToProduce = value;
    }

}
