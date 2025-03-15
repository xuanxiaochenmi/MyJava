package com.liqiang.test2;

public class User {
    private String username;
    private String password;
    private String mail;
    private String gender;
    private int age;


    public User() {
    }

    public User(String username, String password, String mail, String gender, int age) {
        this.username = username;
        this.password = password;
        this.mail = mail;
        this.gender = gender;
        this.age = age;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * 设置
     * @param mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "User{username = " + username + ", password = " + password + ", mail = " + mail + ", gender = " + gender + ", age = " + age + "}";
    }
}
