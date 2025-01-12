package com.ashokit.senariobased.multithreading;

import java.util.concurrent.*;

/*
How would you implement a thread pool?
Answer:

Use ExecutorService:
 */
public class ExceuteServiceExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {


        ExecutorService excutor = Executors.newFixedThreadPool(3);

        //excutor.submit()

        Future<?> future= excutor.submit(() -> {

            for (int i = 0; i < 100; i++) {
                System.out.println("task excuted"+i);
               System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        future.get();
      //  future.get(1, TimeUnit.SECONDS);   //enforce a thread timeout
        if(future.isDone()){
            System.out.println("Task is Done");
        }
        excutor.awaitTermination(100, TimeUnit.SECONDS);
        excutor.shutdown();

     System.out.println("Main Thread");


    }
}
