package org.fieldml.core;


public class Constant implements ValueProducer {

  @Override
  public double getValue() {
    return constantValue;
  }

  @Override
  public double getValue(double[] xiVector) throws InvalidDomainException {
    throw new InvalidDomainException("Constant does not take xi values.");
  }

  /**
   * @uml.property  name="constantValue"
   */
  private double constantValue;

  /**
   * Getter of the property <tt>constantValue</tt>
   * @return  Returns the constantValue.
   * @uml.property  name="constantValue"
   */
  public double getConstantValue() {
    return constantValue;
  }

  /**
   * Setter of the property <tt>constantValue</tt>
   * @param constantValue  The constantValue to set.
   * @uml.property  name="constantValue"
   */
  public void setConstantValue(double constantValue) {
    this.constantValue = constantValue;
  }

}
