package com.company;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.Scanner;

public class Quadeq {
    public static void main(String[] args) {

        double a,b,c,d,x1,x2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        a = sc.nextDouble();
        System.out.print("Enter the value of b : ");
        b = sc.nextDouble();
        System.out.print("Enter the value of c : ");
        c = sc.nextDouble();

        d = b*b-4*a*c;

        if (d>0){

            x1 = (-b+Math.sqrt(d))/(2*a);
            x2 = (-b-Math.sqrt(d))/(2*a);
            System.out.println("Value of d is > 0");
            System.out.println("Value of x1 is"+ x1);
            System.out.println("Value of x2 is"+ x2);
        }
        else if (d==0){
            x1=x2=-b/2*a;
            System.out.println("Value of d is equal to 0");
            System.out.println(x1);
        }
        else {
            x1= ((-b/2*a)+Math.sqrt(-(d)));
            x2= ((-b/2*a)-Math.sqrt(-(d)));
            System.out.println("Value of d is less than 0");
            System.out.println("Value of x1 is" + x1);
            System.out.println("Value of x2 is" + x2);
        }
    }
}
