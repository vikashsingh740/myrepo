package org.example.design.designpatterns.behaviour.template;

public abstract class PaymentFlow {

    abstract void validateRequest();

    abstract void calculateFees();

    abstract void debitAmount();

    abstract void creditAmount();

    public final void sendMoney() {
        validateRequest();
        debitAmount();
        calculateFees();
        creditAmount();
    }
}
