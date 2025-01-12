package com.ashokit.senariobased.multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/*
 How would you implement an unbounded queue?
Answer:

Use LinkedBlockingQueue:     maintain order
 */
public class LinkedBlockingQueueExample {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        queue.put(1);
        queue.put(5);
        queue.put(7);
        queue.put(2);
        queue.put(100);

        while (!queue.isEmpty())
        {
            System.out.println(queue.take());  //1 5 7 2 100
        }

    }
}
