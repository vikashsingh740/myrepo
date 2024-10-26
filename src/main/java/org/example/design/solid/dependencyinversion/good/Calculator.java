package org.example.design.solid.dependencyinversion.good;

public class Calculator {

    public int calculate(int a, int b, Operations operations) {
        return operations.perform(a, b);
    }
}
