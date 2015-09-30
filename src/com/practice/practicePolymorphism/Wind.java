package com.practice.practicePolymorphism;

/**
 * Created by Pravin on 9/29/2015.
 */
public class Wind extends Instrument {
    public void play(Note n){
    System.out.println("Wind.play(): "+ n);
    }

    String what() {
        return "Wind!";
    }
    void adjust(){
        System.out.println("Adjusting Wind");
    }
}
