package com.liqiang.test.static1;

public class Person {

	// TODO
	public static int count ;
	String name;

	private Person() {
	}
	public  Person(String name) {
		this.name = name;
		count ++ ;
	}
	public static int getCount(){
		return count;
	}
}
