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
                if (b[i][j] == -0.00) {
                    System.out.printf("%8.2f",0.00);
                } else {
                    System.out.printf("%8.2f", b[i][j]);
                }
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

    /**
     * This method converts the Matrix to its Reduced row echelon form
     * Reduced row echelon form is really important while working with Matrices
     * A reduced row echelon form has to follow following rules:
     *  All non-zero rows precede (that is appear above) zero rows when both types are contained
     *  in the matrix
     *  The first non zero element of each nonzero row is unity
     *  When the first non zero element of a row appears in column c, then all other elements in column c are zero
     *  The first non-zero element of any nonzero row appears in a later column (further to the right) than the
     *  first non zero element of any preceeding row
     *
     * @param a The double mxn matrix that needs to be converted to ow reduced echelon form
     * @return   The double mxn matrix in reduced row echelon form
     */
    public static double[][] reducedRowEchelonForm(double[][] a){
        int lead = 0;
        int rowLength = a.length;
        int columnLength = a[0].length;
        for (int r =0 ; r < rowLength ;++r){
            if (columnLength <= lead)
                break;
            int i = r;
            while (a[i][lead] == 0){
                //System.out.println("test");
                //Matrix.printMatrix(a);
                 i = i + 1;
                if (rowLength == i){
                    i = r;
                    //System.out.println("check");
                    //Matrix.printMatrix(a);
                    lead =lead + 1;
                    if (lead >= columnLength)
                        break;
                }
            }
            if (lead >= columnLength)
                break;
            RowOperations.swapRows(a,i,r);
            if (a[r][lead] != 0.0 ) {
                double k = 1.0 / a[r][lead];
                RowOperations.multiplyRowByConstant(a, r, k);
                //System.out.println();
                //Matrix.printMatrix(a);
            }
            for (int p = 0 ;p < rowLength ;++p){
                if (p != r){
                    while(a[p][lead] != 0) {
                        double trial = a[p][lead];
                        RowOperations.multiplyRowByConstant(a, r, a[p][lead]);
                        RowOperations.substractRowToAnotherRow(a, r, p);
                        // System.out.println("trial =" + trial);
                        RowOperations.divideRowByConstant(a, r, trial);
                        // System.out.println();
                        // Matrix.printMatrix(a);
                    }
                }
            }

            lead =lead + 1;
        }
        return a;
    }

    // Augment matrix
    // Co-factor of matrix
    // find the basis of the column matrix
    /**
     *  Rank of the Matrix (need row echelon form first)
     *  The rank of A equals the number of
     *  nonzero rows in the row echelon form, which equals
     *  the number of leading entries.
     *  If matrix has fewer columns than rows, its maximum rank is equal
     *  to the maximum number of linearly independent columns.
     *  If matrix has fewer rows than columns, its maximum rank is equal
     *  to the maximum number of linearly independent rows.
     */

    // Nullity of matrix : rank + nullity = number of all columns in the matrix A.

    // Determinant of the matrix

    // Inverse of the matrix

    // Eigen Values and Eigen Vectors

    // Upper triangular form, lower triangular form

    // Gauss-Jordon elimination

    // adjugate?

    // Norms: 1-Norm, 2-Norm, Infinity-Norm, rank, determinant, condition

    // Decompositions: LU, QR, Cholesky, eigenvalues

    // Reformat: unite right [A B], unite down


}