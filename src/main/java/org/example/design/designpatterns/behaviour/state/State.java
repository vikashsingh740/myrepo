package org.example.design.designpatterns.behaviour.state;

public interface State {

    void makeSelection(VendingMachineOrContext context);

    void insertMoney(VendingMachineOrContext context);

    void dispenseItem(VendingMachineOrContext context);
}
