package com.sanketsingh.backend.threaddemo;

import java.util.concurrent.locks.ReentrantLock;

public class FairNessLockDemo {

	
	ReentrantLock lock= new ReentrantLock(true);
	
	void fairuse() {
		lock.lock();
		try {
			System.out.println("Thread " + Thread.currentThread().getName() + " is executing.");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					for (int j = 0; j < 3; j++) {
						FairNessLockDemo demo = new FairNessLockDemo();
						demo.fairuse();
						System.out.println("Thread " + Thread.currentThread().getName() + " has finished execution.");
					}
					
				}
			});
			t.setName("Thread-" + i);
			t.start();
		}
	}
	
	
	

}
