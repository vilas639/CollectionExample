package com.ashokit.introduction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentModificationEx {
	
	public static void main(String[] args) {
		
		Set<Integer> l= new HashSet<>();
		//In ArrayList to resolve the concurrent modification exception we go for Copyon write arraylist
		//In HashSet to resolve the concurrent modification exception we go for Copyon write arraySet
		//In HashMap to resolve the concurrent modification exception we go for ConcurrentHashMap
		l.add(10);//Modcount=1
		l.add(20);//Modcount=2
		l.add(30);//Modcount=3
		l.add(40);//Modcount=4
		l.add(50);//Modcount=5
		l.add(60);//Modcount=6
		
		Iterator<Integer> itr= l.iterator();//expected modCOunt -6
		int i1=100;
		while(itr.hasNext()) {
			Integer i=itr.next();
			System.out.println(i);
			l.add(i1++);
			//Modcount=7
		}
		
		
		Map<Integer, String> m= new HashMap<>();
		m.put(10,"A");
		m.put(20,"B");
		m.put(30,"C");
		m.put(40,"D");
		m.put(50,"F");
		m.put(60,"G");
		
		//Write a program to iterate over the Hash Map
		
		
				
	}

}
