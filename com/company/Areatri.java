package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Areatri {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int l = sc.nextInt();

        System.out.println("Enter widht: ");
        int w = sc.nextInt();

        Area(l,w);
    }

    public static void Area(int a, int b){
        int area = a*b;
        System.out.println("Area of the rectance: "+area);
    }
}
