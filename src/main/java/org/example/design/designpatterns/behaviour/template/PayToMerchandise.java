package org.example.design.designpatterns.behaviour.template;

public class PayToMerchandise extends PaymentFlow {
    @Override
    void validateRequest() {
        System.out.println("validate request from PayToMerchandise");
    }

    @Override
    void calculateFees() {
        System.out.println("calculateFees from PayToMerchandise");
    }

    @Override
    void debitAmount() {
        System.out.println("debitAmount from PayToMerchandise");
    }

    @Override
    void creditAmount() {
        System.out.println("creditAmount from PayToMerchandise");
    }
}
