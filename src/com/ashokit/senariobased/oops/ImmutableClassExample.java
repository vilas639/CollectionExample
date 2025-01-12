package com.ashokit.senariobased.oops;


/*
How would you ensure immutability for an Employee class?
Answer:

Make fields private and final, provide only getter methods, and avoid setters.
 */
public class ImmutableClassExample {

    public static void main(String[] args) {

        Employee1 employee1= new Employee1("ram",20);
        employee1.getAge();
        System.out.println(employee1.getAge());

    }
}


 final class Employee1 {
    private final String name;
    private final int age;

    public Employee1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

