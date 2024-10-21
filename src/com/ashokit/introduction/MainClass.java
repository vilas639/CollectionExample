package com.ashokit.introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainClass {
	
	public static void main(String[] args) {
		
		List<Integer> l= new Vector<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(0);
		
		Thread1 t1=new Thread1(l, "T1");
		Thread2 t2=new Thread2(l, "T2");
		t1.start();
		t2.start();
		
	}

}
