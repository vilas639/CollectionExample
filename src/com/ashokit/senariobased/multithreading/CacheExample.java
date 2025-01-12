package com.ashokit.senariobased.multithreading;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
How would you implement a thread-safe cache?
Answer:

Use ConcurrentHashMap:
 */
public class CacheExample {

    static  Map<String, String> cache = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        CacheExample e= new CacheExample();

       cache.put("1","1235");
        cache.put("2","1234");
        cache.put("3","1235");
        cache.put("3","123");

         System.out.println(e.get("3"));

    }

    public String get(String key) {
        return cache.get(key);
    }

    public void put(String key, String value) {
        cache.put(key, value);
    }
}
