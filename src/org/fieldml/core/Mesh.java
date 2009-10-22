package org.fieldml.core;

import java.util.List;


public class Mesh {

  /** 
   * @uml.property name="field"
   * @uml.associationEnd readOnly="true" multiplicity="(0 -1)" ordering="true" inverse="mesh:org.fieldml.core.Field"
   */
  public List<Field> fields = new java.util.ArrayList<Field>();

  /** 
   * Getter of the property <tt>field</tt>
   * @return  Returns the field.
   * @uml.property  name="field"
   */
  public List<Field> getFields() {
    return fields;
  }

  /**
   * @uml.property  name="element"
   * @uml.associationEnd  readOnly="true" multiplicity="(0 -1)" ordering="true" inverse="mesh:org.fieldml.core.Element"
   */
  public List<Element> elements = new java.util.ArrayList<Element>();

  /**
   * Getter of the property <tt>element</tt>
   * @return  Returns the element.
   * @uml.property  name="element"
   */
  public List<Element> getElements() {
    return elements;
  }

}
