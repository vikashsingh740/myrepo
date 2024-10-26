package org.example.design.solid.openclose;

public class SubtractOperation implements Operation {
    @Override
    public int perform(int a, int b) {
        return a - b;
    }
}
