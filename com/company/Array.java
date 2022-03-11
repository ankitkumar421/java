package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array {


    public static void main(String[] args) {

        int sum=0;
        int res=0;
        int a[]= {5,3,10};

        for (int i=0;i<a.length;i++){
           sum=sum+a[i];
           res=sum/a.length;
        }

        System.out.println(res);






//      int num1[],num2[];
//      num1 = new int[5];
//      num2 = new int[5];
//      Scanner sc = new Scanner(System.in);
//      System.out.println("Element of first array: ");
//      for (int i=0;i< num1.length;i++){
//          num1[i]=sc.nextInt();
//      }
//
//      System.out.println("Element of second array: ");
//      for (int i=0;i< num2.length;i++){
//          num2[i]=sc.nextInt();
//      }
//
//      int result[] = Sum(num1,num2);
//        for (int i=0;i< num2.length;i++){
//            System.out.println("Sum of arrray: "+result[i]);
//        }
//    }
//
//    public static int[] Sum(int num1[], int num2[]){
//        int sum[];
//        sum = new int[5];
//
//        for (int i=0;i< num1.length;i++){
//            sum[i]=num1[i]+num2[i];
//        }
//
//        return sum;
    }

}
