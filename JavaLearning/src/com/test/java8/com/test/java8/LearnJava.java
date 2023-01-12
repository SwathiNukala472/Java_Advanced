package com.test.java8;

import java.util.Scanner;

public class LearnJava {

	
	public static boolean isNumberPalindrom(int n) {
		boolean isPalindrom=false;
		
		int sum=0;
		int temp=n;
		
		while(n>0) {
		sum=(sum*10)+(n%10);
		n=n/10;
		}
		if(sum==temp)
			isPalindrom=true;
		else
			isPalindrom=false;
				
		return isPalindrom;
	}
	public static boolean isNumberArmstrong(int n) {
		boolean isArmstrong=false;
		
		double sum=0;
		int temp=n;
		int digits=0;
		
		while(n>0) {
		//sum=(sum*10)+(n%10);
		n=n/10;
		digits++;
		}
		
		n=temp;
		
		while (n>0) {
			int last=n%10;
			sum=sum+(Math.pow(last,digits));
			n=n/10;
		}
		if(sum==temp)
			isArmstrong=true;
		else
			isArmstrong=false;
				
		return isArmstrong;
	}
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		//System.out.println("is Palindrom " + isNumberPalindrom(number));
		System.out.println("is Armstrong " + isNumberArmstrong(number));
	}
}
