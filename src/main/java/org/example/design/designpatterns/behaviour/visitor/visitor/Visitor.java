package org.example.design.designpatterns.behaviour.visitor.visitor;

import org.example.design.designpatterns.behaviour.visitor.element.DeluxRoom;
import org.example.design.designpatterns.behaviour.visitor.element.DoubleRoom;
import org.example.design.designpatterns.behaviour.visitor.element.SingleRoom;

public interface Visitor {
    void visit(SingleRoom singleRoom);

    void visit(DoubleRoom doubleRoom);

    void visit(DeluxRoom deluxRoom);
}
