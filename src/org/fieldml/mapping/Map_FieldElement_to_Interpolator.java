package org.fieldml.mapping;

import java.util.HashMap;
import java.util.Map;
import org.fieldml.core.Interpolator;


public class Map_FieldElement_to_Interpolator {
  private Map<FieldElement,Interpolator> map = new HashMap<FieldElement,Interpolator>();

  public Interpolator findInterpolator(FieldElement fieldElement){
    return map.get(fieldElement);
  }

  public void addInterpolatorMapping(FieldElement fieldElement, Interpolator interpolator){
    map.put(fieldElement, interpolator);
  }


}
