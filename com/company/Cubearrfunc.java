package com.company;

public class Cubearrfunc {
    public static void main(String[] args) {
        int n[]={8,9,10,27};
        System.out.println("Number of perfect root are "+ Arr(n));
    }

    public static int Arr(int[] n){
        int count=0;
        for (int i=0;i<n.length;i++){
            for (int j=0;j<n[i];j++){
                if(j*j*j==n[i]){
                    count++;
                }
            }
        }

        return count;
    }
}
