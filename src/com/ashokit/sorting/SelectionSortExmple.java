package com.ashokit.sorting;

import java.util.Arrays;

public class SelectionSortExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d[]= new int[6];
		d[0]=50;
		d[1]=20;
		d[2]=30;
		d[3]=4;
		d[4]=6;
		d[5]=2;
		
		
		
		SelectionSortExmple e= new SelectionSortExmple();
		
		d=e.SelectionSortMethod(d);
		
		Arrays.stream(d).forEach(c -> System.out.println("sort"+c));
		

	}
	
	public int[] SelectionSortMethod(int a[])
	{
		
		//find lease and place ith postion
		for(int k=0;k<a.length-1;k++)
		{
		   int minindex=k;
		  for(int j=k+1;j<a.length;j++)
		  {
		   if(a[minindex]>a[j])
		   {
			   minindex=j;
		   }
		  }
		  
		  //store in temp
		  int temp=a[minindex];
          
		  a[minindex]=a[k];
		  a[k]=temp;
		}
		
		return a;
	}

}
