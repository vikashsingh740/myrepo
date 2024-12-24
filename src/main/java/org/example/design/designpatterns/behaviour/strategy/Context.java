package org.example.design.designpatterns.behaviour.strategy;

public class Context {

    Strategy strategy;

    Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }

}
