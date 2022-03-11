package com.company;

import java.sql.SQLOutput;

public class MethodArgs {
    public static void main(String[] args) {
        MethodArgs obj = new MethodArgs();
        obj.sqr(obj.Sum(2,5));
    }

        // cal the sum
        public static int Sum(int a, int b){
            int sum = a*b;
            return sum;
        }

        // square
        public static int sqr(int num){
          return num;
        }


}
