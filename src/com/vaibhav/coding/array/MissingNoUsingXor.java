package com.vaibhav.coding.array;

public class MissingNoUsingXor {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,6};

        int x = 0, y = 0, min = 1, max = 6;
        // min and max here is the minimum and maximum element in the given array.

        for(int i = 0; i<arr.length; i++){
            x = x ^ arr[i];
        }

        for (int i = min; i<=max; i++){
            y = y^i;
        }

        System.out.println("The value of x is : " + x);
        System.out.println("The value of y is : " + y);
        System.out.println("The missing number is : " + (x^y));
    }
}
