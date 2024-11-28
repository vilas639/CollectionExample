package com.ashokit.collectionall.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet<Integer> hs = new TreeSet();
		//hs.add(null);
		hs.add(5);
		hs.add(1);
		hs.add(0);
		hs.add(25);
		hs.add(5);
		//hs.add(null);
		hs.add(6);
	
		//hs.add(null);
		
		for(Integer e: hs)
		{
			System.out.println(e);
		}
		
		 Iterator<Integer> am= hs.iterator();
         
         while(am.hasNext())
         {
         	System.out.println(am.next());
         }   
         
         
         TreeSet<Employee> hs1 = new TreeSet<Employee>();
         hs1.add(new Employee(200,"akjsdj",300));
         hs1.add(new Employee(300,"raje",500));
         hs1.add(new Employee(100,"maharaje",100));
         
         for(Employee e: hs1)
 		{
 			System.out.println(e);
 		}
         
      
         //order in descneding order
         TreeSet hs2 = new TreeSet<>(new MyComparator());
         hs2.add("b");
         hs2.add("a");
         hs2.add("c");
         
         
         
         for(Object e: hs2)
  		{
  			System.out.println(e);
  		}
 		
	}
	
	

}


class MyComparator implements Comparator<Object>
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=o1.toString();
		String s2=o2.toString();
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		//return (l1<l2) ? -1 : (l1==l2) ? 0 : 1;
		return o1.toString().compareTo(o2.toString());
		//return 0;
	}
	
}
