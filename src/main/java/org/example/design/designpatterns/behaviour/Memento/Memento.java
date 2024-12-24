package org.example.design.designpatterns.behaviour.Memento;

public class Memento {
    String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
