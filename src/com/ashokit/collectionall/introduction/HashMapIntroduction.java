package com.ashokit.collectionall.introduction;

import java.util.HashMap;

public class HashMapIntroduction {
	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		Employee e1=new Employee();
		System.out.println(e.hashCode());//SHA algorithm
		System.out.println(e1.hashCode());
		
		Department d=new Department();
		Department d1=new Department();
		System.out.println(d.hashCode());//SHA algorithm
		System.out.println(d1.hashCode());
		
		String s="AB";//String object creation using literal
		String s2="AB";
		System.out.println(s.hashCode());		
		String s1= new String("AB");//String object using new keyword
		System.out.println(s1.hashCode());
		
		System.out.println(s==s1);
		String s3= new String("AB");
		String s4= new String("ABC");
		String s5="ABC";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s==s1);//false
		System.out.println(s==s2);//true
		
		HashMap<Department, Integer> h1= new HashMap<>();
	}

}
