package com.practice.CardGame;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pravin on 10/28/2015.
 */
public class Driver {

    public static void main(String[] args){
        DeckOfCard cards =new DeckOfCard();
        cards.displayDeckOfCards();
        cards.shuffleCards();
        cards.displayDeckOfCards();


    }
}
