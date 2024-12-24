package org.example.design.designpatterns.behaviour.state;

public class DispenseState implements State {
    @Override
    public void makeSelection(VendingMachineOrContext context) {
        System.out.println("Item is being dispensed, you cannot select item");
    }

    @Override
    public void insertMoney(VendingMachineOrContext context) {
        System.out.println("Item is being dispensed, you cannot insert more money.");
    }

    @Override
    public void dispenseItem(VendingMachineOrContext context) {
        System.out.println("Dispensing item");
        context.setState(context.getIdleState());
    }
}
