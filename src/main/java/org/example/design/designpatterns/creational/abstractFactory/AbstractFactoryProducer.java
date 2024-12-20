package org.example.design.designpatterns.creational.abstractFactory;

public class AbstractFactoryProducer {

    public AbstractFactory getInstance(String type) {
        if ("Economic".equals(type)) {
            return new EconomicFactory();
        } else if ("Luxury".equals(type)) {
            return new LuxuryFactory();
        }
        return null;
    }
}
