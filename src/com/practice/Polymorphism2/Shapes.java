package com.practice.Polymorphism2;

/**
 * Created by Pravin on 9/29/2015.
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args){
        Shape[] s = new Shape[9];
        for (int i =0 ; i<9; i++){
            s[i] = gen.next();
        }
        for (Shape sh :s){
            sh.draw();
        }
    }
}
