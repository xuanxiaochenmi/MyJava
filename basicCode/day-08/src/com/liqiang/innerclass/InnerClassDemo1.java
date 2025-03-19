package com.liqiang.innerclass;

public class InnerClassDemo1 {
    public static void main(String[] args) {
        Outter.Inner oi = new Outter(5,6).new Inner();
        oi.show();


    }


}
