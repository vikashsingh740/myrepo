package org.example.design.designpatterns.structural.proxy;

public class ATMProxy implements Account {

    @Override
    public void withdraw() {
        BankAccount bankAccount = new BankAccount();
        System.out.println("withdraw from ATM");
        bankAccount.withdraw();
    }

    @Override
    public int getBalance() {
        BankAccount bankAccount = new BankAccount();
        System.out.println("getBalance from ATM");
        return bankAccount.getBalance();
    }
}
