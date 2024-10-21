package com.ashokit.queue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueExample {
	
	public static void main(String[] args) {
		
		PriorityQueue<Department> depQueue=new PriorityQueue<>();//Natural Sorting order
		depQueue.add(new Department(123));
		depQueue.add(new Department(124));
		depQueue.add(new Department(125));
		depQueue.add(new Department(126));
		

		PriorityQueue<Department> depQueue1=new PriorityQueue<>(new Comparator<Department>() {
		public int compare(Department o1, Department o2) {
			return o1.getDepName().compareTo(o2.getDepName());
		};
		});//Natural Sorting order
		
		//PriorityQueue<Department> depQueue2=new PriorityQueue<>((o1,o2)->o1.getDepName().compareTo(o2.getDepName()));
		depQueue1.add(new Department(123,"a"));
		depQueue1.add(new Department(124,"A"));
		depQueue1.add(new Department(125,"b"));
		depQueue1.add(new Department(126,"B"));
		
		System.out.println(depQueue1);
		System.out.println(depQueue1.poll());
		
		PriorityQueue<Integer> ad1=new PriorityQueue<>();//Natural Sorting order
		ad1.add(10);
		ad1.add(20);
		ad1.add(30);
		ad1.add(05);
		ad1.add(14);
		ad1.add(03);
		ad1.add(1);
		ad1.add(13);
		ad1.add(12);
		System.out.println(ad1);
		//[1,3,5,10,12,13,14,20,30]
		System.out.println(ad1.poll());//30
		System.out.println(ad1.poll());//3
		System.out.println(ad1.poll());//5
		System.out.println(ad1.peek());//10
		System.out.println(ad1.peek());//10
		
		
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(05);
		ad.add(14);
		ad.add(03);
		ad.add(1);
		ad.add(13);
		ad.add(12);
		System.out.println(ad);
		System.out.println(ad.pollLast());//12
		System.out.println(ad.pollLast());//13
		System.out.println(ad.pollFirst());//10
		System.out.println(ad.pollFirst());//20
		System.out.println(ad.peekFirst());//30
		System.out.println(ad.peekFirst());//30
		System.out.println(ad.peekLast());//1
		System.out.println(ad.peekLast());//1
		System.out.println(ad);
		ad.addFirst(123);
		ad.addLast(890);
		System.out.println(ad);
		//System.out.print(ad.add);
		
		
		LinkedBlockingQueue<Integer> l= new LinkedBlockingQueue<>();
		l.add(10);
		l.add(50);
		l.add(05);
		l.add(03);
		l.add(02);
		l.add(100);
		System.out.println(l);
		System.out.println(l.peek());
		System.out.println(l.poll());
		System.out.println(l);
		System.out.println(l.poll());
		System.out.println(l);
		System.out.println(l.poll());
		System.out.println(l);
		System.out.println(l.poll());
		System.out.println(l);
		System.out.println(l.poll());
		System.out.println(l);
		System.out.println(l.poll());
		System.out.println(l);
		System.out.println(l.poll());
		System.out.println(l);
	}

}
