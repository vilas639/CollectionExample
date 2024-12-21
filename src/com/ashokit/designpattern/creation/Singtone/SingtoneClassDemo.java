package com.ashokit.designpattern.creation.Singtone;

import java.io.Serializable;

public class SingtoneClassDemo implements Serializable,Cloneable {
	
	
	 //declare object
	//declare private constructor
	//create a instance method
	
	static SingtoneClassDemo s= null;
	
	private SingtoneClassDemo() throws Exception
	{
		if(s!=null)
		{
			throw new Exception();
		}
	}
	
	
	synchronized static SingtoneClassDemo getInstance() throws Exception
	{
		if(s==null)
		{
			s= new SingtoneClassDemo();
		}
		return s;
	}
	
	
	Object readResolver()
	{
		return s;
		
	}
	
	@Override
  protected	Object clone()
	{
		return s;
	}
	
	

}
