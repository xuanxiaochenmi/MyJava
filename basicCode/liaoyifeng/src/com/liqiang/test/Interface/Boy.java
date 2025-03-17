package com.liqiang.test.Interface;


public class Boy implements Person ,male{
    private String name;
    private int age;

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Boy() {
    }

    @Override
    public void jump() {
        System.out.println("男孩跳起来");
    }
    @Override
    public void run(){
        System.out.println("男孩跑起来");
    }

    @Override
    public void showInfo() {
        System.out.println(this.name + " " + this.age);
    }
}
