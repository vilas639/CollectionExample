package com.ashokit.designpattern.creation.abstractfactory;

public class AbstractFactoryPatternDemo {
//This pattern allows the client to create specific employee types without knowing the exact class details, promoting flexibility and scalability.
//it provide the concept of Factory of factories

    public static void main(String[] args) {

        Employee androidDev = EmployeeFactory.getEmployee(new AndroidFactory());
        androidDev.work();

        Employee webDev = EmployeeFactory.getEmployee(new WebFactory());
        webDev.work();
    }
}


// Step 1: Create the Employee interface
interface Employee {
    void work();
}

// Step 2: Implement concrete classes for Android and Web employees
class AndroidEmployee implements Employee {
    @Override
    public void work() {
        System.out.println("Android Developer is working on a mobile app.");
    }
}

class WebEmployee implements Employee {
    @Override
    public void work() {
        System.out.println("Web Developer is working on a web application.");
    }
}

// Step 3: Create the abstract factory
interface EmployeeAbstractFactory {
    Employee createEmployee();
}

// Step 4: Implement concrete factories for Android and Web employees
class AndroidFactory implements EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new AndroidEmployee();
    }
}

class WebFactory implements EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new WebEmployee();
    }
}

// Step 5: Create the Factory producer to get the appropriate factory
class EmployeeFactory {
    public static Employee getEmployee(EmployeeAbstractFactory factory) {
        return factory.createEmployee();
    }
}

// Step 6: Demonstrate the usage

