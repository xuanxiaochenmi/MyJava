package com.liqiang.code;

public class GameTets {
    public static void main(String[] args) {
        Role role1 = new Role("乔峰",100);
        Role role2 = new Role("鸠摩智", 100);

        while(true) {
            role1.attack(role2);
            if (role2.getRoleHP() <= 0){
                System.out.println(role1.getRoleName() +
                        "K.O了" + role2.getRoleName());
                break;
            }
            role2.attack(role1);
            if (role1.getRoleHP() <= 0){
                System.out.println(role2.getRoleName() +
                        "K.O了" + role1.getRoleName());
                break;
            }

            }
        }
}

