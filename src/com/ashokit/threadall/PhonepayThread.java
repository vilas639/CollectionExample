package com.ashokit.threadall;

public class PhonepayThread extends Thread {
	
	
	Axisbank  axisbank= new Axisbank();
	
	
	PhonepayThread(Axisbank axs)
	{
		this.axisbank =axs;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		axisbank.fetchbalance();
		super.run();
	}

}
