package com.liqiang.learn;

public class func5 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i < 201; i++) {
            if (isPrime(i)){
                System.out.print(i + " ");
                count ++ ;
            }
        }
        System.out.println();
        System.out.println("一共有"+count +"个质数");
    }

    public static  boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (i * i > n) break;
            if (n % i == 0) return false;
        }
        return true;
    }
}
