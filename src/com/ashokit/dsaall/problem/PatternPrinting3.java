package com.ashokit.dsaall.problem;

import java.util.Iterator;
import java.util.Scanner;

//* * * * *
//* * * *
//* * *
//* *
//*
public class PatternPrinting3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		//print the *
          printthepattern(num);
	}

	private static void printthepattern(int num) {
		// TODO Auto-generated method stub
		
	for (int i = 0; i <= num; i++) {
		
		for (int j =num; j>=i; j--) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	}

}
