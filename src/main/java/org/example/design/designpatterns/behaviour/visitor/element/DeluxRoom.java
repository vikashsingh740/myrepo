package org.example.design.designpatterns.behaviour.visitor.element;

import org.example.design.designpatterns.behaviour.visitor.visitor.Visitor;

public class DeluxRoom implements RoomElement {

    int area;

    public DeluxRoom(int area) {
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    @Override
    public void accept(Visitor visitor) {
       visitor.visit(this);
    }
}
