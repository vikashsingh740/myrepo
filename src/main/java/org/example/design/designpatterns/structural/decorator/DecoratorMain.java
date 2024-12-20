package org.example.design.designpatterns.structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Pizza pizza = new CheeseTomatoPizza(new TomatoPizza(new BasePizza()));
        System.out.println(pizza.bake());
    }
}
