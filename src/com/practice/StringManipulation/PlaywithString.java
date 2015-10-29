package com.practice.StringManipulation;

import java.util.StringTokenizer;

/**
 * Created by Pravin on 10/12/2015.
 */
public class PlaywithString {

    /*
     * This method takes the string and replaces the part of the string with the replacement string
     */
    public static String replaceOccurance(String str, String orig, String repl){
        int index = str.indexOf(orig);
        if (index >0 ) {
           str= str.substring(0, index) + repl + str.substring(index + orig.length());
        }
        return str;

    }
    /*
     * Tokenizers:  There is a class called StringTokenizer
     * boolean hasMoreTokens();
     * String nextToken();
     *
     */
    public static void printTokens(String str){
        StringTokenizer tokenizer = new StringTokenizer(str); // StringTokenizer(str, " , "); where "," is the delimiter
        for (int count = 0; tokenizer.hasMoreElements(); count++){
            System.out.println("Token " + count + ": " + tokenizer.nextToken());
        }
    }

    /*
     * Encryptor and Decryptor
     */
    public static String encryptCaesar(String str, int key){
        String result =" ";
        if (key < 0){
            key = 26 -(-key % 26);

        }
        for (int i =0; i < str.length(); i++){
            char ch = str.charAt(i);
            result += encryptchar(ch, key);

        }
        return result;
    }
    /*
     * An Encryptor  method to encrypt a character:
     */
    public static char encryptchar(char ch, int key){
        if (Character.isUpperCase(ch)){
           return (char)('A' + ((ch -'A' + key)% 26));
        } else if (Character.isLowerCase(ch)){
            return (char)('a' + ((ch -'a' + key)% 26));
        }else
            return ch;

    }


    public static void  main(String[] args){

         String sentence = "My name is Pravin.";
         String newName = "Sabin";
         String oldName = "Pravin";
         System.out.println("Before replacement: " +sentence);
         String newSentence = replaceOccurance(sentence, oldName, newName);
         System.out.println("After Replacement: " + newSentence);
        printTokens(sentence);
        System.out.println("Now, Lets encrypt it with 3 step");
        String pseudo = "Zorro";
        String encrypt = encryptCaesar(pseudo,3);
        System.out.println("The encrypted version of Zorro is: " + encrypt);
        String decrypt = encryptCaesar(encrypt, -3);
        System.out.println("The dncrypted version is: " + decrypt);
    }
}
