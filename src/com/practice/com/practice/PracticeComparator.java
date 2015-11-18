package com.practice.com.practice;

import java.util.*;

/**
 * Created by Pravin on 11/18/2015.
 */
public class PracticeComparator {

    public static void main(String[] args){
        String[] suits = {"HEART","CLUB","DIAMOND","SPADE"};
        //convert the array to List
        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements %s%n", list);

        Collections.sort(list);
        System.out.printf("Sorted array elements %s%n", list);

        // Collection.reverseOrder?
        Collections.sort(list, Collections.reverseOrder());
        System.out.printf("Sorted array elements %s%n", list);

        Collections.shuffle(list);
        System.out.printf("Shuffled array elements %s%n", list);





    }




}
