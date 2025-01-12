package com.ashokit.senariobased.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
How would you schedule tasks to execute periodically?
Answer:

Use ScheduledExecutorService:
 */
public class ScheduledExecutorServiceExample {

    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(() -> System.out.println("Task executed"), 0, 1, TimeUnit.SECONDS);


     //   sheduler.scheduleAtFixed("",5,5,TimeUnit.Seconds);  //intial dealy 5 sec then run every 5 sec

       // sheduler.scheduleWithFixedDelay("",5,5,TimeUnit.Seconds); // intial delay 5sec and wait for 5 sec

    }
}
