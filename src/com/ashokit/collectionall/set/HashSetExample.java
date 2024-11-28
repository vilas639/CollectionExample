package com.ashokit.collectionall.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs = new HashSet();
		
		hs.add(5);
		hs.add(1);
		hs.add(0);
		hs.add(25);
		hs.add(5);
		hs.add(null);
		hs.add(6);
		hs.add(null);
		
		
		for(Integer e: hs)
		{
			System.out.println(e);
		}
		
		
		  Iterator<Integer> im= hs.iterator();
		  
		  while(im.hasNext())
		  {
			  System.out.println(im.next());
		  }
		
		
	}

}
