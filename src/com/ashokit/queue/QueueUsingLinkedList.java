package com.ashokit.queue;

public class QueueUsingLinkedList {
	
	Node head;
	class Node{
		Object data;
		Node next;
		Node(Object data){
			this.data=data;
		}
	}
	
	public void push(Object obj) {
		Node n= new Node(obj);
		if(head==null) {
			head=n;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=n;
		}
	}
	
	public Object peek() {
		if(head==null) {
			return null;
		}else {
			return head.data;
		}
	}
	
	public Object poll() {
		Object obj=peek();
		Node temp=head.next;
		head.next=null;
		head=temp;
		return obj;
	}

}
