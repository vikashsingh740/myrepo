package org.example.design.designpatterns.behaviour.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        Strategy strategy1 = new AddStrategy();
        Strategy strategy2 = new SubstractStrategy();
        Strategy strategy3 = new MultiplyStrategy();
        Context context = new Context(strategy1);
        int sum = context.executeStrategy(5,10);
        context = new Context(strategy2);
        int sub = context.executeStrategy(10,5);
        context = new Context(strategy3);
        int mul = context.executeStrategy(10,5);
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
    }
}
