package com.company;

public class Removestatic {
    public static void main(String[] args) {

        Removestatic Obj = new Removestatic();
        int s=Obj.Sum(5,2);
        System.out.println(s);
    }
    public int Sum(int a, int b){
        return a+b;
    }
}
