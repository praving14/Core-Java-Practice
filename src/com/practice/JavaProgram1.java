package com.practice;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Created on 11/11/2015.
 * @author
 * @version 1.0
 */
public class JavaProgram1 {
    // size of array declared as a class constant
    private static int ARRAY_SIZE = 30;
    // declare an array with integers as its element
    private static int[] array;

    /**
     * The method to fill an Array with random numbers from O to 100 inclusive.
     *
     * @param a    An array to be filled with the random numbers
     * @param size The size of an array
     */
    public static void fillArray(int[] a, int size) {
        SecureRandom rand = new SecureRandom();
        for (int i = 0; i < size; ++i) {
            a[i] = rand.nextInt(101);
        }
    }

    /**
     * The method to display the array in such a table format so that there are
     * only six element per row
     *
     * @param a       An array to be printed
     * @param size    The size of an array
     * @param element The number of element to be printed per row
     */
    public static void printArray(int[] a, int size, int element) {
        for (int i = 0; i < size; ++i) {
            if ((i) % 6 == 0) {
                System.out.println();
            }
            System.out.printf("%5d", a[i]);
        }
    }

    /**
     * This method gives you the maximum value from the array
     *
     * @param a    An array to me searched for maximum value
     * @param size The size of an array
     * @return The maximum value
     */
    public static int maximumElement(int[] a, int size) {
        int maximumValue = a[0];
        for (int value : a) {
            if (value > maximumValue)
                maximumValue = value;
        }
        return maximumValue;
    }

    /**
     * This method gives you the minimum from the array
     *
     * @param a    An array to be searched for minimum value
     * @param size The size of an array
     * @return The minimum value in the array
     */
    public static int minimumValue(int[] a, int size) {
        int minimumValue = a[0];
        for (int value : a) {
            if (value < minimumValue)
                minimumValue = value;
        }
        return minimumValue;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Do you want to start (Y/N): ");
        String input = scan.next();

        while (input.equalsIgnoreCase("Y")) {
            array = new int[ARRAY_SIZE];
            fillArray(array, ARRAY_SIZE);
            System.out.println("The array element are: ");
            printArray(array, ARRAY_SIZE, 6);
            int max = maximumElement(array, ARRAY_SIZE);
            int min = minimumValue(array, ARRAY_SIZE);
            System.out.println();
            System.out.println(" The difference between the max value " + max + " and min value " + min + " = " + (max - min));
            System.out.println("*************************************************************************************");
            System.out.print("Do you want to continue (Y/N): ");
            input = scan.next();
        }
        if (input.equalsIgnoreCase("N")) {
            System.out.println("Thank you!");
        }

    }
}

