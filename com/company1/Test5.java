package com.company1;

interface A1{
    public void Show();
}

interface A2 extends A1{
    public void Show1();
}

public class Test5 implements A2{
    @java.lang.Override
    public void Show() {
        System.out.println("From Show");
    }

    public void Show1() {
        System.out.println("From Show1");
    }

    public static void main(String[] args) {
        Test5 obj = new Test5();
        obj.Show();
        obj.Show1();
    }
}
