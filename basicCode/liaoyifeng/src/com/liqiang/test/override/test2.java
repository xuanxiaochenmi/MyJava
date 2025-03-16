package com.liqiang.test.override;
class Income {
    protected double income;
    public Income(double income) {
        this.income = income;
    }
    public double getTax() {
        return income * 0.1; // 税率10%
    }
}
class Salary extends Income {
    public Salary(double income) {
        super(income);
    }
    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}
class StateCouncilSpecialAllowance extends Income {
    public StateCouncilSpecialAllowance(double income) {
        super(income);
    }
    @Override
    public double getTax() {
        return 0;
    }
}


public class test2 {
    public static void main(String[] args) {
        Income income = new Income(30000);
        Income income1 = new Salary(50000);
        Income income2 = new StateCouncilSpecialAllowance(10000);
        System.out.println("total tax:" + new test2().totalTax(income, income1, income2));
    }
    public double totalTax(Income... incomes) {
        double total = 0;
        for (Income income: incomes) {
            total = total + income.getTax();
        }
        return total;
    }
}
