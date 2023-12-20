package com.company;

public class Main {
    public static void main(String... args){

        Car car = new Car();
        car.setColor("Qora");
        car.setModel("Gentra");
        car.setPrice(1869);
        car.setAutoMech("Mexanik");
        car.getInfo();

        System.out.println("------------------------------");

        TugriBurchakliUchburchak uchburchak = new TugriBurchakliUchburchak();
        uchburchak.setA(7);
        uchburchak.setB(8);
        uchburchak.setC(9);
        uchburchak.getYuzi(uchburchak.getA(), uchburchak.getB());
        uchburchak.getPerimetr(uchburchak.getA(), uchburchak.getB(), uchburchak.getC());

        System.out.println("------------------------------");

        Point point = new Point(5,6,7);
    }
}
