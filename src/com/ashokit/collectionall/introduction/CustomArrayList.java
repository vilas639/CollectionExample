package com.ashokit.collectionall.introduction;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class CustomArrayList {

	Object[] a=null;
	int index=0;
	
	CustomArrayList(int size){
		a= new Object[size];
	}
	
	CustomArrayList(){
		a= new Object[10];
	}
	
	//5
	public  void add(Object obj) {//l.add(60)
		
		if(index>=a.length) {
			int newSize=a.length+(a.length/2);//5+5/2=5+2=7
			
			a=Arrays.copyOf(a, newSize);
			/*Object[] ar= new Object[newSize];//7
			for (int i = 0; i < a.length; i++) {
				ar[i]=a[i];
			}
			a=ar;*/
		}
		//a[0]=obj;
		a[index]=obj;//a[4]=10
		index++;//index=index+1//5
	}
	
	@Override
	public String toString() {
		StringBuilder s=new StringBuilder();
		s.append("[");
		for (int i = 0; i < a.length; i++) {
			
			if(i==(a.length-1))
			{
				if(null!=a[i])
					s.append(a[i]);
			}else {
				if(null!=a[i]) {
					if(i==(a.length-1)) {
						s.append(a[i]);
					}else {
					s.append(a[i]+", ");
					}
				}
			}
		}
		String s1 = s.toString();
		//s1="[10, 20, 30, ";//13->0 to 11
		if (s1.endsWith(", ")) {
			s1 = s1.substring(0, s1.length() - 2);
			}
		//s.append(s1);
		//s.append("]");
		
		return s1.concat("]");
	}
	
	public void check() throws Exception {
		if(index>=a.length || index<0) {
			throw new Exception("Index not found.");
		}
	}
	
	Object get(int index) throws Exception{
		check();
		Object obj=a[index];
		return obj;
	}
	
	public int size() {
		int length=0;
		return a.length;
		/*for (Object object : a) {
			length++;
		}
		System.out.println(length);
		return length;*/
	}
	//5
	//10
	//remove(2);
	//5
	//10
	public Object remove(int indexToBeDeleted) throws Exception {
		check();
		Object obj=get(indexToBeDeleted);
		int noOfShiftOperations=a.length-indexToBeDeleted-1;
		//5-2-1=2
		if(noOfShiftOperations>0) {
			System.arraycopy(a, indexToBeDeleted+1, a, indexToBeDeleted, noOfShiftOperations);
			/*
			 * System.arraycopy(a, 2+1, a, 2, 2); System.arraycopy(a, 3+1, a, 3, 2);
			 */
		}
		a[--index]=null;
			
			return obj;
	}
	
}
