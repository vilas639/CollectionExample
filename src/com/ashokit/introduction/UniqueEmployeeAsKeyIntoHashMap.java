package com.ashokit.introduction;

import java.util.HashMap;
import java.util.Map;

public class UniqueEmployeeAsKeyIntoHashMap {
	
	public static void main(String[] args) {
		Map<String, Integer> m= new HashMap<>();
		m.put("A", 56);//0 & 1 bits--65
		m.put("A", 57);
		m.put("A", 58);
		System.out.println(m.size());//1
		System.out.println(m);//[A,58]
		
		String s="AB";
		String s1= new String("AB");
		s.hashCode();
		s1.hashCode();
		//SHA- Secure Hash Algorithem
		Employee e= new Employee(123);
		Employee e1= new Employee(123);
		Employee e2= new Employee(124);
		
		System.out.println(e.equals(e1));
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());		
		Map<Employee, String> m1= new HashMap<>();
		m1.put(e, "Karthik");//123
		m1.put(e1, "Ashok");//123- >
		m1.put(e2, "Ashok");//123- >
		System.out.println(m1.size());
		System.out.println(m1);		
	}
}
