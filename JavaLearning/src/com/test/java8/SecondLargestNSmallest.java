package com.test.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNSmallest {
	public static int findSecondSmallest(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		List<Integer> sortedList=list.stream().sorted().toList();
		return sortedList.get(1);
	}

	public static int findSecondLargest(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		List<Integer> sortedList=list.stream().sorted(Comparator.reverseOrder()).toList();
		return sortedList.get(1);
	}
	
	
	public static void main(String args[]) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(6);
		list.add(4);
		list.add(3);
		list.add(1);
		int largest=findSecondLargest(list);
		int smallest=findSecondSmallest(list);
		ArrayList<Integer> newList=new ArrayList<Integer>();
		newList.add(largest);
		newList.add(smallest);
		System.out.println(newList);
	}

	

}
