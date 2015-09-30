package com.practice.qualitycontrol;

/**
 * Created by Pravin on 8/23/2015.
 */
public class CreditCard {
     private String cardNumber;
     private double expenses;

    public CreditCard (String c, double e){
        this.cardNumber = c;
        this.expenses=e;
    }

    public void charge(double amount) {
        expenses = expenses + amount;
        System.out.println("The expense is: " + expenses );
    }

    public String getCardNumber(String password) {
        if (password.equals("SECRET")) {
            return cardNumber;
        } else {
            return "jerkface";
        }

    }
}