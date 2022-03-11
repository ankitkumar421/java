package com.company;

import java.sql.SQLOutput;

public class Counteven {
    public static void main(String[] args) {
        int n1=1,n2=10;
        int count =0;

        for (int i=n1;i<=n2;i++){
            if (i%2==0){
                count++;
                System.out.println(i);
            }
        }

        System.out.println("Number of even = "+count);

    }
}
