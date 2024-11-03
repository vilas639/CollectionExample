package com.ashokit.designpattern;

public class Thread1 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create two thread
		Thread1 t= new Thread1();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		SingletonDesignPattren s1;
		try {
			s1 = SingletonDesignPattren.getInstance();
			
			System.out.println(Thread.currentThread().getName());
			System.out.println("hi"+s1.hashCode());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
