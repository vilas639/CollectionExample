package com.ashokit.dsaall.problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueElementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,3,24,2,3,2,1,3,4,5,5,5,9};
		
		Set<Integer> uniqueSet= new HashSet<>();
		
		//i want duplicate set
		Set<Integer> duplicateset= new HashSet<>();
		
		for (int i = 0; i < a.length; i++) {
			
			if(!uniqueSet.contains(a[i]))
			{
				uniqueSet.add(a[i]);
			}
			else
			{
				duplicateset.add(a[i]);
			}
		}
		
		System.out.println("unique element"+uniqueSet);
		System.out.println("duplicate element"+duplicateset);
		
		//without using set
		
		int uniqueelemtn[]=new int[a.length];
		int k=0;
		for (int i = 0; i < a.length; i++) {
			boolean duplicateelemtnfound=false;
			for (int j = 0; j <i; j++) {
				
				if(a[i]==a[j])
				{
					duplicateelemtnfound=true;	
					break;
				}
				
			}
			
			if(!duplicateelemtnfound)
			{
				uniqueelemtn[k]=a[i];//1, 2, 3, 4, 5, 24, 9,0,0,0,0,0,0
				k++;
			}
			
			
		}
		
		uniqueelemtn=Arrays.copyOf(uniqueelemtn, k);
		
		System.out.println("Unique elements: " + Arrays.toString(uniqueelemtn));
	}

}
