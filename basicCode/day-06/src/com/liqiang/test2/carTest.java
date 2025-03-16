package com.liqiang.test2;

import java.util.Scanner;

public class carTest {
    public static void main(String[] args) {

        Car[] cars = new Car[3];

        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            System.out.println("请输入第"+(i+1)+"辆车的品牌");
            cars[i].setBrand(sc.next());
            System.out.println("请输入第"+(i+1)+"辆车的价格");
            cars[i].setPrice(sc.nextDouble());
            System.out.println("请输入第"+(i+1)+"辆车的颜色");
            cars[i].setColor(sc.next());
            cars[i].showInfo();
            System.out.println();
        }

        for(int i = 0; i < cars.length; i++){
            cars[i].showInfo();
            System.out.println("___________");
        }

    }
}
