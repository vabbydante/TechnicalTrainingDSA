package com.vaibhav.coding;

public class SpanOfArray {
    public static void main(String[] args) {
        int arr[] = {99, 10, 20, 35, 2, 6, 3};
        int first = arr[0];
        int second = arr[0];

        int max = 0, min = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                first = arr[i];
            }
            if (arr[i] < second) {
                second = arr[i];
            }
        }
        System.out.println("Max is " + first);
        System.out.println("Min is " + second);
        System.out.println("Span is : " + (first - second));
    }
}
