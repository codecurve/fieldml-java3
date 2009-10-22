package org.fieldml.core.interpolation.types;

import org.fieldml.core.Interpolator;
import org.fieldml.core.InvalidDomainException;
import org.fieldml.core.Parameter;



public class LinearLagrangeInterpolator_1D extends Interpolator {

  @Override
  public double getValue() throws InvalidDomainException {
    throw new InvalidDomainException("LinearLagrangeInterpolator requires xi1.");
  }

  @Override
  public double getValue(double[] xiVector) throws InvalidDomainException {
    if(xiVector.length != 1) {
      throw new InvalidDomainException("Linear Lagrange 1D requires xi1.");
    }
    
    double xi1 = xiVector[0];
    
    if(xi1 < 0 || xi1 > 1){
      throw new InvalidDomainException("Linear Lagrange 1D expects xi1 in interval [0,1].");
    }
    
    return phi1(xi1) * u1.getValue() + phi2(xi1) * u2.getValue();
  }


  private static double phi1(double xi1) {
    // TODO Should move phi evaluations such that if same xi values are used for multiple fields, phi calc can be reused.
    return 1-xi1;
  }

  private static double phi2(double xi1) {
    return xi2;
  }


  /**
   * @uml.property  name="u1"
   */
  private Parameter u1;

  /**
   * Getter of the property <tt>u1</tt>
   * @return  Returns the u1.
   * @uml.property  name="u1"
   */
  public Parameter getU1() {
    return u1;
  }

  /**
   * Setter of the property <tt>u1</tt>
   * @param u1  The u1 to set.
   * @uml.property  name="u1"
   */
  public void setU1(Parameter u1) {
    this.u1 = u1;
  }


  /**
   * @uml.property  name="u2"
   */
  private Parameter u2;

  /**
   * Getter of the property <tt>u2</tt>
   * @return  Returns the u2.
   * @uml.property  name="u2"
   */
  public Parameter getU2() {
    return u2;
  }

  /**
   * Setter of the property <tt>u2</tt>
   * @param u2  The u2 to set.
   * @uml.property  name="u2"
   */
  public void setU2(Parameter u2) {
    this.u2 = u2;
  }
  
  
  

}
