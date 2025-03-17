package com.liqiang.interface1;

public class Teenager implements Person{
    protected String name = "lee";

    @Override
    public void eat() {
        System.out.println("少年狼吞虎咽");
    }

    @Override
    public void run(){
        System.out.println("少年跑得飞快");
    }
}
