package com.company1;

public class Overloading {
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.Show(5);
        obj.Show("Ankit");
    }

    public void Show(int a){
        System.out.println(a);
    }

    public void Show(String a){
        System.out.println(a);
    }
}
