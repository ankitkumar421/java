package com.company1;

class Father{
    public int Expences(){
       return 10000;
    }
}

class Mother extends Father{
    public int Expences(){
        return 5000;
    }
}

class Brother extends Father{
    public int Expences(){
        return 4000;
    }
}

class Me extends Father{
    public int Expences(){
        return 8000;
    }
}


public class Test{
    public static void main(String[] args) {
        Mother m = new Mother();
        System.out.println(m.Expences());

        Brother b = new Brother();
        System.out.println(b.Expences());

        Me me = new Me();
        System.out.println(me.Expences());

    }
}
