package org.example.design.designpatterns.behaviour.template;

public class TemplateMain {

    public static void main(String[] args) {
        PaymentFlow paymentFlow = new PayToFriend();
        paymentFlow.sendMoney();

        PaymentFlow paymentMerchandise = new PayToMerchandise();
        paymentMerchandise.sendMoney();
    }
}
