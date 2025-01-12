package com.ashokit.senariobased.oops;

import com.ashokit.designpattern.creation.Singtone.SingtoneClassDemo;

/*
How would you handle multiple objects sharing the same expensive resource?
Answer:
Use the Singleton Pattern to ensure a single shared instance of the resource:
 */
public class SingletonPatternExample {


    public static void main(String[] args) {


        ExpensiveResource s3= ExpensiveResource.getInstance();
        ExpensiveResource s4= ExpensiveResource.getInstance();
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());


        ;



    }
}


