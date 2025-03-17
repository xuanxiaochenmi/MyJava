package com.liqiang.abstract1;

public abstract class Person {

    public final  void write(){
        System.out.println("write1");
        writeMain();
        System.out.println("write1");
    }

    public abstract void writeMain();
}
