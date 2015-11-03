package com.practice.Matrices;

import java.security.SecureRandom;

/**
 * Matrix are basically multi-dimensional arrays. This class only focus on nxn matrices( 2-D).
 * In mathematics, especially Lineal Algebra, there are a lot of operations involving matrices.
 * Matrix class can be used to perform those operation with nxn 2 dimensional arrays.
 *
 *
 * Created by Pravin on 10/29/2015.
 * @author Pravin
 * @version 1.01
 *
 */
public class Matrix {

    /**
     * Prints out the 2-D array in form of nxn matrix
     * @param b nxn array of int data types as an element
     */
    public static void printMatrix(int[][] b) {
        for (int i = 0; i < b.length; ++i) {
            for (int j = 0; j < b[0].length; ++j) {
                System.out.printf("%5d", b[i][j]);
            }
            System.out.println();
        }

    }

    /**
     * Prints out the 2-D array in form of nxn matrix
     * @param b nxn array of double/float data types as an element
     */
    public static void printMatrix(double[][] b) {
        for (int i = 0; i < b.length; ++i) {
            for (int j = 0; j < b[0].length; ++j) {
                System.out.printf("%5d", b[i][j]);
            }
            System.out.println();
        }

    }

    public  static boolean isSquareMatrix(int[][] a){
        int rowLength = a.length;
        int columnLength = a[0].length;
        boolean result = false;
        if (rowLength == columnLength){
            result = true;    }
        else {
            result = false;
        }
        return  result;
    }


    public static int[][] identityMatrix( int a){

        int[][] c =  new int[a][a];

            for (int i =0 ;i<a; ++i)
                for (int j =0 ; j<a ;++i){
                    if (i == j){
                        c[i][j]= 1;
                    }else {
                        c[i][j] = 0;
                    }

                }

        return c;
    }


