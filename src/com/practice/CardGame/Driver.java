package com.practice.CardGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Pravin on 10/28/2015.
 */
public class Driver {

    public static void main(String[] args){
        DeckOfCard cards =new DeckOfCard();
        Card dealtCard = cards.dealCard();
        System.out.println(cards.displayCard(dealtCard));
        cards.reset();
        cards.shuffleCards();
        for (int i = 0; i<52; ++i) {
            System.out.println(cards.displayCard(cards.dealCard()));
        }




    }
}
