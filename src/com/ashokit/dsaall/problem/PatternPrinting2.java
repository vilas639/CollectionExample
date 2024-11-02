package com.ashokit.dsaall.problem;

import java.util.Scanner;

//        #
//      # #
//    # # #
//  # # # #
//# # # # #
public class PatternPrinting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the number of input");
	        int num=sc.nextInt();
		
		System.out.println("Enter the number of rows");
		printhashvalue(num);
	}

	private static void printhashvalue(int num) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= num; i++) {
			
			for (int j = 1; j <= num; j++) {
				
				if((i+j)>num)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
		
		
	}

}
