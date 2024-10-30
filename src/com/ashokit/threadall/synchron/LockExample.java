package com.ashokit.threadall.synchron;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

	
	
	private Lock l = new ReentrantLock();
	
	
	  void display(LockExample lm)
	{
		//create a lock
        
		l.lock();
		
		System.out.println("hi 1");
		
		System.out.println("hi 2");
		
		System.out.println("hi 3");
		
		System.out.println("hi 4");
		
		//unlock
		l.unlock();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LockExample  lm= new LockExample();
		Thread t1= new Thread(() -> lm.display(lm));
		Thread t2= new Thread(() -> lm.display(lm));
		Thread t3= new Thread(() -> lm.display(lm));
		Thread t4= new Thread(() -> lm.display(lm));
		t1.setName("thread1");
		t2.setName("thread2");
		t3.setName("thread3");
		t4.setName("thread4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
