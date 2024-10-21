package com.ashokit.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackExample {
	
	public static void main(String[] args) throws Exception {
		CustomStackUsingArray cs= new CustomStackUsingArray(5);
		cs.push(10);
		cs.push(20);
		cs.push(30);
		cs.push(40);
		cs.push(50);
		System.out.println(cs);
		System.out.println(cs.pop());//50->index=4
		System.out.println(cs.pop());//index=3->40
		cs.push(60);
		System.out.println(cs);
		
		List<Integer> l= new ArrayList<>();
		l.add(10);//0
		l.add(20);//1
		l.add(30);//2
		l.add(40);//3
		System.out.println(l);//[10,20,30,40]
		l.add(2, 06);
		System.out.println(l);//[10,20,06,30,40]
		//Write a program to implement stack uisng array
		//Write a program to implement stack uisng Linkedlist
		//Write a program to implement stack uisng queue
		Stack<Integer> s= new Stack<>();
		//Vector ;
		//It allows duplicates
		//Is it ordered
		//capacity of vector ->double
		//AL is not synchronized, vector is synch
		//Stack is also synch
		//
		/*String s1="[][{()}]";
		char[] c=s1.toCharArray();
		Stack<Character> s2= new Stack<>();
		for (int i = 0; i < c.length; i++) {
			if(c[i]=='['||c[i]=='('||c[i]=='{' ) {
				s2.push(c[i]);
			}
			if(c[i]==']'||c[i]==')'||c[i]=='}' ) {
				s2.pop();
			}
		}*/
		//if(s.isEmpty()) {
			//return trye
		//}
		//[({})]
		//{(]
		
		s.add(10);//first
		s.add(20);
		s.add(05);
		s.add(89);
		s.add(91);//last
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());//91
		System.out.println(s.pop());
		s.add(100);
		System.out.println(s);//[10,20,05,89,100]
		
		System.out.println(s.pop());//remove(ar.length-1)
		System.out.println(s);//4
		System.out.println(s.pop());
		System.out.println(s);//3
		System.out.println(s.pop());
		System.out.println(s);//2
		System.out.println(s.pop());
		System.out.println(s);//1
		System.out.println(s.pop());
		System.out.println(s);//0
		System.out.println(s.pop());
		//-1
		//POp Method
		
	}

}
