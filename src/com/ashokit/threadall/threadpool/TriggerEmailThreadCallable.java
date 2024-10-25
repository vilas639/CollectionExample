package com.ashokit.threadall.threadpool;

import java.util.concurrent.Callable;

public class TriggerEmailThreadCallable  implements Callable<Object>{

	
	Customer c;
	
	public	TriggerEmailThreadCallable(Customer c1)
	{
		this.c=c1;
	}
	
	
	

//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		
//		triggeremailid(this.c);
//	}
//	
	
	
	public  static String triggeremailid(Customer c1)

	{
		System.out.println("email send to "+c1.getName());
		
		return "r send"+c1.getName();
	}





	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		
		String s=triggeremailid(this.c);
		
		return s.toString();
	}

}
