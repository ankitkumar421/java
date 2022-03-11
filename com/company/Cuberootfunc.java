package com.company;

public class Cuberootfunc {

    public static void main(String[] args) {
        if (Cube(9)==1){
            System.out.println("It is perfect cube");
        }else{
            System.out.println("Not perfect");
        }
    }

    public static int Cube(int n){
        int iscube=0;

        for (int i=0;i<n;i++){
            if (i*i*i==n){
                iscube=1;
            }
        }

        return iscube;
    }
}
