package org.example.design.designpatterns.behaviour.template;

public class PayToFriend extends PaymentFlow {
    @Override
    void validateRequest() {
        System.out.println("validate request from PayToFriend");
    }

    @Override
    void calculateFees() {
        System.out.println("calculateFees from PayToFriend");
    }

    @Override
    void debitAmount() {
        System.out.println("debitAmount from PayToFriend");
    }

    @Override
    void creditAmount() {
        System.out.println("creditAmount from PayToFriend");
    }
}
