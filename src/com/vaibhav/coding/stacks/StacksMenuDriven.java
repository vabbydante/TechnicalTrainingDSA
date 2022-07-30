package com.vaibhav.coding.stacks;

import java.util.Scanner;

import static java.lang.System.exit;

class machineStack{
    int capacity = 5;
    int top = -1;
    int[] stack = new int[capacity];

    void push(int item){
        //check overflow :
        if(top == capacity-1){
            System.out.println("Overflow!");
            return;
        }
        top = top + 1;
        stack[top] = item;
    }

    void pop(){
        //check underflow :
        if(top == -1){
            System.out.println("Underflow!");
            return;
        }
        int temp = stack[top];
        System.out.println("Popped element : " + temp);
        stack[top] = 0;
        top = top - 1;
    }

    void peek(){
        if(top == -1){
            System.out.println("No items to peek to!");
            return;
        }
        System.out.println("Peeking top element : " + stack[top]);
    }

    void print(){
        if(top == -1){
            System.out.println("No contents on stack!");
        }
        for(int i = top; i>=0; i--){
            System.out.println(stack[i]);
        }
    }
}

public class StacksMenuDriven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        machineStack mach = new machineStack();
        while(true){
            System.out.println("Stacks Menu : ");
            System.out.println("1. Push an element");
            System.out.println("2. Pop an element");
            System.out.println("3. Peek");
            System.out.println("4. Display Stack Contents");
            System.out.println("5. Exit");
            System.out.println("________________________________");
            System.out.println("Enter choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter item : ");
                    int ele = sc.nextInt();
                    mach.push(ele);
                }
                case 2 -> mach.pop();
                case 3 -> mach.peek();
                case 4 -> mach.print();
                case 5 -> exit(130);
                default -> System.out.println("Wrong Choice!");
            }
        }
    }
}
