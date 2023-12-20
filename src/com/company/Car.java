package com.company;

public class Car {

    private String color;
    private String model;
    private float price;
    private String autoMech;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAutoMech() {
        return autoMech;
    }

    public void setAutoMech(String autoMech) {
        this.autoMech = autoMech;
    }

    public void getInfo(){
        System.out.println("color = "+color+'\n'+"model = "+model+'\n'+"price = "+price+'\n'+"autoMech = "+autoMech);
    }
}
