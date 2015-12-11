package com.practice.Threads;

/**
 * Created by Pravin on 11/23/2015.
 */
public class ThreadDemo {
    public static void main (String [] args)
    {
        MyThread mt = new MyThread ();
        mt.start ();
        for (int i = 0; i < 50; i++)
            System.out.println ("i = " + i + ", i * i = " + i * i);
    }
}
