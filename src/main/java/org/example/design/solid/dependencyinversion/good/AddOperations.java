package org.example.design.solid.dependencyinversion.good;

public class AddOperations implements Operations {
    @Override
    public int perform(int a, int b) {
        return a + b;
    }
}
