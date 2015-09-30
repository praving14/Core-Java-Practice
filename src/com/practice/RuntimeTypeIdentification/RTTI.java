package com.practice.RuntimeTypeIdentification;

import org.omg.PortableInterceptor.USER_EXCEPTION;

/**
 * Created by Pravin on 9/30/2015.
 */
public class RTTI {
    public static void main(String[] args){
        Useful[] x ={
              //  new Useful(),
                new  MoreUseful()
        };
        x[0].f();
        x[0].g();
        x[1].f();
        x[1].g();
       // x[1].u();
       // x[1].v();
/*Note: I cannot call the methods in the derived class MoreUseful since the base class
* doesnot have those methods: Need to be aware of upcast and downcast and in what case it doesnot work.
 */
    }
}
