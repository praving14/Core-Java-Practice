package com.practice.Matrices;

/**
 * Created by Pravin on 11/4/2015.
 * @author Pravin
 * @version 1.0
 */
public class ColumnOperations {


    public static double[][] swapColumn (double[][] a, int column1, int column2){
        int rowLength = a.length;
        double[] temp = new double[rowLength];
        for (int i= 0; i< rowLength ; ++i){
            temp[i] = a[i][column1-1];
        }
        for (int i= 0; i< rowLength ; ++i){
            a[i][column1-1] =a[i][column2-1];
        }
        for (int i= 0; i< rowLength ; ++i){
            a[i][column2-1] =temp[i];
        }

        return a;
    }

    public static int[][] swapColumn (int[][] a, int column1, int column2){
        int rowLength = a.length;
        int[] temp = new int[rowLength];
        for (int i= 0; i< rowLength ; ++i){
            temp[i] = a[i][column1-1];
        }
        for (int i= 0; i< rowLength ; ++i){
            a[i][column1-1] =a[i][column2-1];
        }
        for (int i= 0; i< rowLength ; ++i){
            a[i][column2-1] =temp[i];
        }

        return a;
    }

    public static double[][] multiplyColumnByConstant(double[][] a, int column, double constant){
        int rowLength =a.length;
        for (int i =0; i< rowLength; ++i){
            a[i][column-1] = constant*a[i][column-1];
        }
        return a;
    }


}
