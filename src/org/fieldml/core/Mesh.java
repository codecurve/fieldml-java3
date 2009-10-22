package org.fieldml.core;

import java.util.List;


public class Mesh {

  /** 
   * @uml.property name="field"
   * @uml.associationEnd readOnly="true" multiplicity="(0 -1)" ordering="true" inverse="mesh:org.fieldml.core.Field"
   */
  private List field = new java.util.ArrayList();

  /** 
   * Getter of the property <tt>field</tt>
   * @return  Returns the field.
   * @uml.property  name="field"
   */
  public List getField() {
    return field;
  }

  /**
   * @uml.property  name="element"
   * @uml.associationEnd  readOnly="true" multiplicity="(0 -1)" ordering="true" inverse="mesh:org.fieldml.core.Element"
   */
  private List element = new java.util.ArrayList();

  /**
   * Getter of the property <tt>element</tt>
   * @return  Returns the element.
   * @uml.property  name="element"
   */
  public List getElement() {
    return element;
  }

}
