package com.liqiang.code.abstract1;
public class SalaryIncome extends Income{
    private double salary;
    public SalaryIncome(double salary) {
        this.salary = salary;
    }
    public SalaryIncome(){}

    @Override
    public double cal(){
        return salary * 0.8;

    }


    // TODO

}
