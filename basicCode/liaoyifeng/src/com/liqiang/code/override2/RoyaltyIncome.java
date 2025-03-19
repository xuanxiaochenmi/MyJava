package com.liqiang.code.override2;
/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome extends Income{
    public RoyaltyIncome(double income) {
        super(income);
    }
    // TODO
    public double getTax() {
        return income * 0.1; // 税率10%
    }
}
