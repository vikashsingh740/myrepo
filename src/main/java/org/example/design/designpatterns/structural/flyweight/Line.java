package org.example.design.designpatterns.structural.flyweight;

public class Line implements Shape {
    String color;

    public Line(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Draw a line with color: " + color + " and position x: " + x + " and y: " + y);
    }
}
