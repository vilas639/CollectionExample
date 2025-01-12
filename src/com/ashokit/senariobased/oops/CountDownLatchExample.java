package com.ashokit.senariobased.oops;

import java.util.concurrent.CountDownLatch;

/*

How would you ensure that certain tasks run sequentially in a multi-threaded environment?
Answer:

Use a CountDownLatch: */
public class CountDownLatchExample {

    public static void main(String[] args) {


        CountDownLatch latch = new CountDownLatch(1);

        Thread t1 = new Thread(() -> {
            try {
                latch.await();
                System.out.println("Task 1 executed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Task 2 executed");
            latch.countDown();
        });

        t1.start();
        t2.start();

    }
}
