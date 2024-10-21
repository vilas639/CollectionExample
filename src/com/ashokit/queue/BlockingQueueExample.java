package com.ashokit.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {
	
	public static void main(String[] args) {
		LinkedBlockingQueue<Integer> lb= new LinkedBlockingQueue<>();
		ArrayBlockingQueue<Integer> lb1= new ArrayBlockingQueue<>(10);
		
		Producer p= new Producer(lb);
		Consumer c= new Consumer(lb);
		p.start();
		c.start();
		//lb.put(10);
		//System.out.println(lb.poll());
		/*
		 * lb.add(10); lb.add(20); lb.add(30); lb.add(40); lb.add(50); lb.add(60);
		 */
		
		/*put
		take*/
	}

}
