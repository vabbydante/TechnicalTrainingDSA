package com.vaibhav.coding;

import java.util.Scanner;

// to find the frequency of a number (repetition of a number) in a given array (sorted) :
public class FrequencySorted2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int size = sc.nextInt();
        int freq = 1, i=1;
        int[] arr = new int[size];

        for (int k = 0; k<size; k++){
            arr[k] = sc.nextInt();
        }

        while(i<arr.length) {
            while(i<arr.length && arr[i] == arr[i-1]) {
                freq++;
                i++;
            }
            System.out.println(arr[i-1] + " " + freq);
            i++;
            freq = 1;
        }

        if(arr.length == 1 || arr[arr.length-1]!=arr[arr.length-2]){
            System.out.println(arr[arr.length-1] + " " + 1);
        }
    }
}
