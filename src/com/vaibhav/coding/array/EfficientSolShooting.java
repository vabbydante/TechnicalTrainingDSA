package com.vaibhav.coding.array;

import java.util.Scanner;

public class EfficientSolShooting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int counter = 0;
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // now traversing through the array : 
        for (int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                
                int temp = arr[i];
                arr[i] = arr[counter];
                arr[counter] = temp;
                counter++;
            }
        }
        System.out.println("Now, the array is : ");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println("counter is : " + counter);
    }
}
