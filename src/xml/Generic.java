//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.12-b141219.1637 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.28 at 08:10:32 PM EST 
//


package xml;

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
 *         &lt;element ref="{}windowSize"/&gt;
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
    "windowSize"
})
@XmlRootElement(name = "generic")
public class Generic {

    @XmlElement(required = true)
    protected WindowSize windowSize;

    /**
     * Gets the value of the windowSize property.
     * 
     * @return
     *     possible object is
     *     {@link WindowSize }
     *     
     */
    public WindowSize getWindowSize() {
        return windowSize;
    }

    /**
     * Sets the value of the windowSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindowSize }
     *     
     */
    public void setWindowSize(WindowSize value) {
        this.windowSize = value;
    }

}
