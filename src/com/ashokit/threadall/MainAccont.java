package com.ashokit.threadall;

public class MainAccont {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Axisbank b= new Axisbank(10000);
		
		
		AtmThread atm= new AtmThread(b);
		atm.setName("atm");
		
		GooglepayDipositthread gpay=new GooglepayDipositthread(b);
		gpay.setName("gpay");
		
		PhonepayThread phonpay= new PhonepayThread(b);
		phonpay.setName("phonpay");
		
		atm.start();
		gpay.start();
		phonpay.start();
	}

}
