package com.ashokit.senariobased.oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
What is the best way to compare two custom objects for equality?
Answer:

Override equals() and hashCode() methods:
 */
public class CompartorExample {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("vilas",32));
        personList.add(new Person("vikas",34));
        personList.add(new Person("jaya",26));
        personList.add(new Person("papa",55));

        System.out.println(personList.toString());
    }
}

 class Person {
    private String name;
    private int age;

     public Person(String name, int age) {
         this.name = name;
         this.age = age;
     }

     @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

     @Override
     public String toString() {
         return "Person{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 '}';
     }
 }