package com.ashokit.java8fetures.collectionenhancement;


class Employee3 {

    private int eid;
    private String name;
    private int age;
    private double salary;

    public Employee3(int eid, String name, int age, double salary) {
        this.eid = eid;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getEid() {
        return eid;
    }

    public int getAge() {
        return age;
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
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
