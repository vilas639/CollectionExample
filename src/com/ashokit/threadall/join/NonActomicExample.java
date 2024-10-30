package com.ashokit.threadall.join;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class NonActomicExample {

	static AtomicInteger count = new AtomicInteger(0);
			
	//static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
   ExecutorService e1  =  Executors.newFixedThreadPool(3);
		
		
		for(int i=0;i<10;i++)
		{
			
			e1.execute(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					System.out.println("thread excution "+Thread.currentThread());
				   count.incrementAndGet();
					
				}
			});
			
		}
		
		
		
		 ExecutorService e2  =  Executors.newFixedThreadPool(3);
			
			
			for(int i=0;i<10;i++)
			{
				
				e1.execute(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						
						System.out.println("thread excution two "+Thread.currentThread());
						count.incrementAndGet();
						
					}
				});
				
			}
		
			System.out.println("count"+count);
			e1.shutdown();
			e2.shutdown();
		
		
		

		
		System.out.println("hi1");
		System.out.println("hi2");
		System.out.println("hi3");
		System.out.println("hi4");
		
		
		
		
		
	}
	

}
