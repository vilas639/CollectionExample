package com.ashokit.java8fetures.interfaces;


public interface TestData {
	
	public void dispaly();
	
	//make public to defult
	default void sub() {
		
		System.out.println("example of substract");
	}
	
	
	default void display1()
	{
		System.out.println("display defult method");
	}
	
	static void display2()
	{
		System.out.println("display static method");
	}

}
