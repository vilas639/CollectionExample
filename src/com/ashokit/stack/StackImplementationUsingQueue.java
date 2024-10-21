package com.ashokit.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplementationUsingQueue {
	
	static Queue<Integer> q= new LinkedList<>();
	
	public static void main(String[] args) {
		//LIFO
		StackImplementationUsingQueue s= new StackImplementationUsingQueue();
		s.insert(10);
		s.insert(20);
		s.insert(25);
		s.insert(35);
		//pop ->35
		//pop ->25
		//pop ->20
		//pop ->10
		//[35,25,20,10]
		System.out.println(q.poll());//35
		System.out.println(q.poll());//25
		System.out.println(q.poll());//20
		System.out.println(q.poll());//10
		
	}
	
	public void insert(Integer obj) {//35
		// TODO Auto-generated method stub
		q.add(obj);//[25,20,10,35]
		for (int i = 0; i < q.size()-1; i++) {//3<3
			//q.add(q.poll());//10
			//q.add(q.peek());//[35,25,20,10]
			//q.poll();//[35,25,20,10]
			q.add(q.poll());
			//[20,10]
		}

	}

}
