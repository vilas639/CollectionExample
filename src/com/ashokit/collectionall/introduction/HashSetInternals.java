package com.ashokit.collectionall.introduction;

import java.util.HashSet;
import java.util.Set;

public class HashSetInternals {
	
	static Object PRESENT= new Object();
	static final int i=10;
	
	public static void main(String[] args) {	
		
		Set<String> s= new HashSet<>();
		s.add("A");//map.put("A",PRESENT);
		s.add("B");//map.put("B",PRESENT);
		s.add("C");//map.put("C",PRESENT);
		s.add("D");//map.put("D",PRESENT);
		s.add("E");//map.put("E",PRESENT);
		
		
		if(s.add("A")) {
			
		}else {
			//Select * from Employee- duplicates
		}
		
		Employee e= new Employee(123);
		Employee e1= new Employee(123);
		Employee e2= new Employee(124);
		
		
		Employee[] empArray= new Employee[3];
		empArray[0]=e;
		empArray[1]=e1;
		empArray[2]=e2;
		
		String s1="Karthik";
		int i1=10;
		Object[] a= new Object[10];
		a[0]=s1+10;
		
		
		Set<Employee> empSet= new HashSet<>();
		//Select * from employee ->JDBC
		for (int i = 0; i < empArray.length; i++) {
			/*if(empSet.contains(empArray[i])) {
				
			}else {
				empSet.add(empArray[i])
			}*/			
			if(empSet.add(empArray[i])) {
				
			}else {
				System.out.println("Duplicate EMployee found");
			}
		}
		
		System.out.println(empSet.size());//2
		System.out.println(empSet.size());//3
		
		
		
		
		
		
	}

}
