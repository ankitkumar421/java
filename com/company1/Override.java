package com.company1;

class O{
    public void Show(){
        System.out.println("Hello");
    }
}

public class Override extends O{
    public void Show(){
        super.Show();
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        Override obj = new Override();
        obj.Show();
    }
}
