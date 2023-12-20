package com.company;

public class TugriBurchakliUchburchak {

    private int a;
    private float b;
    private long c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public long getC() {
        return c;
    }

    public void setC(long c) {
        this.c = c;
    }

    public void getYuzi(int a, float b){
        System.out.println("Uchburchakning yuzi = "+(a*b)/2);
    }
    public void getPerimetr(int a, float b, long c){
        System.out.println("Perimetri = "+(a+b+c));
    }
}
