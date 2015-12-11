package com.practice;


import java.util.Random;
import java.util.Scanner;

/**
 * Created on 12/1/2015.
 * @author
 * @version 1.0
 */

public class JavaProgram6 {
    private static int[][] matrix1;
    private static int[][] Matrix2;
    private static int[][] Matrix3;
    private static int  rowSize;
    private static int  columnSize;

    /**
     * The method initializes the array with random integers from 1 to 500
     * @param array  The array that has to initialized
     * @return        The array after being initialized
     */
    public static int[][] initializeArray(int[][] array) {
        Random rd = new Random();
        int columnLength = array[0].length;

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < columnLength; ++j) {
                array[i][j] = rd.nextInt(500)+1;
            }
        }
        return array;
    }
    /**
     * The method that prints the array to the screen
     * @param array   The array to be printed
     */
    public static void printArray(int[][] array){
        int columnLength = array[0].length;
        for (int i =0 ; i< array.length ;++i) {
            for (int j = 0; j < columnLength; ++j) {
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * This method add two matrices of same dimension.
     * @param matrix_1   The matrix to be added
     * @param matrix_2   The another matrix to be added
     * @return    The matrix that is the sum of two matrices
     */
    public static int[][] addMatrices(int[][] matrix_1, int[][] matrix_2) {
        int rowLength = matrix_1.length;
        int columnLength = matrix_1[0].length;
        int[][] result = new int[rowLength][columnLength];
            for (int i = 0; i < matrix_2.length; ++i) {
                for (int j = 0; j < matrix_2[0].length; ++j) {
                    result[i][j] = matrix_1[i][j] + matrix_2[i][j];
                }
            }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Row size of the Matrix: ");
        rowSize = scan.nextInt();
        while (rowSize <= 0) {
            System.out.print("ERROR!! Should be positive. REENTER: ");
            rowSize = scan.nextInt();
        }
        System.out.print("Column size of the Matrix: ");
        columnSize = scan.nextInt();
        while (columnSize <= 0) {
            System.out.print("ERROR!! Should be positive. REENTER: ");
            columnSize = scan.nextInt();
        }
        // Create the first matrix
        matrix1 = new int[rowSize][columnSize];
        initializeArray(matrix1);
        System.out.println("Matrix1:");
        printArray(matrix1);
        System.out.println();
        System.out.println("***********************************************************");

        // Create the second matrix
        Matrix2 =new int[rowSize][columnSize];
        System.out.println("Matrix2:");
        initializeArray(Matrix2);
        printArray(Matrix2);
        System.out.println();
        System.out.println("***********************************************************");

        // Create the third matrix to hold the values for the sum of two matrix
        Matrix3 =new int[rowSize][columnSize];
        Matrix3 = addMatrices(matrix1,Matrix2);
        System.out.println("After adding the two matrices:");
        printArray(Matrix3);

    }

}
