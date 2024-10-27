package com.ashokit.java8fetures.collectionenhancement;

public class Employee1 {
	
	private int empid;
	
	private String emp_name;
	
	private Double salary;

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee1(int empid, String emp_name, Double salary) {
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

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", emp_name=" + emp_name + ", salary=" + salary + "]";
	}
	
	
	
	
	
	

}
