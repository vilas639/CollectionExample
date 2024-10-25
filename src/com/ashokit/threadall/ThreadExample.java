package com.ashokit.threadall;

public class ThreadExample extends Thread {

	
	//thread state new , runnable , running , wait , blocked , dead
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		ThreadExample t1= new ThreadExample();
		ThreadExample t2= new ThreadExample();
		t1.setName("threaddata1 ");
		t2.setName("threaddata2 ");
		t1.start();
		t2.start();
		
	}

	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		  Thread d=Thread.currentThread();
		  
		  System.out.println("current thrad"+d.getName());
		System.out.println("hi");
		super.run();
	}
}
