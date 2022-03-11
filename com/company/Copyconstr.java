package com.company;

public class Copyconstr {
    public static void main(String[] args) {
        Car c1= new Car();
        c1.model="BMW";
        c1.price=50000;
        Car c2= new Car(c1);
        c1.Carinfo();
    }
}

class Car{
    String model;
    int price;

    public void Carinfo(){
        System.out.println(this.model);
        System.out.println(this.price);
    }

    Car(Car c2){
        this.model= c2.model;
        this.price= c2.price;
    }

    Car(){

    }
}
