package com.ashokit.java8fetures.collectionenhancement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	
	
	public static void main(String[] args) {
		
		List<Integer> l= new ArrayList<>();
		l.add(10);
		l.add(30);
		l.add(50);
		l.add(70);
		l.add(90);
		
		//store in data in datastructre
		//linkelist , stack ,queue ,ArrayList
		
		
		//how to create stream
		
		   Stream.of(1,2,3,4);
		   
		 Stream<String> st =   Stream.of("hi","bye","try");
		 
		 //find employee whose name strat with V
		 
		 List<Employee> emplist = new ArrayList<Employee>();
			
			for(int i=0;i<20;i++) {
				
				Employee e = new Employee(i,"vilas"+i,"2000"+i);
				
				emplist.add(e);
			}
			
			
			
			
//		 for (Employee employee : emplist) {
//			 
//			if(validateName(employee.getEmp_name()))
//			{
//				System.out.println("found");
//			}
//			
//				
//		}	
			
			 List<Employee1> emplist1 = new ArrayList<Employee1>();
				
				for(int i=0;i<20;i++) {
					
					Employee1 e = new Employee1(i,"vilas"+i,Double.valueOf(i));
					
					emplist1.add(e);
				}
				
			
			//writ a program get max salary of emplyee
				Employee1 maxSalaryEmployee = emplist1.stream()
					    .max((t1, t2) -> Double.compare(t1.getSalary(), t2.getSalary()))
					    .orElse(null);  // Handles case when list might be empty

					if (maxSalaryEmployee != null) {
					    System.out.println("Employee with the max salary: " + maxSalaryEmployee.getEmp_name() + " - " + maxSalaryEmployee.getSalary());
					}
		
					Employee1 e2=	emplist1.stream()
							.max((t1,t2) -> 
							(t1.getSalary()<t2.getSalary()) ? -1 : (t1.getSalary()==t1.getSalary()) ? 1: 0)
							.orElse(null);
					
					System.out.println("max salary my"+e2.toString());
				
					
			
			//write a program get emp id in separete list
			System.out.println("get emp id list"+emplist.stream().map((t) -> t.getEmpid()).collect(Collectors.toList()));
			
		 
		 emplist.stream().filter((x) -> x.getEmp_name().startsWith("vilas19")).forEach((t) -> System.out.println("type"+t.getEmp_name()));
		 
		 
		//write a program collect employee name in separe list in emplist
		 
		 List<String> empnamelist = new ArrayList<String>();
		
		 for (Employee employee : emplist) {
		 
			 
		
			 empnamelist.add(employee.getEmp_name());
			
	}	
		 
		//  System.out.println(empnamelist.toString());
		 
		List<String> emp1= emplist.stream().map((t) -> t.getEmp_name()).collect(Collectors.toList());
		
		System.out.println(emp1);
		
		
		//write a program to return even number and provide in spareta list
		
		List<Integer> l1= new ArrayList<>();
		l1.add(10);
		l1.add(30);
		l1.add(50);
		l1.add(70);
		l1.add(90);
		
		
		
		Set<Integer> m1= l1.stream().filter((t) -> (t%2==0)).collect(Collectors.toSet());
		
		System.out.println(m1);
		
		//wriite a program a print MIN value in list
		
		int minvalue=l1.get(0);
		for(int i=0;i<l1.size();i++)
		{
			if(l1.get(i)<minvalue)
			{
				minvalue=l1.get(i);
			}
		}
		System.out.println("Min Value is "+minvalue);
		
		
		//in  java8.g
	//	l1.stream().min((t1,t2) -> (t1<t2) ? -1 : (t1==t1) ? 1 : 0).get();
		
		System.out.println("Min Value java 8is "+l1.stream().min((t1,t2) -> (t1<t2) ? -1 : (t1==t1) ? 1 : 0).get());
		//wriite a program a print Max value in list
		 
		int maxvaue=l1.get(0);
		for(int i=0;i<l1.size();i++)
		{
			if(l1.get(i)>maxvaue)
			{
				maxvaue=l1.get(i);
			}
		}
		System.out.println("Max Value is "+maxvaue);
		
		System.out.println("Max Value java 8is "+l1.stream().max((t1,t2) -> (t1<t2) ? -1 : (t1==t1) ? 1 : 0).get());
		
		
		
		//write a program in asending order
		
		List<Integer> l2= new ArrayList<>();
		l2.add(50);
		l2.add(70);
		l2.add(50);
		l2.add(90);
		l2.add(30);
		
		
		System.out.println("Sorted list in asendinf order"+l2.stream().sorted().collect(Collectors.toList()));;
		
		
		//write a program in desending  order
		List<Integer> m3= l2.stream()
		 .sorted(Collections.reverseOrder())
		 .collect(Collectors.toList());
		
		System.out.println("Sorted List in descending order"+m3);
		
		//using comparator in desending order
		
		List<Integer> m4=l2.stream()
		.sorted((t1,t2) -> (t1>t2) ? -1 : (t1==t2) ? 1 : 0)
		.collect(Collectors.toList());
		
		System.out.println("Sorted List in descending order in comparator"+m4);
		
		
		//wriet prorogam sort employee less salary
		
		System.out.println("sort employee less salary");
		emplist1.stream()
		.sorted((t1,t2) -> (t1.getSalary() < t2.getSalary()) ? -1 : (t1.getSalary()==t2.getSalary()) ? 0:1)
		.forEach((p) -> System.out.println(p));
		
		
		
		//wriet prorogam sort employee more salary
		
		System.out.println("sort employee more salary");
		emplist1.stream()
		.sorted((t1,t2) -> (t1.getSalary() > t2.getSalary()) ? -1 : (t1.getSalary()==t2.getSalary()) ? 0:1)
		.forEach((p) -> System.out.println(p));
		
		
		//remove duplicate from list 
		
		List<Integer> l3= new ArrayList<>();
		l3.add(50);
		l3.add(70);
		l3.add(50);
		l3.add(90);
		l3.add(30);
		l3.add(90);
		l3.add(90);
		l3.add(50);

		
		System.out.println("remove duplicate using distinct");
		 l3.stream()
		 .distinct()
		 .sorted(Collections.reverseOrder())
		 .forEach((e) -> System.out.println(e));
		
        
		 //write  a program file duplicate count in list
		 
		
		int duplicate = l3.size() -(int) l3.stream().distinct().count();
		
		System.out.println("duplicate total count "+duplicate);
		
		
		// Count occurrences of each element
		Map<Integer, Long> countMap = l3.stream()
		    .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

		// Filter and display duplicates with their counts
		Map<Integer, Long> duplicates = countMap.entrySet().stream()
		    .filter(entry -> entry.getValue() > 1)
		    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println("Duplicate elements and their counts: " + duplicates);
		
		
		//convert employee list in HashMapp<empid,employee>
		
		 List<Employee1> emplist3 = new ArrayList<Employee1>();
			
			for(int i=0;i<20;i++) {
				
				Employee1 e = new Employee1(i,"vilas"+i,Double.valueOf(i));
				
				emplist3.add(e);
			}
			
		//	emplist3.add(new Employee1(0,"vilas0",0.0d));
			System.out.println("convert list to map");
			
		 Map<Object, Object> map1=	emplist3.stream()
				 .collect(Collectors.toMap
						 (
								 Employee1::getEmpid,      // Key mapper
							        t -> t,                   // Value mapper
							        (existing, replacement) -> existing));
		 
		 System.out.println(map1);
		 
		 //write a program find employee list whose start with k
		 
		 
		 
		List<String> empname1= emplist3.stream()
		 .filter((t) -> t.getEmp_name().startsWith("v"))
		 .map((t) -> t.getEmp_name())
		 .collect(Collectors.toList());
		
		System.out.println("employee name start with v "+empname1);
		
		 //write a program find employee list whose start with k and A
		
		emplist3.add(new Employee1(45,"Kamal",0.0d));
		 emplist3.add(new Employee1(46,"Ashsish",0.0d));
		 emplist3.add(new Employee1(47,"Kohlia",0.0d));
		 emplist3.add(new Employee1(48,"raj",0.0d));
		 
		 List<String> empname2= 	 emplist3.stream()
		 .map((t) -> t.getEmp_name())
		 .collect(Collectors.toList());
		 
		 System.out.println("employee name start with k A "+empname2);
		
	}
	
	 public static boolean validateName(String s)
	 {
		 
		 if(s.startsWith("v"))
		 {
			 return true;
		 }
		 else
		 {
			 return false; 
		 }
		 
		
	 }
	 
	 public static String Returnname(Employee e)
	 {
		 
		return e.getEmp_name();
		 
		
	 }

}
