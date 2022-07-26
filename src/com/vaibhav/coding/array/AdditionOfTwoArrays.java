package com.vaibhav.coding.array;

public class AdditionOfTwoArrays {
    public static void main(String[] args) {
        int firstArr[] = {2,1,3,4};
        int secondArr[] = {4,2,4,5};
        int thirdArr[] = new int[firstArr.length];

        for (int i = 0; i<firstArr.length; i++){
            thirdArr[i] = firstArr[i] + secondArr[i];
            System.out.print(thirdArr[i] + " ");
        }
    }
}
