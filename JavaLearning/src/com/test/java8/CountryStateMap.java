package com.test.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountryStateMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("Inidia,AndhraPradesh");
		
		  list.add("Inidia,Telangana"); list.add("Inidia,Tamilnadu");
		  list.add("Inidia,Kerala"); list.add("Inidia,Karnataka");
		  list.add("USA,California");
		
		list.add("USA,Canada");
		Map<String,List<String>> map=new HashMap<String,List<String>>();
		//List<String> stateList=new ArrayList<String>();
		for(String s:list) {
			String arr[]=s.split(",");
			if(map.containsKey(arr[0])) {
				List<String> alreadyAddedStateList=map.get(arr[0]);
				alreadyAddedStateList.add(arr[1]);
				map.put(arr[0], alreadyAddedStateList);
			}
			else {
				List<String> stateList=new ArrayList<String>();
				stateList.add(arr[1]);
				map.put(arr[0],stateList);
			}
		}
		//System.out.println(map.size() +"map size");
		/*
		 * map.forEach((k,v)->{ v.forEach((s)->{ System.out.println(k+"-"+s); });
		 * 
		 * });
		 */
		
		map.forEach((k,v)->{
			//v.forEach((s)->{
				System.out.println(k+"-"+v);
			//});
			
		});
		/*Map<String,String> map1=list.stream().map(s->s.split(",")).
		collect(Collectors.toMap(s->s[0], s->s[1]));*/
		//Exception in thread "main" java.lang.IllegalStateException: Duplicate key Inidia (attempted merging values AndhraPradesh and Telangana)

		
	
			
		
				
				
		
		
		

	}

}
