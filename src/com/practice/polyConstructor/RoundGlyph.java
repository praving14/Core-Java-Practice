package com.practice.polyConstructor;

/**
 * Created by Pravin on 9/30/2015.
 */
public class RoundGlyph extends Glyph {
    private int radius =1;
    void draw(){
        System.out.println("RoundGlyph.draw().radius= " + radius);
    }

    RoundGlyph( int r){
    radius =r;
    System.out.println("RoundGlyph.RoundGlyph().radius= " + radius);
    }
    void undraw(){
            System.out.println("RoundGlyph.undraw().radius= " + radius);
        }


}
