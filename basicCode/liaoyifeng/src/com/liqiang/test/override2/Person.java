package com.liqiang.test.override2;

public class Person {
    protected String name;
    protected int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person {
    private int grade;

    public Student(String name, int age,int grade) {
        super(name, age);
        this.grade = grade;
    }

    public Student() {

    }

    @Override
    public int getAge() {
        System.out.println("小爷的年龄是：");
        return super.getAge();
    }

    @Override
    public String toString() {

        return name + age+ grade;
    }
}

