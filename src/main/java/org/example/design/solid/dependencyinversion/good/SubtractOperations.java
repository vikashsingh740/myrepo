package org.example.design.solid.dependencyinversion.good;


public class SubtractOperations implements Operations {
    @Override
    public int perform(int a, int b) {
        return a - b;
    }
}
