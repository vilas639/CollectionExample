package com.ashokit.introduction;

public class Employee implements Comparable<Employee>{
	int empId;
	String empName;
	double salary;
	
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId) {
		super();
		this.empId = empId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return empId;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e=(Employee)obj;
		if(empId==e.empId)
			return true;
		else 
			return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee id is"+empId+" Emp Name is "+empName+" Salary is "+salary;
	}
	@Override
	public int compareTo(Employee emp) {
		 return compare(this, emp);
		//By Default ascending order by EMpid
		
		// TODO Auto-generated method stub
		//return 0;
	}
	
	 public static int compare(Employee x, Employee y) {
	        return (x.getEmpId() < y.getEmpId()) ? -1 : ((x.getEmpId() == y.getEmpId()) ? 0 : 1);
	    }

	
}
