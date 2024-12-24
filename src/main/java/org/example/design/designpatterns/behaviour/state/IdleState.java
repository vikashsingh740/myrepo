package org.example.design.designpatterns.behaviour.state;

public class IdleState implements State {
    @Override
    public void makeSelection(VendingMachineOrContext context) {
      System.out.println("Item selected");
      context.setState(context.getPaymentState());
    }

    @Override
    public void insertMoney(VendingMachineOrContext context) {
        System.out.println("select item before inserting money");
    }

    @Override
    public void dispenseItem(VendingMachineOrContext context) {
        System.out.println("select item before dispensing item");
    }
}
