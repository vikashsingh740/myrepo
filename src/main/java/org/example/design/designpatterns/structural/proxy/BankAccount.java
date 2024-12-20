package org.example.design.designpatterns.structural.proxy;

public class BankAccount implements Account {
    @Override
    public void withdraw() {
        System.out.println("Withdraw from bank account");
    }

    @Override
    public int getBalance() {
        System.out.println("getBalance");
        return 100;
    }
}
