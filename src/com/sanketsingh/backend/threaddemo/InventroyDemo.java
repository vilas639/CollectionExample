package com.sanketsingh.backend.threaddemo;

public class InventroyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InventroyRoom room = new InventroyRoom(1);
		
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

class InventroyRoom {
	int items=1;

	public InventroyRoom(int items) {
		this.items = items;
	}

	public synchronized void addItems(int value) {
		items += value;
		System.out.println("Items added: " + value + ", Total items: " + items);
	}

	public synchronized  void removeItems(int value) {
		
		try {
			Thread.sleep(1000); // Simulate some processing time
			
			if (items >= value) {
				items -= value;
				System.out.println("Items removed: " + value + ", Total items: " + items);
			} else {
				System.out.println("Not enough items to remove. Current items: " + items);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
