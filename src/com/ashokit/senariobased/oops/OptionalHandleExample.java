package com.ashokit.senariobased.oops;

import java.util.Optional;

/*

How would you handle optional properties in a method?
Answer:

Use Optional:
 */
public class OptionalHandleExample {

    public static void main(String[] args) {

        OptionalHandleExample o= new OptionalHandleExample();
        o.displayDetails(Optional.of("null"));
    }

    public void displayDetails(Optional<String> middleName) {
        System.out.println("Middle Name: " + middleName.orElse("N/A"));
    }

}

