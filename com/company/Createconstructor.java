package com.company;

public class Createconstructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Ankit";
        s1.age=20;

        Student s2= new Student();
        s2.age=21;
        s2.name="Ayush";

        s1.StudentInfo();
        s2.StudentInfo();
    }
}

class Student{
    String name;
    int age;

    public void StudentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
