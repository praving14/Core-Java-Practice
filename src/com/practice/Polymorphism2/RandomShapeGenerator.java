package com.practice.Polymorphism2;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by Pravin on 9/29/2015.
 */
public class RandomShapeGenerator {

    private SecureRandom random = new SecureRandom();

    public Shape next(){
        switch(random.nextInt(3)){
            default:
            case 0 : return new Circle();
            case 1 : return new Square();
            case 2 : return new Traingle();

        }


    }
}
