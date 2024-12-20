package org.example.design.designpatterns.creational.abstractFactory;

public class LuxuryFactory implements AbstractFactory {
    @Override
    public Car getInstance(int price) {
        if (price > 500000){
            return new LuxuryCar1();
        } else {
            return new LuxuryCar2();
        }
    }
}
