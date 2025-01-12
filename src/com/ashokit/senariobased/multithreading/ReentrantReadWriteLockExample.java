package com.ashokit.senariobased.multithreading;

import java.util.concurrent.locks.ReentrantReadWriteLock;
/*
How would you implement a read-write lock?
Answer:

Use ReentrantReadWriteLock:
 */
public class ReentrantReadWriteLockExample {

    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public static void main(String[] args) {

        ReentrantReadWriteLockExample ab = new ReentrantReadWriteLockExample();

        Runnable read= new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {

                    ab.read();

                }
            }
        };


        Runnable write= new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {

                    ab.write();

                }
            }
        };

        Thread reathread= new Thread(read);
        Thread writethread = new Thread(write);

        reathread.start();
        writethread.start();

        System.out.println("Main Thread running");





    }

    public void read() {
        lock.readLock().lock();
        try {
            // read operation
            System.out.println("Read operation");
        } finally {
            lock.readLock().unlock();
        }
    }

    public void write() {
        lock.writeLock().lock();
        try {
            // write operation
            System.out.println("Write operation");
        } finally {
            lock.writeLock().unlock();
        }
    }
}
