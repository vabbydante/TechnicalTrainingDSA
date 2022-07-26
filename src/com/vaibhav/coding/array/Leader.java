package com.vaibhav.coding.array;

public class Leader {
    public static void main(String[] args) {
        int arr[]={6,44,17,3,5,2};

        int max=arr[0];
        for(int i=arr.length-1;i>0;i--)
        {
            if(arr[i]>max)
            {
                System.out.println("Leader "+arr[i]);
                max=arr[i];
            }
        }
    }
}
