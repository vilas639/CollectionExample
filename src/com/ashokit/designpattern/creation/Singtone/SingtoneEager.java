package com.ashokit.designpattern.creation.Singtone;

public class SingtoneEager {

	//eager initilization whether object crated at class loading 
	//declare the singltone
	//make private constructor
	//crate instance method
	
	static SingtoneEager s= new SingtoneEager();
	
	private SingtoneEager()
	{
		
	}
	
	static SingtoneEager getInstance()
	{
		return s;
	}
   
}
