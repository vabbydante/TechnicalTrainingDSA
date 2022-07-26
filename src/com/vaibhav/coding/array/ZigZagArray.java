package com.vaibhav.coding.array;

public class ZigZagArray {
    // this didn't work. see ZigZagArray2
    public static void main(String[] args) {
        int arr[] = {4,3,7,8,6,2,1};

        for (int i = 0; i<arr.length-2; i++){
            if((arr[i] < arr[i+1]) && (arr[i+1] > arr[i+2])){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = arr[i+2];
                arr[i+2] = temp;
            }
        }
        System.out.println("Now array is : ");
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
