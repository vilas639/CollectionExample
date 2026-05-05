package com.ashokit.exceptionE;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		Exception is an unwanted or unexpected event, which occurs during the execution of a
         program
         
         Error is irrecoverible condition such jvm running out of memeory , memory leak, 
         libray incapabilty
         
         Throwable
         Exception  
         compile time checked exception file not found, sql exception 
         runtime tim uncheck exception  aioutbox , nullpointer exception
         Error
          viretual memoory
          assert error
          
          try
           catch 
           finalyy 
           throw  - throw exception explicity
            thorws - thows the method level with multple exception 
		 */
		
		checkconconcorentmodification();
	}
	
	
	public static void checkconconcorentmodification()
	{
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
//		for (Integer num : list) {
//		    list.remove(num); // ConcurrentModificationException
//		}
		
	Iterator<Integer>  i=	list.iterator();
	
	while(i.hasNext())
	{
		i.next();
		i.remove();
	}
	
	System.out.println(list);
	
	}

}
