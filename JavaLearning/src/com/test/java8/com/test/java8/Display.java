package com.test.java8;

//@FunctionalInterface
public class Display  {

	public static void main(String args[]) {
		//Display display=new Display();
		FunInterface f1= ()->System.out.println("Functional Interface Basic");
		f1.display();
		FunctionalInterface2 f2=(int a,int b)->{
			return a+b;
		};
		int a=f2.calculateSum(1, 2);
		System.out.println("SUm= "+a);
	
				
				
				
				
				
				
				
				
				
				
				
				
	}
	
	

}
