package org.example.design.designpatterns.behaviour.visitor.visitor;

import org.example.design.designpatterns.behaviour.visitor.element.DeluxRoom;
import org.example.design.designpatterns.behaviour.visitor.element.DoubleRoom;
import org.example.design.designpatterns.behaviour.visitor.element.SingleRoom;

public class PricingVisitor implements Visitor {

    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("pricing visitor for single room");
        int price = singleRoom.getArea()*10;
        System.out.println("Pricing for single room: "+price);
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("pricing visitor for double room");
        int price = doubleRoom.getArea()*8;
        System.out.println("Pricing for double room: "+price);
    }

    @Override
    public void visit(DeluxRoom deluxRoom) {
        System.out.println("pricing visitor for delux room");
        int price = deluxRoom.getArea()*10;
        System.out.println("Pricing for delux room: "+price);
    }
}
