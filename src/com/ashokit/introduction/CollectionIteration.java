package com.ashokit.introduction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionIteration {
	public static void main(String[] args) {
		
		List<Integer> l= new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		
		Iterator<Integer> itr=l.iterator();
		ListIterator<Integer> itr1=l.listIterator();
		
		Employee e= new Employee(123);
		Employee e1=new Employee(123);
		e.setEmpId(456);
		System.out.println(e.getEmpId());
		System.out.println(e1.getEmpId());
		/*
		 * for(;itr.hasNext();) { Integer i1=itr.next(); System.out.println(i1);//10 }
		 */
		int i=0;
		while(itr1.hasNext()) {
			i++;
			Integer i1=itr1.next();
			if(i==2) {
				if(itr1.hasPrevious()) {
					Integer i2=itr1.previous();
					System.out.println(i2);
				}
			}
			System.out.println(i1);//10
		}
		
		
		//int i=display();
	}
	
	static int display(){
		return 0;
	}

}
