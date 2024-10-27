package com.ashokit.java8fetures.collectionenhancement;

import java.util.ArrayList;
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
		
		
	}

}
