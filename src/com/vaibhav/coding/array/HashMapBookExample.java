package com.vaibhav.coding.array;

import java.util.*;

class Book{
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class HashMapBookExample {
    public static void main(String[] args) {
        // creating a map of books :
        HashMap<Integer,Book> map = new HashMap<>();

        //creating books :
        Book b1 = new Book(101, "UNIX", "Vabby", "DVC", 10);
        Book b2 = new Book(102, "C", "Someone", "CTPS", 15);
        Book b3 = new Book(103, "UNIX", "Anyone", "BALRAM", 5);

        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);

        // now, traversing our Book Map :

        for(Map.Entry<Integer,Book> m : map.entrySet()){
            int key = m.getKey();
            Book b = m.getValue();
            System.out.println(key + " Details : ");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
