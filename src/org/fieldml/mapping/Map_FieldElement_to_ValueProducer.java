package org.fieldml.mapping;

import java.util.HashMap;
import java.util.Map;

import org.fieldml.core.ValueProducer;


public class Map_FieldElement_to_ValueProducer {
  public Map<FieldElement,ValueProducer> map = new HashMap<FieldElement,ValueProducer>();

  public ValueProducer findValueProducer(FieldElement fieldElement){
    return map.get(fieldElement);
  }

  public void addValueProducerMapping(FieldElement fieldElement, ValueProducer valueProducer){
    map.put(fieldElement, valueProducer);
  }


}
