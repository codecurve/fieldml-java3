package org.fieldml.mapping;

import org.fieldml.core.Field;
import org.fieldml.core.Element;
import java.util.Map;
import org.fieldml.core.Interpolator;


public class FieldElement {

  /**
   * @uml.property  name="field"
   * @uml.associationEnd  inverse="fieldElement:org.fieldml.core.Field"
   */
  private Field field;

  /**
   * Getter of the property <tt>field</tt>
   * @return  Returns the field.
   * @uml.property  name="field"
   */
  public Field getField() {
    return field;
  }

  /**
   * Setter of the property <tt>field</tt>
   * @param field  The field to set.
   * @uml.property  name="field"
   */
  public void setField(Field field) {
    this.field = field;
  }

  /**
   * @uml.property  name="element"
   * @uml.associationEnd  inverse="fieldElement:org.fieldml.core.Element"
   */
  private Element element;

  /**
   * Getter of the property <tt>element</tt>
   * @return  Returns the element.
   * @uml.property  name="element"
   */
  public Element getElement() {
    return element;
  }

  /**
   * Setter of the property <tt>element</tt>
   * @param element  The element to set.
   * @uml.property  name="element"
   */
  public void setElement(Element element) {
    this.element = element;
  }


}
