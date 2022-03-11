package com.company1;

class Encap{
    private int a;
    private int b;

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    public void setA(int n){
        a=n;
    }

    public void setB(int m){
        b=m;
    }
}


public class Encapsulation{
    public static void main(String[] args) {
        Encap obj = new Encap();
        obj.setA(5);
        obj.setB(3);
        System.out.println(obj.getA());
        System.out.println(obj.getB());
    }
}
