package com.liqiang.learn;

import java.util.Random;

public class func10 {
    public static void main(String[] args) {
        choujiang();

    }

    public static void choujiang(){
        int[] hongbao = {2,588,888,1000,10000};
        Random  r =  new Random();
        for(int i=0;i<hongbao.length;i++){
            int  t = r.nextInt(hongbao.length);
            int tmp = hongbao[i];
            hongbao[i] = hongbao[t];
            hongbao[t] = tmp;
        }
        for(int i=0;i<hongbao.length;i++){
            System.out.println(hongbao[i]);
        }
    }
}
