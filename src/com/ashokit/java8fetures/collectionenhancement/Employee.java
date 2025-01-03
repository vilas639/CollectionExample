package com.ashokit.java8fetures.collectionenhancement;

import java.time.LocalDate;

public class Employee {
	
	private int empid;
	
	private String emp_name;
	
	
	
	private double salary;
	
	private String city;

	private LocalDate dob;


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String emp_name, Double salary) {
		super();
		this.empid = empid;
		this.emp_name = emp_name;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", emp_name=" + emp_name + ", salary=" + salary + "]";
	}
	
	
	
	

}
