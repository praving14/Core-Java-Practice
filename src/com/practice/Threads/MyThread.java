package com.practice.Threads;

/**
 * Created by Pravin on 11/23/2015.
 */
public class MyThread extends  Thread {
    @Override
    public void run() {
        for (int count = 1, row = 1; row < 20; row++, count++)
        {
            for (int i = 0; i < count; i++)
                System.out.print ('*');
            System.out.print ('\n');
        }
    }
}
