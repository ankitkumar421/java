package com.company;

import sun.security.util.ArrayUtil;

import java.lang.reflect.Array;

public class Findarr {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int find=2;
        for(int i=0;i< a.length;i++){
            if (find==a[i]){
                System.out.println("Found "+find+" at index "+i);

            }
        }
    }
}
