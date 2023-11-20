package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;
import it.unibo.inheritance.api.BankAccount;

public abstract class AbstractBankAccount implements BankAccount{
    
    private static final double ATM_TRANSACTION_FEE = 1;
    private static final double MANAGEMENT_FEE = 5;

    private final AccountHolder holder;
    private double balance;
    private int transactions;



    public AbstractBankAccount(final AccountHolder accountHolder, final double balance) {
        this.holder = accountHolder;
        this.balance = balance;
        this.transactions = 0;
    }

    public abstract void deposit(final int id, final double amount);

    public abstract void depositFromATM(final int id, final double amount);

    public abstract void withdraw(final int id, final double amount);

    public abstract void withdrawFromATM(final int id, final double amount);

    public abstract void chargeManagementFees(final int id);
    

    public int getTransactionsCount() {
        return transactions;
    }

    public AccountHolder getAccountHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }


}
