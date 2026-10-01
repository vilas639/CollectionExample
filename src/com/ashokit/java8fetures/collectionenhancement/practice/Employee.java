package com.ashokit.java8fetures.collectionenhancement.practice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor	
@NoArgsConstructor
@ToString
public class Employee {

	
    
    
	public Employee(int id, String name, double salary, String city, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
		this.age = age;
	}
	
	
	private int id;
    private String name;
    private double salary;
    private String city;
    private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", city=" + city + ", age=" + age + "]";
	}
    
    
    
    

}
