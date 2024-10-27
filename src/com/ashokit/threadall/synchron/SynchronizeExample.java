package com.ashokit.threadall.synchron;

public class SynchronizeExample {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SynchronizeExample e= new SynchronizeExample();
		
		
		//Runnable l= () ->{ e.display1(e);};
		
		//Thread t= new Thread(l);
		Thread t= new Thread(() -> {e.display1(e);e.display(e);System.out.println("bye");});
		
		
//		Thread t= new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				
//				display1(e);
//				
//			}
//		});
		
		t.start();

	}
	
	
	public static void display(SynchronizeExample d)
	{
		System.out.println("hi 1");
		
		System.out.println("hi 2");
		
		System.out.println("hi 3");
		
		System.out.println("hi 4");
	}
	
	
	public static void display1(SynchronizeExample d)
	{
        System.out.println("hi 1");
		
		System.out.println("hi 2");
		
		synchronized (d) {
			
			System.out.println("hi 3");
			
			System.out.println("hi 4");
		}
		
		
	
	}

}
