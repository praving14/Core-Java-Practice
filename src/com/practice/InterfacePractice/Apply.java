package com.practice.InterfacePractice;

/**
 * Created by Pravin on 10/5/2015.
 */
public class Apply {

    public static void process(Processor p, Object s){
        System.out.println("Using Processor: "+p.name());
        System.out.println(p.process(s));
    }
}
