package com.vaibhav.coding.array;

public class BarChart {
    public static void main(String[] args) {
        int arr[] = {2,1,3};

        int max=arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for (int i=max; i>=1; i--){
            for(int j=0; j<arr.length; j++){
                if(i<=arr[j]){
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
