package com.practice.DiceGame;

import java.util.Scanner;

/**
 * Created by Pravin on 10/30/2015.
 */
public class DriverDice {
    public static int sumOfDiceForPlayer1 =0 ;
    public static int sumOfDiceForPlayer2 =0 ;

    public static void main(String[] args) {
        Dice d = new Dice(3);
        Scanner sc = new Scanner(System.in);
        System.out.println("Player 1 go first: Type Y to play and N to exit ");
        String play1 = sc.next();
        if (play1.equals("Y")) {
            for (int i = 0; i < 5; ++i) {
                int value = d.rollDice();
                d.displayDice();
                System.out.println();
                sumOfDiceForPlayer1 += value;
            }
            System.out.println("The total value is : " + sumOfDiceForPlayer1);

            System.out.println("Now, its time for the Palyer 2: Type Y to play and N to exit");
            String play2 = sc.next();
                if (play2.equals("Y")) {
                    for (int i = 0; i < 5; ++i) {
                        int value = d.rollDice();
                        d.displayDice();
                        System.out.println();
                        sumOfDiceForPlayer2 += value;
                    }
                    System.out.println("The total value is : " + sumOfDiceForPlayer2);
                    System.out.println("Do you want to know who wins? Press Y if you do and N if you donot.");
                    String result = sc.next();
                    if (result.equals("Y")){
                        result(sumOfDiceForPlayer1,sumOfDiceForPlayer2);
                    }else {
                        System.out.println("Its okay. We already know who won and who lost anyway.");
                    }

                } else {
                    System.out.println(" Player 1 wins by default");
                }
        }else {
            System.out.println("Till Next time, then !!! ");
        }



    }

    public static void result(int sumOfDiceForPlayer1, int sumOfDiceForPlayer2){
        if (sumOfDiceForPlayer1 > sumOfDiceForPlayer2){
            System.out.println("Player 1 wins by " + (sumOfDiceForPlayer1 -sumOfDiceForPlayer2) );
        } else if (sumOfDiceForPlayer2 > sumOfDiceForPlayer1 ){
            System.out.println("Player 2 wins by " + (sumOfDiceForPlayer2 -sumOfDiceForPlayer1) );
        }else {
            System.out.println("It is a draw. Thank you for playing!");
        }

    }


}
