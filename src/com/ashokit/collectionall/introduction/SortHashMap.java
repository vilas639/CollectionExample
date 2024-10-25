package com.ashokit.collectionall.introduction;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {
		Map<Integer, String> m= new HashMap<>();
		//Set s= new HashSet();
		m.put(10, "A");//Entry e= new Entry(10,A);//s.add(e);
		m.put(1, "a");//Entry e= new Entry(1,a);//s.add(e);
		m.put(0, "z");
		m.put(12, "S");
		m.put(11, "R");
		//m.entrySet().stream().sorted((o1,o2)->o1.getKey());
		//Write a program to sort the hashmap by keys asc
		//0-z,1-a,10-A,11-R,12-S
		//Write a program to sort the hashmap by values asc
		//10-A,11-R,12-S,1-a,0-z
		
		//TreeMap<K, V>
		
		Set<Entry<Integer, String>> s1=m.entrySet();
		List<Entry<Integer, String>> l= new LinkedList<>(s1);
		
		/*
		 * Collections.sort(l,new Comparator<Integer>() {
		 * 
		 * @Override public int compare(Integer o1, Integer o2) { // TODO Auto-generated
		 * method stub return 0; } });
		 */
		//Collections.sort(l);
		Collections.sort(l, new Comparator<Entry<Integer, String>>() {
			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return (o1.getKey() < o2.getKey()) ? -1 : ((o1.getKey() == o2.getKey()) ? 0 : 1);
			}
		});
		
		System.out.println(l);
		
		Collections.sort(l, new Comparator<Entry<Integer, String>>() {
			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		System.out.println(l);
		Map<Integer, String> lmap=new LinkedHashMap<>();
		for (int i = 0; i < l.size(); i++) {
			lmap.put(l.get(i).getKey(), l.get(i).getValue());
		}
		for (int i = l.size()-1; i >0; i--) {
			lmap.put(l.get(i).getKey(), l.get(i).getValue());
		}
		
		System.out.println(lmap);
		
	}
}
