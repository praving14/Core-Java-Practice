package com.practice.com.practice;

import java.util.*;

/**
 * Created by Pravin on 11/17/2015.
 */
public class PracticeList {

    public static void main(String[] args) {

        String[] colors = {"RED", "BLUE", "WHITE", "BLACK", "ORANGE"};
        List<String> colorlist = new ArrayList<String>();

        for (String c : colors) {
            colorlist.add(c);
        }
        System.out.println("The color list before removing.");
        for (String c: colorlist){
            System.out.printf("%5s ", c);
        }
        System.out.println();
        String[] removeColors = {"BLUE", "WHITE", "ORANGE"};
        List<String> removeList = new ArrayList<String>();

        for (String c: removeColors){
            removeList.add(c);
        }

        removeColorFromList(colorlist,removeList);
        System.out.println("The color list after removing.");
        for (String c: colorlist){
            System.out.printf("%5s ", c);
        }
        System.out.println();

    }
    // Example of Iterator
    public static void removeColorFromList(Collection<String> c1, Collection<String> c2){
        // get iterator
        Iterator<String> iterator = c1.iterator();
        //loop until the collection has items in it
        while (iterator.hasNext()){
            if(c2.contains(iterator.next())){
                iterator.remove();
            }
        }
    }
}
