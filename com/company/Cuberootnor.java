package com.company;

public class Cuberootnor {
    public static void main(String[] args) {
        int n=9;
        int isCube=0;

        for (int i=0;i<=n;i++){
            if (i*i*i==n){
               isCube=1;
            }
        }

        if (isCube==1){
            System.out.println("yes");
        }else if (isCube==0){
            System.out.println("No");
        }
    }
}
