package com.ashokit.senariobased.oops;

/*
Explain how you’d design a thread-safe Singleton.
Answer:

Use Double-checked locking:
 */
public class DoubleCheckLockExample {


    public static void main(String[] args) {
        Singleton s= Singleton.getInstance();
        Singleton s1= Singleton.getInstance();

        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

    }
}

 class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}