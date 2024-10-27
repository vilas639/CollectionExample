package com.ashokit.java8fetures.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 implements TestData {

	@Override
	public void dispaly() {
		// TODO Auto-generated method stub
		System.out.println("this is Example1");
	}
	
	
	public static void main(String[] args)
	{
		
		TestData.display2();
		System.out.println("hi");
		Example1 e= new Example1();
		e.abc();
		
		
		List<Integer> a= new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		//make it synchronized
		Collections.synchronizedList(a);
	}
	
	public void abc()
	{
		TestData.super.sub();
	}

}
