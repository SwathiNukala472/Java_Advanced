package com.test.java8;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		linkedList.add(2);
		linkedList.add(5);
		linkedList.forEach((a)->System.out.println(a));

	}

}
