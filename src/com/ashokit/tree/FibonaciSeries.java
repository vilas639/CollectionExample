package com.ashokit.tree;

public class FibonaciSeries {
	
	public static void main(String[] args) {
		System.out.println( fibo(3));
	}
	
	static int fibo(int n) {//2
		if(n<=1) {
			return n;			
		}else {//return fibo(1)+fib(0)
			return fibo(n-1)+fibo(n-2);
		}
	}

}
