package com.practice.CardGame;

import java.security.SecureRandom;


/**
 * Lesson: Array, enums, counter, enhanced for loops
 * Use of enums for list of constants instead of an array
 * Created by Pravin on 10/28/2015.
 * @author Pravin
 */
public class DeckOfCard{
    private Card[] deck;
    private int dealtCard;

    /*
     String Suite[] = {SPADE, HEART, DIAMOND, CLUB};
     String Rank[] = {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
     */

    /**
     * Constructor:
     */
    public DeckOfCard(){
        deck = new Card[52];
        dealtCard= 0;
        int CardCount =0;
        while(CardCount < 52)
            // Example of the enhanced for-loop
        for (Suite s : Suite.values())
            for (Rank r : Rank.values()){
                deck[CardCount] = new Card(s,r);
                CardCount += 1;
            }
    }

    /**
     * This method displays the Card into the screen.
     */
    public String displayCard(Card deck){
        String card = deck.getRank() + " of " +deck.getSuite();
        return card;
    }


    /**
     * The dealCard method basically deals a card from the deck of cards.
     * There is a counter for dealt card so that the dealt card is not dealt again.
     *
     * @return Card The method returns the dealt card
     */
    public Card dealCard(){
        if (dealtCard < 52) return  deck[dealtCard++];
            else
            return null;
    }


    /**
     * The swapCards method swap two cards;
     *
     * @param i int data type    The nth element of Array List to be swaped
     * @param j int data type    The nth element of Array List to be swaped with
     */
    public  void swapCards( int i, int j){
        Card temp = deck[i];
        deck[i] = deck[j];
        deck[j] = temp;

    }

    public void reset(){
        dealtCard = 0;
    }

    public void returnCard(){
        dealtCard = dealtCard - 1;
    }

    /**
     * The ShuffleCards method swap two random cards, basically simulating a shuffle.
     */
    public void shuffleCards(){
        int newIndex;
        SecureRandom rand = new SecureRandom();
        for (int i =0; i < 52; ++i) {
            newIndex = rand.nextInt(52);
            swapCards(i, newIndex);
        }


    }
}
