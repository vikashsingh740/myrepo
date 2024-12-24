package org.example.design.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    Map<String, Shape> shapes = new HashMap<>();

    public Shape get(String type, String color) {
        String key = type + "-" + color;
        Shape shape = null;
        if (shapes.get(key) == null) {
            if ("oval".equals(type)) {
                shape = new Oval(color);
            } else if ("line".equals(type)) {
                shape = new Line(color);
            }
        } else {
            shape = shapes.get(key);
        }
        return shape;
    }
}
