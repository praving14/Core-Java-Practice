package com.practice.SortNSearch;

import java.util.Comparator;

/**
 * Created by Pravin on 10/11/2015.
 */
public class IntegerComparator implements Comparator<Integer> {

    public  int compare (Integer a, Integer b){
        return a-b ;
    }
}
