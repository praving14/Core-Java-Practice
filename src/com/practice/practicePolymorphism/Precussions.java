package com.practice.practicePolymorphism;

/**
 * Created by Pravin on 9/29/2015.
 */
public class Precussions extends Instrument {
    public void play(Note n){
        System.out.println("Precussions.play(): "+ n);
    }

    String what() {
        return "Precussions!";
    }
    void adjust(){
        System.out.println("Adjusting Precussions");
    }

}
