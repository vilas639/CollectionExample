package com.sanketsingh.backend.threaddemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class InventroyLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InventroyRoom1 room = new InventroyRoom1(1);
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 1 is trying to remove items."+Thread.currentThread().getName());
				room.removeItems(1);
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 2 is trying to remove items."+Thread.currentThread().getName());
				room.removeItems(1);
			}
		});
		
		Thread t3= new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread 3 is trying to remove items."+Thread.currentThread().getName());
				room.removeItems(1);
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Final items in room: " + room.items);
		
		
		
		
	}

}

class InventroyRoom1 {
	
	Lock lock = new ReentrantLock();
	int items=3;

	public InventroyRoom1(int items) {
		this.items = items;
	}

	public synchronized void addItems(int value) {
		items += value;
		System.out.println("Items added: " + value + ", Total items: " + items);
	}

	public void removeItems(int value) {
		
		System.out.println("Thread display ");
		
		//lock.lock();
		if(lock.tryLock())
		{
		System.out.println("Thread " + Thread.currentThread().getName() + " is aqvired lock");
		
		try {
			Thread.sleep(10000); // Simulate some processing time
			
			if (items >= value) {
				items -= value;
				System.out.println("Items removed: " + value + ", Total items: " + items);
				System.out.println("Thread " + Thread.currentThread().getName() + " is reserved lock");
			} 
			else {
				System.out.println("Reserverd lock for Thread " + Thread.currentThread().getName() + " is not enough items to remove. Total items: " + items);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Thread " + Thread.currentThread().getName() + " is released.");
			lock.unlock();
			
		}
		}
		else
		{
			System.out.println("Thread " + Thread.currentThread().getName() + " is not acquired lock");
		}
		
	}
	
}
