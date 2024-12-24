package org.example.design.designpatterns.behaviour.state;

public class VendingMachineOrContext {
    private State idleState;
    private State paymentState;
    private State dispenseState;
    private State currentState;

    public VendingMachineOrContext() {
        idleState = new IdleState();
        paymentState = new PaymentState();
        dispenseState = new DispenseState();
        currentState = idleState;  // The machine starts in Idle state
    }

    public void setState(State state) {
        currentState = state;
    }

    public void insertMoney() {
        currentState.insertMoney(this);
    }

    public void makeSelection() {
        currentState.makeSelection(this);
    }

    public void dispenseItem() {
        currentState.dispenseItem(this);
    }

    // Getters for the states
    public State getIdleState() {
        return idleState;
    }

    public State getPaymentState() {
        return paymentState;
    }

    public State getDispenseState() {
        return dispenseState;
    }
}
