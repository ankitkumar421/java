package com.company;

import java.util.Arrays;

public class Factorialarr {
    public static void main(String[] args) {
        int a[]={2,4};
        int res[]= Arr(a);

        System.out.println(Arrays.toString(res));
    }

    public static int[] Arr(int []arr){
        int f=1;
        int fa[] = new int[arr.length+1];

        for (int i=0;i<arr.length;i++){
            for (int j=1;j<=arr[i];j++){
                f=f*j;
                fa[i]=f;
            }
        }

        return fa;
    }


}
