package com.ashokit.senariobased.multithreading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
/*
How would you coordinate threads using a barrier?
Answer:

Use CyclicBarrier:
 */
public class CyclicBarrierExample {

    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("Barrier reached"));

        Runnable task = () -> {
            try {
                System.out.println("Task executed");
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                Thread.currentThread().interrupt();
            }
        };

        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();

        System.out.println("Main Thread Running");
    }
}
