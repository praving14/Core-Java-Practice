package com.practice;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Created on 12/1/2015.
 * @author
 * @version: 1.0
 */

public class JavaProgram5 {
    private static int[] array;

    /**
     * The method initializes the array with random integers from 1 to 15
     * @param array  The array that has to initialized
     * @return        The array after being initialized
     */
    public static int[] initializeArray(int[] array){
        SecureRandom rand = new SecureRandom();
        for (int i =0 ; i< array.length ;++i){
            array[i] = rand.nextInt(15)+1;
        }
    return array;

    }

    /**
     * The method that prints the array to the screen
     * @param array   The array to be printed
     */
    public static void printArray(int[] array){
        for (int i =0 ; i< array.length ;++i){
            System.out.printf("%5d",array[i]);
        }
    }

    /**
     * This method rotate the array clockwise such that the last element becomes the first element in the array and
     * every other element moves a step ahead.
     * @param array  The array to be rotated
     * @return       The array after being rotated
     */
    public static int[] rotateArray(int[] array){
        int temp =array[array.length-1];
        for (int i = array.length-1 ; i>0 ;--i) {
            array[i] = array[i-1];
        }
        array[0]=temp;
        return array;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int arraySize;

        System.out.print("How many arrays to rotate right?: ");
        int input = scan.nextInt();
        while(input <= 0){
            System.out.print("ERROR!! Should be positive. REENTER: ");
            input = scan.nextInt();
        }
        while (input > 0) {
            System.out.print("Enter array size:");
            arraySize = scan.nextInt();
            while (arraySize <=0){
                System.out.print("ERROR!! Should be positive. REENTER: ");
                arraySize = scan.nextInt();
            }
            array = new int[arraySize];
            initializeArray(array);
            printArray(array);
            System.out.println();
            System.out.println("The array before rotation:");
            printArray(array);
            System.out.println();
            rotateArray(array);
            printArray(array);
            System.out.println();
            input = input -1;

        }
    }

}
