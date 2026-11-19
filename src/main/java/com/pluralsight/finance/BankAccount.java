package com.pluralsight.finance;

import java.math.BigDecimal;

public class BankAccount implements Valuable{

    private String name;
    private int accountNumber;
    private BigDecimal balance;

    public BankAccount(String name, int accountNumber, BigDecimal balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(BigDecimal amount){
        this.balance = this.balance.subtract(amount);
    }

    public void deposit(BigDecimal amount){
        this.balance = this.balance.add(amount);
    }

    @Override
    public BigDecimal getValue() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount | " +
                " name = '" + name + '\'' +
                " | accountNumber = " + accountNumber +
                " | balance = " + balance;
    }
}
