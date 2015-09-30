package com.practice.polyConstructor;

/**
 * Created by Pravin on 9/30/2015.
 */
public class Glyph {
    void draw(){
        System.out.println("Glyph.draw()");
    }
    Glyph(){
        System.out.println("Glyph() before draw");
        draw();
        System.out.println("Glyph() after draw");
    }
}
