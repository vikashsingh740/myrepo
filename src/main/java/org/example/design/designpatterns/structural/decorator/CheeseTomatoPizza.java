package org.example.design.designpatterns.structural.decorator;

public class CheeseTomatoPizza extends PizzaDecorator {

    public CheeseTomatoPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return pizza.bake() + " CheeseTomato pizza";
    }
}
