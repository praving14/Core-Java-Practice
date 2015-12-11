package com.practice.practiceJava;

import java.math.BigInteger;

/**
 * Created by Pravin on 11/19/2015.
 */
public class Driver {
    public static void main(String[] args) {

        for (int i = 0; i < 10; ++i) {
            System.out.printf("%d : %d %n ",i, Practice.fibonacciNumberUsingRecursion(BigInteger.valueOf(i)));

        }
    }
}
