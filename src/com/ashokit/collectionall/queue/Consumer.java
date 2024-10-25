package com.ashokit.collectionall.queue;

import java.util.concurrent.LinkedBlockingQueue;

public class Consumer extends Thread{
	LinkedBlockingQueue<Integer> l=null;
	Consumer(LinkedBlockingQueue<Integer> l){
		this.l=l;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//inserting - producer
		for (int i = 0; i < 7; i++) {
			try {
				System.out.println(l.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
