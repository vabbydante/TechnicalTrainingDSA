package com.vaibhav.coding.linkedlist;


class Node{
    int data;
    Node next;
    //1. next ka datatype Node isliye rakhe hai kyuki ek single node hogi
    // to uske pas ek data, aur ek next hogi. to uska reference node type ka hi banega na ? yes.
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedListOperations {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(12);
        Node n3 = new Node(13);
        Node n4 = new Node(15);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        System.out.println("printing the Linked List : ");
        Node current = n1;
        while(current != null){
            System.out.println(current.data);
//            System.out.println(current.next);
            current = current.next;
        }
    }
}
