package com.liqiang.test4;

public class GirlFriend {
    private String name;
    private int age;
    private String sex;
    private String hobby;

    public GirlFriend() {

    }
    public GirlFriend(String name, int age, String sex, String hobby) {
    	this.name = name;
    	this.age = age;
    	this.sex = sex;
    	this.hobby = hobby;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void showInfo() {
    	System.out.println("姓名：" + this.name);
    	System.out.println("年龄：" + this.age);
    	System.out.println("性别：" + this.sex);
    	System.out.println("爱好：" + this.hobby);
    }
}
