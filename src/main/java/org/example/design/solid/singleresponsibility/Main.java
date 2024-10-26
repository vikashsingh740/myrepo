package org.example.design.solid.singleresponsibility;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber(12345);
        account.setAccountName("vikash");
        account.setAmount(BigDecimal.valueOf(10000));
        AccountOperation accountOperation = new AccountOperation();
        accountOperation.addAccount(account);

        TransactionOperation transactionOperation = new TransactionOperation();
        transactionOperation.deposit(12345,BigDecimal.valueOf(500));
        transactionOperation.withdraw(12345,BigDecimal.valueOf(100));

        System.out.println(accountOperation.accountMap.get(12345).getAmount());
    }
}
