package com.practice.Matrices;

/**
 * Created by Pravin on 11/1/2015.
 * @author Pravin
 */
public class MatricesTest {

    public static void main(String[] args) throws Exception {
        double[][] a = {{1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0}, {0.0, 1.0, 2.0, 3.0},{0.0, 1.0, 2.0, 3.0}};
        double[][] b ={{1,2,1},{2,2,2},{1,0,1}};
        double[][] c = {{3,-2,4,7},{2,1,0,-3},{2,8,-8,2}};


        System.out.println();
        Matrix.printMatrix(c);
        System.out.println("The row reduced echelon form is: " );
        Matrix.reducedRowEchelonForm(c);
        Matrix.printMatrix(c);
    }
}
