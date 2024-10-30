package com.ashokit.threadall.join;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadJoinMultithreading {

	
static	CountDownLatch c=new CountDownLatch(10);

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ExecutorService e1  =  Executors.newFixedThreadPool(3);
		
		
		for(int i=1;i<10;i++)
		{
			
			e1.execute(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					System.out.println("thread excution "+Thread.currentThread());
					c.countDown();
				}
			});
			
		}
		
		c.await();
		c.getCount();
		
		e1.shutdown();
		
		System.out.println("hi1");
		System.out.println("hi2");
		System.out.println("hi3");
		System.out.println("hi4");
	}

}
