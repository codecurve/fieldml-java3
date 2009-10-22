package org.fieldml.core;


public interface ValueProducer {
  double getValue() throws InvalidDomainException;
  double getValue(double[] xiVector) throws InvalidDomainException;

}
