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
package us.gov.dod.standard.ssrf._3_1.multiple;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * TxAntModeRef contains references to the Antenna and its AntMode, used to
 * construct a Transmitter Configuration.
 * <p>
 * Element of {@link TxRef}
 * <p>
 * Example:
 * <pre>
 * &lt;TxAntModeRef&gt;
 *   &lt;Serial cls="U"&gt;USA:NTIA:AN:123&lt;/Serial&gt;
 *   &lt;ModeID cls="U"&gt;TRACKING&lt;/ModeID&gt;
 *   &lt;SpectralPowerDensity cls="U"&gt;15&lt;/SpectralPowerDensity&gt;
 * &lt;/TxAntModeRef&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxAntModeRef", propOrder = {
  "spectralPowerDensity"
})
public class TxAntModeRef
  extends RxAntModeRef {

  /**
   * SpectralPowerDensity - Spectral Power Density (Optional)
   * <p>
   * The maximum spectral power density supplied to the input of the antenna.
   * <p>
   * Format is SN(6,3) (dBW/Hz)
   */
  @XmlElement(name = "SpectralPowerDensity", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBWHZ.class)
  private TDecimal spectralPowerDensity;

  /**
   * Get the maximum spectral power density supplied to the input of the
   * antenna.
   * <p>
   * @return the SpectralPowerDensity value in a {@link TDecimal} data type
   */
  public TDecimal getSpectralPowerDensity() {
    return spectralPowerDensity;
  }

  /**
   * Set the maximum spectral power density supplied to the input of the
   * antenna.
   * <p>
   * @param value the SpectralPowerDensity value in a {@link TDecimal} data type
   */
  public void setSpectralPowerDensity(TDecimal value) {
    this.spectralPowerDensity = value;
  }

  /**
   * Determine if the SpectralPowerDensity is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSpectralPowerDensity() {
    return (this.spectralPowerDensity != null ? this.spectralPowerDensity.isSetValue() : false);
  }

  /**
   * Set the maximum spectral power density supplied to the input of the
   * antenna.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxAntModeRef object instance
   */
  public TxAntModeRef withSpectralPowerDensity(Double value) {
    setSpectralPowerDensity(new TDecimal(value));
    return this;
  }

  /**
   * Get a string representation of this TxAntModeRef instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "TxAntModeRef {"
      + " spectralPowerDensity [" + spectralPowerDensity + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TxAntModeRef} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}