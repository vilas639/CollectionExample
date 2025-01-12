package com.ashokit.senariobased.oops;

/*
 What is the difference between shallow copy and deep copy? Write an example.
Answer:

Shallow Copy: Copies only the reference, not the actual object.
Deep Copy: Copies the actual object.
 */
public class ShalloCopyExample {

    public static void main(String[] args) {


    }
}

 class Address implements Cloneable {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    @Override
    protected Address clone() throws CloneNotSupportedException {
        return (Address) super.clone(); // Shallow copy
    }
}
