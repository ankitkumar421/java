package com.company;

public class Cubearr {
    public static void main(String[] args) {
        int count=0;
        int n[]={8,9,10,27};
            for (int i=0;i<n.length;i++){
                for (int j=0;j<n[i];j++){
                    if(j*j*j==n[i]){
                        count++;
                    }
                }
            }
        System.out.println("total perfect cube number: "+count);
    }
}
