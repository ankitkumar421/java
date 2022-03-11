package com.company;

class Ab{
    String Name="Ankit";
    public void Show(){
        System.out.println(Name);
    }
}

class B extends Ab{
    int Roll= 20;
    public void Show1(){
        System.out.println(Roll);
    }
}

public class Multilevel extends B {

//    String Add = "Sector 9";
    int Roll= 20;

    public void Show2(){
        System.out.println(Roll);
    }

    public static void main(String[] args) {
        Multilevel obj = new Multilevel();
        obj.Show();
        obj.Show1();
        obj.Show2();
    }
}
