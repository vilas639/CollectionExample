package com.ashokit.collectionall.linkedlist;

import com.ashokit.collectionall.introduction.Employee;

public class CustomLinkedList {
	
	CustomNode head;	
	int index=0;
	class CustomNode{
		Object data;
		CustomNode next;
		int customNodeIndex;
		CustomNode(Object data,int in){
			this.data=data;
			this.customNodeIndex=in;
		}
	}
	
	public void insertBeforeHead(Object obj) {
		CustomNode cl= new CustomNode(obj,index);
		if(head ==null) {
			head=cl;
		}else {
			//100.next=10;
			cl.next=head;
			head=cl;
		}
		index++;
	}
	
	public void insert(Object obj) {//This method can be called as Add also
		CustomNode cl= new CustomNode(obj,index);
		if(head ==null) {
			head=cl;
		}else {			
			CustomNode temp=head;
			while(temp.next!=null) {
				System.out.println(temp.data);
				 temp=temp.next;
			}
			//n.next=cl;
			temp.next=cl;
		}
		index++;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer sb= new StringBuffer();
		sb.append("[");
		if(head==null) {
			return sb.toString().concat("]");
		}else {
			CustomNode temp=head;
			while(temp.next!=null) {
				sb.append(temp.data+", ");
				temp=temp.next;					
			}
			sb.append(temp.data);
		}
		return sb.toString().concat("]");
		
	}
	
	public Object get(int indexPassed) throws Exception {
		if(indexPassed<0 || indexPassed>=index) {
			throw new Exception("index not found");
		}else {
			if(head==null) {
				throw new Exception("Linked List empty");
			}else {
				CustomNode temp=head;
				while(temp.next!=null) {
					if(temp.customNodeIndex==indexPassed) {
						return temp.data;
					}else {
						temp=temp.next;
					}
				}
				if(temp.customNodeIndex==indexPassed) {
					return temp.data;
				}
			}
		}
		return null;
		
	}
	
	public void insertAtSpecifiedPosition(Object data,Object afterNode) {
		CustomNode cl= new CustomNode(data, index);
		boolean flag=false;
		if(head!=null) {
			CustomNode temp=head;
			while(temp.next!=null) {
				if(temp.data.equals(afterNode)) {
					CustomNode nextAddr=temp.next;
					temp.next=cl;
					cl.next=nextAddr;
					flag=true;
					break;
				}else {
					temp= temp.next;
				}
			}
			if(!flag) {
				if(temp.data.equals(afterNode)) {				
					temp.next=cl;				
				}
			}
		}
		
	}
	
	//10->20->30->40->50 ---remove(40)
	//10->20->30->40 ->remove(40)
	//40->10->40==remove(40)
	public void remove(Object obj) {
		if(head!=null) {
			CustomNode temp=head;//temp =10
			CustomNode previous=null;
			//boolean flag=false;
			if(head.data.equals(obj)) {
				//flag=true;
				CustomNode tempHead= head.next;
				head.next=null;
				head=tempHead;
				return;
			}
			while(temp.next!=null) {//40.next!=null ->true
				if(temp.data.equals(obj)) {//40.data=40==40
					CustomNode nextAddr=temp.next;
					previous.next=nextAddr;
					temp.next=null;
					break;
				}else {
					previous=temp;//previous=30
					temp=temp.next;//temp=40
				}
				
			}
			if(temp.data.equals(obj)) {//40.data=40==40
				//CustomNode nextAddr=temp.next;
				//previous.next=nextAddr;
				//30.next=null;
				previous.next=null;
				temp=null;
				//break;
			}
			
			//if()
			
		}
		
	}
	

}
