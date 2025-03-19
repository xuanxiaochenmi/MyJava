package com.liqiang.innerclass;
//外部类
public class Outter {
    public int i = 0;
    private int j = 1;

    public Outter(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public class Inner{
        public void show(){
            System.out.println("Inside Inner");
            System.out.println("public field:" + " " + i);
            System.out.println("private method:" + " " + j);
            Outter.this.i = 50;
            Outter.this.j = 100;
            System.out.println("public field:" + " " + i);
            System.out.println("private method:" + " " + j);

        }
    }
}
