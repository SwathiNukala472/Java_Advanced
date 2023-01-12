package com.test.java8;

import java.util.Iterator;
import java.util.Stack;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> primeStack=new Stack<Integer>();
		primeStack.push(1);
		primeStack.push(41);
		primeStack.push(13);
		primeStack.push(7);
		primeStack.push(11);
		primeStack.push(43);
		primeStack.pop();
		primeStack.push(23);
		primeStack.push(53);
		primeStack.push(29);
		primeStack.push(47);
		primeStack.pop();
		//pOp removes the last element 
		System.out.println(primeStack.push(9));
		//Output : 1
		System.out.println(primeStack.add(2));
		//Output : true
		/*
		 * Iterator<Integer> it=primeStack.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */		
		//primeStack.stream().forEach((a)-> System.out.println(a));
		primeStack.stream().collect(Collectors.toList()).forEach((a)-> System.out.println(a));
		

	}

}
