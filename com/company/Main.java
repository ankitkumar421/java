package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int count;
        String temp;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of string");
        count = sc.nextInt();

        String str[]= new String[count];
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter a string one by one");
        for (int i=0;i<count;i++){
            str[i] = sc2.nextLine();
        }
    }
}
