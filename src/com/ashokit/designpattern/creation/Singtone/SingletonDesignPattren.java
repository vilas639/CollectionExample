package com.ashokit.designpattern.creation.Singtone;

import java.io.Serializable;

public class SingletonDesignPattren implements Cloneable {
	
	//static SingletonDesignPattren s = new SingletonDesignPattren(); //egar intilization
	
	 String name="vilas";
	//lazy intilization
	static SingletonDesignPattren s =null;
	private SingletonDesignPattren() throws Exception {
		// TODO Auto-generated constructor stub
		
		if(s!=null)
		{
			throw new Exception();
		}
	}
	
	
	
	synchronized static  SingletonDesignPattren getInstance() throws Exception
	{
		if(s==null)
		{
			s= new SingletonDesignPattren();
		}
		return s;
	}
	
	Object readResolver()
	{
		return s;
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return s;
	}

}

//memory will reuse 
//1 make a private constructor
//create   a object of class
//create instanc method

//eggae intilization when class 
//lazy initilization
//classloader
//first check class code check
//load the class ->class loader
//load ,link ,	initilize
//bootstap ,system ,extention classloader
//bootstap -check run program check java classpath present or not -- check rt.jar
//extentention  -load all classes present lib/ext
//system  -- it load the class
//link phase -all check static varible memory will ocuppy
//initilize -- defallt value will be overite the variable


///breake the singtone pattren
//reflection
//cloning
//serilizable
//multithreading

//usess
//1 .database connection
//2. reading data from proprty file
//3.multimodule  - give the classname 
//4.logger .getintacnce()


//breke the singtone pattern
//Refelction
//serilization
//multithreading
//cloaning

