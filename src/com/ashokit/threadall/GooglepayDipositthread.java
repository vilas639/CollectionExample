package com.ashokit.threadall;

public class GooglepayDipositthread  extends Thread{
	
	

	Axisbank  axisbank= new Axisbank();
	
	
	GooglepayDipositthread(Axisbank axs)
	{
		this.axisbank =axs;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			axisbank.deposite(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.run();
	}

}
