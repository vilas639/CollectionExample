package com.ashokit.queue;

import java.util.Stack;

public class QueueImplUsingStack {
	Stack<Object> s=null;
	public static void main(String[] args) {
		QueueImplUsingStack q=new QueueImplUsingStack();
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		System.out.println(q.remove());//10
		System.out.println(q.remove());//20
		System.out.println(q.remove());//30
		System.out.println(q.remove());//40
		System.out.println(q.remove());//null
	}
	
	public void insert(Object obj) {
		s.add(obj);//[10,20,30,40]
	}
	
	public Object remove() {
		if(s.isEmpty()) {
			return null;
		}
		Object obj =s.pop();//obj=40
		  if (!s.isEmpty()) {
	            Object temp = remove();
	            s.push(obj);//1st-40--2nd 30 --3rd -20 4th=10
	            obj = temp;
	        }
		
		return obj;
	}
	
	QueueImplUsingStack(){
		s= new Stack();
	}

}
