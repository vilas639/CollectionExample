package com.ashokit.java8fetures.collectionenhancement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<String> l= new ArrayList<>();
		l.add("Rakesh");
		l.add("Rakesh");
		l.add("Rakesh");
		l.add("Ajay");
		l.add("Ajay");
		l.add("sarath");
		
		
		Map<String, Long> m1 = l.stream()
			    .collect(Collectors.groupingBy(t -> t, Collectors.counting()));
		
		System.out.println("grouping by "+m1);
		
		//group by name
		List<Employee1> emplist = new ArrayList<Employee1>();
		
		for(int i=0;i<20;i++) {
			
			Employee1 e = new Employee1(i,"vilas"+i,Double.valueOf(i));
			
			emplist.add(e);
		}
		
		
		
		Map<String, Long> m3 = emplist.stream()
			    .collect(Collectors.groupingBy((t) -> t.getEmp_name(), Collectors.counting()));
		
		System.out.println("grouping by "+m3);
		
		
		
		//avg salary
		DoubleSummaryStatistics d1= emplist.stream().collect(Collectors.summarizingDouble((p)->p.getSalary()));
		System.out.println(d1);
		System.out.println("Average "+d1.getAverage());
		System.out.println("max "+d1.getMax());
		System.out.println("min "+d1.getMin());
		
		
		//limit
		List<Integer> l2= new ArrayList<>();
		l2.add(60);
		l2.add(30);
		l2.add(90);
		l2.add(70);
		l2.add(100);
		l2.add(10);
		
		l2.stream().limit(4).forEach((t) -> System.out.println(t));
		
		//find the second largest number in list
		System.out.println("find the second largest number in list ");
		l2.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).forEach(t -> System.out.println(t));
		
		//find the second smallest number in list
		System.out.println("find the second smaalest number in list ");
		l2.stream().sorted().limit(2).skip(1).forEach(t -> System.out.println(t));
		
		//skip the 3 ellment
		System.out.println("skip element ");
		
		l2.stream().skip(3).forEach(t-> System.out.println(t));
		
		//second larget salary of employe
		
		System.out.println("second larget salary of employe");
		
List<Employee1> emplist4 = new ArrayList<Employee1>();
		
		for(int i=0;i<20;i++) {
			
			Employee1 e = new Employee1(i,"vilas"+i,Double.valueOf(i));
			
			emplist4.add(e);
		}
		
		
		
		List<Employee1> e1=emplist4.stream()
		    .sorted((t1,t2) -> (t1.getSalary()> t2.getSalary()) ? -1 : (t1.getSalary()==t2.getSalary()) ? 1: 0)
		    .limit(2).skip(1)
		    .collect(Collectors.toList());
		
		System.out.println(e1);
            
            
		//write a program print a first element 
		System.out.println("find first elemnt ");
		System.out.println(emplist4.stream().findFirst().get());
		
		    
		//sort two list using flatmap
		System.out.println("sort two list using flatmap");
		
		List<String> abc = new ArrayList<String>();
		abc.add("vilas");
		abc.add("rakesh");
		
		List<String> abc1 = new ArrayList<String>();
		abc1.add("vikas");
		abc1.add("ramesh");
		
		List<List<String>> pqr = new ArrayList<List<String>>();
		pqr.add(abc);
		pqr.add(abc1);
		
		System.out.println(pqr);
		
		List<String> sorteddata=pqr.stream()
		.flatMap(t -> t.stream())
	    .collect(Collectors.toList());
		
		System.out.println(sorteddata);
		
		
		//fetch list of employe by name using parallel stream
		System.out.println("fetch list of employe by name using parallel stream");
		
List<Employee1> emplist5 = new ArrayList<Employee1>();
		
		for(int i=0;i<20;i++) {
			
			Employee1 e = new Employee1(i,"vilas"+i,Double.valueOf(i));
			
			emplist5.add(e);
		}
		
		
		
		emplist5.parallelStream().map(t -> t.getEmp_name()).forEachOrdered(t -> System.out.println(t));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
