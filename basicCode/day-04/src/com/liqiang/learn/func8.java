package com.liqiang.learn;

public class func8
{
    public static void main(String[] args) {
        finalScore();
        System.out.println(finalScore());
    }

    public static double finalScore(){
        int n = 6;
        int[] scores = {11,24,12,43,54,62};
        int min = 100,  max = 0;
        double res = 0;
        for (int i = 2; i < scores.length; i++) {
            res += scores[i];
            min = Math.min(min, scores[i]);
            max = Math.max(max, scores[i]);
        }

        res = (res - max -min) / scores.length;
        return res;

    }


}
