package com.ashokit.dsaall.dynamicprograaming;

import java.util.ArrayList;
import java.util.List;

public class COintChangeGreedyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] currency= {1,2,5,10,20,50,100,200,500,1000};
		
		//i want 93 rupees

		int requiredamount=93;
				
				greedymethod(currency,requiredamount);
	}

	private static void greedymethod(int[] currency, int requiredamount) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		  for (int i = currency.length-1; i >= 0; i--) {
			  
			  while(requiredamount>=currency[i])
			  {
				  list.add(currency[i]);
				  requiredamount=requiredamount-currency[i];
			  }
			
		}
		  System.out.println("total coin gets for "+requiredamount+ " is "+list.toString());
	}

}
