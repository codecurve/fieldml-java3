package org.fieldml.core;


public interface ValueProducer {
  double getValue();
  double getValue(XiVector xi) throws InvalidDomainException;

}
