package com.ashokit.senariobased.multithreading;

import java.util.concurrent.PriorityBlockingQueue;
/*
How would you implement a priority queue for tasks?
Answer:

Use PriorityBlockingQueue:     ordder by asending
 */
public class PriorityBlockingQueueExample {


    public static void main(String[] args) throws InterruptedException {



        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();

        queue.add(10);
        queue.add(1);
        queue.add(3);
        queue.add(50);
        queue.add(2);

        while (!queue.isEmpty())
        {

            System.out.println(queue.take()); // 1 2 3 10 50
        }

    }
}
