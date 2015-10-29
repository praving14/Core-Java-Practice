package com.practice.InterfacePractice;

/**
 * Created by Pravin on 10/5/2015.
 */
public abstract class StringProcessor implements Processor {
    public String name(){
        return getClass().getName();
    }

    public abstract String process(Object input);

    public static String s = "If she weighs same as a duck, she's made of wood.";

    public static void main(String[] args){
        Apply.process(new Upcase(),s);
        Apply.process(new LoCase(),s);
        Apply.process(new Splitter(),s);
    }
}
