package com.practice.practiceJava;

import java.awt.*;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author Pravin
 * @version 1.0
 * @date 10/26/2015
 */
public class Practice{

    /**
     * Thei smethod prints out the sequence of fibonacci number using the basic concept: f(n) = f(n-1)+f(n-2)
     * @param f1    The first value of fibonacci number
     * @param f2    The second value of fibonacci number
     * @param num   The maximum number of fibonacci sequence to print
     */
    public void fibonacciNumbers(int f1, int f2, int num) {
        double fn;
        int n = 3;

        double fminus1 = f1;
        double fminus2 = f2;
        double sum = fminus1 + fminus2;
        System.out.print("Fibinacci Number = [" + fminus1 + " " + fminus2 + " ");
        while (n <= num) {
            fn = fminus1 + fminus2;
            fminus1 = fminus2;
            fminus2 = fn;
            n++;
            System.out.print(fn + " ");
            sum += fn;
        }
        System.out.println("]");
        System.out.println("Average: = " + sum / num);
    }

    /**
     * The method that prints out the Fibonacci sequence as double data type using the formula:
     * @param num The number of fibonacci sequence to create
     */
    public void CreatefibonacciNumberUsingFormula(int num){
        double Fibonaccinumbers;
        System.out.print("Fibonacci Numbers :[ ");
        for (int i =1 ; i< num ; ++i){
            Fibonaccinumbers = (1 / Math.sqrt(5.0))*(Math.pow(((1.0+ Math.sqrt(5.0))/2.0),i) - Math.pow(((1.0 - Math.sqrt(5.0)))/2.0,i));
            System.out.print( Fibonaccinumbers + " " );
        }
        System.out.print(" ]");
        System.out.println();
    }

    /**
     * The method tried to find the PiValue to the nearest of precision
     * @param max The maximum number of time, the method will run to get the pi value as accurately as possible
     * @return    Returns the piValue as double data type
     */
    public double piValue(int max) {
        double pi = 0.0;
        for (int i = 1; i < max; i += 2) {
            if (i % 4 == 1) {
                pi += 4 * (1.0 / i);
            } else if (i % 4 == 3) {
                pi -= 4 * (1.0 / i);
            }
        }
        return pi;
    }


}


