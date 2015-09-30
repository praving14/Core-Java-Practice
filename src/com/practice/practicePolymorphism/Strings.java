package com.practice.practicePolymorphism;

/**
 * Created by Pravin on 9/29/2015.
 */
public class Strings extends Instrument {
    public void play(Note n){
        System.out.println("Strings.play(): "+ n);
    }

    String what() {
        return "Strings!";
    }
    void adjust(){
        System.out.println("Adjusting Strings");
    }
}