    public static int[][] createRandomMatrix(int m , int n) {
        int[][] c = new int[m][n];
        SecureRandom rand = new SecureRandom();
        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j) {
                c[i][j] = rand.nextInt();
            }
        return c;
    }

    // rref: reduced row echelon form


    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rowLength = a.length;
        int columnLength = a[0].length;
        int[][] c = new int[rowLength][columnLength];
        if (sameDimension(a,b)) {
            for (int i = 0; i < b.length; ++i) {
                for (int j = 0; j < b[0].length; ++j) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
        } else {
            System.out.println(" The two matrices need to have same dimensions to carry out this operation.");
        }
        return c;
    }

    public static double[][] addMatrices(double[][] a, double[][] b) {
        int rowLength = a.length;
        int columnLength = a[0].length;
        double[][] c = new double[rowLength][columnLength];
        if(sameDimension(a,b)) {
            for (int i = 0; i < b.length; ++i) {
                for (int j = 0; j < b[0].length; ++j) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
        } else {
            System.out.println(" The two matrices need to have same dimensions to carry out this operation.");
        }
        return c;
    }

    public static int[][] substractMatrices(int[][] a, int[][] b) {
        int rowLength = a.length;
        int columnLength = a[0].length;
        int[][] c = new int[rowLength][columnLength];
        if (sameDimension(a,b)) {
            for (int i = 0; i < b.length; ++i) {
                for (int j = 0; j < b[0].length; ++j) {
                    c[i][j] = a[i][j] - b[i][j];
                }
            }
        }else {
            System.out.println(" The two matrices need to have same dimensions to carry out this operation.");
        }
        return c;
    }

    public static double[][] substractMatrices(double[][] a, double[][] b) {

        int rowLength = a.length;
        int columnLength = a[0].length;
        double[][] c = new double[rowLength][columnLength];
        if (sameDimension(a,b)){

            for (int i = 0; i < b.length; ++i) {
                for (int j = 0; j < b[0].length; ++j) {
                c[i][j] = a[i][j] - b[i][j];
                }
            }
        } else
        {
            System.out.println(" The two matrices need to have same dimensions to carry out this operation.");
        }
        return c;
    }

    public static boolean sameDimension(int[][] a, int[][] b) {
        boolean result = false;
        if (a.length == b.length && a[0].length == b[0].length) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static boolean sameDimension(double[][] a, double[][] b) {
        boolean result = false;
        if (a.length == b.length && a[0].length == b[0].length) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }


    public static boolean equals(int[][] a, int[][] b){
        boolean result = true;
        for (int i =0 ;i < a.length ;++i){
            for (int j=0 ; j< a[0].length ;++j){
                if ( a[i][j] != b[i][j])
                    result = false;
                    break;
            }
        }
    return result;
    }

    public static boolean equals(double[][] a, double[][] b){
        boolean result = true;
        for (int i =0 ;i < a.length ;++i){
            for (int j=0 ; j< a[0].length ;++j){
                if ( a[i][j] != b[i][j]){
                    result = false;
                break;}
            }
        }
        return result;
    }


    public static int dotProduct( int[][] a, int[][] b){
        int result = 0;
        if (a.length == b.length && a[0].length == b[0].length ){
        for (int i =0 ;i < a.length ;++i){
            for (int j=0 ; j< a[0].length ;++j){
                result += (a[i][j]*b[i][j]);
            }
        }}else{
            System.out.println(" The two matrices need to have same dimension to carry out this operation.");
        }
        return result;
    }

    public static double dotProduct( double[][] a, double[][] b){
        double result = 0.0;
        if(sameDimension(a,b)){
        for (int i =0 ;i < a.length ;++i){
            for (int j=0 ; j< a[0].length ;++j){
                result += (a[i][j]*b[i][j]);
            }
        }}else{
            System.out.println(" The two matrices need to have same dimension to carry out this operation.");
        }
        return result;
    }

    public static int[][] scalarMultiplication(int[][] a, int n){
        int rowLength = a.length;
        int columnLength = a[0].length;
        int[][] c = new int[rowLength][columnLength];
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[0].length; ++j) {
                c[i][j] = (a[i][j])*n;
            }
        }
        return c;
    }

    public static double[][] scalarMultiplication(double[][] a,int n){
        int rowLength = a.length;
        int columnLength = a[0].length;
        double[][] c = new double[rowLength][columnLength];
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[0].length; ++j) {
                c[i][j] = (a[i][j])*n;
            }
        }
        return c;
    }


    public static int[][] transpose(int[][] a) {
        int columnLength = a.length;
        int rowLength = a[0].length;
        int[][] c = new int[rowLength][columnLength];
        for (int i = 0; i < a[0].length; ++i) {
            for (int j = 0; j < a.length; ++j) {
                c[i][j] = a[j][i];
            }

        }
        return c;
    }

    public static double[][] transpose(double[][] a) {
        int columnLength = a.length;
        int rowLength = a[0].length;
        double[][] c = new double[rowLength][columnLength];
        for (int i = 0; i < a[0].length; ++i) {
            for (int j = 0; j < a.length; ++j) {
                c[i][j] = a[j][i];
            }

        }
        return c;
    }

    public static int[][] Multiplication(int[][] a, int[][] b){
        int columnLength= b[0].length;
        int c[][] = new int[a.length][columnLength];
        if(a[0].length == b.length){
            for (int i = 0; i < a.length; ++i) {
                for (int j = 0; j < b[0].length; ++j) {
                    for (int k =0; k< b.length ;++k){
                        c[i][j] += a[i][k]*b[k][j];
                    }
                }
            }

        }else
        {System.out.println("The size of the matrices does not match for Multiplication operation.");}
    return c;
    }

    public static double[][] Multiplication(double[][] a, double[][] b){
        int columnLength= b[0].length;
        double c[][] = new double[a.length][columnLength];
        if(a[0].length == b.length){
            for (int i = 0; i < a.length; ++i) {
                for (int j = 0; j < b[0].length; ++j) {
                    for (int k =0; k< b.length ;++k){
                        c[i][j] += a[i][k]*b[k][j];
                    }
                }
            }

        }else
        {System.out.println("The size of the matrices does not match for Multiplication operation.");}
        return c;
    }

    public static int[][] power(int[][] a, int n) {
        int rowLength = a.length;
        int columnLength = a[0].length;
        int[][] c = new int[rowLength][columnLength];
        if (rowLength == columnLength) {
            for (int i = 0; i <= n; ++i) {
                {
                    if (i == 0) {
                        c = scalarMultiplication(a, 0);
                    } else if (i == 1) {
                        c = a;
                    } else {
                        c = Multiplication(c, a);
                    }
                }
            }
        } else {
            System.out.println("The matrix must be square to raise it to a power.");
        }
        return c;
    }

    public static double[][] power(double[][] a, int n) {
        int rowLength = a.length;
        int columnLength = a[0].length;
        double[][] c = new double[rowLength][columnLength];
        if (rowLength == columnLength) {
            for (int i = 0; i <= n; ++i) {
                {
                    if (i == 0) {
                        c = scalarMultiplication(a, 0);
                    } else if (i == 1) {
                        c = a;
                    } else {
                        c = Multiplication(c, a);
                    }
                }
            }
        } else {
            System.out.println("The matrix must be square to raise it to a power.");
        }
        return c;
    }

    // Augment matrix

    //echelon form

    // Co-factor of matrix

    // Rank of the Matrix

    // Determinant of the matrix

    // Inverse of the matrix

    // EigenValues and EigenVectors

    // Upper triangular form, lower triangular form

    // Gauss-Jordon elimination

    // adjugate?

    // Norms: 1-Norm, 2-Norm, Infinity-Norm, rank, determinant, condition

    // Decompositions: LU, QR, Cholesky, eigenvalues

    // Reformat: unite right [A B], unite down


}