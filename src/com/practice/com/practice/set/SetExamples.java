package com.practice.com.practice.set;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Pravin on 8/23/2015.
 */
public class SetExamples {
    // No index
    public static void main (String[] args){

// Tree Set: Sorted;
        SortedSet<String> books = new TreeSet<String>();
        books.add("Great Expectation");
        books.add("The Bible");
        books.add("Great Expectation");
        books.add("The Hunchback of NotreDame");
        System.out.println(books.size());
        System.out.println("This is the example of Tree Set");

        // We can use headSet and tailSet in Tree set of Sorted set
        System.out.println(books.headSet("The Bible"));
        System.out.println(books.tailSet("The Bible"));




        books.remove("The Bible");

// for loops for the list arrays
        System.out.println(books);

        //Hashset
        System.out.println("Now the example of a Hash set");
        Set<String> anotherBook = new HashSet<String>();
        anotherBook.add("Great Expectation");
        anotherBook.add("The Bible");
        anotherBook.add("Great Expectation");
        anotherBook.add("The Hunchback of NotreDame");
        anotherBook.add("");

        System.out.println(anotherBook);

        anotherBook.remove("The Hunchback of NotreDame");

        System.out.println(anotherBook);



    }

}

