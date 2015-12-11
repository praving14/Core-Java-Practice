package com.practice;


import java.security.SecureRandom;
import java.util.Scanner;

/**
 * This program mainly focuses on searching and sorting
 * Created on 12/4/2015.
 * @author
 * @version 1.0
 */
public class JavaProgram8 {

    // initialize constant ONE
    private static final int ONE = 1;
    // initialize constant FIVE_HUNDRED
    private static final int FIVE_HUNDRED = 500;
    // initialize the ARRAY_SIZE
    private static final int ARRAY_SIZE = 20;
    // create new integer array with size of ARRAY_SIZE
    private static int[] array = new int[ARRAY_SIZE];

    /**
     * The method to create one dimensional array with random numbers ranging from 1-500.
     * @param array     The array to be created with the random number
     * @return          The 1D array filled with random numbers from 1-500
     */
    public static int[] createOneDimensionalArray(int[] array){
        SecureRandom rand = new SecureRandom();
        for (int i =0 ; i< ARRAY_SIZE; ++i){
            array[i] = rand.nextInt(FIVE_HUNDRED)+ ONE;
        }
        return array;
    }

    /**
     * The method to display the array in the screen
     * @param array     The array to be printed on the screen
     */
    public static void printArray(int[] array){
        for (int i = 0; i< ARRAY_SIZE; ++i){
            System.out.printf("%d ", array[i]);
        }
    }

    /**
     * The linear search method basically compares the key with each element in the array
     * @param array        The array to be search the key value
     * @param key          The value to be searched for in the array
     * @return             Returns -1 if not found, returns index number if key is found in the array
     */
    public static int linearSearch(int[] array, int key){
        int result = -1;
        for (int i=0; i < array.length; ++i){
            if(array[i] == key){
                result = i;
                System.out.println("Index is:" + i);
            }
        }
        return result;
    }

    /**
     * The binary Search method implements the binary search algorithm to find if the key is present in the array
     * @param array         The array where the key is to be found
     * @param key           The key value to be searched for in the array
     * @return              Returns -1 if not found, returns index number if key is found in the array
     */
    public static int binarySearch(int[] array, int key){
        int low =0;
        int high= array.length -1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key > array[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * The method to swap two numbers
     * @param array      The array where swapping need to be done
     * @param i          The index in array whose element is to be swapped
     * @param j          The index in array whose element is to be swapped
     */
    public static void swapNumber(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] =temp;
    }

    /**
     * The bubble sort method to sort the array in ascending order
     * @param array     The array to be sorted in ascending order
     * @return          The array that is sorted in the ascending order
     */
    public static int[] bubbleSort(int[] array){
       for (int i =0; i< array.length; ++i)
           for (int j = 1; j < array.length - i; ++j) {
               if (array[j - 1] > array[j]) {
                   swapNumber(array,j-1,j);
               }
           }
        return  array;
    }

    public static void main(String[] args){
        int value;
        // sorted array
        int[] sortedArray;
        Scanner sc = new Scanner(System.in);
        System.out.print("Start (Y/N) :");
        String input = sc.next();
        while (input.equalsIgnoreCase("Y")){
            createOneDimensionalArray(array);
            System.out.println("The original list is: ");
            printArray(array);
            System.out.println();
            System.out.print("Enter the search key for the unsorted list: ");
            value = sc.nextInt();
            while(value < ONE || value > FIVE_HUNDRED ){
                System.out.print("The value must be within 1 and 500. RE-ENTER");
                value = sc.nextInt();
            }
            int result = linearSearch(array,value);
            if (result >= 0){
                System.out.printf("The key (%d) was found in the element with index %d%n", value, result);
            }else {
                System.out.printf("The key (%d) was NOT found!%n",value);
            }
            System.out.println("***************************************************");

            System.out.println("The sorted list is: ");
            sortedArray= bubbleSort(array);
            printArray(sortedArray);
            System.out.println();

            System.out.println("***************************************************");
            System.out.print("Enter the search key for the sorted list: ");
            value = sc.nextInt();
            while(value < ONE || value > FIVE_HUNDRED ){
                System.out.print("The value must be within 1 and 500. RE-ENTER");
                value = sc.nextInt();
            }
            int newResult = binarySearch(array,value);
            if (newResult >= 0){
                System.out.printf("The key (%d) was found in the element with index %d%n", value, newResult);
            }else {
                System.out.printf("The key (%d) was NOT found!%n",value);
            }
            System.out.println("***************************************************");
            System.out.print("Continue(Y/N): ");
            input =sc.next();
        }
        if (input.equalsIgnoreCase("N")) {
            System.out.println("Thank you!");
        }
    }


}
