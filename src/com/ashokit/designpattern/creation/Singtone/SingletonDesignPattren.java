package com.ashokit.designpattern.creation.Singtone;

import java.io.Serializable;

public class SingletonDesignPattren implements Cloneable {
	

	
	 String name="vilas";
	//lazy intilization
	static SingletonDesignPattren s =null;
	
	private SingletonDesignPattren() throws Exception {
		// TODO Auto-generated constructor stub
		
		//prevent the refelction
		if(s!=null)
		{
			throw new Exception();
		}
	}
	
	
	//multiple thread prevent using synchronized keyword
	 static  SingletonDesignPattren getInstance() throws Exception
	{
		 System.out.println("Hi");
		 System.out.println("Hi1");
		
		 if(s==null)//Double checking locking
		 {
				synchronized (SingletonDesignPattren.class) {
					if(s==null)
						s= new SingletonDesignPattren();
					
									}
			 
		 }
		return s;
	}
	
	//prevetn from serilizable
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

//Advantages of Singtone is memory will reuse 
//1 make a private constructor that will not allow create a object
//create   a object of class
//create instanc method

//eagger intilization when class 
/*
 * 1. static varaible load at class loading 
 */

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
//4.logger .getIntance()

//in java which class is singltone class
//ans : Runtime
//@Controller, @RestController, @Repository, or @Service are singletons by default. 
