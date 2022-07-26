package com.vaibhav.coding.array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,2,2,2,3,3,3,3,4,4,5,5};
//        int arr[] = {2,2,2,1,1,6,6,9};

        System.out.println("The non-duplicate array elements are : ");
        for (int i = 1; i<arr.length; i++){
            if (arr[i-1] != arr[i]) {
                System.out.print(arr[i - 1] + " ");
            }
        }
        // for the last element :
        System.out.print(arr[arr.length-1]);
    }
}
