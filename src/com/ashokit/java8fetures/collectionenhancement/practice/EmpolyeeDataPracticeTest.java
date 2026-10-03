package com.ashokit.java8fetures.collectionenhancement.practice;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmpolyeeDataPracticeTest {
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub

	        List<Employee> emplist= new  ArrayList<Employee>();

	        Employee e1=new Employee(1,"vilas",70000.00,"Mumbai",34);
	        Employee e2=new Employee(2,"ganesh",30000.00,"Mumbai",45);
	        Employee e3=new Employee(3,"rajesh",40000.00,"Delhi",32);
	        Employee e4=new Employee(4,"mohan",10000.00,"Delhi",29);
	        Employee e5=new Employee(5,"nilesh",40000.00,"Delhi",50);
	        Employee e6=new Employee(6,"arjun",90000.00,"Mumbai",55);
	        Employee e7=new Employee(7,"Ram",45000.00,"Delhi",45);
	        Employee e8=new Employee(8,"vilas",40000.00,"Manali",21);
	        Employee e9=new Employee(8,"vilas",40000.00,"Pune",21);

	        emplist.add(e1);emplist.add(e2);emplist.add(e3);emplist.add(e4); emplist.add(e5); emplist.add(e6); emplist.add(e7);
	        emplist.add(e8);
	        emplist.add(e9);
	        //get list of detail who belong to delhi

	        
	      List<Employee> emplistdelhi=emplist.stream()
	      .filter(emp -> "Delhi".equalsIgnoreCase(emp.getCity()))
	      .collect(Collectors.toList());
	
	      System.out.println(emplistdelhi);

	      //find employee whose name start with A
	      
	      List<Employee> empliststart= emplist.stream()
	      .filter(emp -> emp.getName().startsWith("A"))
	      .collect(Collectors.toList());
	      
	      System.out.println("start with A"+empliststart);
	      
	        //get name of employee
	        //map transform objexct into field
//	      List<String> emplistdelhi=emplist.stream()
//	              .filter(emp -> "Delhi".equalsIgnoreCase(emp.getCity()))
//	              .map(e -> e.getName())
//	              .collect(Collectors.toList());
	//
//	      System.out.println(emplistdelhi);

	        ////get id and name employee
	        //build key value structre

//	      Map<Integer,String> emplistdelhi=emplist.stream()
//	              .filter(emp -> "Delhi".equalsIgnoreCase(emp.getCity()))
//	              .collect(Collectors.toMap(Employee::getId, Employee::getName));
	//
//	      System.out.println(emplistdelhi);

	        //get id and object
	        //Mapping multiple fields into a concise representation.
//	      Map<Integer,Employee> emplistdelhi=emplist.stream()
//	              .filter(emp -> "Delhi".equalsIgnoreCase(emp.getCity()))
//	              .collect(Collectors.toMap(Employee::getId, emp -> emp));
	//
//	      System.out.println(emplistdelhi);

	        //sort employee by salary descending order
	        //Using sorted() with Comparator.comparing().
//	      List<Employee> emplistdelhi=      emplist.stream().
//	              filter(emp -> "Delhi".equalsIgnoreCase(emp.getCity()))
//	              .sorted(Comparator.comparing(Employee::getSalary).reversed())
//	              .collect(Collectors.toList());
	//
//	      System.out.println(emplistdelhi);

	        //sort employee by salary descending order highest salary
	        //find first or max

//	      Optional<Employee> emplistdelhi=      emplist.stream().
//	              filter(emp -> "Delhi".equalsIgnoreCase(emp.getCity()))
//	              .sorted(Comparator.comparing(Employee::getSalary).reversed())
//	              .findFirst();
	//
	//
//	      System.out.println(emplistdelhi);

	        //sort the employe by alphatect order
//	      List<Employee> emplistdelhi=      emplist.stream().
//	      sorted(Comparator.comparing(Employee::getName))
//	      .collect(Collectors.toList());
//	      System.out.println(emplistdelhi);

	        //grouping by city

//	      Map<String,List<Employee>> emplistdelhi= emplist.stream()
//	      .collect(Collectors.groupingBy(Employee::getCity));
	//
//	      System.out.println(emplistdelhi);

	        //grouping by city  of each employee
	        //groupingBy() for classification.
//	      Map<String,List<Employee>> emplistdelhi= emplist.stream()
//	              .sorted(Comparator.comparing(Employee::getSalary))
//	              .collect(Collectors.groupingBy(Employee::getCity));
	//
//	              System.out.println(emplistdelhi);

	        //grouping by city and max salry of each employee
//	      Map<String,Optional<Employee>> emplistdelhi= emplist.stream()
//	      .sorted(Comparator.comparing(Employee::getSalary))
//	      .collect(Collectors.groupingBy(Employee::getCity,
//	              Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
	//
//	      System.out.println(emplistdelhi);

	        //grouping by salary
//	      Map<Double ,List<Employee>> groupsalry=emplist.stream()
//	      .collect(Collectors.groupingBy(Employee::getSalary));
//	      System.out.println(groupsalry);

	        //count the employee in each city
//	      Map<String,Long> emplistdelhi=emplist.stream()
//	      .collect(Collectors.groupingBy(Employee::getCity, Collectors.counting()));
//	      System.out.println(emplistdelhi);

	        //what is avg salary of delhi empoyee
//	      double avgsal=emplist.stream()
//	      .filter(emp -> "Mumbai".equalsIgnoreCase(emp.getCity()))
//	      .collect(Collectors.averagingDouble(Employee::getSalary));

//	      System.out.println(avgsal);

	        //avg salary of each city wise

//	      Map<String,Double> emplistdelhi= emplist.stream()
//	      .sorted(Comparator.comparing(Employee::getSalary))
//	      .collect(Collectors.groupingBy(Employee::getCity,Collectors.averagingDouble(

//	      System.out.println(emplistdelhi);

//	      Map<String,List<Employee>> emplistdelhi=    emplist.stream()
//	      .collect(Collectors.groupingBy(Employee::getCity));

	        //parrele strem
//	      Map<String,List<Employee>> emplistdelhi=    emplist.parallelStream()
//	              .collect(Collectors.groupingBy(Employee::getCity));
//	      System.out.println(emplistdelhi);

	        //3rd highest salry per city wise
//	      Map<String,Employee> secondHighestByCityClean = emplist.stream()
//	      .collect(Collectors.groupingBy(Employee::getCity,
//	              Collectors.collectingAndThen(
//	                      Collectors.toList(),
//	                      m -> m.stream()
//	                      .sorted(Comparator.comparing(Employee::getSalary).reversed())
//	                      .limit(3)
//	                      .skip(2)
//	                      .findFirst()
//	                      .orElse(null)
//	                      )));
//	              System.out.println(secondHighestByCityClean);

	        //find top 3 highest salay with distinct

//	      Map<Integer,Employee> second= emplist.stream()
//	      .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
//	      .distinct()
//	      .limit(3)
//	      .collect(Collectors.toMap(Employee::getId, Employee -> Employee));
//	      System.out.println(second);

	        //sum of all employee salary
//	      double totalsum=emplist.stream()
//	              .mapToDouble(Employee::getSalary)
//	              .sum();
	//
//	      System.out.println(totalsum);
	      
	      //sum of all employee salary using reduce 
//	      double totalsum = emplist.stream()
//                  .map(Employee::getSalary)
//                  .reduce(0.0, Double::sum);
//	      System.out.println(totalsum);

	        //total sum groupwise city
	      Map<String,Double> groupwisecity=   emplist.stream()
	      .collect(Collectors.groupingBy(
	              Employee::getCity,
	              Collectors.collectingAndThen(Collectors.toList(),
	                      m -> m.stream()
	                      .mapToDouble(Employee::getSalary)
	                      .sum()
	                      )));
	      System.out.println("total sum groupwisece city"+groupwisecity);

	        //those age is 45 increase there salary by 10% and provide then list
	        //peek for modification

//	      Map<Integer,Employee> emplistage=emplist.stream()
//	      .filter(emp -> emp.getAge() > 45)
//	      .peek(emp -> emp.setSalary(emp.getSalary()*1.10))
//	      .collect(Collectors.toMap(Employee::getId, Employee -> Employee));
//	      System.out.println(emplistage);

//	      supplier    value with no input
//	      consumer    thee value with no return
//	      predicate   test the condition
//	      function    pass paramter

	        //those age is 45 increase there salary by 10% and provide then only name
	        //peek for modification
//	      Map<Integer,String> emplistage=emplist.stream()
//	              .filter(emp -> emp.getAge() > 45)
//	              .peek(emp -> emp.setSalary(emp.getSalary()*1.10))
//	              .collect(Collectors.toMap(Employee::getId, Employee -> Employee.getName(
//	              System.out.println(emplistage);

	        //give me list of name using , paramter

//	      String csvname= emplist.stream()
//	              .map(Employee::getName)
//	              .collect(Collectors.joining(","));
	//
//	      System.out.println(csvname);

	        //find the unique name
//	      Set<String> uniquename=   emplist.stream()
//	      .map(emp -> emp.getName())
//	      .collect(Collectors.toSet());
//	      System.out.println(uniquename);

	        //find unige record
//	      List<Employee> uniquerecord=    emplist.stream()
//	      .collect(Collectors.toMap(Employee::getId, emp -> emp,
//	              (e,n) -> e))
//	      .values().stream()
//	      .collect(Collectors.toList());
//	      System.out.println(uniquerecord);

	        //find the duplicate name
//	      Set<String> uniquename= emplist.stream()
//	      .collect(Collectors.groupingBy(Employee::getName,Collectors.counting()))
//	      .entrySet().stream()
//	      .filter(data -> data.getValue() > 1)
//	      .map(Map.Entry::getKey)
//	      .collect(Collectors.toSet());
//	      System.out.println(uniquename);


	        //given list sort salry in descenting order and skip first 3 in list

//	      List<Employee>   skipemp=   emplist.stream()
//	      .sorted(Comparator.comparing(Employee::getSalary).reversed())
//	      .skip(3)
//	      .collect(Collectors.toList());
	//
//	      System.out.println(skipemp);


	        //given list sort salry in descenting order and skip last 3 in list
//	      List<Employee>  skipemp=  emplist.stream()
//	              .sorted(Comparator.comparing(Employee::getSalary).reversed())
//	              .limit(emplist.size()-3)
//	              .collect(Collectors.toList());
	//
//	              System.out.println(skipemp);

	        //sort employee by city then age then salary
//	      List<Employee> Sortlist=emplist.stream()
//	      .sorted(Comparator.comparing(Employee::getCity)
//	              .thenComparing(Employee::getAge)
//	              .thenComparing(Employee::getSalary).reversed()
//	              )
//	      .collect(Collectors.toList());
	//
//	      System.out.println(Sortlist);

	        //filter the list whose name lest than 4 char

//	      List<Employee> charlist= emplist.stream()
//	      .filter(emp -> emp.getName().length() <= 3)
//	      .collect(Collectors.toList());
//	      System.out.println(charlist);

	        //salary renge 30k to 40k range
//	      List<Employee> SalrangeList=emplist.stream()
//	      .filter(emp -> emp.getSalary() >=30000 && emp.getSalary() <=40000)
//	      .collect(Collectors.toList());
//	      System.out.println(SalrangeList);

	        //want name those salary in 30k to 40k range  and age between 30 to 40
//	      List<String> SalrangeList1=emplist.stream()
//	              .filter(emp -> emp.getSalary() >=30000 && emp.getSalary() <=400
//	              .filter(emp -> emp.getAge() >=30 && emp.getAge() <=40)
//	              .map(t -> t.getName())
//	              .collect(Collectors.toList());
//	              System.out.println(SalrangeList1);

	        //want name those salary in 30k to 40k range  and age between 30 to 40
//	              List<Employee> SalrangeListNew=   emplist.stream()
//	              .filter(emp -> emp.getSalary() >=30000 && emp.getSalary() <=
//	              .filter(emp -> emp.getAge() >=30 && emp.getAge() <=40)
//	              .peek(emp -> emp.setSalary(emp.getSalary()*1.10))
//	              .collect(Collectors.toList());
//	              System.out.println(SalrangeListNew);

	        //remove duplicate employee
	      
	      //flatmap
//	      List<List<String>> skills = null;
//
//List<String> result =skills.stream()
//                .flatMap(List::stream)
//                .collect(Collectors.toList());
//
//System.out.println(result);
	      
	      //partitioningBy
//	      Map<Boolean, List<Employee>> result =
//	    	        emplist.stream()
//	    	                .collect(Collectors.partitioningBy(
//	    	                        e -> e.getSalary() >= 50000
//	    	                ));
//
//	      System.out.println("partitan by"+result);
//
//	    
	 
	      
	      Predicate<Employee> isIT =
	    	        e -> "Delhi".equalsIgnoreCase(e.getCity());

	    	Predicate<Employee> highSalary =
	    	        e -> e.getSalary() > 40000;

	    	Predicate<Employee> experienced =
	    	        e -> e.getAge() > 32;

	    	List<Employee> result =
	    	        emplist.stream()
	    	                .filter(isIT.and(highSalary).and(experienced))
	    	                .collect(Collectors.toList());

	    	 System.out.println("predict list by"+result);
	


	}

}