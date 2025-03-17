package com.liqiang.interface1;

public class Child implements  Person{

    @Override
    public void run(){
        System.out.println("孩子在跑");
    }
    @Override
    public void eat() {
        System.out.println("孩子大快朵颐");
    }
}
