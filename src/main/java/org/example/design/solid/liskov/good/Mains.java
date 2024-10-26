package org.example.design.solid.liskov.good;


public class Mains {
    public void makeSound(Birds birds){
       birds.makeSound();
    }

    public void fly(Flyable flyable){
        flyable.fly();
    }

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        Penguins penguin = new Penguins();
        Mains m = new Mains();
        m.makeSound(sparrow);
        m.makeSound(penguin);
        m.fly(sparrow);
    }
}
