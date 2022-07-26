package com.vaibhav.coding.array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,30,40,5,9,100};
//        int[] arr = {100,100,100,100,100,100};

        int max = arr[0];
        int secondmax = -1;

        for (int i=1; i<arr.length; i++){
            if(arr[i]>max){
                secondmax = max;
                max = arr[i];
            }

            if(arr[i]!=max){
                if(arr[i]>secondmax){
                    secondmax = arr[i];
                }
            }
        }
        System.out.println("Second largest element in the array is : " + secondmax);
    }
}
