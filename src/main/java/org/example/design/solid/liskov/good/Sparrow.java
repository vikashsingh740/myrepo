package org.example.design.solid.liskov.good;

public class Sparrow extends Birds implements Flyable {
    @Override
    public void fly() {
     System.out.println("I can fly");
    }
    public void makeSound() {
        System.out.println("sparrow can sound");
    }
}
