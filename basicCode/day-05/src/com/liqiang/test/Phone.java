package com.liqiang.test;

public class Phone {
    // 属性
    private String brand;
    private double price;

    public void call(){
        System.out.println("手机在打电话.");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }
}
