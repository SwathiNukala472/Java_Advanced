package com.test.java8;

public class MethodReference1 {

	MethodReference1(){
		System.out.println("Hello -Constructor");
	}
	//static method references with class name
	public static void sayHello() {
		System.out.println("Hello -static");
	}
	//static method references with object name
	public  void sayHelloNoNStatic() {
		System.out.println("Hello -Non static");
	}
	public static void main(String args[]) {
		FunInterface f1=MethodReference1::sayHello;
		FunInterface f2=()->System.out.println("display -abstract emethod in functional interface");
		int a=f2.sum(1, 2);
		System.out.println(a);
		f1.display();
		f2.display();
		System.out.println("difference"+FunInterface.difference(2, 1));
		MethodReference1 mr1=new MethodReference1();
		FunInterface f3=mr1::sayHelloNoNStatic;
		f3.display();
		FunInterface f4=()->System.out.println("display -abstract emethod in functional interface-2");
		f4.display();
		FunInterface f5=MethodReference1::new;
		f5.display();
	}
}
