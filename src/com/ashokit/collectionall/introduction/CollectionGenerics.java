package com.ashokit.collectionall.introduction;

import java.util.ArrayList;
import java.util.List;

public class CollectionGenerics {
	
	public static void main(String[] args) {
		
		List l= new ArrayList();
		//COllection framwork is used to group the objects together
		l.add(10);//Auto boxing->COnverting the primitve into corresponding wrapper object -int->Integer
		//int into Integer ->
		//Integer.valueOf(0)
		l.add('a');
		l.add(10.123);//Double.valueOf
		l.add("Karthik");//String
		l.add(new Employee());//
		
		Double d=(Double)l.get(1);//Type cast issue
		System.out.println(d);
		//type safety
		
		//generics
		
		List<Integer> l1= new ArrayList<>();//A a1= new B()
		ArrayList<Integer> l4= new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(40);
		
		Integer l2=l1.get(1);
		
		//A -m1, m3 - instance methods
		//B extedns A -m2, m1() is overridden
		// Main method in B class and write below code
		//B b= new B();//Child object
		//b.m1() ->B class
		//b.m2()
		//A a= new A();
		//a.m1();--A class
		//a.m2();
		
		//A a1= new B();
		//a1.m1()->overriden in b class
		//a1.m3();//
		//a1.m2()//
		
	}

}
