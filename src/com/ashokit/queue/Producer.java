package com.ashokit.queue;

import java.util.concurrent.LinkedBlockingQueue;

public class Producer extends Thread{
	LinkedBlockingQueue<Integer> l=null;
	Producer(LinkedBlockingQueue<Integer> l){
		this.l=l;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//inserting - producer
		for (int i = 0; i < 7; i++) {
			try {
				l.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
