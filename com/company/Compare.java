package com.company;

import java.util.Arrays;

public class Compare {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={1,2,3,5};

        if (Arrays.equals(arr1,arr2)){
            System.out.println("Array are equal");
        }else {
            System.out.println("Array not equal");
        }
    }
}
