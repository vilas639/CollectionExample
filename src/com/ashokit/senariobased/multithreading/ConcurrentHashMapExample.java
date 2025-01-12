package com.ashokit.senariobased.multithreading;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ForkJoinPool;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {

        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.computeIfAbsent("key", k -> "value");
        map.computeIfAbsent("key", k -> "value");
        map.computeIfAbsent("key", k -> "value");


        //parall processing
        ForkJoinPool pool = ForkJoinPool.commonPool();
        pool.submit(() -> {

            for (int i = 0; i < 100; i++) {
                System.out.println("Parallel task");

            }

        });

        pool.shutdown();
    }
}
