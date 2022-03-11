package com.company;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of triangle: ");
        int height = sc.nextInt();
        System.out.println("Enter base of triangle: ");
        int base = sc.nextInt();

        TriArea(height,base);
    }

    public static void TriArea(int h, int b){
        int area = (h*b)/2;
        System.out.println("Area of rectange is: "+ area);
    }
}
