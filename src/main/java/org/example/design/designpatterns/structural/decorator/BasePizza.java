package org.example.design.designpatterns.structural.decorator;

public class BasePizza implements Pizza {

    @Override
    public String bake() {
        return "Base Pizza";
    }
}
