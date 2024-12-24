package org.example.design.designpatterns.structural.flyweight;

public class Oval implements Shape {

    String color;

    public Oval(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Draw a oval with color: " + color + " and position x: " + x + " and y: " + y);
    }
}
