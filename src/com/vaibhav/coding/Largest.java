package com.vaibhav.coding;

public class Largest {
    public static void main(String[] args) {
        int[] arr = {100,200,1000,900,300};

        boolean isMax;

        for (int i = 0; i<arr.length; i++) {
            isMax = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    isMax = false;
                    break;
                }
            }
            if(isMax) {
                System.out.println("Largest element is : " + arr[i]);
            }
        }
    }
}