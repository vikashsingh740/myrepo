package org.example.design.solid.singleresponsibility;

import java.util.HashMap;
import java.util.Map;

public class AccountOperation {
    static Map<Integer, Account> accountMap = new HashMap<>();

    public void addAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public void updateAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public Account getAccount(int accountNumber) {
        return accountMap.get(accountNumber);
    }

    /** This method should not be part account operation
     * Reason is account operation is responsible to do operation on account
     * like add account,update account and get account. However Deposit is something called as transaction
     * which is eventually not responsible by account
     *  Adding this method violates single Responsibility principle
     *  Create new class which does TransactionOperation
     */
    public void deposit(int accountNumber, int amount){

    }
}
