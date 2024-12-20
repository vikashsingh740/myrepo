package org.example.design.designpatterns.structural.decorator;

public class TomatoPizza extends PizzaDecorator {

    public TomatoPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return pizza.bake()+ " Tomato Pizza";
    }
}
