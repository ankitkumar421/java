package com.company;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a side of square");
        int inp = sc.nextInt();

        int Area = Sqr(inp);
        System.out.println("Area of square is : 5"+Area);
    }

    public static int Sqr(int a){
        return a*a;
    }
}
