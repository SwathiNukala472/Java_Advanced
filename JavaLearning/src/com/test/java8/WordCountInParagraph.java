package com.test.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.*;

public class WordCountInParagraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> countMap=new HashMap<String, Integer>();
		countMap=WordCountInParagraph.
				getWordCountInParagraph("I am Swathi Swathi Nukala From AndhraPradesh am a software Enginner");
		countMap.forEach((k,v)->System.out.println(k +"-"+ v));

	}

	private static HashMap<String, Integer> getWordCountInParagraph(String string) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> countMap=new HashMap<String, Integer>();
		
		String[] arr=string.split(" ");
		List<String> list=Arrays.asList(arr);
		list.stream().forEach((s)->{
			if(countMap.containsKey(s)) {
				countMap.put(s, countMap.get(s)+1);
			}
			else {
				countMap.put(s,1);
			}	
		});
		/*for(String s:arr) {
			if(countMap.containsKey(s)) {
				countMap.put(s, countMap.get(s)+1);
			}
			else {
				countMap.put(s,1);
			}
		}*/
				
		return countMap;
	}

}
