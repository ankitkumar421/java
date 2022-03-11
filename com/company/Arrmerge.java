package com.company;

import java.util.Arrays;

public class Arrmerge {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};

        int[] b = {5, 6, 7, 8};

        int a1 = a.length;

        int b1 = b.length;

        int c1 = a1 + b1;

        int[] c = new int[c1];

        for (int i = 0; i < a1; i++) {
            c[i] = a[i];
        }

        for (int i = 0, j = a.length; j < (a.length + b.length); i++, j++) {
            c[j] = b[i];
        }

        System.out.println(Arrays.toString(c));
    }
}
