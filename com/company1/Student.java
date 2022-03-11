package com.company1;

class Roll{

    int roll;
    Roll(int roll) {
        this.roll=roll;
        System.out.println(roll);
    }
}


public class Student extends Roll{

    String name;
    Student(String name){
        super(5);
        this.name=name;
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student obj = new Student("Ankit");
    }
}

