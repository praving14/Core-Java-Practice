package com.practice.com.practice.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Pravin on 8/23/2015.
 */
public class MapExamples {


    public static void main(String[] args) {
        System.out.println("Example : Hash Map");
        Map<Integer, String> employee = new HashMap<Integer, String>();

        employee.put(1, "Raj");
        employee.put(8, "Pravin");
        employee.put(3, "Sabin");

        System.out.println(employee.get(3));

        for (Integer s : employee.keySet()) {
            System.out.println(s);
        }
        for (String s : employee.values()) {
            System.out.println(s);
        }

        employee.remove(3);
        System.out.println("Now, Remove the value and key pair with the key 3");

        for (Integer s : employee.keySet()) {
            System.out.println(s);
        }
        for (String s : employee.values()) {
            System.out.println(s);
        }

        System.out.println("Example : Tree Map");

        // TreeMap
        Map<Integer, String> employee2 = new TreeMap<Integer, String>();

        employee2.put(4, "Rajani");
        employee2.put(7, "pravina");
        employee2.put(6, "Sabina");

        System.out.println(employee2.get(6));

        for (Integer p : employee2.keySet()) {
            System.out.println(p);
        }
        for (String g : employee2.values()) {
            System.out.println(g);
        }
    }
}
