package com.liqiang.code;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call();
        p.setBrand("xiaomi");
        System.out.println(p.getBrand());
        p.getBrand();

    }

}
