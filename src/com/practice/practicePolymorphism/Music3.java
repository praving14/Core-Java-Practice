package com.practice.practicePolymorphism;

/**
 * Created by Pravin on 9/29/2015.
 */
public class Music3 {

    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll (Instrument[] e){ //Did you see that we are using the array of objects in here
        for (Instrument i:e){
            tune(i);
        }
    }

    public static void main(String[] args){
        Instrument[] orchestra =  {
                new Wind(),
                new Precussions(),
                new Strings(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
