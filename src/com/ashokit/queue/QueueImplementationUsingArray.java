package com.ashokit.queue;

import java.util.Arrays;

public class QueueImplementationUsingArray {
	
	Object[] a=null;
	int index=0;
	QueueImplementationUsingArray(){
		a=new Object[10];
	}
	
	QueueImplementationUsingArray(int size){
		a=new Object[size];
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
	
	public Object peek() {
		if(a.length==0) {
			return null;
		}else {
			return a[0];
		}
	}
	
	public Object poll() {//Same as remove(0) in ArrayList
		Object obj=peek();
		int indexToBeDeleted=0;
		int noOfShiftoperations=a.length-indexToBeDeleted-1;
		if(noOfShiftoperations>0) {
			System.arraycopy(a, indexToBeDeleted+1, a, indexToBeDeleted, noOfShiftoperations);
		}
		a[--index]=null;
		
		return obj;
	}
	
	//pollFirst -> poll method in Queue
	//pollLast ->pop method in Stack
	//peekfirst -> peek method in Queue
	//peekLast ->peek method in Stack

}
