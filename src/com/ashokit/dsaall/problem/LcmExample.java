package com.ashokit.dsaall.problem;

import java.util.Iterator;

public class LcmExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {2,4,8,15,21};
		
		System.out.println(lcm(a));
	}

	private static long lcm(int[] a) {
		// TODO Auto-generated method stub
		
		int division=2;
		int count=0;
		int lcm=1;
		boolean isdivision=false;
		
		while(true) {
			
			isdivision=false;
			count=0;
			
	     for (int i = 0; i < a.length; i++) {
	    	 
	    	 if(a[i]==0)
	    	 {
	    		 return 0;
	    	 }
	    	 if(a[i]==1)
	    	 {
	    		 count=count+1;
	    	 }
	    	 else if(a[i]%division==0)
	    	 {
	    		 isdivision=true;
	    		 a[i]=a[i]/division;
	    	 }
	     }
	     if(isdivision)
			{
				 lcm = lcm*division;
			}
			else
			{
				division++;
			}
	     
	     if(count==a.length)
	     {
	    	 return lcm;
	     }
	    	      
			
		}
		
	     
	     
	     
	}

}
