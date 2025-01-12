package com.ashokit.senariobased.oops;


/*
How would you design a system where multiple types of employees have different salary calculation logic?
Answer:
Use the Strategy Pattern to encapsulate salary calculation logic for each employee type.
 */
public class StrategyPatternExample {

    public static void main(String[] args) {
        Employee e= new Employee(new FullTimeSalary());
        Employee e1= new Employee(new PartTimeSalary());
        System.out.println("full time salary"+e.getSalary(20000));
        System.out.println("part time salary"+e1.getSalary(20000));


    }

}

 interface SalaryStrategy {
    double calculateSalary(double baseSalary);
}

 class FullTimeSalary implements SalaryStrategy {
    @Override
    public double calculateSalary(double baseSalary) {
        return baseSalary + (baseSalary * 0.2); // Full-time bonus
    }
}

 class Employee {
    private SalaryStrategy salaryStrategy;

    public Employee(SalaryStrategy salaryStrategy) {
        this.salaryStrategy = salaryStrategy;
    }

    public double getSalary(double baseSalary) {
        return salaryStrategy.calculateSalary(baseSalary);
    }
}

 class PartTimeSalary implements SalaryStrategy {
    @Override
    public double calculateSalary(double baseSalary) {
        return baseSalary * 0.5; // Half salary for part-time
    }
}

