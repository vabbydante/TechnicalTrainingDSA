package com.vaibhav.coding.array;

public class Largest2 {
    public static void main(String[] args) {
        int[] arr = {100,200,1000,900,300};

        int max = arr[0];

        for (int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest element is : " + max);
    }
}