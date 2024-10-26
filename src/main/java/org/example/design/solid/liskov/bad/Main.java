package org.example.design.solid.liskov.bad;

public class Main {

    public void makeSound(Bird bird) {
        bird.makeSound();
    }

    public void fly(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();
        Main m = new Main();
        m.makeSound(sparrow);
        m.makeSound(penguin);
        m.fly(sparrow);
        m.fly(penguin);
    }
}
