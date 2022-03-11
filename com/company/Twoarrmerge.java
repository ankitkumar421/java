package com.company;

import java.util.Arrays;

public class Twoarrmerge {
    public static void main(String[] args) {
        int a[][]={{1,2},{3,4}};
        int b[][]={{1,2},{3,4}};
        int c[][];
        c = new int[a.length][b.length];

        for (int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
              c[i][j]=a[i][j]+b[i][j];
            }
        }

        System.out.println(Arrays.deepToString(c));
    }
}
