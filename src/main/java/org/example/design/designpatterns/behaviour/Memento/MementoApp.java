package org.example.design.designpatterns.behaviour.Memento;

public class MementoApp {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("state-1");
        originator.setState("state-2");
        careTaker.addMemento(originator.saveStateToMemento());

        originator.setState("state-3");
        careTaker.addMemento(originator.saveStateToMemento());

        originator.setState("state-4");
        System.out.println("====>> "+originator.getState());

        originator.getStateFromMemento(careTaker.getMemento(0));
        System.out.println("====>> "+originator.getState());

        originator.getStateFromMemento(careTaker.getMemento(1));
        System.out.println("====>> "+originator.getState());
    }
}
