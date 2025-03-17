package com.liqiang.test.override2;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
//		// TODO: 给一个有工资收入和稿费收入的小伙伴算税:
//		Income[] incomes = new Income[] { new Income(3000), new SalaryIncome(7500), new RoyaltyIncome(12000) };
//		double total = 0;
//		// TODO:
//		for (Income income: incomes) {
//			total = total + income.getTax();
//		}
//		System.out.println(total);

		Person person = new Person();
		Student s = new Student("lee",20,100);
		System.out.println(s.toString());
	}

}
