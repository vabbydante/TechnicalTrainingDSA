package com.vaibhav.coding.array;

public class SortedOrNot {
    public static void main(String[] args) {
        int arr[] = {3,6,7,8,11,12};
        boolean flag = false;
        for(int i=1; i<arr.length-1; i++){
            if((arr[i]>arr[i-1]) && (arr[i]<arr[i+1])){
                flag = true;
            } else {
                flag = false;
            }
        }
        if(flag){
            System.out.println("Sorted.");
        } else {
            System.out.println("Not Sorted.");
        }
    }
}
