package org.example.design.designpatterns.behaviour.visitor.element;

import org.example.design.designpatterns.behaviour.visitor.visitor.Visitor;

public interface RoomElement {
    void accept(Visitor visitor);
}
