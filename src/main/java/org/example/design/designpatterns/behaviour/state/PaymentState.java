package org.example.design.designpatterns.behaviour.state;

public class PaymentState implements State {
    @Override
    public void makeSelection(VendingMachineOrContext context) {
        System.out.println("You need to insert money before making a selection ");
    }

    @Override
    public void insertMoney(VendingMachineOrContext context) {
        System.out.println("Money inserted");
        context.setState(context.getDispenseState());
    }

    @Override
    public void dispenseItem(VendingMachineOrContext context) {
        System.out.println("You need to insert money before dispensing item ");
    }
}
