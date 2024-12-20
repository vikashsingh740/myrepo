package org.example.design.designpatterns.behaviour.chainofResp;

public class CreditCardPaymentHandler extends PaymentHandler {

    @Override
    public void handlePayment(double amount) {
        if (amount <= 1000) {
            System.out.println("Payment handling by credit card");
        } else {
            next.handlePayment(amount);
        }
    }
}
