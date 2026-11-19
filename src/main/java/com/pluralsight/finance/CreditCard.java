package com.pluralsight.finance;

import java.math.BigDecimal;

public class CreditCard implements Valuable{

    private String name;
    private String accountNumber;
    private BigDecimal balance;

    public CreditCard(String name, String accountNumber, BigDecimal balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void charge(BigDecimal amount){
        balance = balance.add(amount);
    }

    public void pay(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

    @Override
    public BigDecimal getValue() {
        return balance.negate();
    }

    @Override
    public String toString() {
        return "CreditCard | " +
                "name = '" + name + '\'' +
                " | accountNumber = '" + accountNumber + '\'' +
                " | balance = $" + balance;
    }
}
