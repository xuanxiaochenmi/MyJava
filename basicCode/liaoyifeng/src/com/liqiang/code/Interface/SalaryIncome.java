package com.liqiang.code.Interface;
public class SalaryIncome implements Income {

	// TODO
    double salary;
    public SalaryIncome(double salary) {
        this.salary = salary;
    }
    public SalaryIncome() {}

    @Override
    public double getIncome() {
        return salary * 0.9;
    }
}
