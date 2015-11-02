package com.practice.figures;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaSymbols;

/**
 * Lesson:
 * Class and Objects
 * getter and setter method
 * for loops and nested for loops
 * PrintPatterns Class to print various shapes or patterns using any Characters
 * Created by Pravin on 10/29/2015
 * @author Pravin
 * @version 1.0
 */
public class PrintPatterns {
    //Instance variable character
    private char character;

    //Constructor
    public PrintPatterns(char character) {

        this.character = character;
    }

    /**
     * SetCharacter method to set the char type value
     *
     * @param character
     */
    public void setCharacter(char character) {
        this.character = character;
    }

    /**
     * GetCharacter method to get the char type value
     *
     * @return the character data type that is used in the constructor while creating the instance of the class
     */
    public char getCharacter() {
        return this.character;
    }

    /**
     * This methods prints the straight horizontal line of various length
     * @param lineLength int data type   The length of the line
     */
    public void horizontalStraightLine(int lineLength) {
        for (int i = 0; i < lineLength; ++i) {
            System.out.printf("%c    ", character);
        }

    }
    /**
     * This methods prints the straight vertical line of various length
     * @param lineLength int data type   The length of the line
     */
    public void verticalStraightLine(int lineLength) {

        for (int i = 0; i < lineLength; ++i) {
            System.out.printf("%n%c", character);
        }
    }

    /**
     * This method prints the rectangle pattern of various length and breadth
     * This also prints a square if length is set the same as the breadth
     * @param length  int data type   The length of the rectangle
     * @param breadth int data type   The breadth of the rectangle
     */
    public void rectangle(int length, int breadth) {

        for (int i = 0; i < breadth; ++i) {
            for (int j = 0; j < length; ++j) {
                System.out.printf("%c    ", character);
            }
            System.out.println();
        }
    }

    /**
     * This method prints the right angled triangle
     * The adjacent side and the opposite side of the right angled triangle are same.
     * @param side  int data type The adjacent side of the triangle
     */
    public void RightAngledTriangle(int side) {

        for (int i = 0; i < side; ++i) {
            for (int j = 0; j < side; ++j) {
                if (j <= i) {
                    System.out.printf("%c    ", character);
                }
            }
            System.out.println();
        }
    }

    /**
     * This method prints the pyramid pattern of required side length
     * @param side int data type    The side of the pyramid
     */
    public void pyramid(int side){
        for (int row=1 ; row <= side; ++row){
            for (int blank = side -row; blank > 0;--blank){
                System.out.print("     ");
            }
            for (int filled = 1; filled <=(2*row - 1); ++filled){
                System.out.printf("%c    ", character);
            }
            System.out.println();
        }
    }

    /**
     * This method prints the pyramid pattern upside down of required side length
     * @param side int data type    The side of the pyramid
     */
    public void pyramidUpsidedown(int side){
        for (int row = 1; row <= side ; ++ row){
            for (int blank = 1; blank <= row; ++blank ){
                System.out.print("     ");
            }
            for (int filled = 1; filled <= (side*2)-(2*(row - 1)+1); ++filled){
                System.out.printf("%c    ", character);
            }
            System.out.println();
        }
    }

    /**
     * This method prints the pattern of the diamond of required side length
     * The four side length of the diamond pattern are the same
     * @param side int data type    The length of the side of the diamond
     */
    public void diamond(int side){
        PrintPatterns pn =new PrintPatterns(character);
        pn.pyramid(side);
        pn.pyramidUpsidedown(side-1);
    }


}
