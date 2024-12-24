package org.example.design.designpatterns.behaviour.visitor.element;

import org.example.design.designpatterns.behaviour.visitor.visitor.Visitor;

public class SingleRoom implements RoomElement {

    int area;

    public SingleRoom(int area) {
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
