package com.liqiang.test2;

import java.util.Scanner;

public class printTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数");
//        int num = sc.nextInt();
//        System.out.println(num);
//
//        System.out.println("请输入一个字符串");
//        String str = sc.next();
//        System.out.println(str);

        System.out.println("请再输入一个字符串");
        String str1 = sc.nextLine();
        System.out.println(str1);


        String[] str2 = str1.split(" ");
        for (int i = 0; i < str2.length; i++) {
            System.out.println(str2[i]);
        }
        System.out.println();




    }
}
