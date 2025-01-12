package com.ashokit.senariobased.multithreading;

/*
How would you prevent deadlocks?
Answer:

Use a consistent locking order:
 */
public class DeadlockFreePreventExample {



    public static void main(String[] args) throws InterruptedException {

        DeadlockFree d= new DeadlockFree();


        Runnable r= new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    d.method1();
                    d.method2();
                }

            }
        };

        Thread t= new Thread(r);
        t.start();
        t.join();
        System.out.println("Main Thread");

    }
}

 class DeadlockFree {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void method1() {
        synchronized (lock1) {
            synchronized (lock2) {
                System.out.println("Executing method1");
            }
        }
    }

    public void method2() {
        synchronized (lock1) {
            synchronized (lock2) {
                System.out.println("Executing method2");
            }
        }
    }
}
