package com.liqiang.learn;

import java.util.Random;

public class func11 {
    public static void main(String[] args) {
        int[] guess_red = {1,2,3,4,5,6};
        int guess_blue = 16;

        System.out.println("您的彩票是：红球： ");
        for (int i = 0; i < 6; i++) {
            System.out.print(guess_red[i] + " ");
        }
        System.out.print("蓝球： " + guess_blue +"\n");

        shaungSeQiu(guess_red, guess_blue);

    }
    public static void shaungSeQiu(int[] guess_red, int guess_blue){
        Random r = new Random();
        int[] red_ball = new int[33];
        for (int i = 0; i < red_ball.length; i++) {
            red_ball[i] = i + 1 ;
        }
        for (int i = 0; i < red_ball.length; i++) {
            int t = r.nextInt(red_ball.length);
            int tmp = red_ball[i];
            red_ball[i] = red_ball[t];
            red_ball[t] = tmp;
        }
        int blue_ball = r.nextInt(16) + 1;

        System.out.print("红球开奖： ");
        for (int i = 0; i < 6; i++) {
            System.out.print(red_ball[i] + " ");
        }
        System.out.print("蓝球开奖： " + blue_ball);

        int red_res = 0, blue_res = blue_ball == guess_blue ? 1 : 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (guess_red[i] == red_ball[j]) red_res ++;
            }
        }

        String res = "";
        if (red_res + blue_res < 4 && blue_res == 1) res = "六等奖-5元";


        else if (red_res + blue_res == 4) res = "五等奖-10元";
        else if (red_res + blue_res == 5) res = "四等奖-200元";
        else if (red_res == 5 && blue_res == 1) res = "三等奖-3000元";
        else if (red_res == 6 && blue_res == 0) res = "二等奖-最高500万元";
        else if (red_res == 6 && blue_res == 1 ) res = "一等奖-最高1000万元";
        else res = "很遗憾，你未中奖~";

        System.out.println("\n" + "您的中奖结果是："+" " + res);
    }



}
