package com.ashokit.collectionall.introduction;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<Integer> l= new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println(l);
		l.add(1,40);
		System.out.println(l);
		
	}

}
