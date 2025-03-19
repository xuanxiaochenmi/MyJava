package com.liqiang.code;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeDemo1 {
    public static int[] list = new int[100];
    static{
        System.out.println("静态代码块执行");
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }
    }

    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println("main方法执行");
        System.out.println(Arrays.toString(list));
        System.out.println(list.toString());
        System.out.println(list1.toString());
    }
}
