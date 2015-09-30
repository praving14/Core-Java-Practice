package com.practice.practicePolymorphism;

/**
 * Created by Pravin on 9/29/2015.
 */
public class Woodwind extends Wind {
     public void play(Note n){
        System.out.println("Woodwind.play() " + n);
    }
    String what(){
        return "Woodwind!";
    }

}
