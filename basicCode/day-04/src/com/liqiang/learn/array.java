package com.liqiang.learn;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] tmp = {1, 2, 3, 4, 5};

        String s = "20000";
        String c = new String(s);
        System.out.println(s == c );
        System.out.println(array[0]);
        test(array[0]);
        System.out.println(array[0]);

    }


    public static void test(int a){
        a = 200;
        System.out.println("方法内： " + a);
    }
}
