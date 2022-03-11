package com.company1;

class Std{
    Std(){
        System.out.println("Parent constructor");
    }

    public void Show(){
        System.out.println("Parent Class");
    }
}

public class Over extends Std{

    Over(){
        System.out.println("Child Constructor");
    }

    public void Show(){
        super.Show();
        System.out.println("Child Class");
    }

    public static void main(String[] args) {
        Over obj = new Over();
        obj.Show();
    }
}
