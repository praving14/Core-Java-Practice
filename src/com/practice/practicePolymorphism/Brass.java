package com.practice.practicePolymorphism;

/**
 * Created by Pravin on 9/29/2015.
 */
public class Brass extends Wind {

    public void play(Note n){
        System.out.println("Brass.play(): "+ n);
    }

    void adjust(){
        System.out.println("Adjusting Brass!");
    }
}

