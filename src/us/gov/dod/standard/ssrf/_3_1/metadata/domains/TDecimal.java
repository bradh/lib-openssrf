/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
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
package us.gov.dod.standard.ssrf._3_1.metadata.domains;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import us.gov.dod.standard.ssrf.AMetadata;

/**
 * A Numeric Decimal instance with SSRF Standard Metadata Attributes. This
 * corresponds to the "xs:decimal" number type.
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/29/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDecimal")
public class TDecimal extends AMetadata<TDecimal> implements IMetadataType {

  /**
   * The value to which the metadata attributes are associated.
   */
  @XmlValue
  protected BigDecimal value;

  /**
   * Construct a new data type instance with the indicated value.
   * <p>
   * @param value the value
   */
  public TDecimal(BigDecimal value) {
    this.value = value;
  }

  /**
   * Construct a new data type instance with the indicated value.
   * <p>
   * @param value the value
   */
  public TDecimal(Double value) {
    this.value = value != null ? BigDecimal.valueOf(value) : null;
  }

  /**
   * Gets the value of the value property.
   * <p>
   * @return
   */
  @Override
  public BigDecimal getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   * <p>
   * @param value
   */
  public void setValue(BigDecimal value) {
    this.value = value;
  }

  /**
   * Determine if the Value is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetValue() {
    return (this.value != null);
  }

  @Override
  public String toString() {
    return value != null ? value.toString() : null;
  }
}