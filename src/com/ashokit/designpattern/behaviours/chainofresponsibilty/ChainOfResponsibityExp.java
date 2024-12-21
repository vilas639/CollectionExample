package com.ashokit.designpattern.behaviours.chainofresponsibilty;

public class ChainOfResponsibityExp {

	
	public static void main(String[] args)
	{
	    System.out.println("main method");	
	    m1();
	}
	   
	
	static void m1()
	{
		System.out.println("m1 is ruunning");
		
		m2();
	}
	
	static void m2()
	{
		System.out.println("m2 is ruunning");
		
		m3();
	}
	
	static void m3()
	{
		System.out.println("m3 is ruunning");
		try
		{
			int num=10/0;
		}
		catch(Exception e)
		{
		     e.printStackTrace();
		}
		
	}
}
