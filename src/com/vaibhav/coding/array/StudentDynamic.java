//package com.vaibhav.coding;
//
//import java.util.*;
//import java.util.Scanner;
//
//class Student {
//    int rollno;
//    String name;
//    int cls;
//    String section;
//    String address;
//
//    public Student(int rollno, String name, int cls, String section, String address){
//        this.rollno = rollno;
//        this.name = name;
//        this.cls = cls;
//        this.section = section;
//        this.address = address;
//    }
//}
//
//public class StudentDynamic {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        HashMap<Integer,Student> map = new HashMap<>();
//
//        System.out.println("Enter the number of students you want to add : ");
//        int num = sc.nextInt();
//        for (int i = 1; i<=num; i++) {
//            Student = new Student();
//            System.out.println("Enter the details for Student " + i);
//            i = new Student(sc.nextInt(), sc.next(), sc.nextInt(), sc.next(), sc.next());
//            map.put(i, i);
//        }
//
//        for(Map.Entry <Integer,Book> m : map.entrySet()){
//            int key = m.getKey();
//            Student s = m.getValue();
//            System.out.println(key + " Details : ");
//            System.out.println(s.rollno + " " + s.name + " " + s.cls + " " + s.section + " " + s.address);
//        }
//    }
//}
