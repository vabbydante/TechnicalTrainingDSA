package com.vaibhav.coding.array;

import java.util.Scanner;

public class MissingNoEfficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int total = 1;
        for(int i = 2; i<=(size+1); i++){
            total+=i;
            total-=arr[i-2];
        }
        System.out.println("The missing number in the series is : " + total);
    }
}
