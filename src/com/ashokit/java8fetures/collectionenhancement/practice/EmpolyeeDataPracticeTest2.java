package com.ashokit.java8fetures.collectionenhancement.practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmpolyeeDataPracticeTest2 {
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
	        Employee e9=new Employee(9,"vilas",40000.00,"Pune",21);
	        Employee e10=new Employee(10,"arrav",20000.00,"Pune",23);
	        Employee e11=new Employee(11,"yogesh",30000.00,"Pune",25);
	        emplist.add(e1);emplist.add(e2);emplist.add(e3);emplist.add(e4); emplist.add(e5); emplist.add(e6); emplist.add(e7);
	        emplist.add(e8);
	        emplist.add(e9);
	        emplist.add(e10);
	        emplist.add(e11);
	        
	       
	      //get list of detail who belong to delhi
	        
//	        List<Employee> empdelhilist= emplist.stream()
//	   	         .filter(emp -> "Delhi".equalsIgnoreCase(emp.getCity()))
//	   	         .collect(Collectors.toList());
//	   	        
//	   	       System.out.println("delhi"+empdelhilist);
	   	       
	        //get name of employee
	       	//map transform objexct into field
	   	       
//	        List<String> empdelhilist= emplist.stream()
//	        .map(emp -> emp.getName())
//	        .collect(Collectors.toList());
//	        
//	        System.out.println("delhi"+empdelhilist);
	        
	        //get id and name employee
	       	        //build key value structre
//	        Map<Integer,Employee> empdelhilist=emplist.stream()
//	        		.collect(Collectors.toMap(Employee:: getId, emp -> emp));
//	        
//	        System.out.println("delhi"+empdelhilist);
	        
	        //sort employee by salary descending order
	       	        //Using sorted() with Comparator.comparing().
	        
//	       List<Employee> empdelhilist= emplist.stream()
//	        .sorted(Comparator.comparing(Employee:: getSalary).reversed())
//	        .collect(Collectors.toList());
//	       System.out.println("delhi"+empdelhilist);
	        
	          //sort employee by salary descending order highest salary
	       	        //find first or max
//	        Optional<Employee> empdelhilist= emplist.stream()
//	    	        .sorted(Comparator.comparing(Employee:: getSalary).reversed())
//	    	        .findFirst();
//	    	       System.out.println("delhi"+empdelhilist);
	       	
	    	//sort the employe by alphatect order
	        
//	    	       List<Employee> empdelhilist= emplist.stream()
//	    	   	        .sorted(Comparator.comparing(Employee:: getName))
//	    	   	        .collect(Collectors.toList());
//	    	   	       System.out.println("delhi"+empdelhilist);
	    	    		   
	    	 //grouping by city
	        
//	        Map<String,List<Employee>> empdelhilist=  emplist.stream()
//	        .collect(Collectors.groupingBy(Employee::getCity));
//	        System.out.println("delhi"+empdelhilist);
	         
	        //count the employee in each city
	        
//	        Map<String,Long> empdelhilist=  emplist.stream()
//	    	        .collect(Collectors.groupingBy(Employee::getCity,Collectors.counting()));
//	    	        System.out.println("delhi"+empdelhilist);
//	    	        
	           //what is avg salary of delhi empoyee
	    	        
//	      Double delhiavg=  emplist.stream()
//	        .filter(e -> "Delhi".equalsIgnoreCase(e.getCity()))
//	        .collect(Collectors.averagingDouble(Employee::getSalary));
	    	
	  //    System.out.println("delhi"+delhiavg);
	           //avg salary of each city wise
	      
//	      Map<String,Double>  citywise= emplist.stream()
//	        .collect(Collectors.groupingBy(Employee::getCity,
//	        		 Collectors.averagingDouble(Employee:: getSalary)));
//	      System.out.println("delhi"+citywise);
	            
	      //parrele strem
//	      Map<String,List<Employee>> empparra=  emplist.parallelStream()
//	        .collect(Collectors.groupingBy(Employee::getCity));
//	      System.out.println("delhi"+empparra);
	      
	        //3rd highest salry per city wise
	     
//	      Map<String,Employee> empparra= emplist.stream()
//	        .collect(Collectors.groupingBy(Employee::getCity,
//	        		Collectors.collectingAndThen(
//	        		Collectors.toList(), 
//	        		m -> m.stream()
//	        		.sorted(Comparator.comparing(Employee::getSalary).reversed()
//	        				)
//	        		.limit(3)
//	        		.skip(2)
//	        		.findFirst()
//	        		.orElse(null))));
//	        
//	        System.out.println("delhi"+empparra);
	        
	               //find top 3 highest salay with distinct
//	     Map<Integer,Employee> empparra =  emplist.stream()
//	        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
//	        .distinct()
//	        .limit(3)
//	        .collect(Collectors.toMap(Employee::getId,e -> e));
//	        
//	     System.out.println("delhi"+empparra);
	        
	        
	       Optional<Employee> empnam= emplist.stream()
	        .sorted(Comparator.comparing(Employee:: getSalary).reversed())
	        .distinct()
	        .limit(2)
	        .skip(1)
	        .findFirst();
	       System.out.println("2nd higest "+empnam);
	        
	                //sum of all employee salary
//	       Double totalsum= emplist.stream()
//	        .mapToDouble(Employee::getSalary)
//	        .sum();
//	       System.out.println("delhi"+totalsum);
	       
	                  //total sum groupwise city
//	       Map<String,Double> totalsum= emplist.stream()
//	   	        .collect(Collectors.groupingBy(Employee::getCity,
//	   	        		Collectors.collectingAndThen(
//	   	        		Collectors.toList(),
//	   	        		m -> m.stream()
//	   	        		.mapToDouble(Employee:: getSalary)
//	   	        		.sum())));
//	       
//	       System.out.println("delhi"+totalsum);
	       
	       //those age is 45 increase there salary by 10% and provide then list
	       	        //peek for modification
//	       Map<Integer,Employee> emplistage=  emplist.stream()
//	             .filter(emp -> emp.getAge() >45
//	            		 .peek(emp -> emp.SetSalary(emp.getSalary()* 1.10)
//	            .collect(Collectors.toMap(Employee::getId, Employee -> Employee));		
	       
	       //those age is 45 increase there salary by 10% and provide then only name
	       	        //peek for modification
	       	           
	       //give me list of name using , paramter
	       	           
	       //find the unique name
//              Set<String> uniquename=emplist.stream()
//              .map(m -> m.getName())
//              .collect(Collectors.toSet());
      
	       	             //find unige record
//             List<Employee> uniqerecords= emplist.stream()
//              .collect(Collectors.toMap(Employee:: getId, 
//            		  e -> e,
//            		  (e,x) -> e)
//            		  )
//              .values().stream()
//              .collect(Collectors.toList());
//             
//             System.out.println("uniqerecords"+uniqerecords);
              
	       	              //find the duplicate name
	       
	       Set<String> uniquename=   emplist.stream()
	       .collect(Collectors.groupingBy(Employee::getName,Collectors.counting()))
	       .entrySet().stream()
	       .filter(data -> data.getValue() >1)
	       .map(Map.Entry::getKey)
	       .collect(Collectors.toSet());
	       System.out.println("duplicate"+uniquename);

//	       emplist.stream()
//	       .sorted(Comparator.comparing(Employee::getCity)
//	    		   .thenComparing(Employee::getSalary)
//	    		   .thenComparing(Employee::getName)
//	    		   )
//	       .collect(Collectors.toList());
	       
	       	               //given list sort salry in descenting order and skip first 3 in list	         	        	         //given list sort salry in descenting order and skip last 3 in list
	       	                //filter the list whose name lest than 4 char
	       	                 //salary renge 30k to 40k range
	       	                   //want name those salary in 30k to 40k range  and age between 30 to 40
	       	                     //want name those salary in 30k to 40k range  and age between 30 to 40	        	
	        
	      
	       
	        //count the number of word
	        String name="VILAS SAVAJI JADHAV VILAS";
           	 //find the duplicate with there count

             //find the repeated charater
              //find the first repeated charater
               //find the first nonrepeated charater
                //find the most repeated charater
                 //reverse the character of each word
                 //reverse string
	        	
          Map<Object,Long> headCount=  Arrays.stream(name.trim().split(" "))
            .collect(Collectors.groupingBy(e -> e,Collectors.counting()));
	     
          System.out.println("total head"+headCount);
        //find the duplicate with there count
          
        Map<Object,Long> dupicateCount=  headCount.entrySet()
          .stream()
          .filter(e -> e.getValue() >1)
          .collect(Collectors.toMap(Map.Entry:: getKey, Map.Entry:: getValue));
          
        System.out.println("dupicate head"+dupicateCount);
        
      //find the repeated charater
       Map<Character,Long> repeatedchar=name.replace(" ","")
        .toLowerCase()
        .chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
        .entrySet().stream()
        .filter(data -> data.getValue() > 1)
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        
       System.out.println("repeatedchar head"+repeatedchar);
        
       //find the first repeated charater
       Optional<Map.Entry<Character,Long>> repeated1=  name.replace(" ","")
       .toLowerCase()
       .chars()
       .mapToObj(c -> (char) c)
       .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
       .entrySet().stream()
       .filter(data -> data.getValue() > 1)
       .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
       .entrySet().stream()
       .findFirst();
       
       System.out.println("repeatedchar head"+repeated1);
       
     //find the first nonrepeated charater
       Optional<Map.Entry<Character,Long>> repeated2=  name.replace(" ","")
    	       .toLowerCase()
    	       .chars()
    	       .mapToObj(c -> (char) c)
    	       .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
    	       .entrySet().stream()
    	       .filter(data -> data.getValue() == 1)
    	       .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
    	       .entrySet().stream()
    	       .findFirst();
    	       
    	       System.out.println("repeatedchar head"+repeated2);
    	       
    	       
    	       //find mostr repeated
    	       
    	       Optional<Character> repeated3=  name.replace(" ","")
    	    	       .toLowerCase()
    	    	       .chars()
    	    	       .mapToObj(c -> (char) c)
    	    	       .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
    	    	       .entrySet().stream()
    	    	       .filter(data -> data.getValue() >1 )
    	    	       .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
    	    	       .entrySet().stream()    
    	       .max(Map.Entry.comparingByValue())
   	           .map(Map.Entry::getKey);

    	       System.out.println("most repeated head"+repeated3);
    	       
    	       

   	        String reversed = name.
   	                chars()                     // IntStream of characters
   	                .mapToObj(c -> (char) c)    // convert int to char
   	                .collect(Collectors.collectingAndThen(
   	                        Collectors.toList(),
   	                        list -> {
   	                            Collections.reverse(list); // reverse the list
   	                            return list.stream()
   	                                    .map(String::valueOf)
   	                                    .collect(Collectors.joining());
   	                        }));

   	        System.out.println(reversed); // dlroWolleH
	    }
	 
	

	}
