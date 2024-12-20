package org.example.design.designpatterns.behaviour.chainofResp;

public class BankPaymentHandler extends PaymentHandler {

    @Override
    public void handlePayment(double amount) {
        if (amount <= 500) {
            System.out.println("Payment handling by bank");
        } else {
            next.handlePayment(amount);
        }
    }
}
