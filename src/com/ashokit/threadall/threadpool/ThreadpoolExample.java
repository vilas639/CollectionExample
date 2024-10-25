package com.ashokit.threadall.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadpoolExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//single thrad
		//cached thrad
		//scheddule thrad
		//fixed thread
		
		//fixed thread 
		ExecutorService e= Executors.newFixedThreadPool(3);
		e.execute(null);

	}

}
