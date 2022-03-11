package com.company;

public class Naturalsum {
    public static void main(String[] args) {
//        int result = Sum(5);
//        System.out.println(result);

        int result = Fact(5);
        System.out.println(result);
    }

    public static int Sum(int n){
        if (n<=1){
            return n;
        }else {
            return n+Sum(n-1);
        }
    }

    public static int Fact(int n){
        if (n==0){
            return 1;
        }else {
            return n*Fact(n-1);
        }
    }
}
