package com.liqiang.test.override;
class Person {
    public void run() {
        System.out.println("Person.run");
    }
}
class Student extends Person {
    @Override
    public void run() {
        System.out.println("Student.run");
    }
    public void run(int a, int b) {
        System.out.println("Student.run2");
    }
}
public class test {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Student();
        test1(p1);
        test1(p2);
    }
    public static void test1(Person p) {
        p.run();
    }
}
