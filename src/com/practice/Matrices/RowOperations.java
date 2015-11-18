package com.practice.Matrices;

/**
 * Created by Pravin on 11/4/2015.
 * @author Pravin
 * @version 1.0
 */
public class RowOperations {

    public static int[][] swapRows (int[][] a, int row1, int row2){
        int columnLength = a[0].length;
        int[] temp = new int[columnLength];
        for (int i= 0; i< columnLength ; ++i){
            temp[i] = a[row1][i];
        }
        for (int i= 0; i< columnLength ; ++i){
            a[row1][i] =a[row2][i];
        }
        for (int i= 0; i< columnLength ; ++i){
            a[row2][i] =temp[i];
        }

        return a;
    }

    public static double[][] swapRows(double[][] a, int row1, int row2){
        int columnLength = a[0].length;
        double[] temp = new double[columnLength];
        for (int i= 0; i< columnLength ; ++i){
            temp[i] = a[row1][i];
        }
        for (int i= 0; i< columnLength ; ++i){
            a[row1][i] =a[row2][i];
        }
        for (int i= 0; i< columnLength ; ++i){
            a[row2][i] =temp[i];
        }
        return a;
    }


    /**
     *
     * @param a     int[][]  This is the array where the rows are to be added
     * @param row1  int[m]    The row that is to be added to the nth row
     * @param row2  int[n]   The mth row is added to this row
     * @return      int[][]  The array a is returned where the elements from mth  row is
     *                        is added to the nth row
     */
    public static int[][] addRowtoAnotherRow(int[][] a, int row1 ,int row2){
        int columnLength = a[0].length;
        for (int i=0; i< columnLength ;++i){
            a[row2][i] += a[row1][i];
        }
        return a;
    }

    public static double[][] addRowtoAnotherRow(double[][] a, int row1 ,int row2){
        int columnLength = a[0].length;
        for (int i=0; i< columnLength ;++i){
            a[row2][i] += a[row1][i];
        }
        return a;
    }

    public static int[][] substractRowToAnotherRow(int[][] a, int row1 ,int row2){
        int columnLength = a[0].length;
        for (int i=0; i< columnLength ;++i){
            a[row2][i] -= a[row1][i];
        }
        return a;
    }

    public static double[][] substractRowToAnotherRow(double[][] a, int row1 ,int row2){
        int columnLength = a[0].length;
        for (int i=0; i< columnLength ;++i){
            a[row2][i] -= a[row1][i];
        }
        return a;
    }

    public static double[][] multiplyRowByConstant(double[][] a, int row, double constant){
        int columnLength =a[0].length;
        for (int i =0; i< columnLength; ++i){
            a[row][i] = constant*a[row][i];
        }
        return a;
    }

    public static double[][] divideRowByConstant(double[][] a, int row, double constant){
        int columnLength =a[0].length;
        for (int i =0; i< columnLength; ++i){
            a[row][i] = (a[row][i])/constant;
        }
        return a;
    }


}
