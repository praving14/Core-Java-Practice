package com.practice.practiceJava;

import java.util.Scanner;

/**
 * Created by Pravin on 10/26/2015.
 */
public class Exercises {
     // A method that find the sum of all the from lowerlimit  to the upper limit you input
     // It also outputs the average of these numbers
    static void sumAndAverage(int lowerlimit, int upperlimit){
        int sum = 0;
        double average = 0.0;
        double total = upperlimit - lowerlimit;
        for (int i = lowerlimit; i <= upperlimit; ++i ){
            sum += i;
        }
        average = sum/ total;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is : "+ average);
    }

    // Extracting digits: Write a program to extract each digit from an int, in the reverse order. For example, if the int is 1542,
    // the output shall be "2,4,5,1", with a comma separating the digits.
    // limitations: it can only hold int values, sometime you may get "integer value too large" error if the value is too big
    static void extractDigits (int number){
        int[] reverseddigits = new int[number];
            int i=0;
            while (number > 0 ){
                reverseddigits[i] = number % 10;
                number /= 10;
                i +=1;
        }
        System.out.print("The digits in reverse order is  : ");
        for (int j =0 ;j < i ; ++j){
        System.out.print(reverseddigits[j]);
        }
        System.out.println();
    }

    //Nested loops:
    //    you can print square board with "#" of whatever length you want
    static void printSquareBoard(int length){
        for (int i = 0 ; i< length; ++i){
            for (int j=0 ;j <length; ++j){
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    // Nested loops:
    //    you can print checker board with "#" of whatever length you want

    static void printCheckerBoard(int length){
        for (int i = 1 ; i<=length; ++i){
           if (i % 2 == 0){
               System.out.print(" ");
           }
            for (int j=1 ;j <= length; ++j) {
                System.out.print("# ");
            }

            System.out.println();
        }
    }

    // This gives you the multiplication table;
    // incomplete...complete this
    static void timeTable(int num){
        for (int i = 1; i <= num ; ++i){
            for (int j= 1; j<= num; ++j){
                System.out.print(j*i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int lowerLimit, upperLimit, digitToReverse;

        Scanner in = new Scanner(System.in);
        System.out.println("Input the lower limit of a number: ");
        lowerLimit = in.nextInt();
        System.out.println("Input the upper limit of a number: ");
        upperLimit = in.nextInt();
        // This should give you the sum and average
         sumAndAverage(lowerLimit,upperLimit);

        System.out.println("Input the integer digit that you want to reverse");
        digitToReverse = in.nextInt();
        // if input is 1234 then  output should be 4321
        extractDigits(digitToReverse);

        // printSquareBoard(10);

        // printCheckerBoard(10);

        // timeTable(9);


    }
}
