package com.ashokit.threadall.threadpool;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class MonthlyPreiummCustomerNotiifactionThred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Customer> listcustomer = new ArrayList<Customer>();
		
		for(int i=0;i<30;i++)
		{
			Customer c= new Customer("vilas"+i, "PLNO+"+i, i);
			listcustomer.add(c);
		}
		
		//fixedthreadpool
	    // ExecutorService e1= 	Executors.newFixedThreadPool(3);
		
		//Chachethreadpool 
	  //   ExecutorService e1= 	Executors.newCachedThreadPool();
	     
		//singthreadpool
	    // ExecutorService e1= 	Executors.newSingleThreadExecutor();
	     
	    ScheduledExecutorService e1=	Executors.newScheduledThreadPool(2);
		
	     ArrayList<Future<Object>> e = new ArrayList<Future<Object>>();
	     
		for (Customer m : listcustomer) {
			
			//triggeremailid(m);
			
//			TriggerEmailThread t= new TriggerEmailThread(m);
//			e1.execute(t);
			
			
//			TriggerEmailThreadCallable t= new TriggerEmailThreadCallable(m);
//			  
//			Future<Object> o1 =  e1.submit(t);
//			e.add(o1);
			
			
			//schedule fot 10 sec
			TriggerEmailThreadCallable t= new TriggerEmailThreadCallable(m);
			  
			Future<Object> o1 =  e1.schedule(t, 10, TimeUnit.SECONDS);
			
			//schedule fot 10 sec every 10 hourc
			
			//ScheduledFuture<Object> o1 =  e1.scheduleAtFixedRate(t, 2,10, TimeUnit.HOURS);
			e.add(o1);
			
		}
		
		//explited shutdown method
		e1.shutdown();
		
		
		for (Future<Object> obj : e) {
			
			try {
		        // .get() will retrieve the result from each Future
		        System.out.println("got " + obj.get());
		    } catch (InterruptedException | ExecutionException ex) {
		        System.out.println("An error occurred: " + ex.getMessage());
		        ex.printStackTrace();
		    }
		}
		

	}
	


}
