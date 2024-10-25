package com.ashokit.collectionall.linkedlist;

import java.util.concurrent.CopyOnWriteArrayList;

public class Thread1 extends Thread{
	CopyOnWriteArrayList l=null;
	Thread1(CopyOnWriteArrayList l){
		this.l=l;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Integer i1=(Integer) l.remove(4);
		System.out.println(i1);
	}
}
