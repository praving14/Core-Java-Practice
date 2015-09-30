package com.practice.practicePolymorphism;

/**
 * Created by Pravin on 9/29/2015.
 */
public class Instrument {
    public void play(Note n){
        System.out.println("Instrument.play()");
    }

    String what() {
        return "Instrument!";
    }
    void adjust(){
        System.out.println("Adjusting Instrument");
    }
}
