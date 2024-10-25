package com.ashokit.threadall;

public class Axisbank {
	
	
	int accountbalanc=0;
	
	Axisbank()
	{
		
	}
	
	Axisbank(int bal)
	{
		this.accountbalanc=bal;
	}
	
	
	synchronized void withdraw(int amount) throws InterruptedException
	{
		//Thread.sleep(10000);
		
		if(this.accountbalanc<amount)
		{
			System.out.println("start wating for withdraw....");
			wait(10000);
			System.out.println("end  wating for withdraw.......");
		}
		
		accountbalanc =this.accountbalanc-amount;
		
		System.out.println("done withdraw");
		
	}
	
	synchronized void deposite(int amount) throws InterruptedException
	 {
		Thread.sleep(10000);
		System.out.println("start deposite for .......");
		 accountbalanc =this.accountbalanc+amount;
		 
		 System.out.println("end deposite for .......");
		 notifyAll();
		 System.out.println("notify  deposite for .......");
		 
		
	 }
	 
	synchronized void fetchbalance()
	 {
		 System.out.println("avaiblen balance"+this.accountbalanc);
	 }

}
