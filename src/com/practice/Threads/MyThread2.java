package com.practice.Threads;

/**
 * Created by Pravin on 11/23/2015.
 */
public class MyThread2 extends Thread {
    MyThread2(){};
    MyThread2(String name){
        super(name);
    }
    public void run(){
        System.out.println ("My name is: " + getName ());
    }
}
