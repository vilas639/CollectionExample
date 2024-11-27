package com.ashokit.collectionall.stack;

import java.util.Arrays;

public class CustomStackUsingArray {
	
	Object[] a=null;
	//Integer[] i=new Integer[10]; 
	int index=0; 
	CustomStackUsingArray(){
		a=new Object[10];
	}
	CustomStackUsingArray(int index){
		a=new Object[index];
	}
	
	public Object push(Object obj) {//5--[0,1,2,3,4]
		if(index>=a.length) {
			int newSize=a.length*2;
			a=Arrays.copyOf(a, newSize);
			//Object[] ar= new Object[newSize];
			//for (int i = 0; i < a.length; i++) {
				
			//}
		}
		a[index]=obj;//4
		index++;//5
		return obj;
	}
	public Object peek() throws Exception {
		if(a.length==0) {
			throw new Exception("Stack is empty you cannot perform Peek");
		}
		return a[a.length-1];
	}
	
	public Object pop() throws Exception {
		if(a.length==0) {
			throw new Exception("Stack is empty you cannot perform Peek");
		}
		index=index-1;
		Object obj=a[index];
		a[index]=null;
		return obj;		
	}
	

}
