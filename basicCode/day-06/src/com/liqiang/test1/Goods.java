package com.liqiang.test1;

public class Goods {
    private String ID;
    private String name;
    private double price;
    private int store_amount;

    public Goods(){}

    public Goods(String ID, String name, double price, int store_amount) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.store_amount = store_amount;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStore_amount() {
        return store_amount;
    }

    public void setStore_amount(int store_amount) {
        this.store_amount = store_amount;
    }

    public void showInfo() {
        System.out.println("商品编号：" + this.ID);
        System.out.println("商品名称：" + this.name);
        System.out.println("商品价格：" + this.price);
        System.out.println("商品库存：" + this.store_amount);
    }
}
