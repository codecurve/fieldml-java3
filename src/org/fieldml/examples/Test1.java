package org.fieldml.examples;

import java.util.List;

import junit.framework.TestCase;

import org.fieldml.core.Element;
import org.fieldml.core.Field;
import org.fieldml.core.Interpolator;
import org.fieldml.core.InvalidDomainException;
import org.fieldml.core.Mesh;
import org.fieldml.core.Parameter;
import org.fieldml.core.ValueProducer;
import org.fieldml.core.interpolation.types.LinearLagrangeInterpolator_1D;
import org.fieldml.mapping.FieldElement;
import org.fieldml.mapping.Map_FieldElement_to_ValueProducer;
import org.fieldml.core.parameter.types.ParamFromArrayByIndex;

public class Test1 extends TestCase {
  public void testTest1a() throws InvalidDomainException {
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

    double[] array = new double[4];
    array[0] = 0.1;
    array[1] = -0.3;
    array[2] = 2.0;
    array[3] = 0.12;
    
    LinearLagrangeInterpolator_1D interpolator1 = new LinearLagrangeInterpolator_1D();
    ParamFromArrayByIndex u1 = new ParamFromArrayByIndex();
    u1.setArray(array);
    u1.setArrayIndex(0);
    interpolator1.setU1(u1);
    ParamFromArrayByIndex u2 = new ParamFromArrayByIndex();
    u2.setArray(array);
    u2.setArrayIndex(1);
    interpolator1.setU2(u2);
    mainMap.addValueProducerMapping(fieldElement1, interpolator1);
    
    LinearLagrangeInterpolator_1D interpolator2 = new LinearLagrangeInterpolator_1D();
    interpolator2.setU1(u2);
    ParamFromArrayByIndex u3 = new ParamFromArrayByIndex();
    u3.setArray(array);
    u3.setArrayIndex(2);
    interpolator2.setU2(u3);
    mainMap.addValueProducerMapping(fieldElement2, interpolator2);
    
    ValueProducer vp1 = mainMap.findValueProducer(fieldElement1);
    assertEquals(interpolator1, vp1);
    double[] xiVector = new double[1];
    xiVector[0] = 0.0;
    double value = vp1.getValue(xiVector);
    assertEquals(array[0], value, 1e-12);
    xiVector[0] = 1.0;
    value = vp1.getValue(xiVector);
    assertEquals(array[1], value, 1e-12);
    xiVector[0] = 0.5;
    value = vp1.getValue(xiVector);
    assertEquals((array[0]+array[1])/2, value, 1e-12);


    ValueProducer vp2 = mainMap.findValueProducer(fieldElement2);
    assertEquals(interpolator2, vp2);
    xiVector[0] = 0.0;
    value = vp2.getValue(xiVector);
    assertEquals(array[1], value, 1e-12);
    xiVector[0] = 1.0;
    value = vp2.getValue(xiVector);
    assertEquals(array[2], value, 1e-12);
    xiVector[0] = 0.5;
    value = vp2.getValue(xiVector);
    assertEquals((array[1]+array[2])/2, value, 1e-12);
  
  }

}
