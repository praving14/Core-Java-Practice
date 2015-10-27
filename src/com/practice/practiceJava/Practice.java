package com.practice.practiceJava;

import java.awt.*;
import java.lang.Math;
import java.util.Scanner;

/**
 * Created by Pravin on 10/26/2015.
 */
public class Practice {
    /*
    * Practicing Java
    */


    // fibonacci numbers and their average;
    // we can do similar for tribonacci numbers;
    static void fibonacciNumbers(int f1, int f2, int num) {
        int fn;
        int n = 3;

        int fminus1 = f1;
        int fminus2 = f2;
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

    // calculating pi-value
    static double piValue(int max) {
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


    public static void main(String[] args) {
        double harmonicSumL2R = 0.0;
        double harmonicSumR2L = 0.0;
        int maxDenominator = 50000;
        double difference = harmonicSumL2R - harmonicSumR2L;

        for (int i = 1; i <= maxDenominator; ++i) {
            harmonicSumL2R += (1.0 / i);
        }
        for (int i = maxDenominator; i >= 1; --i) {
            harmonicSumR2L += (1.0 / i);
        }

        System.out.println("From left to right, Harmonic sum is: " + harmonicSumL2R);
        System.out.println("From right to left, Harmonic sum is: " + harmonicSumR2L);
        System.out.printf("The difference between two Harmonic sum is: %.15f ", harmonicSumR2L - harmonicSumL2R);
        System.out.println();

        System.out.println("Pi-value is: " + piValue(maxDenominator));
        System.out.println("pi-value constant is: " + Math.PI);
        Scanner in = new Scanner(System.in);
        System.out.println("Give me the first fibonacci integer value: ");
        int f1 = in.nextInt();
        System.out.println("Give me the second fibonacci integer value: ");
        int f2 = in.nextInt();
        System.out.println("Now how many fibonacci sequence do you want? ");
        int maxNum = in.nextInt();

        fibonacciNumbers(f1,f2,maxNum);
    }
}


