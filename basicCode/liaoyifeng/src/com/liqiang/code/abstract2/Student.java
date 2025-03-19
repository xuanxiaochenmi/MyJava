package com.liqiang.code.abstract2;

public class Student extends Person{
    private int grade;

    public Student(int grade) {
        this.grade = grade;
    }
    public Student(){}
    @Override
    public void run(){
        System.out.println("学生在跑");
    }

}
