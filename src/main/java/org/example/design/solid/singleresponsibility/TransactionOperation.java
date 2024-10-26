package org.example.design.solid.singleresponsibility;

import java.math.BigDecimal;

public class TransactionOperation {

    public void deposit(int accountNumber, BigDecimal amount){
       AccountOperation accountOperation = new AccountOperation();
       Account account = accountOperation.getAccount(accountNumber);
       account.setAmount(account.getAmount().add(amount));
    }

    public void withdraw(int accountNumber, BigDecimal amount){
        AccountOperation accountOperation = new AccountOperation();
        Account account = accountOperation.getAccount(accountNumber);
        account.setAmount(account.getAmount().subtract(amount));
    }

}
