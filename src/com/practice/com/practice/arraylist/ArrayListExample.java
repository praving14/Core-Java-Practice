package com.practice.com.practice.arraylist;

import java.lang.ref.SoftReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pravin on 8/23/2015.
 */
public class ArrayListExample {

    public static void swap(List<String> a, int i, int j){
        String temp = a.get(i);
        a.set(i,a.get(j));
        a.set(j,temp);

    }

    public static void main (String[] args){

        List<String> books = new ArrayList<String>();
        books.add("Great Expectation");
        books.add("The Bible");
        books.add("The Hunchback of NotreDame");

        System.out.println("Now using loop!!");
// for loops for the list arrays
        for (String s : books){
            System.out.println(s);
        }

        swap(books,0,1);

        System.out.println("There are "+books.size() + "books.");
        System.out.println("1: " + books.get(0));
        System.out.println("2: " + books.get(1));
        System.out.println("3: " + books.get(2));


        System.out.println("The list of books after removing one: ");
        books.remove(1);
        for (String s : books) {
            System.out.println(s);
        }
    }

}
