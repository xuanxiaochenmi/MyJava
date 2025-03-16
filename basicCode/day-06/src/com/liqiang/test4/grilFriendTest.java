package com.liqiang.test4;

public class grilFriendTest {
    public static void main(String[] args) {
        GirlFriend[] grilFriends = new GirlFriend[4];
        grilFriends[0] = new GirlFriend("小红", 18, "女", "打游戏");
        grilFriends[1] = new GirlFriend("小花", 19, "女", "看电影");
        grilFriends[2] = new GirlFriend("小绿", 20, "女", "看电影");
        grilFriends[3] = new GirlFriend("小黄", 21, "女", "看电影");

        for (int i = 0; i < grilFriends.length; i++) {
            grilFriends[i].showInfo();
            System.out.println("---------------------");
        }

        System.out.println("---------------------");
        System.out.println("平均年龄为");
        int sum_age = 0;
        for (int i = 0; i < grilFriends.length; i++) {
            sum_age += grilFriends[i].getAge();
        }

        int avg_age = sum_age / grilFriends.length;
        System.out.println(avg_age);
        System.out.println("---------------------");
        System.out.println("比平均年龄低的为");
        int count = 0;
        for (int i = 0; i < grilFriends.length; i++) {
            if (grilFriends[i].getAge() < avg_age) {
                grilFriends[i].showInfo();
                count ++ ;
            }
        }
        System.out.printf("只有%d个小于平均年龄的姑娘", count);
    }
}
