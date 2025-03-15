package com.liqiang.learn;

public class sunc9 {
    public static void main(String[] args) {
        String res = code(1983);
        System.out.println(code(1983));

    }


    public static String code(int password){
        StringBuilder str = new StringBuilder();
        while(password > 0){
            str.append((password%10 + 5) % 10);
            password /= 10;
        }
        return str.toString();
    }
}
