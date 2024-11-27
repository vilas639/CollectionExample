package com.ashokit.collectionall.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListIntrod {
	
	public static void main(String[] args) {
		
		/*List<Integer> l1= new ArrayList<>();
		l1.add(10);//0
		l1.add(20);//1
		System.out.println(l1);
		l1.add(0, 100);
		System.out.println(l1);*/
		
		CustomLinkedList cl= new CustomLinkedList();
		//cl.insertBeforeHead(50);
		  cl.insert(10);
		  cl.insert(20); 
		  cl.insert(30); 
		  cl.insert(40);
		  cl.insertAtSpecifiedPosition(25, 20);
		  
		 
		System.out.println(cl);//[] //com.ashokit.linkedlist.CustomLinkedList@7878

		LinkedList l= new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(0);
		l.add(60);
		l.add(60);
		System.out.println(l);//[10,20,30,0,60,60]
		System.out.println(l.get(1));
		//AL l = new AL()
		//link l -= new Link
		
		//List = get remove - abstract
		//AL -> get , remove -overridden -> common func is checking if the index is negrative
		//or index is <array.length -  public validate()

		l.add(4,76);
		System.out.println(l);
		l.set(4,78);
		System.out.println(l);
		l.remove(5);
		System.out.println(l);
		l.addFirst(23);
		System.out.println(l);
		l.addLast(78);
		System.out.println(l);
		l.removeFirst();
		System.out.println(l);
		l.removeLast();
		System.out.println(l);



	}

}

