package com.practice.InterfacePractice;

import java.util.Arrays;

/**
 * Created by Pravin on 10/5/2015.
 */
public class Splitter extends StringProcessor{
    public String process(Object input){
        return Arrays.toString(((String) input).split(" "));
    }

}
