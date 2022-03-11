package com.company;

import java.util.Arrays;

public class Addelearr {
    public static void main(String[] args) {

//        Array add

//        int a[]={1,2,3,4};
//        int e=5;
//        int temp[];
//        temp = new int[a.length+1];
//
//        for (int i=0;i<a.length;i++){
//            temp[i]=a[i];
//            temp[a.length]=e;
//        }
//
//        System.out.println(Arrays.toString(temp));

//        Add element at position

        int a[]={1,2,4,5};
        int e=3;
        int pos=2;
        int temp[]=new int[a.length+1];

        for (int i=0,j=0;i< temp.length;i++){
            if (i==pos){
                temp[i]=e;
            }else {
                temp[i]=a[j++];
            }
        }

        System.out.println(Arrays.toString(temp));

    }
}
