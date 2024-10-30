package com.ashokit.threadall.join;

public class JoinExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		Thread t= new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("file is excutition ");
			}
		});
		
		t.start();
		t.join();
		
		Thread t1  =new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("file is processing....");
			}
		});
		
		t1.start();
		
Thread t2  =new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("file is downloadedd ....");
			}
		});
		
		t2.start();
		
	}
	

}
