package com.practice.CardGame;

/**
 *
 * Created by Pravin on 10/28/2015.
 * @author Pravin
 */
public class Card {
    private Suite suit;
    private Rank rank;
    // Constructor
    public  Card (Suite suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }


    public void setSuit(Suite suit){
        this.suit= suit;
    }

    public Suite getSuit(){
        return  suit;
    }

    public void setRank(Rank rank){
        this.rank =rank;
    }

    public Rank getRank(){
        return rank;
    }
}
