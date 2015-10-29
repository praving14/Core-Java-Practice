package com.practice.InterfacePractice;

import javafx.beans.binding.ObjectExpression;

/**
 * Created by Pravin on 10/5/2015.
 */
public interface Processor {
    String name();

    Object process(Object input);
}
