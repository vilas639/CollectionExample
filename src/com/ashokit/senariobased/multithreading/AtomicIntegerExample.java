package com.ashokit.senariobased.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

/*

How do you implement a thread-safe counter?
Answer:

Use AtomicInteger:
 */
public class AtomicIntegerExample {

    private final AtomicInteger counter = new AtomicInteger();

    public void increment() {
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }

    public static void main(String[] args) {

        AtomicIntegerExample a= new AtomicIntegerExample();
        a.increment();;
        a.getCounter();
        a.increment();;
        System.out.println("counter"+a.counter);
    }
}
