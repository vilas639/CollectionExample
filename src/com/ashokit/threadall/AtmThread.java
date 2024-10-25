package com.ashokit.threadall;

public class AtmThread extends Thread {
	
	
	Axisbank  axisbank= new Axisbank();
	
	
	AtmThread(Axisbank axs)
	{
		this.axisbank =axs;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			axisbank.withdraw(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.run();
	}

}
