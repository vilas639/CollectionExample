package com.ashokit.collectionall.map;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

import com.ashokit.collectionall.set.Employee;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeMap m1= new TreeMap(new MyComparator() );
		m1.put("abc", 3);
		m1.put("vilas", 30);
		m1.put("raj", 120);
		m1.put("ramesh", 50);
		m1.put("ratn", 320);
		m1.put("ajay", 33);
		
		
		System.out.println(m1);
		
		//i want in desecnding order
		
		 TreeMap<Integer,Employee> hs1 = new TreeMap<Integer,Employee>();
         hs1.put(1,new Employee(200,"akjsdj",300));
         hs1.put(2,new Employee(300,"raje",500));
         hs1.put(3,new Employee(100,"maharaje",100));
         
    
		 for(Entry<Integer, Employee> m4 : hs1.entrySet())
		 {
			 Integer i=m4.getKey();
			Employee e=m4.getValue();
			System.out.println(" i"+ i+ " value"+e);
		 }
		 
		 
	       
	}

}

class MyComparator implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	//	return 0;
	}
	
}
