package com.practice.CardGame;

/**
 * 4 Suites in the card
 * Created by Pravin on 10/28/2015.
 * @author Pravin
 * @version 1.0
 */
public enum Suite {
    SPADE(1) ,
    HEARTS(2) ,
    DIAMOND(3) ,
    CLUBS(4);

    private int value;
    // Constructor of enum always has to be private. We can specify the enum constant value at creation time using Constructor
    private Suite(int value){
        this.value =value;
    }

    public int getValue(){
        return value;
    }


}


