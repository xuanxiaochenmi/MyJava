package com.liqiang.learn;
import java.util.Random;
public class leecode {
    public static void main(String[] args) {
        System.out.println(zhishu(10000));
    }

    public static int test6(){
        Random r = new Random();
        int n = r.nextInt(10S);
    }

    public static boolean zhishu(int x){
        for (int i = 2 ; i < x ; i++){
            if ( x % i == 0){return false;}
        }
        return true;
    }



    public static int test5(int x) {
        int l = 1, r = x ;
        while (l <= r) {
            int m = (l + r) / 2;
            if (m * m == x) {return m;}
            else if (m * m > x) {
                r = m - 1;
            }
            else l = m + 1;
        }
        return l-1;


    }
    public static void test4(){
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7 ) {
                System.out.println(i  + "过");
            }
        }
        String[]  array =  {"Hello", "World", "Java"};
        String str = String.join(" ", array );
        System.out.println(str); // 输出: Hello World
    }

    public static int test2(int a, int b){
        int count = 0;
        while (a >= b){
            a -= b;
            count ++ ;
        }
        return count;

    }
    public static boolean test(int a){
        String S = Integer.toString(a);
        for (int i = 0; i < (S.length()/2); i++) {
            if (S.charAt(i) != S.charAt(S.length()-i-1)) return false;
         }
        return true;

    }
}
