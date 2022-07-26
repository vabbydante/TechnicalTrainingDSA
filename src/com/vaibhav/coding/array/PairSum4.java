package com.vaibhav.coding.array;

import java.util.*;

public class PairSum4 {
    public static void main(String[] args) {
        int arr[] = {2,9,6,3,1,10,40};

        int n = 9;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i<arr.length; i++){
            if (map.get(i) == null) {
                map.put(n-i, i);
            } else {
                System.out.println("Pair sum is : " + map.get(i) + " " + i);
//                return;
            }
        }
    }
}
