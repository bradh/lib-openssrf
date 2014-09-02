/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package us.gov.dod.standard.ssrf._3_0;

import us.gov.dod.standard.ssrf._3_0.datatype.TSN5_2;
import us.gov.dod.standard.ssrf._3_0.datatype.TFreqM;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCBO;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN5_2;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for AntGain complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <pre>
 * &lt;complexType name="AntGain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Calculated" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="Gain" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSN5_2"/>
 *         &lt;element name="Freq" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="FrontToBackRatio" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN5_2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntGain", propOrder = {
  "calculated",
  "gain",
  "freq",
  "frontToBackRatio"
})
public class AntGain {

  @XmlElementRef(name = "Calculated", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> calculated;
  @XmlElement(name = "Gain", required = true)
  protected TSN5_2 gain;
  @XmlElementRef(name = "Freq", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> freq;
  @XmlElementRef(name = "FrontToBackRatio", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN5_2> frontToBackRatio;

  /**
   * Gets the value of the calculated property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getCalculated() {
    return calculated;
  }

  /**
   * Sets the value of the calculated property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setCalculated(JAXBElement<TListCBO> value) {
    this.calculated = value;
  }

  /**
   * Gets the value of the gain property.
   * <p>
   * @return possible object is {@link TSN5_2 }
   * <p>
   */
  public TSN5_2 getGain() {
    return gain;
  }

  /**
   * Sets the value of the gain property.
   * <p>
   * @param value allowed object is {@link TSN5_2 }
   * <p>
   */
  public void setGain(TSN5_2 value) {
    this.gain = value;
  }

  /**
   * Gets the value of the freq property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getFreq() {
    return freq;
  }

  /**
   * Sets the value of the freq property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setFreq(JAXBElement<TFreqM> value) {
    this.freq = value;
  }

  /**
   * Gets the value of the frontToBackRatio property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN5_2 }{@code >}
   * <p>
   */
  public JAXBElement<TUN5_2> getFrontToBackRatio() {
    return frontToBackRatio;
  }

  /**
   * Sets the value of the frontToBackRatio property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN5_2 }{@code >}
   * <p>
   */
  public void setFrontToBackRatio(JAXBElement<TUN5_2> value) {
    this.frontToBackRatio = value;
  }

}
