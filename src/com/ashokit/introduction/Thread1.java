package com.ashokit.introduction;

import java.util.List;

public class Thread1 extends Thread{
	List<Integer> l=null;
	public Thread1(List<Integer> l,String threadName) {
		// TODO Auto-generated constructor stub
		super(threadName);
		this.l=l;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		l.add(1,100);
		/*
		 * l.add(2, 20);//a[2]=20; l.contains(30);
		 */
		//for(int i=0;i<a.length;i++){
		//if(a[i]==30){
		//return true;
		//}
		//}
		//return false;
	}

}
