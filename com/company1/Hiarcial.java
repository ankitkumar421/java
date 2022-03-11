package com.company1;

import com.company.Inheritance;

class  A{
    String name="Ankit";
    public void Show(){
        System.out.println(name);
    }
}

class B extends A{
    int roll=69;
    public void Show2(){
        System.out.println(roll);
    }
}

public class Hiarcial extends A {

    int Class=9;
    public void Show3(){
        System.out.println(Class);
    }

    public static void main(String[] args) {
        Hiarcial obj = new Hiarcial();
        B obj2 = new B();
        obj.Show();
        obj.Show3();

        obj2.Show2();
    }
}
