package com.ashokit.basic.oops;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student>{

	int marks;
	
	Student(int m)
	{
		this.marks = m;
	}
	
	public int getMarks() {
		return marks;
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.marks, o.marks);
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Student [marks=" + marks + "]";
	}

	public static void main(String[] args) {
		System.out.println("hi");
		
		Student s= new Student(30);
		Student s1= new Student(15);
		
		List<Student> list= new ArrayList<>();
		list.add(s);
		list.add(s1);
		
		System.out.println(list.toString());
		
		//list.sort(Comparator.comparingInt(Student::));
		list.sort(Comparator.comparingInt(Student::getMarks));
		
		System.out.println(list.toString());
		
		
	}

}
