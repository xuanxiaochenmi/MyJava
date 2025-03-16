package com.liqiang.test3;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < phones.length; i++){
            phones[i] = new Phone();
            System.out.println("请输入品牌");
            phones[i].setBrand(sc.next());
            System.out.println("请输入价格");
            phones[i].setPrice(sc.nextDouble());
            System.out.println("请输入颜色");
            phones[i].setColor(sc.next());
            System.out.println("_______________");
        }

        System.out.println("三个手机的平均价格为：");
        System.out.println((phones[0].getPrice() + phones[1].getPrice() + phones[2].getPrice()) / 3);
    }
}
