package com.liqiang.code;

public class Student extends Person{
    private int grade;
    private final int score;

    public Student(String name, int age, int grade,int score ) {
        super(name, age);
        this.grade = grade;
        this.score = score;
    }

    public Student() {
        this.score = 0;
    }

    @Override
    public void run(){
        System.out.println("学生在跑");
    }



    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
