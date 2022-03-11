package com.company1;

interface myInterface{
    public void Show();
}

public class Test3 implements myInterface{
    public void Show() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Test3 obj = new Test3();
        obj.Show();
    }
}
