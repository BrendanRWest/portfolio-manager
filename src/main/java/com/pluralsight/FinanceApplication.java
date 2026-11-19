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
        account1.deposit(100);

        // This won't work because an interface object doesn't have access to any methods
        account2.deposit(100);

    }
}
