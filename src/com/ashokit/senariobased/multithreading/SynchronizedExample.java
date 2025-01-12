package com.ashokit.senariobased.multithreading;

/*
How do you ensure thread-safe access to shared resources?
Answer:

Use synchronized:
 */
public class SynchronizedExample {

    public static void main(String[] args) {


    }
}


 class SharedResource {
    private int counter;

    public synchronized void increment() {
        counter++;
    }

    public synchronized int getCounter() {
        return counter;
    }
}