package com.liqiang.test;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call();
        p.setBrand("xiaomi");
        System.out.println(p.getBrand());
        p.getBrand();

    }

}
