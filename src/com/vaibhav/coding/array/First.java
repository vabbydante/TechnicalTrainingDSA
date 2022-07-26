package com.vaibhav.coding.array;

class First {
    public static void main(String[] args) {
        double salary[] = new double[]{1.5,2.5,6.6,10.0};
        int salary1[] = new int[]{1,2,3,4,5};
        float salary2[] = new float[]{1, 2};
        System.out.println(salary);
        System.out.println(salary1);
        System.out.println(salary2);
        System.out.println(salary.length);


        // for (int i = 0; i<salary.length; i++) {
        //     System.out.println(i + " " + salary[i]);
        // } 

        // enhanced for loop : 
        // for(double element : salary){
        //     System.out.println(element);
        // }
    }
}
