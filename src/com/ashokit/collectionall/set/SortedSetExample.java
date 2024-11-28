package com.ashokit.collectionall.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
     SortedSet<Integer> hs = new TreeSet();
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
	}

}
