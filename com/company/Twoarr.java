package com.company;

import java.util.Arrays;

public class Twoarr {
    public static void main(String[] args) {
        int a[][]= {{1,2},{3,4}};
        int sum=0;

        for (int i=0;i< a.length;i++){
           for (int j=0;j< a.length;j++){
               sum=sum+a[i][j];
           }
        }

        System.out.println(sum);
    }
}
