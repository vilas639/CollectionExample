package com.ashokit.java8fetures.collectionenhancement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatondComparable implements Comparator<Integer> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> l= new ArrayList<>();
		l.add(60);
		l.add(30);
		l.add(90);
		l.add(70);
		l.add(100);
		l.add(10);
		
		System.out.println("before sort"+l);
		//write a program to sort in asending order
		Collections.sort(l); //COMPARBALE NATURAL SORTING USING COMPARE METHOD
		
		// param <parm2 ? 1 : param1==param2 :0 ? -1
		System.out.println("after sort"+l);
		
		//write a program sort using desending order
		//implement comparator overite compare method
		Collections.sort(l, new ComparatondComparable());
		
		System.out.println("is decending order"+l);
 
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		
		return (o1<o2) ? 1 : ((o1==o2) ? 0:-1);
	}

}
