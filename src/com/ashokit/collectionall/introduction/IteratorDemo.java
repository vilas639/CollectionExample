package com.ashokit.collectionall.introduction;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al= new ArrayList<>();
		al.add("ram");
		al.add("shyam");
		al.add("soham");
		al.add("akash");
		
		
		  Iterator<String> am= al.iterator();
		  
		  while(am.hasNext())
		  {
			  String next=am.next();
			 
			  System.out.println(next);
		  }
		  
		  
		    ListIterator<String> am1=al.listIterator();
		    
		    while(am1.hasNext())
		    {
		    	String string=am1.next();
		    	System.out.println("| "+string);
		    }

		    Vector<String> v1= new Vector<String>();
		    v1.add("ram");
		    v1.add("shyam");
			v1.add("soham");
			v1.add("akash");
			
			 Enumeration<String> e= v1.elements();
			 
			 while(e.hasMoreElements())
			 {
				 System.out.println(e.nextElement()+"");
			 }
		    
	}

}
