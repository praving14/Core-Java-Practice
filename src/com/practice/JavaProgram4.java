package com.practice;

import java.security.SecureRandom;

/**
 * Created on 11/17/2015.
 * @author
 * @version 1.0
 */
public class JavaProgram4 {
    // number of rows in the array declared as a class constant
    private static int ROW = 10;
    // number of column in the array declared as a class constant
    private static int COLS =15;

    /**
     *  The method to generate an multidimensional array ROWxCOLS with random numbers from 0-500
     * @param a     The multidimensional array to be filled with random numbers from 0-500
     * @return      Array of ROWxCOLS filled with random numbers range from 0-500
     */
    public static int[][] generateArray(int[][] a){
        SecureRandom rand =new SecureRandom();
        for (int i= 0 ; i< ROW ; ++i){
            for (int j = 0; j< COLS; ++j){
                a[i][j] =rand.nextInt(501);
            }
        }
        return a;
    }

    /**
     * The method to print out the element of multidimensional array in a table format
     * @param a     The multidimensional array ROWxCOLS to be printed
     */
    public static void printArray(int[][] a){
        for (int i= 0 ; i< ROW ; ++i){
            for (int j = 0; j< COLS; ++j){
                System.out.printf("%5d ", a[i][j]);
            }
            System.out.println();
        }

    }

    /**
     *  The method to find the largest element in the multidimensional array
     * @param a     The multidimensional array to be searched for the largest element
     * @return      The largest value/ element in the multidimensional array
     */
    public static int largestElement(int[][] a){
        int largestValue = a[0][0];
        for (int i= 0 ; i< ROW ; ++i) {
            for (int j = 0; j < COLS; ++j) {
                if (a[i][j] > largestValue)
                    largestValue = a[i][j];
            }
        }
        return largestValue;
    }

    /**
     *  The method to find the smallest element in the multidimensional array
     * @param a     The multidimensional array to be searched for the smallest element
     * @return      The smallest value/ element in the multidimensional array
     */
    public static int smallestElement(int[][] a){
        int smallestValue = a[0][0];
        for (int i= 0 ; i< ROW ; ++i) {
            for (int j = 0; j < COLS; ++j) {
                if (a[i][j] < smallestValue)
                    smallestValue = a[i][j];
            }
        }
        return smallestValue;
    }

    /**
     * The method to find the sum of all the elements in the array
     * @param a     The multidimensional array whose sum is to be calculated
     * @return      The value for the sum of all the elements in the array
     */
    public static int sumOfArray(int[][] a){
        int sum =0;
        for (int i= 0 ; i< ROW ; ++i) {
            for (int j = 0; j < COLS; ++j) {
                sum += a[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args){
        // initialize an array with ROW number if rows and COLS number of columns
        int[][] array =new int[ROW][COLS];
        System.out.println("The array elements are: ");
        System.out.println("=========================================================================================");
        generateArray(array);
        printArray(array);
        //Print the elements of second row
        System.out.println("Second row elements are :");
        for(int i =0 ; i< COLS ;++i){
            System.out.printf("%5d", array[1][i]);
        }
        System.out.println();

        // Print the elements of third column
        System.out.println("Third column elements are: ");
        for(int i =0 ; i< ROW ;++i){
            System.out.printf("%5d", array[i][2]);
        }
        System.out.println();

        System.out.println("Range of values/array: " + smallestElement(array) + " - " + largestElement(array));

        System.out.println("The sum of all elements/array: " + sumOfArray(array));

        // Calculating the average of all elements by the formula average =total_sum / total_number_elements
        double average = (double)sumOfArray(array)/(ROW*COLS);

        System.out.printf("The average of all elements/array: %3.2f", average);



    }
}
