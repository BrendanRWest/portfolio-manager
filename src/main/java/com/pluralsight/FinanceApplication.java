package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

import java.math.BigDecimal;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", 123,
                new BigDecimal("12500"));
        Valuable account2 = new BankAccount("Gary", 456,
                new BigDecimal("1500"));


        // This won't work because the input isn't a BigDecimal
        // account1.deposit(100);

        // This won't work because the interface doesn't implement getValue
        // account2.deposit(100);

        // These should all work
        System.out.println(account1.getValue());
        account1.deposit(new BigDecimal("100"));
        System.out.println(account1.getValue());

        account1.withdraw(new BigDecimal("250"));
        System.out.println(account1.getValue());

        System.out.println(account2.getValue());

    }
}
