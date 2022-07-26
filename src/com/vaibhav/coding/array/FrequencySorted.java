package com.vaibhav.coding.array;

import java.util.Scanner;

public class FrequencySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int freq = 1, k = 1;
        System.out.println("Enter SORTED elements only : ");
        for (int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        while(k<arr.length){
            while(k<arr.length && arr[k] == arr[k-1]){
                freq++;
                k++;
            }
            System.out.println(arr[k-1] + " " + freq + " times");
            k++;
            freq=1;
        }
        if(arr.length == 1 || arr[arr.length-1] != arr[arr.length-2]){
            System.out.println(arr[arr.length-1] + " " + 1 + " times");
        }
    }
}
