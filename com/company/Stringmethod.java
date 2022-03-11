package com.company;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Stringmethod {
    private static final Logger logger=Logger.getLogger(Stringmethod.class.getName());
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        logger.info("Enter first number: ");
        int a= sc.nextInt();
        logger.info("Enter second number: ");
        int b= sc.nextInt();
        int s;
        s=a+b;
        logger.log(Level.INFO,"Result is  {0}",s);
    }
}
