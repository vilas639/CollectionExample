package com.ashokit.threadall.threadpool;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureExample {

	 public static void main(String[] args) {
	        ExecutorService executorService = Executors.newFixedThreadPool(3);

	        // Fetch employee data asynchronously
	        CompletableFuture<Employee> fetchEmployeeFuture = CompletableFuture.supplyAsync(() -> {
	            System.out.println("Fetching employee details... " + Thread.currentThread().getName());
	            return new Employee(1, "John Doe", "Software Engineer", 75000);
	        }, executorService);

	        // Update employee salary asynchronously
	        CompletableFuture<Employee> updateSalaryFuture = fetchEmployeeFuture.thenApplyAsync(employee -> {
	            System.out.println("Updating employee salary... " + Thread.currentThread().getName());
	            employee.setSalary(employee.getSalary() + 5000);
	            return employee;
	        }, executorService);

	        // Save updated employee data asynchronously
	        CompletableFuture<Void> saveEmployeeFuture = updateSalaryFuture.thenAcceptAsync(employee -> {
	            System.out.println("Saving employee details... " + Thread.currentThread().getName());
	            System.out.println("Updated Employee: " + employee);
	        }, executorService);

	        // Wait for all tasks to complete
	        saveEmployeeFuture.join();
	        executorService.shutdown();
	        System.out.println("All tasks completed!");
	    }
	}

	// Employee class
	class Employee {
	    private int id;
	    private String name;
	    private String designation;
	    private double salary;

	    public Employee(int id, String name, String designation, double salary) {
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
