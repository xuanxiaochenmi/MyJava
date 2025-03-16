package com.liqiang.test5;

import java.util.Scanner;

public class studentTest {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(1, "张三", 18);
        students[1] = new Student(2, "李四", 19);
        students[2] = new Student(3, "王五", 20);
        Scanner sc = new Scanner(System.in);
        // 要求1
        Student stu3 = new Student( 4, "赵六", 21);
        boolean found = false;
        for(Student student : students){
            if (student != null && student.getId() == stu3.getId()) {
                found = true;
                System.out.println("当前学生列表中已存在");
                break;
            }
        }
        if (!found) {
            boolean flag = false;
            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    flag = true;
                    students[i] = stu3;
                    break;
                }
            }
            if (!flag){
                System.out.println("学生列表已满");
                //扩展列表
                Student[] newStudents = new Student[students.length + 1];
                for (int i = 0; i < students.length; i++) {
                    newStudents[i] = students[i];
                }
                newStudents[students.length] = stu3;
                students = newStudents;
            }
        }

        System.out.println("-----------------------");

        // 要求2
        for (Student student : students) {
            if (student == null) continue;
            student.showInfo();
            System.out.println("**************");
        }
        System.out.println("-----------------------");

        //要求3 删除id对应学生信息
        System.out.println("请输入要删除的学生学号");
        int id2 = sc.nextInt();
        found = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id2) {
                students[i] = null;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("没有找到该学生");
        }
        System.out.println("-----------------------");
        for (Student student : students) {
            if (student == null) continue;
            student.showInfo();
            System.out.println("**************");
        }
        System.out.println("-----------------------");

        //要求5
        int  id = 2;
        for (Student student : students) {
            if (student == null) continue;
            if (student.getId() == id) {
                student.setAge(student.getAge()  +1);
                break;
            }
        }
        for (Student student : students) {
            if (student == null) continue;
            student.showInfo();
            System.out.println("**************");
        }


    }
}
