package com.liqiang.code.Innerclass;

public class Main {
    public static void main(String[] args) throws Exception {
        new Outer().testAnonymousClass();
    }
}

class Outer {
    private String message = "Outer的私有字段";

    private void showPrivateMessage() {
        System.out.println("Outer的私有方法");
    }

    public void testAnonymousClass() {
        MyInterface myInterfaceImpl = new MyInterface() {
            @Override
            public void show(String name, int age) { //实现接口定义的方法
                System.out.println(name + "@" + age);
                System.out.println(Outer.this.message); //用Outer.this访问外部类的私有方法
                showPrivateMessage(); //不用 Outer.this也可以直接访问外部类的私有方法
            }
        };

        myInterfaceImpl.show("张三", 18);
    }
}