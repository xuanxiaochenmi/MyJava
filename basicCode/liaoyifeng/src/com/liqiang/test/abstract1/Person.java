package com.liqiang.test.abstract1;

abstract class Person {
    protected String name;
    protected int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public abstract String getName();
}
