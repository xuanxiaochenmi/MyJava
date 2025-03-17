package com.liqiang.sington;

import java.security.PrivateKey;

public class A {
    private static A a ;

    private int id ;
    private A() {
        this.id = 0 ;
    }
    private A(int id){
        this.id = id;
    }

    public static A getInstance(int id) {
        if (a == null) {
            a = new A(id);
        }
        return a ;
    }

    public static A getInstance() {
        if (a == null) {
            a = new A();
        }
        return a ;
    }

    public int getId() {
        return id;
    }
}
