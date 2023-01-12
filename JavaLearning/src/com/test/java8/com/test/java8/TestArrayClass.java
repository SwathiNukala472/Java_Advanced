package com.test.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.*;

public class TestArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,4,5,6,7,8};
		int[] arr2= {5,8,9,10,12};
		int[] arr3=new int[arr1.length+arr2.length];
		int pos=0;
		
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
			pos++;
		}
		for(int i=0;i<arr2.length;i++) {
			//if(arr1.)
			arr3[pos]=arr2[i];
			pos++;
		}
		HashSet<Integer>   set=new HashSet<Integer>();
		List<Integer> list=new ArrayList<Integer>();
		list=Arrays.stream(arr3).boxed().toList();
		set.addAll(list);
		List<Integer> list1=new ArrayList<Integer>();
		list1.addAll(set);
		
		
		int arr[]=new int[set.size()];
		int k=0;
		
		for(Integer i:set) {
			arr[k]=i;
			k++;
		}
		// System.arraycopy(set.toArray(), 0, arr, 0, set.size());
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
