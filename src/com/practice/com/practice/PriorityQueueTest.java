package com.practice.com.practice;

import java.util.PriorityQueue;

/**
 * Created by Pravin on 11/18/2015.
 */
public class PriorityQueueTest {
    public static void main(String[] args) {

        PriorityQueue<Double> queue = new PriorityQueue<>();

        queue.offer(3.2);
        queue.offer(1.2);
        queue.offer(5.2);
        queue.offer(3.6);
        queue.offer(0.2);

        for(Double q : queue){
            System.out.printf("%5.2f" , q);
        }
        System.out.println();

        while(queue.size()>0){
            System.out.println("The element on que: ");
            System.out.printf("%5.2f %n", queue.peek());
            queue.poll();
            System.out.println("The elements are the poll");
            for(Double q : queue){
                System.out.printf("%5.2f" , q);
            }
            System.out.println();
        }


    }
}
