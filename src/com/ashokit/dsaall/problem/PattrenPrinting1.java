package com.ashokit.dsaall.problem;

import java.util.Scanner;

//*
//* *
//* * *
//* * * *
//* * * * *

public class PattrenPrinting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of input");
        int n=sc.nextInt();
        
        //print*
        Printintstart(n);
        
        //print a bcd
        PrintAlphabet(n);
        
        //print the number
        PrintNumber(n);
        
        //print abcd with sequence 
        PrintAlphabetSequence(n);
	}

	private static void Printintstart(int n) {
		for(int i=1;i<=n;i++)
        {
        	//print the *
        	
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print("* ");
        	}
        	
        	System.out.println();
        }
	}
	
	
	//  A
	//  A B
	//  A B C
	//  A B C D
	//  A B C D E
	
	private static void PrintAlphabet(int n) {
		for(int i=1;i<=n;i++)
        {
        	//print the *
        	char ch='A';
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print(ch+" ");
        		ch++;
        	}
        	
        	System.out.println();
        }
	}
	
    //  1
	//  1 2
	//  1 2 3
	//  1 2 3 4
	//  1 2 3 4 5
	
	private static void PrintNumber(int n) {
		for(int i=1;i<=n;i++)
        {
        	//print the *
        	int ch=1;
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print(ch+" ");
        		ch++;
        	}
        	
        	System.out.println();
        }
	}
	
	
    //  A
	//  B C
	//  D E F
	//  G H I J
	//  K L M N O
	
	private static void PrintAlphabetSequence(int n) {
		
		char ch='A';
		for(int i=1;i<=n;i++)
        {
        	//print the *
        	
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print(ch+" ");
        		ch++;
        	}
        	
        	System.out.println();
        }
	}

}
