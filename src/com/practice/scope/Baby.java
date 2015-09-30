package com.practice.scope;

/**
 * Created by Pravin on 8/23/2015.
 */
public class Baby {
    private int servings;

    public Baby (int s){
        this.servings =s ;
    }

    void feed(int servings) {
        this.servings = this.servings + servings;
    }

    void poop() {
        System.out.println("All Better!");
        servings = 0;
    }

    public static void main(String[] args) {
        Baby nancy = new Baby(2);
        nancy.feed(1203);

        System.out.println(nancy.servings);

        nancy.poop();
        System.out.println(nancy.servings);

    }
}