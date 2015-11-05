package com.practice;

import java.math.BigInteger;

/**
 * Created by Pravin on 11/5/2015.
 * @author Pravin
 * @version 1.0
 */
public class Factorial{
    /**
     * The method finds the factorial of a whole number n
     * Pre-condition: The input value must be whole number
     * Post-condition: The data type to store result value has to be able to store large number
     * @param n  The whole number input to find the factorial of
     * @return   The factorial value as double data type
     */
    public static double findFactorial(int n) {
        double result = 1;
        if (n == 0 || n == 1) {
            result = 1;
        } else {
            double m = (double) n;
            for (int i = 2; i <= m; ++i) {
                result = i * result;
            }
        }
        return result;
    }


    public static void main(String[] args){
        int n= 100;
        System.out.println(" The factorial of " + n + " is " + findFactorial(n));

        /*
        BigInteger bg = BigInteger.ONE;
        for ( int i = 1; i <=n; ++i){
            bg = bg.multiply(BigInteger.valueOf(i));
        }
        System.out.println(" The factorial of " + n + " is " + bg);
        */
    }
}
