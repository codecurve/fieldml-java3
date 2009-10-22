package org.fieldml.core.parameter.types;

import org.fieldml.core.Parameter;


public class ParamFromArrayByIndex implements Parameter {

  @Override
  public double getValue() {
    return array[arrayIndex];
  }

  /**
   * @uml.property  name="array[]"
   */
  private double array[];

  /**
   * Getter of the property <tt>array</tt>
   * @return  Returns the array.
   * @uml.property  name="array[]"
   */
  public double[] getArray() {
    return array;
  }

  /**
   * Setter of the property <tt>array</tt>
   * @param array  The array to set.
   * @uml.property  name="array[]"
   */
  public void setArray(double array[]) {
    this.array = array;
  }

  /**
   * @uml.property  name="arrayIndex"
   */
  private int arrayIndex;

  /**
   * Getter of the property <tt>arrayIndex</tt>
   * @return  Returns the arrayIndex.
   * @uml.property  name="arrayIndex"
   */
  public int getArrayIndex() {
    return arrayIndex;
  }

  /**
   * Setter of the property <tt>arrayIndex</tt>
   * @param arrayIndex  The arrayIndex to set.
   * @uml.property  name="arrayIndex"
   */
  public void setArrayIndex(int arrayIndex) {
    this.arrayIndex = arrayIndex;
  }

}
