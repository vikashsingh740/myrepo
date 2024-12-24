package org.example.design.designpatterns.behaviour.visitor;

import org.example.design.designpatterns.behaviour.visitor.element.DeluxRoom;
import org.example.design.designpatterns.behaviour.visitor.element.DoubleRoom;
import org.example.design.designpatterns.behaviour.visitor.element.SingleRoom;
import org.example.design.designpatterns.behaviour.visitor.visitor.MaintenanceVisitor;
import org.example.design.designpatterns.behaviour.visitor.visitor.PricingVisitor;
import org.example.design.designpatterns.behaviour.visitor.visitor.Visitor;

public class VisitorMain {
    public static void main(String[] args) {
        Visitor pricingVisitor = new PricingVisitor();
        MaintenanceVisitor maintenanceVisitor = new MaintenanceVisitor();

        SingleRoom singleRoom = new SingleRoom(1000);
        DoubleRoom doubleRoom = new DoubleRoom(2000);
        DeluxRoom deluxRoom = new DeluxRoom(2500);

        singleRoom.accept(pricingVisitor);
        singleRoom.accept(maintenanceVisitor);

        doubleRoom.accept(pricingVisitor);
        doubleRoom.accept(maintenanceVisitor);

        deluxRoom.accept(pricingVisitor);
        deluxRoom.accept(maintenanceVisitor);
    }
}
