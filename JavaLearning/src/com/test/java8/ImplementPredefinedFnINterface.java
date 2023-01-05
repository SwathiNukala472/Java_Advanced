package com.test.java8;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class ImplementPredefinedFnINterface {
	
	
	public static void main(String args[]) {
		
		//takes input and returns nothing prints the output
		Consumer<Integer> display=(Integer a)->{
			System.out.println("INteger Display Consumer:"+ a);
		};
		
		display.accept(4);
		
		//takes input gives output as boolean
		Predicate<Double> prdicate =(b)->{
			return (b%2==0.0);
		};
		boolean c=prdicate.test(4.0);
		System.out.println("is EVen:" +c);
		
		//takes input of one type gives output of specified type like boolean below
		//has andThen and compose methods also along with apply
		//andThen executes after apply
		//compose executes before to apply method
		Function<Integer, Boolean> function=(e)->{
			boolean g=(e%2==1);
			return g;
		};
		
		Boolean d=function.apply(4);
		System.out.println("is odd:" +d);
		
		//no input but gives of outpiut of specified type
		Supplier<Double> supplier=()->Math.random();
		
		System.out.println("Supplier output:"+supplier.get());
		
		//Similarly we have bifunction biconsumer bipredicate and longToDouble convertion functional interfaces 
		//to perfom the operations with more than one parameter
	}
	

}
