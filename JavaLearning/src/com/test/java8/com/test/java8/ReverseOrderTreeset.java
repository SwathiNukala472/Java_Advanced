package com.test.java8;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class ReverseOrderTreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> treeset=new TreeSet<Integer>(Collections.reverseOrder());
		treeset.add(1);
		treeset.add(41);
		treeset.add(13);
		treeset.add(7);
		treeset.stream().forEach((a)->System.out.println(a));
		
		TreeSet<String> str=new TreeSet<String>();
		str.add("Ravi");
		str.add("Swathi");
		str.stream().forEach((a)->System.out.println(a));
	}

}
