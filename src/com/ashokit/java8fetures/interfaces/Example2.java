package com.ashokit.java8fetures.interfaces;

import javax.security.auth.Subject;

public class Example2 implements TestData {

	@Override
	public void dispaly() {
		// TODO Auto-generated method stub
		System.out.println("this is Example2");
	}
	
	
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		//TestData.super.sub();
		
		System.out.println("overrriden the substract method");
	}
	
	
	public void abc()
	{
		TestData.super.sub();
	}
	
	public static void main(String[] args) {
		
		Example2 e= new Example2();
		e.sub();
	}

}
