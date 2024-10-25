package com.ashokit.collectioall.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomStackUsingLinkedList {
	
	Node head=null;
	Node last=null;
	class Node{
		Object data;
		Node next;
		Node(Object data){
			this.data=data;
		}
	}
	//cs.add(20)
	//cs.add(30)
	public Object push(Object obj) {
		Node n= new Node(obj);
		if(head==null) {
			head=n;
			last=n;
		}else {
			last.next=n;
			last=n;
			
			/*Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=n;*/
		}
		
		return obj;
	}
	
	
	public Object peek() throws Exception {
		//return last.data;
		
		if(head==null) {
			throw new Exception("Stack is Empty");
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			return temp.data;
		}
		
		
		//Arrays.stream(null)
		//List l= new ArrayList<>();
		//l.stream().f
	}
	
	public Object pop() throws Exception {
		//return last.data;
		
		if(head==null) {
			throw new Exception("Stack is Empty");
		}else {
			Node temp=head;
			Node previous=null;
			while(temp.next!=null) {
				previous=temp;
				temp=temp.next;
			}
			Object obj=temp.data;
			previous.next=null;
			temp=null;
			return obj;
		}
		
		
		//Arrays.stream(null)
		//List l= new ArrayList<>();
		//l.stream().f
	}

}
