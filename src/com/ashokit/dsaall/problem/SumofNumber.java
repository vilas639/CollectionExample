package com.ashokit.dsaall.problem;

import java.util.Arrays;

public class SumofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,7};
		
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			
			sum +=a[i];
		}
		System.out.println("sum"+sum);

		
		//natural sorting n(n+1)/2
	
		int n=a.length;
		int sum1=(n*(n+1))/2;
		
		System.out.println("sum1"+sum1);
		
		// Calculate the sum using streams
        int sum2 = Arrays.stream(a).sum();

        System.out.println("Sum2: " + sum);
		
	}

}
