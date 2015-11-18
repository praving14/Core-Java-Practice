package com.practice;

import java.util.Scanner;

/**
 * Created on 11/17/2015.
 * @author
 * @version 1.0
 */
public class JavaProgram3 {

    /**
     * The method to generate the multiplication table and save it in the multidimensional array
     * @param a      Multidimensional array to in input the value of the multiplication table
     * @param size   The maximum value to find the multiplication table of
     * @return       Multidimensional array int[][] a , with the multiplication table
     */
    public static int[][] generateMultiplicationTable(int[][] a,int size){
        for ( int i =0 ;i <= size ;++i){
            for (int j =0; j<= size; ++j){
                a[i][j] = j*i;
            }
        }
        return a;
    }

    /**
     * The method to print n*n multidimensional array in form of a table
     * @param a     The multidimensional array to be printed in form of a table
     */
    public static void printTable(int[][] a){
        for(int i =0; i < a.length; ++i){
            for (int j =0 ; j < a.length ;++j){
                System.out.printf("%5d", j*i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to Start (Y/N) :");
        String input = sc.next();
        while (input.equalsIgnoreCase("Y")){
            System.out.println("Enter an Integer n (3-30) :" );
            int n =sc.nextInt();
            while (n<3 || n >30){
                System.out.println("ERROR! Valid Range: 3 -30! REENTER: ");
                n =sc.nextInt();
            }
            int[][] array = new int[n+1][n+1];
            System.out.println("0 to " + n + " multiplication table");
            System.out.println("========================================================================");
            generateMultiplicationTable(array,n);
            printTable(array);
            System.out.println("Do you want to Continue (Y/N) :");
            input = sc.next();

        }
        if (input.equalsIgnoreCase("N")) {
            System.out.println("Thank you!");
        }

    }
}
