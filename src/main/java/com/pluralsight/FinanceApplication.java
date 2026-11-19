package com.pluralsight;

import com.pluralsight.finance.*;

import java.math.BigDecimal;

public class FinanceApplication {
    public static void main(String[] args) {
        Valuable account1 = new BankAccount("Pam", 123,
                new BigDecimal("12500"));
        Valuable creditCard = new CreditCard("Visa", "123",
                new BigDecimal("-1000"));
        Valuable jewelry = new Jewelry("Wedding Ring", 10);
        Valuable home = new House("My Humble Abode", 1994, 7500,
                3);

        Portfolio portfolio1 = new Portfolio("My Portfolio",
                "Brendan");

        portfolio1.add(account1);
        portfolio1.add(creditCard);
        portfolio1.add(jewelry);
        portfolio1.add(home);

        System.out.println("Your portfolio is worth: " + portfolio1.getValue());
        System.out.println("Most valuable: " + portfolio1.getMostValuable());
        System.out.println("Least valuable: " + portfolio1.getLeastValuable());

    }
}
