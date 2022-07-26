package com.vaibhav.coding.array;

import java.util.*;

public class HashMapPractice1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1, "Mango");
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");

        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("Now replacing the Grapes with Oranges");

        map.replace(4, "Oranges");
        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Trying the direct printing : ");
        System.out.println(map);

    }
}
