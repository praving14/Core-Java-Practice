package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Pravin on 11/5/2015.
 * @author Pravin
 * @version 1.0
 */
public class Prime {

    /**
     * The method tells you whether the input value is prime or not
     * Precondition: The value should be a whole number
     * @param n      The input whole number value to check for prime
     * @return       true if prime
     * @return       false if not prime
     */

    public static boolean isPrime(int n){
        boolean result = true;
        if (n <= 1){
            result = false;
        }else{
            for ( int i =2; i <= n/2 ; ++i){
                if ( n % i == 0){
                    result =false;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        int lower;
        int upper;
        int counter = 0;
        System.out.println("How many times do you want to test for Prime numbers? ");
        int num = scan.nextInt();
        // The number of times to be tested has to be greater than 0
        while (num <= 0){
            System.out.println("Error! The number should be greater than 0. Try again: ");
            num =scan.nextInt();
        }
        while (num > 0){
            System.out.println("Enter lower bound: ");
            lower = scan.nextInt();
            // The lower bound to be tested has to be greater than 0
            while ( lower < 0){
                System.out.println("The lower bound must be greater than or equal to 0. Try again! ");
                System.out.println("Enter lower bound: ");
                lower = scan.nextInt();
            }
            System.out.println("Enter upper bound: ");
            upper = scan.nextInt();
            // The Upper bound to be tested has to be greater than 0
            while ( upper < 0){
                System.out.println("The upper bound must be greater than or equal to 0. Try again! ");
                System.out.println("Enter upper bound: ");
                upper = scan.nextInt();
            }
            // The lower bound has to be less than or equal to upper bound
            while ( lower > upper){
                System.out.println("The lower bound must be greater than upper bound!");
                System.out.println("Enter lower bound: ");
                lower = scan.nextInt();
                System.out.println("Enter upper bound: ");
                upper = scan.nextInt();
            }
            for (int i = lower ; i <= upper ;++i){
                if (isPrime(i)){
                    //counter to count the number of prime numbers
                    counter =counter+1;
                    System.out.println(i + " is a prime number.");
                }
            }
            // if there are no prime numbers, the counter equals zero.
            if (counter ==0){System.out.println("There are no prime numbers.");}

        // The num value is like a counter to count the number of times the test should be run
        num =num -1;
            counter =0;
        }
    }


}
