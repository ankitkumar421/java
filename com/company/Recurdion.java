package com.company;

public class Recurdion {
    public static void main(String[] args) {
        int r= Mult(2,3);
        System.out.println(r);
    }

//    public static int Sum(int a, int b){
//        if (b==0){
//            return a;
//        }else {
//            return(1+Sum(a,b-1));
//        }
//    }

    public static int Mult(int a, int b){
        if (a<b){
            return Mult(b,a);
        }else if (b!=0){
            return(a+Mult(a,b-1));
        }else {
            return 0;
        }
    }
}
