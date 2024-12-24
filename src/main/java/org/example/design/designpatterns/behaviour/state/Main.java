package org.example.design.designpatterns.behaviour.state;

public class Main {
    public static void main(String[] args) {
        // Create the Vending Machine
        VendingMachineOrContext vendingMachine = new VendingMachineOrContext();
        
        // Scenario 1: User selects item and inserts money
        vendingMachine.makeSelection();  // Transition to PaymentState
        vendingMachine.insertMoney();    // Transition to DispenseState
        vendingMachine.dispenseItem();   // Dispense the item, transition back to IdleState
        
        // Scenario 2: User tries to insert money without making a selection
        vendingMachine.insertMoney();    // In IdleState, it says you need to select an item first.
        vendingMachine.makeSelection();  // Make selection first
        vendingMachine.insertMoney();    // Insert money now
        vendingMachine.dispenseItem();   // Dispense the item, transition back to IdleState
    }
}
