package com.ashokit.linkedlist;

import java.util.concurrent.CopyOnWriteArrayList;

public class Thread2 extends Thread{
	CopyOnWriteArrayList l=null;
	Thread2(CopyOnWriteArrayList l){
		this.l=l;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		l.add(6, new Integer(123));
		System.out.println(l);
	}
}
