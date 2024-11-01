package com.ashokit.dsaall.problem;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int a=10;
		int b=20;
		
//		int temp=a;
//		a=b;
//		b=temp;
//		System.out.println("swap number a"+a+ " b"+b);
		
		//another way
		a=a+b;//10+20  30
		b=a-b;//10-20  10
		a=a-b;//30-10   20
		
		System.out.println("swap number a"+a+ " b"+b);
		
	}

}
