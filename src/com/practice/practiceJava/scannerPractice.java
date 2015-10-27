package com.practice.practiceJava;

import java.util.*;
/**
 * Created by Pravin on 10/26/2015.
 */
public class scannerPractice {
/*
 * In this class, i will be using scanner to get the input from the users. I will primarily forcus on ths string and play with
 * strings, try to manipulate them.
 */
    public static void reverseString(String word){
        int wordlength = word.length();
        char[] words  = new char[wordlength];
        for (int i = 0 ; i< wordlength ; ++i){
            words[i] = word.charAt(i);
        }

        for (int i = wordlength -1 ; i>=0 ; --i){
            System.out.print(words[i]);
        }
        System.out.println();
    }

    /*
     * virtual Keypad of a phone:
     * On your phone keypad, the alphabets are mapped to digits as follows:
     * ABC(2), DEF(3), GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9).
     */

    static void phoneKeyPad(String input){
        String word = input.toLowerCase();
        int lengthOfWord = word.length();
        System.out.println("The sequence of keypad digits for the word is: ");
        for (int i = 0; i < lengthOfWord ; ++i ){
            if (word.charAt(i) == 'a' || word.charAt(i) == 'b' ||word.charAt(i) == 'c'){
                System.out.print(2);
            }
            else if (word.charAt(i) == 'd' || word.charAt(i) == 'e' ||word.charAt(i) == 'f'){
                System.out.print(3);
            }
            else if (word.charAt(i) == 'g' || word.charAt(i) == 'h' ||word.charAt(i) == 'i'){
                System.out.print(4);
            }
            else if (word.charAt(i) == 'j' || word.charAt(i) == 'k' ||word.charAt(i) == 'l'){
                System.out.print(5);
            }
            else if (word.charAt(i) == 'm' || word.charAt(i) == 'n' ||word.charAt(i) == 'o'){
                System.out.print(6);
            }
            else if (word.charAt(i) == 'p' || word.charAt(i) == 'q' ||word.charAt(i) == 'r' ||word.charAt(i) == 's'){
                System.out.print(7);
            }
            else if (word.charAt(i) == 't' || word.charAt(i) == 'u' ||word.charAt(i) == 'v'){
                System.out.print(8);
            }
            else if (word.charAt(i) == 'w' || word.charAt(i) == 'x' ||word.charAt(i) == 'y' || word.charAt(i) == 'z') {
                System.out.print(9);
            }

        }
    }



    public static void main(String[] args){
        String word1;
        Scanner in = new Scanner(System.in);
        System.out.println("Type a String: ");
        word1 = in.next();
        reverseString(word1);
        phoneKeyPad(word1);
    }
}
