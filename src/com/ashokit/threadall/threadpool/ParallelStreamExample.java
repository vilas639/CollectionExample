package com.ashokit.threadall.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1(1, "John Doe", "Software Engineer", 75000));
        employees.add(new Employee1(2, "Jane Smith", "Senior Developer", 85000));
        employees.add(new Employee1(3, "Michael Brown", "Manager", 95000));
        employees.add(new Employee1(4, "Emily Davis", "Software Engineer", 70000));
        employees.add(new Employee1(5, "Chris Wilson", "Team Lead", 90000));

        System.out.println("Processing employees in parallel...");

        // Filter employees with salary < 80000 and give them a raise
        List<Employee1> updatedEmployees = employees.parallelStream()
                .filter(employee -> employee.getSalary() < 80000)
                .peek(employee -> {
                    System.out.println("Processing: " + employee + " in thread " + Thread.currentThread().getName());
                    employee.setSalary(employee.getSalary() + 5000);
                })
                .collect(Collectors.toList());

        System.out.println("\nUpdated Employees:");
        updatedEmployees.forEach(System.out::println);
    }
}

// Employee class
class Employee1 {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee1(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    // Getters and setters
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
