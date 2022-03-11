package com.company;

class A{
    String name="Ankit";
    public void Show(){
        System.out.println(name);
    }
}

public class Inheritance extends A{

    int roll=5;

    public void Show1(){
        System.out.println(roll);
    }

    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        obj.Show();
        obj.Show1();
    }
}
