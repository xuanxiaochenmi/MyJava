package com.liqiang.code.Interface;
/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome implements Income {
    double money;

    public RoyaltyIncome(){};
    public RoyaltyIncome(double money) {
        this.money = money;
    }
    // TODO

    public double getIncome() {
        return money * 0.8;
    }

}
