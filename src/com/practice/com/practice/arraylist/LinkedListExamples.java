package com.practice.com.practice.arraylist;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Pravin on 11/17/2015.
 */
public class LinkedListExamples {

    public static void ConvertToLowerCase(List<String> c1){
        ListIterator<String> iterator = c1.listIterator();
        while (iterator.hasNext()){
            String color = iterator.next();
            iterator.set(color.toLowerCase());
        }
    }

    public static void removeItems(List<String> c1, int start, int end){
        c1.subList(start,end).clear();
    }

    public static  void  reversedList(List<String> c1){
        ListIterator<String> iterator =c1.listIterator(c1.size());
        System.out.println("The list in reverse order");
        while(iterator.hasPrevious()){
            System.out.printf("%5s ",iterator.previous());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] colors1 = {"RED", "ORANGE", "BLUE", "BLACK", "WHITE"};
        String[] colors2 = {"BROWN", "GREY", "YELLOW", "PURPLE", "PLAIN"};



        LinkedList<String> list1 = new LinkedList<String>();
        for (String s: colors1){
            list1.add(s);
        }

        System.out.println("The list 1 at the beginning.");
        for(String s: list1){
            System.out.printf("%5s ", s);
        }

        LinkedList<String> list2 = new LinkedList<String>();
        for (String s: colors2){
            list2.add(s);
        }
        System.out.println();

        list1.addAll(list2);
        System.out.println("The list 1 after addAll() method");
        for(String s: list1){
            System.out.printf("%5s ", s);
        }
        System.out.println();

        list2 = null;

        ConvertToLowerCase(list1);
        System.out.println("The list 1 in Lower Case");
        for(String s: list1){
            System.out.printf("%5s ", s);
        }
        System.out.println();

        removeItems(list1,2,5);
        System.out.println("The list 1 after removing range of element from 3rd to 6th element");
        for(String s: list1){
            System.out.printf("%5s ", s);
        }
        System.out.println();


        reversedList(list1);
    }


}
