package com.liqiang.learn;

import javax.print.DocFlavor;
import java.util.Random;

public class func6 {
    public static void main(String[] args) {
        System.out.println(code(5));

    }

    public static String code(int n){
        StringBuilder res = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < n-1; i++) {
            int k = r.nextInt(52);
            res.append(k < 26 ? (char) ('A' +  k) : (char) ('a' + k - 26));
        }
        int t = r.nextInt(10);
        res.append(t);
        return res.toString();

    }
}
