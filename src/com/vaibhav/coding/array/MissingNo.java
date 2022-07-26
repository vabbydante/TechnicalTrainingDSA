package com.vaibhav.coding.array;

import java.util.Scanner;

// Find the missing number in a given array of 'n' natural numbers.
public class MissingNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking inputs from the user :
        System.out.println("Enter the number of elements : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int k = 0; k<size; k++){
            arr[k] = sc.nextInt();
        }

        // setting the variables :
        int actual = 0;
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }

        // taking the first and last element from the user's array :
        int first;
        int last = arr[arr.length-1];

        for(first = arr[0]; first<=last; first++){
            actual = actual+first;
        }
        int result = actual-sum;
        System.out.println("The missing element is : " + result);
    }
}
