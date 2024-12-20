package org.example.design.designpatterns.creational.abstractFactory;

public class EconomicFactory implements AbstractFactory {
    @Override
    public Car getInstance(int price) {
        if (price > 100000){
            return new EconomicCar1();
        } else {
            return new EconomicCar2();
        }
    }
}
