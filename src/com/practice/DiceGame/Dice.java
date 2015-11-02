package com.practice.DiceGame;

import java.security.SecureRandom;

/**
 * Created by Pravin on 10/30/2015.
 */
public class Dice {
    private int DiceValue;
    int[] face ={};
    private int n;

    public Dice(int n){
        this.n = n;
        face = new int[n];
        for (int i= 0; i < n ; i++){
            face[i] = i+1;
        }
    }

    public int setDiceValue(int facevalue, int DiceValue){
        if (facevalue <= n) {
            this.DiceValue = DiceValue;
            face[facevalue - 1] = DiceValue;

        }
        return face[facevalue - 1];
    }

    public int getDiceValue(){
        return face[DiceValue];
    }

    public int rollDice(){
        SecureRandom sr = new SecureRandom();
        DiceValue = sr.nextInt(n);
        return face[DiceValue];
    }

    public void displayDice(){
        System.out.print("You rolled " + face[DiceValue] + " ");
    }



}
