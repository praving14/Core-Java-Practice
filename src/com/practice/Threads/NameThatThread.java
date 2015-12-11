package com.practice.Threads;

import java.util.Scanner;

/**
 * Created by Pravin on 11/23/2015.
 */
public class NameThatThread {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int n = sc.nextInt();
        String name= "name1";
        MyThread2 mt;
        if (n == 0)
            mt = new MyThread2 ();
        else
            mt = new MyThread2 (name);
        mt.start ();
    }
}
