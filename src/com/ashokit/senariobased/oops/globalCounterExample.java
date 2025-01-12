package com.ashokit.senariobased.oops;

import java.util.concurrent.atomic.AtomicInteger;

/*

How would you design a thread-safe class that maintains a global counter?
Answer:

Use AtomicInteger or synchronized methods:
 */
public class globalCounterExample {

   private GlobalCounter  g1;

    public static void main(String[] args) {

        globalCounterExample g= new globalCounterExample();
        GlobalCounter.increment();

    }
}

 class GlobalCounter {
    private static AtomicInteger counter = new AtomicInteger(0);

    public static int increment() {
        return counter.incrementAndGet();
    }

    public static int getValue() {
        return counter.get();
    }
}