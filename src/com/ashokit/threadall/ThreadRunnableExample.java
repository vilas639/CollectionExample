package com.ashokit.threadall;

public class ThreadRunnableExample implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadRunnableExample t= new ThreadRunnableExample();
		Thread t1= new Thread(t);
		t1.start();
		
		Thread t2= new Thread(new ThreadRunnableExample());
		t2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

}
