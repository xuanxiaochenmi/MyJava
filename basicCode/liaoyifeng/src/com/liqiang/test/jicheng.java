//package com.liqiang.test;
//sealed class Person permits Student {
//    protected String name;
//    protected  int age;
//
//    public Person() {
//    }
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}
//
//
//final class  Student extends  Person{
//    private int score;
//    public Student() {}
//    public Student(String name, int age, int score) {
//        super(name, age);//调用父类的构造方法
//        this.score = score;
//    }
//
//    public int getScore() {
//        return score;
//    }
//
//    public void setScore(int score) {
//        this.score = score;
//    }
//    public void show() {
//        System.out.println("姓名：" + name + "年龄：" + age + "成绩：" + score);
//    }
//}
//public class jicheng {
//    public static void main(String[] args) {
////        Student s = new Student("李四", 20, 100);
////        s.show();
////        Person p = new Student("lee",20,90);
////        System.out.println(p.getName() + " " +p.getAge());
////
////        Student s1 = new Student();
////        Person p1 = s; // upcasting, ok
////        Object o1 = p; // upcasting, ok
////        Object o2 = s; // upcasting, ok
//
//        Person p = new Person();
//        System.out.println(p instanceof Person); // true
//        System.out.println(p instanceof Student); // false
//
//        Student s = new Student();
//        System.out.println(s instanceof Person); // true
//        System.out.println(s instanceof Student); // true
//
//        Student n = null;
//        System.out.println(n instanceof Student); // false
//
//        Object obj = "hello";
//        if (obj instanceof String) {
//            String s1 = (String) obj;
//            System.out.println(s1.toUpperCase());
//        }
//
//    }
//}
