package com.liqiang.code.Interface;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		// TODO: 用接口给一个有工资收入和稿费收入的小伙伴算税:
//		Income[] incomes = new Income[] {new SalaryIncome(1000), new RoyaltyIncome(1000) };
//		double total = 0;
//		// TODO:
//		for (Income income : incomes) {
//			total += income.getIncome();
//		}
//		System.out.println(total);

//		Math m = new Math();

		Person b = new Boy();
		male m = (male) b;
		b.run();
		m.jump();

	}

}
