package com.ashokit.java8fetures.collectionenhancement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CollectionEnhancment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<Integer> l= new ArrayList<>();
		l.add(10);
		l.add(30);
		l.add(50);
		l.add(70);
		l.add(90);
		
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		
		
//	   Consumer<Integer> lm = (x) ->{
//		   System.out.println("with java8"+x);
//	   };
//		
//		l.forEach(lm);
		
		
		 
		
		l.forEach((x) -> { 
			
			System.out.println (" ");
			System.out.println ("with java 8"+x);
			
		});
		
		
		
		List<Employee> emplist = new ArrayList<Employee>();
		
		for(int i=0;i<20;i++) {
			
			Employee e = new Employee(i,"vilas"+i,"2000"+i);
			
			emplist.add(e);
		}
		
		
//		for(int k=0;k<emplist.size();k++)
//		{
//			System.out.println("empp id"+emplist.get(k).getEmpid()+" name:"+emplist.get(k).getEmp_name()+" salry :"+emplist.get(k).getSalary()+"");
//		}
		
		
		
		emplist.forEach((v) -> {
			System.out.println("empp id"+v.getEmpid()+" name:"+v.getEmp_name()+" salry :"+v.getSalary()+"");
		});
		
		
		//removeif
		
		Predicate<Employee> e=(p1) -> {
			return p1.getEmp_name().equals("vilas0");
			
			};
		
		emplist.removeIf(e);
		System.out.println(emplist);
		
		
	}

}
