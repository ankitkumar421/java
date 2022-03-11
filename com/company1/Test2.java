package com.company1;

abstract class Animal{
    abstract public void Sound();

    Animal(){
        System.out.println("from constructor");
    }

    public void Show(){
        System.out.println("Abstract class method");
    }
}

abstract class Dog extends Animal{
    public void Sound(){
        System.out.println("Dog Bark");
    }
}

public class Test2 extends Dog{
    public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.Show();
        obj.Sound();
    }
}
