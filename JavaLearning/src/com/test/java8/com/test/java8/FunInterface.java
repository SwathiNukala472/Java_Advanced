package com.test.java8;
import java.lang.FunctionalInterface;


@FunctionalInterface
public interface FunInterface {

	public void display();
	
	default int sum(int a ,int b) {
		return a+b;
	}
	static int difference(int a ,int b) {
		return a-b;
	}
	/*
	 * public int sumAdv(int a ,int b) { return a+b; }//methods only with scope default and static are allowed
	 * with private and public are not allowed 
	 */
	
}
