package com.liqiang.learn;

import java.util.Scanner;

public class liearn {
    public static void main(String[] args) {
        test4();
    }

    public static void test4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输选择服务：");
        int n = sc.nextInt();
        switch (n) {
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预订");
            case 3 -> System.out.println("机票改签");
            case 4 -> System.out.println("退出服务");
            default -> System.out.println("退出服务");
        }

    }


    public static void test3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n){
            case 1:
//                System.out.println("周一");
//                break;
            case 2:
//                System.out.println("周二");
//                break;
            case 3:
//                System.out.println("周三");
//                break;
            case 4:
//                System.out.println("周四");
//                break;
            case 5:
                System.out.println("工作日");
                break;
            case 6:
//                System.out.println("周六");
//                break;
            case 7:
                System.out.println("周末");
                break;
            default:
                System.out.println("输入错误");



        }

    }
    public static void test2(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("具有最高身高的为：" + (a > b ? (a > c ? "a" : "c") :(b > c ? "b" : "c" )) );
    }

    public static void test1(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = n % 10;
        int s = (n / 10) % 10;
        int b = n /100 % 10;

        System.out.println(
                "个位是：" + g + "\n"
                        + "十位是：" + s + "\n"
                        + "百位是：" + b + "\n"
        );
    }
}
