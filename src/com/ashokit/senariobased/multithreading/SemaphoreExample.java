package com.ashokit.senariobased.multithreading;

import java.util.concurrent.Semaphore;
/*
How would you limit thread execution?
Answer:

Use Semaphore:    to limit reached
 */
public class SemaphoreExample {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(2);

        Runnable task = () -> {
            try {
                semaphore.acquire();
                System.out.println("Task executed");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                semaphore.release();
            }
        };

        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();

        System.out.println("Main Thread Running");
    }
}
