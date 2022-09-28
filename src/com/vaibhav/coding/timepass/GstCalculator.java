package com.vaibhav.coding.timepass;

import java.util.Scanner;

public class GstCalculator {
    public static int gstMachine(int amount, int gstPerc){
        int gstAmt = (amount * gstPerc)/100;
        return amount + gstAmt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount excluding GST : ");
        int amt = sc.nextInt();
        System.out.println("Enter the GST Percentage (without % sign) : ");
        int gstPercentage = sc.nextInt();

        System.out.println("Total Price including GST : " + gstMachine(amt, gstPercentage));
    }
}
