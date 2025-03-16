package com.liqiang.test1;

public class ObjectTest {
    public static void main(String[] args) {
        Goods[] goods = new Goods[3];
        goods[0] = new Goods("001", "TV", 5000, 10);
        goods[1] = new Goods("002", "Phone", 2000, 20);
        goods[2] = new Goods("003", "Computer", 8000, 30);
        for (Goods good : goods) {
            good.showInfo();
            System.out.println("--------------");
        }
    }
}
