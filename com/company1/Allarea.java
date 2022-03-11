package com.company1;

class AreaCal{
    public int Area(int x, int y){
        int area = x*y;
        return area;
    }

    public int Area(int x){
        int area = x*x;
        return area;
    }

    public float Area(float a, float b){
        float area = (a*b)*0.5f;
        return area;
    }
}

public class Allarea {
    public static void main(String[] args) {
        AreaCal obj = new AreaCal();
        int sq = obj.Area(5);
        int rec = obj.Area(2,3);
        float tri = obj.Area(3,4);

        System.out.println("Area of sqaure "+sq);
        System.out.println("Area of rectancgle "+rec);
        System.out.println("Area of tri "+ tri);
    }
}
