package com.ashokit.senariobased.multithreading;

import java.util.concurrent.CountDownLatch;
/*
How would you implement a countdown latch?
Answer:

Use CountDownLatch:
 */
public class CountDownlatchExample {
    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(3);

        Runnable task = () -> {
            System.out.println("Task executed");
            latch.countDown();
        };

        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();

        latch.await();

        System.out.println("All tasks finished");
    }
}
