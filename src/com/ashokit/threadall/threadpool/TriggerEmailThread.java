package com.ashokit.threadall.threadpool;

public class TriggerEmailThread  implements Runnable{

	
	Customer c;
	
	public	TriggerEmailThread(Customer c1)
	{
		this.c=c1;
	}
	
	
	


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		triggeremailid(this.c);
	}
	
	
	
	public  static void triggeremailid(Customer c1)

	{
		System.out.println("email send to "+c1.getName());
	}

}
