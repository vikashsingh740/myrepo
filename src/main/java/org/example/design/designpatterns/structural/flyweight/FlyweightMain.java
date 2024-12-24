package org.example.design.designpatterns.structural.flyweight;

public class FlyweightMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape oval1 = shapeFactory.get("oval", "red");
        Shape oval2 = shapeFactory.get("oval", "red");
        Shape line1 = shapeFactory.get("line", "blue");
        Shape line2 = shapeFactory.get("line", "blue");

        oval1.draw(1, 2);
        oval2.draw(1, 2);
        line1.draw(1, 2);
        line2.draw(1, 2);
    }
}
