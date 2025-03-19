package com.liqiang.code;

public class CodeDemo2 {
    //实例代码块，无static修饰
    {
        System.out.println("实例代码块执行了");
    }
    public static void main(String[] args) {
        System.out.println("main方法执行了");
        new CodeDemo2();
        new CodeDemo2();
        new CodeDemo2();
    }
}
