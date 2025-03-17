package com.liqiang.test.abstract1;
/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome extends Income {
    private double money;
    public RoyaltyIncome() {}
    public RoyaltyIncome(int money) {
        this.money = money;
    }

    @Override
    public double cal(){
        return money * 0.9;
    }

	// TODO

}
