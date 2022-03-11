package com.company;

abstract class Staicblock extends javafx.application.Application {
    static {
        System.out.println("Static block");
        System.exit(0);
    }
}
