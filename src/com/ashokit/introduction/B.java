package com.ashokit.introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class B extends A{
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("B class m1 method");
	}
	
	public void m2() {
		System.out.println("B class m2 method");
	}
	
	public static void main(String[] args) {
		
		//Parent is A
		//Child is B
		A a= new A();
		a.m1();
		a.m3();
		
		B b= new B();
		b.m1();
		b.m3();
		b.m2();
		
		A a1= new B();
		a1.m1();
		a1.m3();
		//a1.m2();
		
		//ArrayList- Class-Implements List
		//ArrayList - Child
		//List - Parent
		List l1= new ArrayList<>();
		l1.add(10);
		//l1.replaceAll(null);
		
		ArrayList<Integer> a5= new ArrayList<>();		
		List<Integer> a4= new ArrayList<>();
		a4.add(10);
		a4.add(0);
		a4.add(1);
		a4.add(15);
		a4.add(12);
		a4.add(21);
		System.out.println(a4);//[10,0,1,15,12,21]		
		//Write a program to sort the array list by ascending
		Collections.sort(a4);
		System.out.println(a4);
		
		//Write a program to sort the array list by Descnding
		
		List<Department> depList=new ArrayList<>();
		depList.add(new Department(124,"A"));
		depList.add(new Department(120,"a"));
		depList.add(new Department(121,"Z"));
		depList.add(new Department(125,"E"));
		depList.add(new Department(111,"H"));
		
		//Write a program to sort the depList by dep id ascending
		System.out.println(depList);
		Collections.sort(depList);
		System.out.println(depList);		
		//Write a program to sort the depList by dep id descending
		
		//Write a program to sort the depList by dep Name Asceding
		Collections.sort(depList, new DeptNameComparator());
		System.out.println(depList);
		List<Integer> a2= new Vector<>();
		List<Integer> a3= new CopyOnWriteArrayList<>();
		display(a3);
		//show(a4);
		
		//LinkedHashMap
		/*Write a program to sort the hashmap by keys
		Write a program to sort the hashmap by values*/
		
		System.out.println("Sorted List"+a4);
		Collections.sort(a4, Collections.reverseOrder());
		System.out.println("Sorted List Descending "+a4);
		
		//Comparable and COmaprator
		//Employee name, employee id
		//Write a program to sort empList by emp Id ascending
		//Write a program to sort empList by emp Name
		Employee e1= new Employee(123,"Karthik",10000);
		Employee e2= new Employee(124,"Harish",43000);
		Employee e3= new Employee(125,"Sachin",100000);
		Employee e4= new Employee(126,"Ajay",87484);
		Employee e5= new Employee(127,"Z",76565);
		Employee e6= new Employee(127,"Aravind",76565);		
		List<Employee> empList= new ArrayList<>();
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e1);
		empList.add(e2);
		empList.add(e6);		
		System.out.println(empList);
		
		Collections.sort(empList);
		
		Collections.sort(empList, new Comparator<Employee>() {
			public int compare(Employee x, Employee y) {
					return x.getEmpName().compareTo(x.getEmpName());				
				//return (x.getSalary() < y.getSalary()) ? 1 : ((x.getSalary() == y.getSalary()) ?  : -1);
			};
		});
		//class Policy implements compable 
				//Policy Id ->
				//policy Name
				//Transaction date ->10 years
				//
		Collections.sort(empList, new EmpNameSorting());
		//Write a program to sort the empList by salary descending
		Collections.sort(empList, new Comparator<Employee>() {
			public int compare(Employee x, Employee y) {				
				if(x.getSalary() < y.getSalary())
				{
					return 1;
				}else if(x.getSalary() == y.getSalary()) {
					return x.getEmpName().compareTo(x.getEmpName());
				}else {
					return -1;
				}
				//return (x.getSalary() < y.getSalary()) ? 1 : ((x.getSalary() == y.getSalary()) ?  : -1);
			};
		});
		System.out.println("Salary descending "+empList);
		
		/*
		 * Employee e= new Employee(); new Employee();
		 */
		
		Collections.sort(empList, new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return o1.getEmpName().compareTo(o2.getEmpName());
			};
		});
		System.out.println(empList);
		
		//Write a program to sort empList by emp Name
		
	}
	
	static void display(List<Integer> l) {
		
	}

static void show(ArrayList<Integer> l,Vector<Integer> l1) {
		
	}
}
