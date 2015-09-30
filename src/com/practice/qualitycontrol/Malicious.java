package com.practice.qualitycontrol;

/**
 * Created by Pravin on 8/23/2015.
 */
public class Malicious {
    public static void main (String[] args){
        String creditCardNumber;
        CreditCard card = new CreditCard("1234567898", 235.60);
        creditCardNumber = card.getCardNumber("SECRET");
        System.out.println(creditCardNumber);
                card.charge(5 / 40);
    }

}
