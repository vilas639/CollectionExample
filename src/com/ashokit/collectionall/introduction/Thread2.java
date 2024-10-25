package com.ashokit.collectionall.introduction;

import java.util.List;

public class Thread2 extends Thread{
	List<Integer> l=null;
	public Thread2(List<Integer> l,String threadName) {
		// TODO Auto-generated constructor stub
		super(threadName);
		this.l=l;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		l.add(3,30);
	}

}
