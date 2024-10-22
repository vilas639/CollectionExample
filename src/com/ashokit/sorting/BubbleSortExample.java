package com.ashokit.sorting;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Iterator;

public class BubbleSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//31,5,7,45,60,4  sort using bubble sort
		int[] a = {31,5,7,45,60,4};
		BubbleSortExample b= new BubbleSortExample();
		b.BubbleSort(a);
		
		//find time complexty
		b.Display();
		

	}
	
	public void BubbleSort(int[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			boolean isSorted = true;
			for (int j = 0; j < data.length - 1 - i; j++) {
				if (data[j] > data[j + 1]) {
					isSorted = false;
					// normal way swap
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
					// alternate way to swap
					// A=A+B
					// A=A-B
					// B=A-B
				}
			}
			if(isSorted)
			{
				break;
			}
		}

		System.out.println(data);

		// iterate data

//		for(int k=0;k<data.length;k++)
//		{
//			System.out.println(data[k]);
//		}

		// stream
		Arrays.stream(data).forEach(p -> System.out.println(p));

	}
	
	public void Display()
	{
		LocalDateTime d= LocalDateTime.now();
	  for (int i = 0; i < 100000; i++) {
		  
		  //System.out.println("Hi"+i);
		
	}
	  LocalDateTime d1= LocalDateTime.now();
	          Duration d2= Duration.between(d1, d);
	          System.out.println("duration "+d2.toMillis());
	  
	}

}
