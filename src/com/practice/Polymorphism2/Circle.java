package com.practice.Polymorphism2;

/**
 * Created by Pravin on 9/29/2015.
 */
public class Circle extends Shape {

    public void draw() {
       System.out.println("Circle.draw()");
    }

    public void erase() {
        System.out.println("Circle.erase()");
    }
}
