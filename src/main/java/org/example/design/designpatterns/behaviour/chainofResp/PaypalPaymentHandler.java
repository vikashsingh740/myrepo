package org.example.design.designpatterns.behaviour.chainofResp;

public class PaypalPaymentHandler extends PaymentHandler {

    @Override
    public void handlePayment(double amount) {
        if (amount <= 1500) {
            System.out.println("Payment handling by paypal");
        }
    }
}
