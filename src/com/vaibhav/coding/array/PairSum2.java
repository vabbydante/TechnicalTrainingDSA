package com.vaibhav.coding.array;

import java.util.Scanner;

public class PairSum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,9,6,3,1,10,4};
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                sum = arr[i] + arr[j];
                if(sum == n){
                    System.out.println("Pair is : " + arr[i] + " " + arr[j]);
                    return; // remove this, if you want to get all the possible pairs which make up the sum.
                }
            }
        }
    }
}
