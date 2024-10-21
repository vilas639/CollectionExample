package com.ashokit.tree;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapImpl {
	
	public static void main(String[] args) {
		
		
		Map<String, Integer> m1= new HashMap<>();
		m1.put("Z", 1);
		m1.put("A", 11);
		m1.put("a", 12);
		m1.put("R", 13);
		m1.put("Q", 14);
		System.out.println(m1);
		
		Map<String, Integer> m2= new TreeMap<>(m1);
		
		System.out.println(m2);
		
		Map<String, Integer> m= new TreeMap<>(new Comparator<String>() {
		public int compare(String o1, String o2) {
			return o2.compareTo(o1);
			};
		});
		m.put("Z", 1);//index=65/16=4=node(65, A,12,B node)
		m.put("A", 10);//index =66/16=4 node(66, B,10,null)
		m.put("B", 12);//65/16=4 ->
		m.put("a", 14);
		//1000-700 -index 4
		//B Tree
		
		System.out.println(m);//
		//Write a program to sort the tree map in reverse order of key
		
		
	}

}
