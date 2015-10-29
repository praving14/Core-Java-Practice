package com.practice.CardGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Pravin on 10/28/2015.
 * @author Pravin
 */
public class DeckOfCard {
    List<String> deck =new ArrayList<String>();
    // Constructor: basically creates the deck of 52 cards and add them into the deck ArrayList of String data type
    public DeckOfCard(){
        for (Suite suit : Suite.values()){
            for (Rank rank : Rank.values()){
                deck.add(rank + " of " + suit);
            }
        }

    }

    /**
     * This method displays the Deck of Cards into the screen
     */
    public void displayDeckOfCards(){
        for (String s : deck){
            System.out.print(deck + " " );
        }
        System.out.println();
    }

    public int lengthOfDeck(){
        return deck.size();
    }

    /**
     *
     * @param i int data type    The nth element of Array List to be swaped
     * @param j int data type    The nth element of Array List to be swaped with
     */
    public  void swapCards( int i, int j){
        String temp = deck.get(i);
        deck.set(i, deck.get(j));
        deck.set(j, temp);

    }


    public void shuffleCards(){
        int newIndex;
        Random rand =new Random();
        for (int i =0; i < deck.size(); ++i){
            newIndex = rand.nextInt(52);
            swapCards(i,newIndex);
        }


    }
}
