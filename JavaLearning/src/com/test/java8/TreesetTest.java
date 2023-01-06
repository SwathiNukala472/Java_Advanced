package com.test.java8;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetTest {
	
	public static void main(String args[]) {
		TreeSet<Integer> primeSet=new TreeSet<>();
		primeSet.add(1);
		primeSet.add(41);
		primeSet.add(13);
		primeSet.add(7);
		primeSet.add(11);
		primeSet.add(43);
		primeSet.add(23);
		primeSet.add(53);
		primeSet.add(29);
		primeSet.add(47);
		Iterator<Integer> iterator=primeSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		
		}
		TreeSet<User> userSet=new TreeSet<User>(Comparator.comparing(User::getLastName));
		userSet.add(new User("Swathi","Nukala",26));
		userSet.add(new User("Ravi","Mekala",24));
		
		userSet.forEach((a) ->System.out.println(a.getLastName()));
	}
}
