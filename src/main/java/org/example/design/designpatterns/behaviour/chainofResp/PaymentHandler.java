package org.example.design.designpatterns.behaviour.chainofResp;

public abstract class PaymentHandler {
    PaymentHandler next;

    public void setNext(PaymentHandler paymentHandler) {
        this.next = paymentHandler;
    }

    public abstract void handlePayment(double amount);
}
