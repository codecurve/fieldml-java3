package org.fieldml.examples;

import java.util.List;

import junit.framework.TestCase;

import org.fieldml.core.Element;
import org.fieldml.core.Field;
import org.fieldml.core.Interpolator;
import org.fieldml.core.Mesh;
import org.fieldml.core.interpolation.types.LinearLagrangeInterpolator_1D;
import org.fieldml.mapping.FieldElement;
import org.fieldml.mapping.Map_FieldElement_to_ValueProducer;

public class Test1 extends TestCase {
  public void testTest1a() {
    Mesh mesh = new Mesh();

    Field field1 = new Field();
    field1.setName("u");
    mesh.getFields().add(field1);

    List<Element> elements = mesh.getElements();

    // First Element
    Element element1 = new Element();
    elements.add(element1);

    // Second Element
    Element element2 = new Element();
    elements.add(element2);

    // Map first element
    FieldElement fieldElement1 = new FieldElement();
    fieldElement1.setElement(element1);
    fieldElement1.setField(field1);

    // Map second element
    FieldElement fieldElement2 = new FieldElement();
    fieldElement2.setElement(element2);
    fieldElement2.setField(field1);

    Map_FieldElement_to_ValueProducer mainMap = new Map_FieldElement_to_ValueProducer();

    Interpolator interpolator1 = new LinearLagrangeInterpolator_1D();
    mainMap.addValueProducerMapping(fieldElement1, interpolator1);
    
    Interpolator interpolator2 = new LinearLagrangeInterpolator_1D();
    mainMap.addValueProducerMapping(fieldElement2, interpolator2);

  }

}
