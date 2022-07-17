package com.vaibhav.coding;

import java.util.Scanner;

public class NaiveSolShooting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // now traversing through the array : 
        for (int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                for (int j=i+1; j<arr.length; j++){
                    if(arr[j] != 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        System.out.println("New array is : ");
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
