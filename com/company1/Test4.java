package com.company1;

interface I1{
    public void Show();
}

interface I2{
    public void Show1();
}

public class Test4 implements I1,I2{
    public void Show(){
        System.out.println("for show");
    }

    public void Show1(){
        System.out.println("for show1");
    }

    public static void main(String[] args) {
        Test4 obj = new Test4();
        obj.Show();
        obj.Show1();
    }
}
