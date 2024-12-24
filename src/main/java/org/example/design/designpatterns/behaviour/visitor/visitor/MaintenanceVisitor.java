package org.example.design.designpatterns.behaviour.visitor.visitor;

import org.example.design.designpatterns.behaviour.visitor.element.DeluxRoom;
import org.example.design.designpatterns.behaviour.visitor.element.DoubleRoom;
import org.example.design.designpatterns.behaviour.visitor.element.SingleRoom;

public class MaintenanceVisitor implements Visitor {
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("maintenance visitor for single room");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("maintenance visitor for double room");
    }

    @Override
    public void visit(DeluxRoom deluxRoom) {
        System.out.println("maintenance visitor for delux room");
    }
}
