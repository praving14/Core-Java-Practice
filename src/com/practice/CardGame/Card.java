package com.practice.CardGame;

/**
 * Lesson: Classes and Objects: Constructor, getter and setter method
 * Created by Pravin on 10/28/2015.
 * @author Pravin
 */
public class Card {
    private Suite suit;
    private Rank rank;
    // If the constructor is not there, default constructor is created without any parameters
    // Constructor with parameter
    public  Card (Suite suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
        // this.fieldName is used mainly if the local variable or parameter has the same name as the name of the field in the class
        // Shadowing
    }

 // set and get method:
    public void setSuite(Suite suit){
        this.suit= suit;
    }

    public Suite getSuite(){
        return  suit;
    }

    public void setRank(Rank rank){
        this.rank =rank;
    }

    public Rank getRank(){
        return rank;
    }
}
