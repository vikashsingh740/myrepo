package org.example.design.designpatterns.behaviour.chainofResp;

public class PaymentHandlerMain {

    public static void main(String[] args) {
        PaymentHandler bank = new BankPaymentHandler();
        PaymentHandler creditCard = new CreditCardPaymentHandler();
        PaymentHandler paypal = new PaypalPaymentHandler();
        bank.setNext(creditCard);
        creditCard.setNext(paypal);

        bank.handlePayment(500);
        bank.handlePayment(1000);
        bank.handlePayment(1500);
    }
}
