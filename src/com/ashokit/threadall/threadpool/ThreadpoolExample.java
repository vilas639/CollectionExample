package com.ashokit.threadall.threadpool;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class ThreadpoolExample {

	
	static int num = 1;
    static final int MAX = 10;
    static final Object lock = new Object();
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//single thrad
		//cached thrad
		//scheddule thrad
		//fixed thread
		
		//fixed thread 
//		ExecutorService e= Executors.newFixedThreadPool(3);
//		e.execute(null);
		
//		ExecutorService e= Executors.newFixedThreadPool(10);
//		
//		for(int i=0;i<100;i++) {
//			e.submit( () -> {
//				
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				System.out.println("Thread Name: "+Thread.currentThread().getName() + " Thread ID: "+Thread.currentThread().getId());
//			});
//		}
//		
//		e.shutdown();
//		
//		System.out.println("Thread Name: "+Thread.currentThread().getName() + " Thread ID: "+Thread.currentThread().getId());
		
		
		
	//	computee 2 sum using completable future and threadpool
		
		// Task 1: Compute sum of 10 and 20 asynchronously
		
//		  ExecutorService executor = Executors.newFixedThreadPool(2);
//		CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
//		try {
//		Thread.sleep(6000); // Simulate a time-consuming computation
//		} catch (InterruptedException e) {
//		Thread.currentThread().interrupt();
//		}
//		System.out.println("Task 1 completed: 10 + 20");
//		return 10 + 20; // Result of Task 1
//		}, executor);
//
//		// Task 2: Compute sum of 30 and 40 asynchronously
//		CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
//			try {
//				Thread.sleep(3000); // Simulate a time-consuming computation
//			} catch (InterruptedException e) {
//				Thread.currentThread().interrupt();
//			}
//			System.out.println("Task 2 completed: 30 + 40");
//			return 30 + 40; // Result of Task 2
//			}, executor);
//		
//	   
//	  
//	      
//
//		// Combine the results of both tasks when they are completed
//		CompletableFuture<Integer> combinedFuture = future1.thenCombineAsync(future2, (result1, result2) -> {
//			System.out.println("Combining results: " + result1 + " + " + result2);
//			return result1 + result2; // Final result
//		}, executor);
//
//		// Wait for the combined result and print it
//		int finalResult = combinedFuture.join();
//		System.out.println("Final Result: " + finalResult);
//
//		// Shutdown the executor service
//		executor.shutdown();
		
		
//		Semaphore semaphore = new Semaphore(2);
//
//        for (int i = 1; i <= 5; i++) {
//            int threadId = i;
//
//            new Thread(() -> {
//                try {
//                    semaphore.acquire();
//
//                    System.out.println(
//                        "Thread " + threadId + " acquired lock"
//                    );
//
//                    Thread.sleep(3000);
//
//                    System.out.println(
//                        "Thread " + threadId + " releasing"
//                    );
//
//                } catch (InterruptedException e) {
//                    Thread.currentThread().interrupt();
//                } finally {
//                    semaphore.release();
//                }
//            }).start();
//        }
		
		
		 

		for (int i = 0; i < 3; i++) {
            final int id = i;

            new Thread(() -> {
                while (true) {
                    synchronized (lock) {

                        while (num <= MAX && (num - 1) % 3 != id) {
                            try {
                                lock.wait();
                                Thread.sleep(2000);
                                
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                                return;
                            }
                        }

                        if (num > MAX) {
                            lock.notifyAll();
                            return;
                        }

                        System.out.println(
                            Thread.currentThread().getName() + " : " + num++
                        );

                        lock.notifyAll();
                    }
                }
            }, "Thread-" + (i + 1)).start();
        }		
		

	}

}
