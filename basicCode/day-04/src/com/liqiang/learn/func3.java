package com.liqiang.learn;

import java.util.Scanner;

public class func3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入原价");
        int price = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("是否为头等舱？(请输入y/n)");
        boolean head = sc.next().charAt(0) == 'y' ? true :false;
        System.out.println(planeTicket(price,month,head));

    }
    public static int planeTicket(int price , int month , boolean head){
        //折扣
        double result = 0;
        switch (month) {
            case 1, 2, 3, 4, 11, 12 -> result =getPrice(price,head,0.7,0.65);
            case 5, 6, 7, 8, 9, 10 -> result =getPrice(price,head,0.9,0.85);
            default -> {
                System.out.println("输入的月份不合法");
            }
        }
        return (int) result;
    }
    public static int getPrice(int price , boolean head ,double v0 ,double v1){
        return (int) (price * (head? v1 : v0));
    }


}
