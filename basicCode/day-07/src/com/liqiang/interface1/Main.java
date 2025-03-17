package com.liqiang.interface1;

public class Main {
    public static void main(String[] args) {
        Person c = new Child();
        c
        System.out.println(b.name);

//        eat(c);
//        eat(b);
//
//        D d = new D();
//        d.show1();
//        d.show2();
//        d.show3();


    }

    interface A{
        void show1();
    }
    interface B {
        void show2();
    }
    interface C extends B, A{
        void show3();
    }
    public static class D implements C{
        @Override
        public void show3() {

        }

        @Override
        public void show1() {

        }

        @Override
        public void show2() {

        }
    }

    public static void eat(Person p){
        p.eat();
    }

    public static void run(Person p){
        p.run();
    }
}
