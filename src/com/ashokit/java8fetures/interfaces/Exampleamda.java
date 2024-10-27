package com.ashokit.java8fetures.interfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Exampleamda {

	
	
	
	public static void main(String[] args) {
		
		
		TestData d =() -> {
			int x=10;
			System.out.println("override display method"+x);
		};
		d.dispaly();
		
		
		
//		int show(int p);
		TestData3 d1 =(x) -> {
			int m=3;
			x=m+x;
			System.out.println("hi man"+x);
			return x;
		};
		
		System.out.println(d1.show(5));
		
		

		TestData4 d2=(y) -> {
			System.out.println(y);
		};
		
		d2.showdata("vilas");
		
		
		
//		TestData4 d2=() -> {
//			System.out.println(y);
//		};
//		
//		d2.showdata("vilas");
		
		//input and no output  -- consumer
		//void showdata(String n);
		
		Consumer<String> c=(n) -> {
			System.out.println("my name is "+n);
		};
		
		c.accept("villas");
		
		
		//no input and return output  -- supplyer
		//String shodata();
		
		Supplier<String> p =() -> {
			
			System.out.println("My name is Supplieer");
			return "My name is Supplieer";
		};
		
		p.get();
		
		//input and output  functional
		//Int shodata(Int a);
		
		Function<Integer, Integer> f=(m) -> {
			int mn=1;
			m=m+mn;
			System.out.println("functional arguments"+m);
			
			return m;
		}; 
		
		f.apply(10);
		
		
		//inout and return bolean
		//boolean istrue(int i)
		
//		Predicate<Boolean> p1 =(t) -> {
//			boolean b= false;
//			
//			return b;
//		};
//		
//		p1.and(false);
		
		
		
		
		
	}
	
	
	
	
	 //void showdata(String n);
	
	//input and nuthing return   consumer
	//input and output   function
	//no input and output   supplier
	
	
	
	
      
	
	

}
