package org.fieldml.unittests;

import org.fieldml.core.parameter.types.ParamFromArrayByIndex;

import junit.framework.TestCase;

public class TestParamFromArrayByIndex extends TestCase {

  double[] array = new double[4];

  @Override
  public void setUp(){
    array[0] = 0.1;
    array[1] = -0.3;
    array[2] = 2.0;
    array[3] = 0.12;
  }
  
  public void testGetValue() {
    ParamFromArrayByIndex p = new ParamFromArrayByIndex();
    p.setArray(array);
    for(int i = 0; i<array.length; i++) {
      p.setArrayIndex(i);
      assertEquals(array[i], p.getValue(), 0);
    }
  }

  public void testSetAndGetArray() {
    ParamFromArrayByIndex p = new ParamFromArrayByIndex();
    p.setArray(array);
    assertEquals(array, p.getArray());
  }

  public void testSetAndGetArrayIndex() {
    ParamFromArrayByIndex p = new ParamFromArrayByIndex();
    p.setArrayIndex(5);
    assertEquals(5, p.getArrayIndex());

  }


}
