package com.ashokit.threadall;

public class ThreadExample extends Thread {

	
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		 /*
		  thread is independent path of exceution within a same program
		  
		  thread lifecyle
		  //thread state new , runnable , running , wait , blocked , dead
		   new - thread is created but not start
           runnable -- thred goes runnable pool  
           running. - os will pick thread from runnbale pull and runn
            wait  - thread is waiting state if another thread perform task
             dead.  - after complettion runnable bloack it will dead 
            block
            
            
            creattio of thread
            creata a thread 
            extending thread
            implementing runnable -- does return 
            implementing callable. - callable return future object  using call method
            
            
            synchronized lock the object 
            
            deadloack - using trylock and lock.unlock
             
            semaphore - acees the resource using acquried and release
            

	 	  */
		ThreadExample t1= new ThreadExample();
		ThreadExample t2= new ThreadExample();
		t1.setName("threaddata1 ");
		t2.setName("threaddata2 ");
		t1.start();
		t2.start();
		
	}

	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		  Thread d=Thread.currentThread();
		  
		  System.out.println("current thrad"+d.getName());
		System.out.println("hi");
		super.run();
	}
}
