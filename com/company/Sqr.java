package com.company;

public class Sqr {
    public static void main(String[] args) {

        int opt = SqrNum(5, fun());
        System.out.println(opt);
    }

    public static int SqrNum(int num, int b){
        int result = num*num;
        return result;
    }

    public static int fun(){
        System.out.println("From func");
        return 0;
    }
}
