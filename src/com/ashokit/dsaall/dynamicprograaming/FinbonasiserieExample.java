package com.ashokit.dsaall.dynamicprograaming;

import java.util.HashMap;

public class FinbonasiserieExample {

	static int  sum=0;
	
	static int count=0;
	static int dybnamiccount=0;
	static HashMap<String, Integer> dynamichash=new HashMap<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     System.out.println("total sum"+fib(18));
	     System.out.println("total sum"+dynamicfib(18));
		System.out.println("number of process"+count);
		
		
		System.out.println("number of process"+dybnamiccount);
	}
	
	static int fib(int n)
	{
		count++;
		if(n==0 || n==1)
		{
			return n;
		}
		else
		{
		 sum= fib(n-1)+fib(n-2);
		 return sum;
		  
		}
		
		
	}
	
	static int dynamicfib(int n)
	{
		dybnamiccount++;
		if(dynamichash.containsKey("dynamic"+n))
		{
			return dynamichash.get("dynamic"+n);
		}
		
		if(n==0 || n==1)
		{
			dynamichash.put("dynamic"+n, n);
			return n;
		}
		else
		{
		 sum= dynamicfib(n-1)+dynamicfib(n-2);
		 dynamichash.put("dynamic"+n, sum);
		 return sum;
		  
		}
		
		
	}
	
	

}
