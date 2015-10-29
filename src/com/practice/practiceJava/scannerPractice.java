package com.practice.practiceJava;

import java.util.*;
/**
 * Created by Pravin on 10/26/2015.
 * @author Pravin
 * @version 1.0
 *
 */
public class  scannerPractice{


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" Input the String that you want to reverse= ");
        String userStringInput = input.next();
        simplyReverseString(userStringInput);
    }

    /**
     *  Use of String Builder or String Buffer class to reverse the String
     * @param input         String data type: The String that will be reversed
     * @return newString    String data type: The string where each character  is reversed
     */
    public static String reverseStringUsingStringBuilder(String input){

        String oldString = input;
        String newString = new StringBuilder(oldString).reverse().toString();
        System.out.println(newString);
        return newString;
    }

    /**
     * Reverse string algorithm
     * @param input         String data type: The original String that will be reversed
     * @return reverse      String data type: The string where each character  is reversed
     */

    public static void simplyReverseString(String input){
        String original = input;
        String reverse =  "";
        int length =  original.length();
        for (int i =length-1; i>=0; --i){
            reverse += original.charAt(i);
        }
        System.out.println(reverse);
    }


    /**
     * Virtual Phone Keypad: Gives the consecutive digit value for each of the character in the String
     * ABC(2), DEF(3), GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9).
     * @param input     String data type;
     */

    public void phoneKeyPad(String input){
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
            System.out.println();
        }
    }


    /**
     * Palindromic test: The method test to see if the word is palindromic: madam is same when reversed.
     * @param input             The word that will undergo the palindromic test
     * @return  boolean type    It returns true if the test pass and false if the test false.
     */
   public boolean palindromeTest(String input){
        String oldWord = input;
        boolean result;
        for (int i =0 ; i < oldWord.length()/2; ++i){
            if (oldWord.charAt(i) != oldWord.charAt(oldWord.length() -(i+1))){
                result = false;
            } else
                result =true;
        }
       return result;

    }



}
