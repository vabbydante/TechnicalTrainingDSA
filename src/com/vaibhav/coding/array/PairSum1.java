package com.vaibhav.coding.array;

import java.util.Scanner;
// this program is made by me :
public class PairSum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,9,6,3,1,10,4};

        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<arr.length; i++){
            sum = arr[i] + arr[i-1];
            if(sum==n){
                System.out.println("The pair is : " + arr[i-1] + " + " + arr[i]);
                return;
            }
        }
    }
}
