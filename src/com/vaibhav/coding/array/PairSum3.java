package com.vaibhav.coding.array;

import java.util.Arrays;
import java.util.Scanner;

public class PairSum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,9,6,3,10,1,4};
        int n = sc.nextInt();
        int first = 0;
        int last = arr.length-1;
        Arrays.sort(arr);
        while(first<last){
            if((arr[first]+arr[last] == n)){
                System.out.println("Pair sum is : " + arr[first] + " " + arr[last]);
                return;
            }
            if((arr[first]+arr[last])<n){
                first++;
            } else if ((arr[first] + arr[last]>n)) {
                last--;
            }
        }
    }
}
