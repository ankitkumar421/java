package com.company;

import java.util.Arrays;

public class Copyarr {
    public static void main(String[] args) {

        int a[]={1,2,3,4};
//        int b[]= new int[a.length];
//        int b[]= a.clone();
//        System.arraycopy(a,0,b,0,4);
        int b[]= Arrays.copyOf(a,4);

//        for (int i=0;i<a.length;i++){
//            b[i]=a[i];
//        }

        for (int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println(" ");
        for (int i=0;i<a.length;i++){
            System.out.print(b[i]);
        }
    }
}
