package com.practice.Matrices;

/**
 * Created by Pravin on 11/1/2015.
 */
public class MatricesTest {

    public static void main(String[] args){
        int[][] a = {{1,2,3,6},{4,5,6,9},{1,2,3,5},{2,3,4,7}};
        int[][] b = {{7,8},{9,10},{11,12}};
        int[][] c;
        Matrix.printMatrix(a);
        c = Matrix.power(a,3);
        Matrix.printMatrix(c);
    }
}
