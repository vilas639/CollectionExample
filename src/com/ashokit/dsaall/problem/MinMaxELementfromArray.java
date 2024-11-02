package com.ashokit.dsaall.problem;

import java.util.stream.IntStream;

public class MinMaxELementfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {4,6,7,23,12,78,34,5};
        
        int minvalue=a[0];
        int maxvalue =a[0];
        
        for (int i = 1; i < a.length; i++) {
			if(minvalue>a[i])
			{
				minvalue=a[i];
			}
			if(maxvalue<a[i])
			{
				maxvalue=a[i];
			}
			
		}
        
        System.out.println("min value"+minvalue);
        
        System.out.println("max value"+maxvalue);
        
        
        int minvalue1 = IntStream.of(a).min().orElseThrow(IllegalArgumentException::new);
        int maxvalue1 = IntStream.of(a).max().orElseThrow(IllegalArgumentException::new);

        System.out.println("min value: " + minvalue1);
        System.out.println("max value: " + maxvalue1);
	}

}
