package com.vaibhav.coding;

public class MissingNoAnother {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int missing = 0;
        int size = 4;
        for(int i=2; i<size; i++){
            if(arr[i] != arr[i-1]+1){
                missing = arr[i]-1;
            }
        }
        System.out.println("Missing number is : " + missing);
    }
}