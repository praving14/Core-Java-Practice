package com.practice;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Created on 11/11/2015.
 * @author
 * @version 1.0
 */
public class JavaProgram2 {
    // declare an array with integers as its element
    private static int[] array;

    /**
     * The method to fill an Array with random numbers from O to 100 inclusive.
     * @param a         An array to be filled with the random numbers
     * @param size      The size of an array
     */
    public static void fillArray(int[] a, int size){
        SecureRandom rand = new SecureRandom();
        for (int i =0; i < size ; ++i){
            a[i] = rand.nextInt(15) + 1;
        }
    }

    /**
     * The method to print an Array
     * @param a         An array to be printed on the screen
     * @param size      The size of an array
     */
    public  static void printArray(int[] a, int size){
        System.out.println("The array elements are: ");
        for (int value : a){
            System.out.printf("%3d " , value);
        }
    }

    /**
     * This method display the graphical representation of an array in form of a histogram
     * The number of star represent the value in the array.
     * If the value is 8 , you will have 8 number of stars and so on.
     * @param a     An array to be represented as histogram
     * @param size  Size of an array
     */
    public static void printHistogram( int[] a, int size){
        System.out.printf("%7s %7s   %8s %n", "Index","Value" ,"Histogram");
        System.out.println("---------------------------------------------------------------");
        for( int i=0; i<size; ++i){
            System.out.printf("%7d %7d   ", i, a[i]);
            for( int j =0 ;j < a[i] ;++j){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[]  args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Do you want to start (Y/N): ");
        String input = scan.next();

        while(input.equalsIgnoreCase("Y")){
            System.out.print("Enter array size: ");
            int arraySize = scan.nextInt();
            while (arraySize <= 0){
                System.out.print("ERROR! Should be Positive. REENTER: ");
                arraySize =scan.nextInt();
            }
            int[] array = new int[arraySize];
            fillArray(array, arraySize);
            printArray(array, arraySize);
            System.out.println();
            printHistogram(array, arraySize);

            System.out.print("Do you want to continue (Y/N): ");
            input = scan.next();
        }

        if (input.equalsIgnoreCase("N")){
            System.out.println("Thank You!");
        }
    }
}
