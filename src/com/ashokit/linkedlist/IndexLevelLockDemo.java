package com.ashokit.linkedlist;

import java.util.concurrent.CopyOnWriteArrayList;

public class IndexLevelLockDemo {
    private static final int THREAD_COUNT = 5;
    private static final int LIST_SIZE = 10;

    private static CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
        // Initialize the list with some values
        for (int i = 0; i < LIST_SIZE; i++) {
            list.add(i);
        }

        // Create and start multiple threads
        Thread1 t1= new Thread1(list);
        Thread2 t2= new Thread2(list);
        t1.start();
        t2.start();
    }
    
}

