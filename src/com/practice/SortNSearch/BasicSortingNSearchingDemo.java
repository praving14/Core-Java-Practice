package com.practice.SortNSearch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Pravin on 10/11/2015.
 */
public class BasicSortingNSearchingDemo {

    public static void main(String[] args){


        Random rd = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>();


        for (int i =0; i<20; i++){
            numbers.add(rd.nextInt(100)+1);
        }

        System.out.println("UNSORTED!!");
        printNumbers(numbers);

        //Find number by Linear search
        int index = findNumbers(numbers, 50);
        printIndex(index);

        Collections.sort(numbers, new IntegerComparator());
        System.out.println("SORTED");
        printNumbers(numbers);
       /*
        *Collections.shuffle(numbers);
        * System.out.println("SHUFFLED");
        * printNumbers(numbers);
        */

        // Binary Search
       index = Collections.binarySearch(numbers, 50 , new IntegerComparator());
        printIndex(index);
    }

    public static void printNumbers(ArrayList<Integer> num){
        for (int i = 0; i< num.size();i++){
            System.out.print(num.get(i) + " ");
        }
        System.out.println(" ");
    }

    public static int findNumbers(ArrayList<Integer> num, int index ){
        //linear search
        int foundIndex = -1;
        for (int i = 0; i< num.size();i++){
            if (num.get(i)==index) {
                foundIndex = i;
                break;
            }
        }
        return foundIndex;
    }

    public static void printIndex( int p){
        if (p < 0){
            System.out.println("The number doesnot exist in the list");
        }else {
            p = p+1;
            System.out.println("The number is "+ p + "th number in the List");
        }
    }



}
