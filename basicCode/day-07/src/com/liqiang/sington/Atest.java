package com.liqiang.sington;

public class Atest {
    public static void main(String[] args) {
        A a  = A.getInstance(20);

        System.out.println(a.getId());
        A b  = A.getInstance(30);

        System.out.println(a == b);
    }
}
