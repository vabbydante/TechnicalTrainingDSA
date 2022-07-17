package com.vaibhav.coding;

import java.util.Scanner;

public class ArrayOperations {
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		while(true) {
		    System.out.println("Array Operations");
		    System.out.println("*****************************");
		    System.out.println("1. Insert at Specific Position");
		    System.out.println("2. Delete from Specific Position");
		    System.out.println("3. Search in the Array");
		    System.out.println("4. Print the whole array");
		    System.out.println("5. Update an array");
		    System.out.println("6. Exit");
		    System.out.println("*****************************");
		    System.out.println("Enter your choice : ");
		    int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the position : ");
                    int pos = sc.nextInt();
                    System.out.println("Enter the element : ");
                    int ele = sc.nextInt();
                    insertElements(pos, ele, arr, size);
                }
                case 2 -> {
                    System.out.println("Enter the position : ");
                    int pos_del = sc.nextInt();
                    deleteElements(pos_del, arr, size);
                }
                case 3 -> {
                    System.out.println("Enter the element to search in array : ");
                    int searchEle = sc.nextInt();
                    searchInArray(searchEle, arr, size);
                }
                case 4 -> printArray(arr);
                case 5 -> updateArray();
                case 6 -> System.out.println("done");
                default -> System.out.println("Please enter a valid choice!");
            }
		}
	}

    private static void updateArray() {
    }

    private static void printArray(int[] array) {
        System.out.println("The array elements are : ");
        for (int j : array) {
            System.out.println(j);
        }
    }

    private static void searchInArray(int searching_element, int[] array_searching, int size) {
        for (int i = 0; i<size; ++i){
            if(array_searching[i] == searching_element) {
                System.out.println("element found at position : " + i);
                break;
            }
        }
    }

    private static void deleteElements(int position_delete, int[] arr, int size) {
        try{
            System.out.println("Element for deletion : " + arr[position_delete]);
            arr[position_delete] = 0;
            System.out.println("Element at position " + position_delete + "is deleted.");            
        } catch (Exception e){
            System.out.println("No elements to delete!");
        }
    }

    private static void insertElements(int position, int element, int[] arr, int size) {
        try{
            arr[position] = element;
            System.out.println("Element Inserted : " + element);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Position is out of bounds! Try again!");
        }
    }
}
