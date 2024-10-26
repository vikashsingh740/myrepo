package org.example.design.solid.liskov.bad;

public class Penguin extends Bird {

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Can't fly");
    }
}
