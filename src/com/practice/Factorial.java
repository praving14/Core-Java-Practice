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

    /**
     * The method to calculate factorial using recursion emthod
     * @param n  The value of factorial to be calculated
     * @return   The calculated result for n!
     */
    public static long factorialUsingRecursion(int n){
        if (n<=1){
            return 1;
        }else {
            return n * factorialUsingRecursion(n-1);
        }
    }

    // Using BigInteger
    public static BigInteger factorialUsingRecursion(BigInteger n){
        if (n.compareTo(BigInteger.ONE) <= 0){
            return BigInteger.ONE;
        }else {
            return n.multiply(factorialUsingRecursion(n.subtract(BigInteger.ONE)));
        }
    }

    public static void main(String[] args){
        for( int j= 1; j <= 100;++j){
            System.out.printf("%d! = %d %n ", j, factorialUsingRecursion(j));
            System.out.printf("%d! = %d %n ", j, factorialUsingRecursion(BigInteger.valueOf(j)));
        }

    }
}
