package com.company;

public class Primenumber {
    public static void main(String[] args) {
        int temp=0;
        int count=0;

        while (count<=100){
            for(int i=1;i<100;i++){
                for (int j=2;j<i;j++){
                    if (i%j==0){
                        temp = temp+1;
                    }
                }

                if (temp==0){
                    System.out.println(i);
                    count++;
                }
                else {
                    temp=0;
                }
            }
        }
    }
}
