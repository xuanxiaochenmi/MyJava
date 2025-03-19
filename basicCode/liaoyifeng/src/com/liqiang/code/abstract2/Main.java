package com.liqiang.code.abstract2;

public class Main {
    public static void main(String[] args) {
        Person p = new Student();
        System.out.println(p);
        p.run();
        Person t = new Teather();
        t.run();

    }
}
